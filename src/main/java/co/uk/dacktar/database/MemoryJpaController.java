/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uk.dacktar.database;

import co.uk.dacktar.database.exceptions.NonexistentEntityException;
import co.uk.dacktar.database.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author seth
 */
public class MemoryJpaController implements Serializable {

    public MemoryJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Memory memory) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(memory);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMemory(memory.getId()) != null) {
                throw new PreexistingEntityException("Memory " + memory + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Memory memory) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            memory = em.merge(memory);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = memory.getId();
                if (findMemory(id) == null) {
                    throw new NonexistentEntityException("The memory with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Memory memory;
            try {
                memory = em.getReference(Memory.class, id);
                memory.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The memory with id " + id + " no longer exists.", enfe);
            }
            em.remove(memory);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Memory> findMemoryEntities() {
        return findMemoryEntities(true, -1, -1);
    }

    public List<Memory> findMemoryEntities(int maxResults, int firstResult) {
        return findMemoryEntities(false, maxResults, firstResult);
    }

    private List<Memory> findMemoryEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Memory.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Memory findMemory(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Memory.class, id);
        } finally {
            em.close();
        }
    }

    public int getMemoryCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Memory> rt = cq.from(Memory.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
