/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

/**
 *
 * @author noahacosta
 */

/*
    Create named queries.
1. Allows us to populate a list of ALL the zipcodes in our database and return.

2. Allows us to set a variable to a Zipcode entity by matching it to what was
    found in the database, if it was not found it throws an exception.
*/
@Entity
@NamedQueries({
    @NamedQuery(name = "Zipcode.findAll", query = "SELECT z FROM Zipcode z"),
    @NamedQuery(name = "Zipcode.findByZip", query = "SELECT z FROM Zipcode z WHERE z.zip = :zip")
})
public class Zipcode implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // zip will be our primary key! So denote it with ID
    @Id
    @Basic(optional=false)
    @Size(max=5)
    private Integer zip; 
    
    /* Create an instance of the Zipcode entity class */
    public Zipcode() {
    }
    public Zipcode(int zip){
        this.zip = zip;
    }

    // getters and setters
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip != null ? zip.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zipcode)) {
            return false;
        }
        Zipcode other = (Zipcode) object;
        if ((this.zip == null && other.zip != null) || (this.zip != null && !this.zip.equals(other.zip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+zip;
    }
    
}
