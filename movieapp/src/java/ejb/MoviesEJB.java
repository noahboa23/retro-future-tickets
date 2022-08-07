/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;


import entity.Movies;
import entity.Theaters;
import entity.Times;
import entity.Zipcode;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author noahacosta
 */
@Stateless
public class MoviesEJB {
    
    // inject our entity manager for persisting the DB
    @PersistenceContext(unitName = "MovieAPPPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    
    // generate a list of ALL the zipcodes from the database and return
    public List<Zipcode> findAllZipcodes()
    {
        return em.createNamedQuery("Zipcode.findAll", Zipcode.class)
                .getResultList();
    }
    
    
    // generate a list of Movie Theaters from a given zipcode
    public List<Theaters> getTheaterList(Integer zip)
    {
        return em.createNamedQuery("Theaters.findbyzip", Theaters.class)
                .setParameter("zip", zip)
                .getResultList();
    }
    
    // generate a list of movies from a given theater
    public List<Movies> getMovieList(String movietheater)
    {
        return em.createNamedQuery("Movies.getbytheater", Movies.class)
                .setParameter("movietheater", movietheater)
                .getResultList();
    }
    
    // generate a list of showing times for a specified movie
    public List<Times> getTimesList(String moviename)
    {
        return em.createNamedQuery("Times.findbymoviename", Times.class)
                .setParameter("movietitle", moviename)
                .getResultList();
    }
    
    // get the movie description for a specified movie. 
    public List<Movies> getAboutList(String movietitle)
    {
        return em.createNamedQuery("Movies.getabout", Movies.class)
                .setParameter("movietitle", movietitle)
                .getResultList();
    }
    
    // cast the String variable passed in and match it to a theater entity
    public Theaters getTheater(String theater)
    {
        return em.createNamedQuery("Theaters.findByTheatername", Theaters.class)
                .setParameter("movietheater", theater)
                .getSingleResult();
    }
    
    // cast a String variable passed in and match it to its movie entity
    public Movies getMovie(String moviename)
    {
        return em.createNamedQuery("Movies.getbyname", Movies.class)
                .setParameter("movietitle", moviename)
                .getSingleResult();
    }
    
    // cast a String timeslot passed in to its matching Times Entity
    public Times getTimes(String timeslot)
    {
        return em.createNamedQuery("Times.findbytime", Times.class)
                .setParameter("timeslot", timeslot)
                .getSingleResult();
    }
    
    // cast an integer zipcode read in to its matching zipcode entity
    public Zipcode getZip(int zipentered)
    {
        return em.createNamedQuery("Zipcode.findByZip", Zipcode.class)
                .setParameter("zip", zipentered)
                .getSingleResult();
    }
   
}
