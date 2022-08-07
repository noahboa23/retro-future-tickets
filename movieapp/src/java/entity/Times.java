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
    Create two query statements
1. Find the timeslot for a given movie title. 

2. Casts a variable to the matching Time entity

*/
@Entity
@NamedQueries({
    @NamedQuery(name = "Times.findbymoviename", query = "Select t.timeslot from Times t,"
            + " Movies m, TimesToMovies z where "
            + "t.timeslot = z.ttomPK.timeslot and"
            + " m.movietitle = z.ttomPK.movietitle and"
            + " m.movietitle = :movietitle"),
    @NamedQuery(name = "Times.findbytime", query = "Select t from Times t"
            + " where t.timeslot = :timeslot")
})
public class Times implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // PRIMARY KEY
    @Id
    @Basic(optional=false)
    @Size(min=1,max=10)
    private String timeslot;
    
    // CONSTRUCTORS
    public Times(){
        
    }
    public Times(String timeslot){
        this.timeslot = timeslot;
    }

    // GETTERS AND SETTERS
    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeslot != null ? timeslot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Times)) {
            return false;
        }
        Times other = (Times) object;
        if ((this.timeslot == null && other.timeslot != null) 
                || (this.timeslot != null && !this.timeslot.equals(other.timeslot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+timeslot;
    }
    
}
