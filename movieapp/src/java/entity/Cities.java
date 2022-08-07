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
import javax.validation.constraints.Size;

/**
 *
 * @author noahacosta
 */
@Entity
public class Cities implements Serializable {

    private static final long serialVersionUID = 1L;
   
    // primary key
    @Id
    @Basic(optional=false)
    @Size(min = 1, max = 20)
    private String cityname;

    // constructors
    public Cities() {
        
    }
    public Cities(String cityname){
        this.cityname = cityname;
    }
   
    // getters and setters
    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cityname != null ? cityname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cities)) {
            return false;
        }
        Cities other = (Cities) object;
        if ((this.cityname == null && other.cityname != null) || (this.cityname != null && !this.cityname.equals(other.cityname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.City[ cityname=" + cityname + " ]";
    }
    
}
