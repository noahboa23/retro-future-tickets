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
    We use this class as a connection from our Zipcode entity and our Movietheater
    entity. 

    We denote it embeddable as it contains the two primary/foreign keys in our table.
*/

@Embeddable
public class ZipToTheaterPK implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Basic(optional=false)
    @Size(max=5)
    private Integer zip;
    
    @Basic(optional=false)
    @Size(min=1,max=20)
    private String movietheater;
    
    // CONSTRUCTORS
    public ZipToTheaterPK(){
        
    }
    public ZipToTheaterPK(int zip, String movietheater){
        this.zip = zip;
        this.movietheater = movietheater;
    }

    // getters and setters
    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
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
        hash += (zip != null ? zip.hashCode() : 0);
        hash += (movietheater != null ? movietheater.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipToTheaterPK)) {
            return false;
        }
        ZipToTheaterPK other = (ZipToTheaterPK) object;
        if ((this.zip == null && other.zip != null) 
                || (this.zip != null && !this.zip.equals(other.zip))) {
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
        return "entity.ZipToTheaterPK[ zip=" + zip + ", movietheater= " + movietheater + " ]";
    }
    
}
