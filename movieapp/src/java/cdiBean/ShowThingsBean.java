
package cdiBean;

import ejb.MoviesEJB;
import entity.Movies;
import entity.Theaters;
import entity.Times;
import entity.Zipcode;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author noahacosta
 */
@Named(value = "showThingsBean")
@SessionScoped
public class ShowThingsBean implements Serializable {

    // inject our EJB
    @EJB
    private MoviesEJB moviesEJB;
    
    // create local instances of our entities to use
    private Zipcode zip;
    private Theaters movietheater;
    private Movies movie;
    private Times timechosen;
    
    // create local variables 
    private String zip_entered;
    private String result;
    private int zippy;

     /**
     * Creates a new instance of ShowThingsBean
     */
    public ShowThingsBean() {
    }

    // GETTERS AND SETTERS
    public String getZip_entered() {
        return zip_entered;
    }
    public void setZip_entered(String zip_entered) {
        this.zip_entered = zip_entered;
    }

    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    public int getZippy() {
        return zippy;
    }
    public void setZippy(int zippy) {
        this.zippy = zippy;
    }

    public Zipcode getZip() {
        return zip;
    }
    public void setZip(Zipcode zip) {
        this.zip = zip;
    }

    public Theaters getMovietheater() {
        return movietheater;
    }
    public void setMovietheater(Theaters movietheater) {
        this.movietheater = movietheater;
    }

    public Movies getMovie() {
        return movie;
    }
    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public Times getTimechosen() {
        return timechosen;
    }
    public void setTimechosen(Times timechosen) {
        this.timechosen = timechosen;
    }


    
    /**
     * Set the zip read in from the page to this class's zip so that 
     * we can keep track of what zip code we are going to query for
     * 
     * @param zip
     * @return The ShowTheaters page to list the theaters for a specified zip
     */
    public String showTheatersPage(Zipcode zip)
    {
        this.zip = zip;
        
        return "ShowTheaters.xhtml"; 
    }
    
    /**
     * Verifies that a zip code has been established from the previous page/method
     * and call our EJB to query and get the list of theaters associated with 
     * that zip code.
     * 
     * @return the list of theaters for a specified zip code
     * or returns null if no zip is set
     */
    public List<Theaters> getTheatersList()
    {
        if(zip != null){
            return moviesEJB.getTheaterList(zip.getZip());
        }else{
            return null;
        }
    }
    
    
    /**
     * Casts the Theater name that we read in to our movie theater entity
     * by verifying that the string read in is actually part of our database.
     * 
     * @param theater
     * @return the next page which is the List of movies for that theater
     */ 
    public String showMoviesPage(String theater)
    {
        movietheater = moviesEJB.getTheater(theater);

        return "ShowMovies.xhtml";
    }
   
    
    /**
     * generates the list of movies for a given movie theater by calling our EJB.
     * 
     * If we have yet to set a theater, it returns null
     * @return a list of movies 
     */
    public List<Movies> getMovieList()
    {
        if(movietheater != null){
            return moviesEJB.getMovieList(movietheater.getMovietheater());
        }else{
            return null;
        }
    }
    
    
    /**
     * Casts the movie title we read in to its matching movie entity
     * @param moviename
     * @return the next page, which is the showing times for that movie
     */
    public String showTimespage(String moviename)
    {
        movie = moviesEJB.getMovie(moviename);
        return "ShowTimes.xhtml";
    }
    
    /**
     * Generates the showing times for a specified movie by calling our EJB
     * If we have not yet set a movie, then it returns null
     * @return the showing times for our movie
     */
    public List<Times> getTimesList()
    {
        if(movie != null){
            return moviesEJB.getTimesList(movie.getMovietitle());
        }else{
            return null;
        }
    }
    
    
    /**
     * Generates our movie description for a specified movie by calling our EJB
     * 
     * if no movie has been set, then it returns null
     * @return the movie's description
     */
    public List<Movies> getAboutList()
    {
        if(movie != null){
            return moviesEJB.getAboutList(movie.getMovietitle());
        }else{
            return null;
        }
    }
    
    
    /**
     * Casts the selected showing time to its matching Times entity 
     * by calling our EJB
     * @param timeslot
     * @return the checkout page to buy tickets
     */
    public String showCheckoutPage(String timeslot)
    {
        timechosen = moviesEJB.getTimes(timeslot);
        return "BuyTickets.xhtml";
    }
    
    /**
     * Validates if the zip code entered by the user is actually a zip code.
     * 
     * 1st: Validate it is 5 digits long, if not return an error message and stay
     * on the same page.
     * 
     * 2nd: Try and cast the String to an integer. If it fails to cast, then the
     * user did not enter just digits. return error message
     * 
     * 3rd: Try and cast the numbers to a zip code entity by querying our database
     * If it does not match a zip code in our DB, then it is invalid.
     * 
     * Finally: if all passes, return the next page.
     * @return 
     */
    public String validateZip()
    {
        if(zip_entered.length() != 5)
        {
            result = "INVALID ZIP CODE LENGTH. MUST BE 5 DIGITS";
            return "";
        }
        else
        {
            result="";

            try{
                zippy = Integer.parseInt(zip_entered);
            }catch(Exception ex){
                result = "PLEASE ONLY ENTER DIGITS 0-9!";
                return "";
            }

            try{
                zip = moviesEJB.getZip(zippy);
            }catch(Exception ex){
                result = "INVALID ZIP CODE ENTERED";
                return "";
            }

            return "ShowTheaters.xhtml";
        }
    }

    
}
