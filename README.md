# Kaiburr-Task1-Java-RestApi
## Task1 - Java Rest Api
Implement an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:
<br>
● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.
<br>
● PUT a server. The server object is passed as a json-encoded message body. Here’s an
example:
<br>
{
<br>
“id”: “123”,
<br>
“name”: ”Programming language”,
<br>
“framework”:”FrameWork in that language”,
<br>
“description”:”some description”
<br>
}
<br>
● DELETE a server. The parameter is a server ID.
<br>
● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.
<br>
“Server” objects should be stored in MongoDB database.
<br>
Be sure that you can show how your application responds to requests using postman, curl or
any other HTTP client.
<br>
## Description:
This application provides a REST API with endpoints for searching, creating, and deleting "server" objects. The server objects are stored in a MongoDB database.
<br>
### Endpoints

#### POST Servers
<br>
POST /tasks: Creates a new server object. The server object is passed as a json-encoded message body.
<br>

![image](https://user-images.githubusercontent.com/83091167/228509736-1e05b3d5-6ec8-45dc-8ffa-09dd9b75b2bb.png)

<br>

#### GET Servers

<br>
GET /tasks: Returns all servers stored in the database.
<br>

![image](https://user-images.githubusercontent.com/83091167/228509936-9898f239-e7d7-4793-99e7-d0b4e1528fc6.png)



<br>
GET /tasks/{id}: Returns a single server with the specified id. Returns 404 if no server with the specified id is found.
<br>

![image](https://user-images.githubusercontent.com/83091167/228510199-d854a16e-340b-46b0-aac6-140a67b1857a.png)

<br>

GET /tasks/name: Finds all servers with a name that contains the specified name parameter. Returns 404 if no servers are found.
<br>

![image](https://user-images.githubusercontent.com/83091167/228510379-eb724a98-73a0-4aec-9b82-c95be34aa8fd.png)

<br>

#### PUT a Server
<br>
PUT /tasks : Updates a server object. The server object is passed as a json-encoded message body.
<br>

![image](https://user-images.githubusercontent.com/83091167/228511759-3a0b4dfd-af2a-4f4c-8704-6cdd20a3f583.png)

![image](https://user-images.githubusercontent.com/83091167/228511910-aec1ac1e-a208-4ea9-bc63-04db42ab3868.png)

<br>

#### DELETE a Server
<br>
DELETE /tasks/{id}: Deletes the server with the specified id from the database.
<br>

![image](https://user-images.githubusercontent.com/83091167/228512140-6ea1a541-eedb-44c9-bc07-d03d9d127596.png)

![image](https://user-images.githubusercontent.com/83091167/228512287-1b1a0786-60c0-4273-bea1-6007eb844766.png)

<br>

## Installation
<br>
●Clone the repository.
<br>
●Configure MongoDB connection in the application.yml file.
<br>
●Build the application using mvn clean install.
<br>

## Running the Application
<br>
●Run the application using java - KaiburrTaskApi.java.
<br>
●Access the API at http://localhost:8080.
