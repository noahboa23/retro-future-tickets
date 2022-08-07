-- drop table locations;
-- drop table movietotheater;
-- drop table timestomovies;
-- drop table ziptotheater;
-- drop table cities;
-- drop table movies;
-- drop table theaters;
-- drop table times;
-- drop table zipcode;

CREATE TABLE Zipcode
(
    zip INT,
    PRIMARY KEY (zip)
);

CREATE TABLE Cities
(
    cityname VARCHAR(20),
    PRIMARY KEY (cityname)
);


CREATE TABLE Locations
(
    zip INT,
    cityname VARCHAR(20),
    PRIMARY KEY (zip, cityname),
    FOREIGN KEY (zip) REFERENCES Zipcode,
    FOREIGN KEY (cityname) REFERENCES Cities
);

CREATE TABLE Movies
(
    movietitle VARCHAR (50),
	about VARCHAR (1000),
    PRIMARY KEY (movietitle)
);

CREATE TABLE Theaters
(
    movietheater VARCHAR (20),
    primary key (movietheater)
);

CREATE TABLE MovieToTheater
(
    movietitle VARCHAR (50),
    movietheater VARCHAR (20),
    PRIMARY KEY (movietitle, movietheater),
    foreign key (movietitle) references Movies,
    foreign key (movietheater) references Theaters
);

Create table ZipToTheater
(
    zip INT,
    movietheater Varchar (20),
    primary key (zip, movietheater),
    foreign key (zip) references zipcode,
    foreign key (movietheater) references Theaters
);

create table Times
(
    timeslot VARCHAR(10),
    PRIMARY KEY (timeslot)
);

CREATE TABLE TIMESTOMOVIES
(
    timeslot varchar(10),
    movietitle varchar(50),
    primary key (timeslot, movietitle),
    foreign key (timeslot) references times,
    foreign key (movietitle) references movies
);

insert into Zipcode (zip)
values (75150);
insert into Zipcode (zip)
values (76051);
insert into Zipcode (zip)
values (75080);

insert into Cities (cityname)
values ('Mesquite, TX');
insert into Cities (cityname)
values ('Grapevine, TX');
insert into Cities (cityname)
values ('Richardson, TX');

insert into Locations (zip, cityname)
values (75150, 'Mesquite, TX');
insert into Locations (zip, cityname)
values (76051, 'Grapevine, TX');
insert into Locations (zip, cityname)
values (75080, 'Richardson, TX');

insert into Movies (movietitle, about)
values ('The Devil Wears Prada', 'Andy (Anne Hathaway) is a recent college graduate with big dreams. Upon landing a job at prestigious Runway magazine, she finds herself the assistant to diabolical editor Miranda Priestly (Meryl Streep). Andy questions her ability to survive her grim tour as Mirandas whipping girl without getting scorched.');


insert into Movies (movietitle, about)
values ('Mean Girls', 'Teenage Cady Heron (Lindsay Lohan) was educated in Africa by her scientist parents. When her family moves to the suburbs of Illinois, Cady finally gets to experience public school and gets a quick primer on the cruel, tacit laws of popularity that divide her fellow students into tightly knit cliques. She unwittingly finds herself in the good graces of an elite group of cool students dubbed the Plastics, but Cady soon realizes how her shallow group of new friends earned this nickname.');

insert into Movies (movietitle, about)
values ('Moana', 'An adventurous teenager sails out on a daring mission to save her people. During her journey, Moana meets the once-mighty demigod Maui, who guides her in her quest to become a master way-finder. Together they sail across the open ocean on an action-packed voyage, encountering enormous monsters and impossible odds. Along the way, Moana fulfills the ancient quest of her ancestors and discovers the one thing she always sought: her own identity.');

insert into Movies (movietitle, about)
values ('Legally Blonde', 'Elle Woods (Reese Witherspoon) has it all. She wants nothing more than to be Mrs. Warner Huntington III. But there is one thing stopping him (Matthew Davis) from proposing: She is too blond. Elle rallies all of her resources and gets into Harvard, determined to win him back.');

insert into Movies (movietitle, about)
values ('Scary Movie 3','After newspaper reporter Cindy (Anna Faris) accidentally watches a strange videotape that causes the viewer to die within a week, she discovers the tape is only one of many weird happenings. Local farmers Tom (Charlie Sheen) and George (Simon Rex) have reported massive crop circles appearing overnight in their fields. Cindy finds a link between the tape and the crop circles with help from the U.S. president (Leslie Nielsen) and a kindly aunt (Queen Latifah).');

