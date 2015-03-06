/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dacktar13.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Seth Wheeler
 */
@Entity
@Table(name = "MEMORY", catalog = "", schema = "NEURON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memory.findAll", query = "SELECT m FROM Memory m"),
    @NamedQuery(name = "Memory.findById", query = "SELECT m FROM Memory m WHERE m.id = :id"),
    @NamedQuery(name = "Memory.findByNodes", query = "SELECT m FROM Memory m WHERE m.nodes = :nodes"),
    @NamedQuery(name = "Memory.findByWeight", query = "SELECT m FROM Memory m WHERE m.weight = :weight")})
public class Memory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NODES", nullable = false, length = 64)
    private String nodes;
    @Basic(optional = false)
    @Column(name = "WEIGHT", nullable = false)
    private int weight;

    public Memory() {
    }

    public Memory(Integer id) {
        this.id = id;
    }

    public Memory(Integer id, String nodes, int weight) {
        this.id = id;
        this.nodes = nodes;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Memory)) {
            return false;
        }
        Memory other = (Memory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.dacktar13.database.Memory[ id=" + id + " ]";
    }
    
}
