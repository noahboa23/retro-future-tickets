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
    We use this class as a connection from our Times entity and our Movies
    entity. 

    We denote it embeddable as it contains the two primary/foreign keys in our table.
*/
@Embeddable
public class TimesToMoviesPK implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // set primary keys
    @Basic(optional=false)
    @Size(min=1,max=10)
    private String timeslot;
    @Basic(optional=false)
    @Size(min=1,max=50)
    private String movietitle;
    
    // CONSTRUCTORS
    public TimesToMoviesPK(){
        
    }
    public TimesToMoviesPK(String timeslot, String movietitle){
        this.movietitle = movietitle;
        this.timeslot = timeslot;
    }
    
    // GETTERS AND SETTERS
    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (timeslot != null ? timeslot.hashCode() : 0);
        hash += (movietitle != null ? movietitle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimesToMoviesPK)) {
            return false;
        }
        TimesToMoviesPK other = (TimesToMoviesPK) object;
        if ((this.timeslot == null && other.timeslot != null) || (this.timeslot != null && !this.timeslot.equals(other.timeslot))) {
            return false;
        }
        if ((this.movietitle == null && other.movietitle != null) || (this.movietitle != null && !this.movietitle.equals(other.movietitle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TimesToMoviesPK[ timeslot=" + timeslot + ", movietitle= " + movietitle + " ]";
    }
    
}