insert into Movies (movietitle, about)
values ('Lilo and Stitch','A tale of a young girls close encounter with the galaxys most wanted extraterrestrial. Lilo is a lonely Hawaiian girl who adopts a small ugly "dog," whom she names Stitch. Stitch would be the perfect pet if he werent in reality a genetic experiment who has escaped from an alien planet and crash-landed on Earth. Through her love, faith and unwavering belief in ohana, the Hawaiian concept of family, Lilo helps unlock Stitchs heart and gives him the ability to care for someone else.');

insert into Movies (movietitle, about)
values ('Ice Princess','Casey Carlyle (Michelle Trachtenberg) is supposed to go to Harvard, just like her mother (Joan Cusack). While Casey has the grades to get into her moms alma mater, what she really wants to do is pursue her passion: figure skating. Both Caseys mom and Gen (Hayden Panettiere), the captain of the local team, scoff at the idea of Casey on the ice. But Casey soon finds an unlikely ally, and coach, in Gens mom, Tina (Kim Cattrall), a former skater trying to live down mistakes from her past.');

insert into Movies (movietitle, about)
values ('Crazy Rich Asians','Rachel Chu is happy to accompany her longtime boyfriend, Nick, to his best friends wedding in Singapore. Shes also surprised to learn that Nicks family is extremely wealthy and hes considered one of the countrys most eligible bachelors. Thrust into the spotlight, Rachel must now contend with jealous socialites, quirky relatives and something far, far worse, Nicks disapproving mother.');

insert into Movies (movietitle, about)
values ('MA','A lonely middle-aged woman befriends some teenagers and decides to let them party in the basement of her home. But there are some house rules: One of the kids has to stay sober, dont curse, and never go upstairs. They must also refer to her as Ma. But as Mas hospitality starts to curdle into obsession, what began as a teenage dream turns into a terrorizing nightmare, and Mas place goes from the best place in town to the worst place on Earth.');

insert into Movies (movietitle, about)
values ('Spy Kids 2','Now full fledged Spy Kids, Carmen (Alexa Vega) and Juni (Daryl Sabara) Cortez are back for another James Bond style adventure. Their newest mission takes them to a distant island where they take on a mysterious man and his imaginative creatures. But this time, they also have to fight the forces of rival sibling Spy Kids, Gary (Matt OLeary) and Gerti (Emily Osment) Giggles, as they head right into a trap that will test each and every spy in the Cortez family.');

insert into Movies (movietitle, about)
values ('The Princess Diaries','Shy San Francisco teenager Mia Thermopolis (Anne Hathaway) is thrown for a loop when, from out of the blue, she learns the astonishing news that shes a real-life princess! As the heir apparent to the crown of the small European principality of Genovia, Mia begins a comical journey toward the throne when her strict and formidable grandmother, Queen Clarisse Renaldi (Julie Andrews), shows up to give her "princess lessons."');

insert into Movies (movietitle, about)
values ('A Cinderella Story','Sam (Hilary Duff), a teenager in California, is obliged to work as a janitor and dishwasher in the diner of her stepmother (Jennifer Coolidge). After a cell phone mix-up, Sam begins an anonymous text-messaging and e-mail relationship with a boy. They agree to meet at a school dance, but when Sam finds out that her secret pen pal is none other than Austin Ames (Chad Michael Murray), the cutest boy in school, she panics and looks for a way to make herself cooler.');

insert into Movies (movietitle, about)
values ('Precious','Pregnant by her own father for the second time, 16-year-old Claireece "Precious" Jones (Gabourey Sidibe) can neither read nor write and suffers constant abuse at the hands of her vicious mother (MoNique). Precious instinctively sees a chance to turn her life around when she is offered the opportunity to transfer to an alternative school. Under the patient, firm guidance of her new teacher, Ms. Rain (Paula Patton), Precious begins the journey from oppression to self-determination.');

insert into Movies (movietitle, about)
values ('I Can Do Bad All By Myself','When Madea (Tyler Perry) catches three young siblings raiding her home, she takes matters into her own hands and delivers the children to their only relative: Aunt April (Taraji P. Henson). At first, April, a boozy nightclub singer who leeches off her married boyfriend, wants nothing to do with them, but when a Mexican immigrant named Sandino (Adam Rodriguez) rents a room in her basement, April begins to realize that life may hold more possibilities.');

insert into Movies (movietitle, about)
values ('The Little Mermaid','In Disneys beguiling animated romp, rebellious 16-year-old mermaid Ariel (Jodi Benson) is fascinated with life on land. On one of her visits to the surface, which are forbidden by her controlling father, King Triton, she falls for a human prince. Determined to be with her new love, Ariel makes a dangerous deal with the sea witch Ursula (Pat Carroll) to become human for three days. But when plans go awry for the star-crossed lovers, the king must make the ultimate sacrifice for his daughter.');

