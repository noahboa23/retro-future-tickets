/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


/**
 *
 * @author noahacosta
 */
@Entity
public class Locations implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // call our embedded class to use as our primary keys
    @EmbeddedId
    protected LocationsPK locationsPK;
    
    // constructors
    public Locations(){
        
    }
    public Locations(LocationsPK locationsPK){
        this.locationsPK = locationsPK;
    }
    public Locations(int zip, String cityname){
        this.locationsPK = new LocationsPK(zip, cityname);
    }

    // getters and setters
    public LocationsPK getLocationsPK() {
        return locationsPK;
    }

    public void setLocationsPK(LocationsPK locationsPK) {
        this.locationsPK = locationsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationsPK != null ? locationsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locations)) {
            return false;
        }
        Locations other = (Locations) object;
        if ((this.locationsPK == null && other.locationsPK != null) || 
                (this.locationsPK != null && !this.locationsPK.equals(other.locationsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Locations[ locationsPK=" + locationsPK + " ]";
    }
    
}
