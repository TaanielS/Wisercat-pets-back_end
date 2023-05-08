# Wisercat 2023

Link for the front-end application: [https://github.com/TaanielS/Wisercat-pets-front_end](https://github.com/TaanielS/Wisercat-pets-front_end)\
The program can be started by running the main method in PetManagementApplication.java.

Spring boot version - 3.0.6 \
Dependencies' versions can be found in pom.xml.

### Tasks:
*	~~Create a Spring Boot application.~~
*	~~User is displayed a list of pets that the user has entered (see the provided html).~~
*	~~User can add pets (see the provided html).~~
*	~~A pet has a name, an identification code, a type (CAT, DOG, etc) and a fur color.~~
*	~~When a new pet is saved, validate all mandatory fields.~~
*	~~Store all input data to database.~~
*	~~Values of select lists have to be populated with data from database.~~

### Optional tasks:
*	~~User can edit pets.~~
*	Log in with one of the created user accounts (registration does not have to be implemented).
*	Create 3 user accounts into the database (username and password).
*	User is not allowed to see other user’s pets.
*	~~User can sort pets by all columns in the table.~~
*	~~A pet has a country of origin.~~
*	~~Validate form fields both inline and in the back-end.~~

### Technical requirements:
*	~~Application has to run with 1 click or command.~~
~~If front- and back-end are in different projects, then 1 click/command per project.~~
*	~~Use Spring Boot.~~
*	~~Embed a H2 database into the application.~~
*	~~Use Liquibase as a database migration tool, execute SQL scripts on app startup.~~
*	~~Use Angular for front end.~~
*	~~Use Bootstrap for design and styling. Do not use multiple CSS libraries.~~
*	~~Use latest versions of all used technologies.~~
*	~~API has to be RESTful.~~

### TODO:
*   Branch withUser has code to start implementing users. I wanted to use JWT to verify users and allow doing operations on only user's pets (see, modify, add). Pets need to have user id as well.

### Thoughts:
*   I had created REST applications before and recently familiarised (during a course and Google) myself with Spring Boot so creating a back-end went rather fast. Most of the code was written in one sitting (let's say 8h just to be safe), later I added data validation, PUT endpoint and an endpoint for front-end select list values. I'd like to make HTTP request responses clearer for the user. Also tests for endpoints would be a nice touch.
