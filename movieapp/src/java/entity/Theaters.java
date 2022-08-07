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
    Create two named queries
1. Find the theaters for a specified zipcode passes

2. Casts a variable to the matching theater entity.

*/
@Entity
@NamedQueries({
    @NamedQuery(name = "Theaters.findbyzip", query = "Select t.movietheater from Theaters t, Zipcode z, ZipToTheater s"
            + " where t.movietheater = s.ztotPK.movietheater and"
            + " z.zip = s.ztotPK.zip and"
            + " z.zip = :zip"),
    @NamedQuery(name="Theaters.findByTheatername", query="Select t from Theaters t"
            + " where t.movietheater = :movietheater")
})
public class Theaters implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // PRIMARY KEY
    @Id
    @Basic(optional=false)
    @Size(min=1,max=20)
    private String movietheater;
    
    // CONSTRUCTORS
    public Theaters(){
        
    }
    public Theaters(String movietheater){
        this.movietheater = movietheater;
    }

    // GETTERS AND SETTERS
    public String getMovietheater() {
        return movietheater;
    }

    public void setMovietheater(String movietheater) {
        this.movietheater = movietheater;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movietheater != null ? movietheater.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Theaters)) {
            return false;
        }
        Theaters other = (Theaters) object;
        if ((this.movietheater == null && other.movietheater != null) 
                || (this.movietheater != null && !this.movietheater.equals(other.movietheater))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+movietheater;
    }
    
}
