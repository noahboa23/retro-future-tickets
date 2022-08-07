/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

import javax.validation.constraints.Size;

/**
 *
 * @author noahacosta
 */

/* 
    We use this class as a connection from our Zipcode entity and our Citites
    entity. 

    We denote it embeddable as it contains the two primary/foreign keys in our table.

*/
@Embeddable
public class LocationsPK implements Serializable {
    
    // PRIMARY KEYS 
    @Basic(optional=false)
    @Size(max=5)
    private Integer zip;
    
    @Basic(optional=false)
    @Size(min=1, max=20)
    private String cityname;
    
    // constructors 
    public LocationsPK() {
        
    }
    public LocationsPK(int zip, String cityname){
        this.zip = zip;
        this.cityname = cityname;
    }

    // getters and setters
    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zip != null ? zip.hashCode() : 0);
        hash += (cityname != null ? cityname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LocationsPK)) {
            return false;
        }
        LocationsPK other = (LocationsPK) object;
        if ((this.zip == null && other.zip != null) || (this.zip != null && !this.zip.equals(other.zip))) {
            return false;
        }
        if ((this.cityname == null && other.cityname != null) || (this.cityname != null && !this.cityname.equals(other.cityname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.LocationsPK[ zip=" + zip + ", cityname= " + cityname + " ]";
    }
    
}