insert into Movies (movietitle, about)
values ('Back To The Future','In this 1980s sci-fi classic, small-town California teen Marty McFly (Michael J. Fox) is thrown back into the 50s when an experiment by his eccentric scientist friend Doc Brown (Christopher Lloyd) goes awry. Traveling through time in a modified DeLorean car, Marty encounters young versions of his parents (Crispin Glover, Lea Thompson), and must make sure that they fall in love or he will cease to exist. Even more dauntingly, Marty has to return to his own time and save the life of Doc Brown.');

insert into Movies (movietitle, about)
values ('Why Did I Get Married','Eight married friends take their annual reunion vacation in the Colorado mountains. Revelations of infidelity involving one pair shatter the amicable mood, forcing the remaining friends to take a hard look at the strength of their own marriages. The couples grapple with issues of commitment, love, betrayal and forgiveness as they try to move on with their lives.');

insert into Movies (movietitle, about)
values ('Grown Ups','A single man who drinks too much. A father with three daughters who he rarely sees. A guy who is overweight and unemployed. A hen-pecked househusband. A successful Hollywood agent married to a fashion designer. What do these five men have in common? They used to play for the same basketball team at school. Now their former coach has died, and they are reunited at his funeral. Will the group rediscover old bonds?');

insert into Movies (movietitle, about)
values ('The Fast and the Furious','Dominic Toretto (Vin Diesel) enjoys the adrenaline of street car racing and his fans treat him like a rock star. After a blazing encounter with the ruthless Johnny Tran, Dom decides to take Brian (Paul Walker), a newcomer to street racing, under his wing. Doms sister Mia sees something she likes in Brian, too. Trouble is, neither of them realize he is an undercover cop, and Dominic and his rival Johnny Tran are both the prime suspects in a case involving dirty money and big-rig hijacking.');

insert into Movies (movietitle, about)
values ('Spirited Away','In this animated feature by noted Japanese director Hayao Miyazaki, 10-year-old Chihiro (Rumi Hiiragi) and her parents (Takashi Naitô, Yasuko Sawaguchi) stumble upon a seemingly abandoned amusement park. After her mother and father are turned into giant pigs, Chihiro meets the mysterious Haku (Miyu Irino), who explains that the park is a resort for supernatural beings who need a break from their time spent in the earthly realm, and that she must work there to free herself and her parents.');

insert into Movies (movietitle, about)
values ('Moonlight','A look at three defining chapters in the life of Chiron, a young black man growing up in Miami. His epic journey to manhood is guided by the kindness, support and love of the community that helps raise him.');

insert into Movies (movietitle, about)
values ('Titanic','James Camerons "Titanic" is an epic, action-packed romance set against the ill-fated maiden voyage of the R.M.S. Titanic; the pride and joy of the White Star Line and, at the time, the largest moving object ever built. She was the most luxurious liner of her era -- the "ship of dreams" -- which ultimately carried over 1,500 people to their death in the ice cold waters of the North Atlantic in the early hours of April 15, 1912.');

insert into Movies (movietitle, about)
values ('The Wizard of Oz','When a tornado rips through Kansas, Dorothy (Judy Garland) and her dog, Toto, are whisked away in their house to the magical land of Oz. They follow the Yellow Brick Road toward the Emerald City to meet the Wizard, and en route they meet a Scarecrow (Ray Bolger) that needs a brain, a Tin Man (Jack Haley) missing a heart, and a Cowardly Lion (Bert Lahr) who wants courage. The wizard asks the group to bring him the broom of the Wicked Witch of the West (Margaret Hamilton) to earn his help.');

insert into Movies (movietitle, about)
values ('Finding Nemo','Marlin (Albert Brooks), a clown fish, is overly cautious with his son, Nemo (Alexander Gould), who has a foreshortened fin. When Nemo swims too close to the surface to prove himself, he is caught by a diver, and horrified Marlin must set out to find him. A blue reef fish named Dory (Ellen DeGeneres) -- who has a really short memory -- joins Marlin and complicates the encounters with sharks, jellyfish, and a host of ocean dangers. Meanwhile, Nemo plots his escape from a dentists fish tank.');

insert into Movies (movietitle, about)
values ('Toy Story','Woody (Tom Hanks), a good-hearted cowboy doll who belongs to a young boy named Andy (John Morris), sees his position as Andys favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure. Even worse, the arrogant Buzz thinks hes a real spaceman on a mission to return to his home planet. When Andys family moves to a new house, Woody and Buzz must escape the clutches of maladjusted neighbor Sid Phillips (Erik von Detten) and reunite with their boy.');

