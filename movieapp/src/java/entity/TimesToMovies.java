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
public class TimesToMovies implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // call our embedded class to use as our primary keys
    @EmbeddedId
    protected TimesToMoviesPK ttomPK;
    
    // CONSTRUCTORS
    public TimesToMovies(){
        
    }
    public TimesToMovies(TimesToMoviesPK ttomPK){
        this.ttomPK = ttomPK;
    }
    public TimesToMovies(String timeslot, String movietitle){
        this.ttomPK = new TimesToMoviesPK(timeslot, movietitle);
    }

    // GETTERS AND SETTERS
    public TimesToMoviesPK getTtomPK() {
        return ttomPK;
    }

    public void setTtomPK(TimesToMoviesPK ttomPK) {
        this.ttomPK = ttomPK;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ttomPK != null ? ttomPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimesToMovies)) {
            return false;
        }
        TimesToMovies other = (TimesToMovies) object;
        if ((this.ttomPK == null && other.ttomPK != null) || (this.ttomPK != null && !this.ttomPK.equals(other.ttomPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.TimesToMovies[ ttomPK=" + ttomPK + " ]";
    }
    
}
