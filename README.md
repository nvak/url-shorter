
API for converting long urls to short urls

## Structure
3 layers architecture
- Data access layer: DAO
- Business logic layer: Services
- Presentation layer: Controllers

## Technologies
- Java
- Spring Boot
- Apache Tomcat
- Maven
- H2 Database (In-memory database)

## Endpoints and roles for them
- POST: / - user
- GET: / - all

## How to run project
1. Clone the project on your IDE
2. Run project.

## How to use
1. Send POST request to get short url with basic authorization
- username: SomeUser
- password: SomePassword
- request like:
```
{"longUrl":"YOUR_URL"}
```
You will receive short url as Json.
```
{"url": "YOUR_SHORT_URL" }
```
2. Send GET or past in browser your short url and receive full url as Json

Or u can use postman for sending and receiving requests

Download Postman https://www.postman.com/downloads/  
