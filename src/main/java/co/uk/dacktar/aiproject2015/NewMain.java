/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uk.dacktar.aiproject2015;

import co.uk.dacktar.database.Memory;
import co.uk.dacktar.database.MemoryJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;


/**
 *
 * @author seth
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory e = null;
        e.createEntityManager();
        MemoryJpaController j = new MemoryJpaController(e);
        Memory m = new Memory(1, "1,0,1,0,1,1,1", 1, "a");
        try {
            j.create(m);
            
        } catch (Exception ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
