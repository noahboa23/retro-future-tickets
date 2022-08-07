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
    CREATE NAMED QUERIES

1. GET THE MOVIES FOR A SPECIFIED THEATER 

2. CAST A VARIABLE TO THE MATCHING MOVIE NAME

3. GET THE DESCRIPTION OF A MOVIE WITH FROM ITS MOVIE TITLE
*/
@Entity
@NamedQueries({
    @NamedQuery(name = "Movies.getbytheater", query = "Select m.movietitle from Movies m, "
            + "Theaters t, MovieToTheater z where "
            + "m.movietitle = z.mtotPK.movietitle "
            + "and t.movietheater = z.mtotPK.movietheater"
            + " and t.movietheater = :movietheater"),
    @NamedQuery(name = "Movies.getbyname", query = "Select m from Movies m "
            + "where m.movietitle = :movietitle"),
    @NamedQuery(name = "Movies.getabout", query = "Select m.about from Movies m "
            + "where m.movietitle = :movietitle")
})
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // PRIMARY KEY
    @Id
    @Basic(optional=false)
    @Size(min=1,max=50)
    private String movietitle;
    
    // MOVIE DESCRIPTION VARIABLE
    @Size(min=1,max=1000)
    private String about;

    // CONSTRUCTORS
    public Movies(){
        
    }
    public Movies(String movietitle, String about){
        this.movietitle = movietitle;
    }
    
    // GETTERS AND SETTERS
    public String getMovietitle() {
        return movietitle;
    }

    public void setMovietitle(String movietitle) {
        this.movietitle = movietitle;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movietitle != null ? movietitle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movies)) {
            return false;
        }
        Movies other = (Movies) object;
        if ((this.movietitle == null && other.movietitle != null) 
                || (this.movietitle != null && !this.movietitle.equals(other.movietitle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+movietitle;
    }
    
}
