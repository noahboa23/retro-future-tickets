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
public class ZipToTheater implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // call our embedded class to use as our primary keys
    @EmbeddedId
    protected ZipToTheaterPK ztotPK;
    
    // constructors
    public ZipToTheater(){
        
    }
    public ZipToTheater(ZipToTheaterPK ztotPK){
        this.ztotPK = ztotPK;
    }
    public ZipToTheater(int zip, String movietheater){
        this.ztotPK = new ZipToTheaterPK(zip, movietheater);
    }

    // getters and setters
    public ZipToTheaterPK getZtotPK() {
        return ztotPK;
    }

    public void setZtotPK(ZipToTheaterPK ztotPK) {
        this.ztotPK = ztotPK;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ztotPK != null ? ztotPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZipToTheater)) {
            return false;
        }
        ZipToTheater other = (ZipToTheater) object;
        if ((this.ztotPK == null && other.ztotPK != null) || (this.ztotPK != null && !this.ztotPK.equals(other.ztotPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZipToTheater[ ztotPK=" + ztotPK + " ]";
    }
    
}
