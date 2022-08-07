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
    We use this class as a connection from our Movies entity and our Theaters
    entity. 

    We denote it embeddable as it contains the two primary/foreign keys in our table.
*/
@Embeddable
public class MovieToTheaterPK implements Serializable {

    private static final long serialVersionUID = 1L;
   
    // PRIMARY KEYS
    @Basic(optional=false)
    @Size(min=1,max=50)
    private String movietitle;
    
    @Basic(optional=false)
    @Size(min=1,max=20)
    private String movietheater;
    
    // CONSTRUCTORS
    public MovieToTheaterPK(){
        
    }
    public MovieToTheaterPK(String movietitle, String movietheater){
        this.movietheater = movietheater;
        this.movietitle = movietitle;
    }

    // GETTERS AND SETTERS
    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getMovietheater() {
        return movietheater;
    }

    public void setMovietheater(String movietheater) {
        this.movietheater = movietheater;
    }

 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movietitle != null ? movietitle.hashCode() : 0);
        hash += (movietheater != null ? movietheater.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieToTheaterPK)) {
            return false;
        }
        MovieToTheaterPK other = (MovieToTheaterPK) object;
        if ((this.movietitle == null && other.movietitle != null) 
                || (this.movietitle != null && !this.movietitle.equals(other.movietitle))) {
            return false;
        }
        if ((this.movietheater == null && other.movietheater != null) 
                || (this.movietheater != null && !this.movietheater.equals(other.movietheater))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieToTheaterPK[ movietitle=" + movietitle + ", movietheater= " + movietheater + " ]";
    }
    
}
