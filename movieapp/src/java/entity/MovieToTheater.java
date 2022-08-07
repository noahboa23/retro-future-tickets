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

public class MovieToTheater implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // call our embedded class to use as our primary keys
    @EmbeddedId
    protected MovieToTheaterPK mtotPK;
    
    // CONSTRUCTORS
    public MovieToTheater(){
        
    }
    public MovieToTheater(MovieToTheaterPK mtotPK){
        this.mtotPK = mtotPK;
    }
    public MovieToTheater(String movietitle, String movietheater){
        this.mtotPK = new MovieToTheaterPK(movietitle, movietheater);
    }

    // GETTERS AND SETTERS
    public MovieToTheaterPK getMtotPK() {
        return mtotPK;
    }

    public void setMtotPK(MovieToTheaterPK mtotPK) {
        this.mtotPK = mtotPK;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtotPK != null ? mtotPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovieToTheater)) {
            return false;
        }
        MovieToTheater other = (MovieToTheater) object;
        if ((this.mtotPK == null && other.mtotPK != null) 
                || (this.mtotPK != null && !this.mtotPK.equals(other.mtotPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MovieToTheater[ mtotPK=" + mtotPK + " ]";
    }
    
}
