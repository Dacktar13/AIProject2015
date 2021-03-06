/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.uk.dacktar.database;

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
@Table(catalog = "", schema = "NEURON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memory.findAll", query = "SELECT m FROM Memory m"),
    @NamedQuery(name = "Memory.findById", query = "SELECT m FROM Memory m WHERE m.id = :id"),
    @NamedQuery(name = "Memory.findByNodes", query = "SELECT m FROM Memory m WHERE m.nodes = :nodes"),
    @NamedQuery(name = "Memory.findByWeight", query = "SELECT m FROM Memory m WHERE m.weight = :weight"),
    @NamedQuery(name = "Memory.findBySymbol", query = "SELECT m FROM Memory m WHERE m.symbol = :symbol")})
public class Memory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 64)
    private String nodes;
    @Basic(optional = false)
    @Column(nullable = false)
    private int weight;
    @Basic(optional = false)
    @Column(nullable = false)
    private String symbol;

    public Memory() {
    }

    public Memory(Integer id) {
        this.id = id;
    }

    public Memory(Integer id, String nodes, int weight, String symbol) {
        this.id = id;
        this.nodes = nodes;
        this.weight = weight;
        this.symbol = symbol;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
        return "co.uk.dacktar.database.Memory[ id=" + id + " ]";
    }
    
}