insert into Movies (movietitle, about)
values ('Frozen','When their kingdom becomes trapped in perpetual winter, fearless Anna (Kristen Bell) joins forces with mountaineer Kristoff (Jonathan Groff) and his reindeer sidekick to find Annas sister, Snow Queen Elsa (Idina Menzel), and break her icy spell. Although their epic journey leads them to encounters with mystical trolls, a comedic snowman (Josh Gad), harsh conditions, and magic at every turn, Anna and Kristoff bravely push onward in a race to save their kingdom from winters cold grip.');

insert into Movies (movietitle, about)
values ('The Blind Side','Michael Oher (Quinton Aaron), a homeless black teen, has drifted in and out of the school system for years. Then Leigh Anne Tuohy (Sandra Bullock) and her husband, Sean (Tim McGraw), take him in. The Tuohys eventually become Michaels legal guardians, transforming both his life and theirs. Michaels tremendous size and protective instincts make him a formidable force on the gridiron, and with help from his new family and devoted tutor, he realizes his potential as a student and football player.');

insert into Theaters (movietheater)
values ('AMC 30');
insert into Theaters (movietheater)
values ('AMC Firewheel');
insert into Theaters (movietheater)
values ('Regal UA Galaxy');

insert into Theaters (movietheater)
values ('Cinemark-Grapevine');
insert into Theaters (movietheater)
values ('AMC-Grapevine');
insert into Theaters (movietheater)
values ('EVO');

insert into Theaters (movietheater)
values ('Cinemark Plano');
insert into Theaters (movietheater)
values ('Alamo Drafthouse');
insert into Theaters (movietheater)
values ('Strike and Reel');

insert into MovieToTheater (movietitle, movietheater)
values ('The Devil Wears Prada', 'AMC 30');
insert into MovieToTheater (movietitle, movietheater)
values ('Mean Girls', 'AMC 30');
insert into MovieToTheater (movietitle, movietheater)
values ('Moana', 'AMC 30');
insert into MovieToTheater (movietitle, movietheater)
values ('Legally Blonde', 'AMC Firewheel');
insert into MovieToTheater (movietitle, movietheater)
values ('Scary Movie 3', 'AMC Firewheel');
insert into MovieToTheater (movietitle, movietheater)
values ('Lilo and Stitch', 'AMC Firewheel');
insert into MovieToTheater (movietitle, movietheater)
values ('Ice Princess', 'Regal UA Galaxy');
insert into MovieToTheater (movietitle, movietheater)
values ('Crazy Rich Asians', 'Regal UA Galaxy');
insert into MovieToTheater (movietitle, movietheater)
values ('MA', 'Regal UA Galaxy');

