# Viewing book (microservices arhitecture)

## About
viewingbook -  application that allows you to keep records of viewed titles using a microservice architecture.

### Spring 
Spring-MVC part - contains all the basic logic of the MVC architecture of the entire application. This microservice is responsible for recognizing http requests, maintaining the Notebook database, and storing the session token.
### Spring-Auth 
Registration-MVC part - includes generating a session token using the Bcrypt library and algorithm, registering the user and storing his data as a hash in the database for greater security, and verifying the entered data for user authorization.
### Spring-API-Gateway 
Api-GateWay part - is the connecting link of all services, serves to combine and reduce the number of generated tokens (one token received during authorization is enough), transfers one session token to all services and redirects it to the necessary api gateway based on the design pattern.

## Services links
- Spring : https://github.com/TaarMaan/Spring
- Auth-Spring : https://github.com/TaarMaan/SpringAuth
- API-Gateway-Spring : https://github.com/TaarMaan/SpringAuth

## Methods

## register 
("/registration" part of link in Gate) - we record user data in the customer database.

![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/1.PNG)
### Veiw of hash in db 'titles'

![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/2.PNG)

## getToken 

("/login" part of link in Gate) - we check the entered data and issues a token

![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/3.PNG)

## getAllTitles 

("/titles" part of ling in Gate) - performs a serch all titles list. Also, after adding in signature of link: "? + {name/category/rating} = required data for search, it becomes possible to modernize the output of the sheet of all titles according to the required search pattern. Example of request:
list of all titles

![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/4.PNG)

### rating search
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/4-2.PNG)

### name search
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/4-3.PNG)

### category search
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/4-4.PNG)

## getTitleById 

("/titles/{id}" part of link in Gate) - performs a search by ID.
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/5.PNG)

## editTitle 

("/titles/{id}" part of link in Gate) - allows you to edit the data in the book 

### request
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/6.PNG)

### result
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/6-2.PNG)

## addTitle 

("/titles" part of link in Gate) - creates a new entry in the book

### request
![]([about/7.PNG](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/7.PNG))

### result
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/7-2.PNG)

## deleteTitle 

("/titles/{id}" part of link in Gate) - deletes an entry in the book

### request
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/8.PNG)

### result
![](https://github.com/TaarMaan/Spring/blob/master/src/main/resources/about/8-2.PNG)
