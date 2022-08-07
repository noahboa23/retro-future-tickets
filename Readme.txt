
*** Note: our database is entitled 'MovieDB' and contains the 
username: noah 
Password: boa 

*** 'myJava8' is Noah's Java EE 8 library. We have also included the standard Java EE 8 library. 

*** NOTE: ONLY THE ZIP CODES 75150 , 76051 , 75080 ARE IN THE DATABASE! ALL OTHERS WILL RETURN A 'NOT VALID' 




Web files:
---------------

index.xhtml - Welcome screen / Home screen - Greets user and has button to goto zip code page.

MainPage.xhtml - Zip code search page - Has an input box to enter a zip code to see theaters in an area.


ShowTheaters.xhtml - Theater list page - Shows a list of theaters based on the entered zip code (Can click link or just the picture to get to the next page).

ShowMovies.xhtml - Movie list page - Shows a list of available movies at current theater (Can click link or just the picture to get to the next page).

ShowTimes.xhtml - Movie info page - Shows the picture of the movie again along with a description and the available show times.

BuyTickets.xhtml - Ticket selection page - Has oneSelectMenu to select how many tickets to purchase.
Payment.xhtml - Payment page - Shows total price ($10 a ticket) and has a form to enter card information (16 numbers exactly for CC number is required to get to next page).

Thankyou.xhtml - Thank you page - Displays a thank you message and has a button to return to the home page.

images directory - Contains all images of movie posters as well as the Welcome and popcorn pictures.



------------------------------
Java files:

Entity:
----------
	Zipcode.java - Mimics our zipcode table in the SQL. Has Two Named Queries that allow the user to find all the zipcodes in the database or to individually verify a zipcode in the database. It contains an ID of Integer zip, which mimics our primary key in our SQL. Includes Getters/Setters with two constructors.
	
	ZipToTheaterPK.java - An embeddable class that contains a zip, and movietheater variables. This mimics our SQL by creating the Primary keys and Foreign keys. This class will then be implemented into ZipToTheater as its ID.
	
	ZipToTheater.java - Calls upon ZipToTheaterPK to get its IDs as it is the bridge that maps Zipcode to Theater. 
	
	TimesToMoviesPK.java - An embeddable class that contains a timeslot, and movietitle variables. This mimics our SQL by creating the Primary keys and Foreign keys. This class will then be implemented into TimesToMovies as its ID.
	
	TimesToMovies.java - Calls upon TimesToMoviesPK to get its IDs as it is the bridge that maps Times to Movies.
	 
	Times.java - Mimics our Times table in the SQL. Has Two Named Queries that allow the user to find the Show Times for a given movie, or verify the timeslot in the database. It contains an ID of String timeslot, which mimics our primary key in our SQL. Includes Getters/Setters with two constructors.
	
	Theaters.java - Mimics our theaters table in the SQL. Has Two Named Queries that allow the user to find all the theaters associated to a specific zipcode, as well as cast and verify if a specified theater exisits in our database. It contains an ID of String movietheater, which mimics our primary key in our SQL. Includes Getters/Setters with two constructors.
	
	Movies.java - Mimics our movies table in the SQL. Has three Named Queries that allow the user to find all the movies associated with a certain theater, cast and verify that a specific movie is in our database, and get the movie description for a specific movie. It contains an ID of String movietitle and a String about variable, which mimics our primary key, and column in our SQL. Includes Getters/Setters with two constructors.
	
	MovieToTheaterPK.java - An embeddable class that contains a movietitle, and movietheater variables. This mimics our SQL by creating the Primary keys and Foreign keys. This class will then be implemented into MovieToTheater as its ID.
	
	MovieToTheater.java - Calls upon MovieToTheaterPK to get its IDs as it is the bridge that maps Movies to Theaters.
	


*** Below are entities that were created since they exist in our SQL, but are not used in the main program. ***
	
	LocationsPK.java - An embeddable class that contains a zip, and cityname variables. This mimics our SQL by creating the Primary keys and Foreign keys. This class will then be implemented into Locations as its ID.
	
	Locations.java - Calls upon LocationsPK to get its IDs as it it the bridge that connects Zipcode to Cities.
	
	Cities.java - Mimics our cities table in the SQL. It contains an ID of String cityname which mimics our primary key in our SQL. Includes Getters/Setters with two constructors.
	
	
	
	
EJB
---------
	MoviesEJB.java - A stateless session bean with an injected entity manager that executes our named queries that were created in our entity classes when called upon. 
	
	



cdiBean
----------
	ShowThingsBean.java - Our main cdiBean that is session scoped. Injects our EJB. Creates instances of some of our entities as well as local variables to hold data entered in by the user. Has getters and setters for all variables. Contains various methods needed to call upon our EJB to query data, and set our instances to the data selected by the user. It also contains a validation method that makes sure the user entered in a correct zip code.
	
	CheckoutBean.java - A session scoped cdi bean that creates local variables with getters and setter to get the data the user enters on the Credit Card page. It contains a validator method that makes sure the user entered a correct credit card number, only 16 digits. It also has a calculateCharges method that takes the number of tickets the user wants to purchase, multiplies it by 10 (the ticket cost) and returns the String of the total cost.