insert into MovieToTheater (movietitle, movietheater)
values ('Spy Kids 2', 'Cinemark-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('The Princess Diaries', 'Cinemark-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('A Cinderella Story', 'Cinemark-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('Precious', 'AMC-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('I Can Do Bad All By Myself', 'AMC-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('The Little Mermaid', 'AMC-Grapevine');
insert into MovieToTheater (movietitle, movietheater)
values ('Back To The Future', 'EVO');
insert into MovieToTheater (movietitle, movietheater)
values ('Why Did I Get Married', 'EVO');
insert into MovieToTheater (movietitle, movietheater)
values ('Grown Ups', 'EVO');

insert into MovieToTheater (movietitle, movietheater)
values ('The Fast and the Furious', 'Cinemark Plano');
insert into MovieToTheater (movietitle, movietheater)
values ('Spirited Away', 'Cinemark Plano');
insert into MovieToTheater (movietitle, movietheater)
values ('Moonlight', 'Cinemark Plano');
insert into MovieToTheater (movietitle, movietheater)
values ('Titanic', 'Alamo Drafthouse');
insert into MovieToTheater (movietitle, movietheater)
values ('The Wizard of Oz', 'Alamo Drafthouse');
insert into MovieToTheater (movietitle, movietheater)
values ('Finding Nemo', 'Alamo Drafthouse');
insert into MovieToTheater (movietitle, movietheater)
values ('Toy Story', 'Strike and Reel');
insert into MovieToTheater (movietitle, movietheater)
values ('Frozen', 'Strike and Reel');
insert into MovieToTheater (movietitle, movietheater)
values ('The Blind Side', 'Strike and Reel');

insert into ZipToTheater (zip, movietheater)
values (75150, 'AMC 30');
insert into ZipToTheater (zip, movietheater)
values (75150, 'AMC Firewheel');
insert into ZipToTheater (zip, movietheater)
values (75150, 'Regal UA Galaxy');

insert into ZipToTheater (zip, movietheater)
values (76051, 'Cinemark-Grapevine');
insert into ZipToTheater (zip, movietheater)
values (76051, 'AMC-Grapevine');
insert into ZipToTheater (zip, movietheater)
values (76051, 'EVO');

insert into ZipToTheater (zip, movietheater)
values (75080, 'Cinemark Plano');
insert into ZipToTheater (zip, movietheater)
values (75080, 'Alamo Drafthouse');
insert into ZipToTheater (zip, movietheater)
values (75080, 'Strike and Reel');

INSERT INTO TIMES (TIMESLOT)
VALUES ('10:00 AM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('10:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('10:30 AM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('11:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('11:30 AM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('12:00 AM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('12:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('1:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('2:30 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('3:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('4:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('5:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('6:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('7:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('7:30 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('8:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('8:30 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('9:00 PM');
INSERT INTO TIMES (TIMESLOT)
VALUES ('9:30 PM');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 AM', 'The Devil Wears Prada');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 PM', 'The Devil Wears Prada');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('3:00 PM', 'The Devil Wears Prada');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:00 PM', 'Mean Girls');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:30 PM', 'Mean Girls');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:00 PM', 'Mean Girls');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('1:00 PM', 'Moana');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('4:00 PM', 'Moana');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:30 PM', 'Moana');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:30 AM', 'Legally Blonde');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('2:30 PM', 'Legally Blonde');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('5:00 PM', 'Legally Blonde');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 PM', 'Scary Movie 3');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 AM', 'Scary Movie 3');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM', 'Scary Movie 3');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:30 AM', 'Lilo and Stitch');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 PM', 'Lilo and Stitch');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('2:30 PM', 'Lilo and Stitch');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:00 PM', 'Ice Princess');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('5:00 PM', 'Ice Princess');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 PM', 'Ice Princess');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('4:00 PM', 'Crazy Rich Asians');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:00 PM', 'Crazy Rich Asians');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 PM', 'Crazy Rich Asians');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:30 PM', 'MA');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:00 PM', 'MA');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 AM', 'MA');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:30 PM', 'Spy Kids 2');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('3:00 PM', 'Spy Kids 2');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:30 AM', 'Spy Kids 2');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 AM', 'The Princess Diaries');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 PM', 'The Princess Diaries');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('5:00 PM', 'The Princess Diaries');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:30 AM', 'A Cinderella Story');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('1:00 PM', 'A Cinderella Story');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM', 'A Cinderella Story');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:00 PM', 'Precious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:30 PM', 'Precious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:30 PM', 'Precious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:00 PM', 'I Can Do Bad All By Myself');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:00 PM', 'I Can Do Bad All By Myself');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 PM', 'I Can Do Bad All By Myself');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 AM', 'The Little Mermaid');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:30 AM', 'The Little Mermaid');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('1:00 PM', 'The Little Mermaid');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:00 PM','Back To The Future');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('12:00 AM','Back To The Future');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('4:00 PM','Back To The Future');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM','Why Did I Get Married');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:30 PM','Why Did I Get Married');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:00 PM','Why Did I Get Married');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('2:30 PM', 'Grown Ups');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:30 AM', 'Grown Ups');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:00 PM', 'Grown Ups');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:00 PM','The Fast and the Furious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:30 PM','The Fast and the Furious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('3:00 PM','The Fast and the Furious');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:30 PM', 'Spirited Away');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('4:00 PM', 'Spirited Away');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('1:00 PM', 'Spirited Away');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('8:00 PM', 'Moonlight');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('5:00 PM', 'Moonlight');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:30 PM', 'Moonlight');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:00 AM', 'Titanic');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('2:30 PM', 'Titanic');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM', 'Titanic');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:30 AM','The Wizard of Oz');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('3:00 PM','The Wizard of Oz');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:30 PM','The Wizard of Oz');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('10:30 AM','Finding Nemo');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:00 PM','Finding Nemo');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:00 PM','Finding Nemo');

INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('1:00 PM','Toy Story');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM','Toy Story');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:30 AM','Toy Story');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('3:00 PM', 'Frozen');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('7:30 PM', 'Frozen');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('9:30 PM', 'Frozen');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('2:30 PM', 'The Blind Side');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('6:00 PM', 'The Blind Side');
INSERT INTO TIMESTOMOVIES (TIMESLOT, MOVIETITLE)
VALUES ('11:00 PM', 'The Blind Side');

