# graphql-spring-boot-mongodb-example
Example project for spring boot + mongo db + graphql (perfect combination for fast API development)

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
JDK
Mongo DB
Eclipse or Inte
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
git clone https://github.com/rayedbajwa/graphql-spring-boot-mongodb-example
Start Mongo DB server
Add `application-local.properties` to src/main/resources with DB connection settings
Setup profile to `local`
./gradlew bootRun
Go to http://127.0.0.1:8080/graphiql to query 
```
## Example Queries

* Create: 
```
mutation createUser($user: UserInput!) {
  createUser(input:$user){
    email,
    username,
    firstName,
    lastName,
    isAdmin,
    role,
    createdDate
  }
}

variables:
{
  "user":{ 
    "email": "contact@rayedbajwa.com",
    "username": "Rayed4",
    "firstName":"banwa",
    "lastName": "M",
    "isAdmin": true,
    "role": "ADMIN",
  	"createdDate": "110002028250"
  }
}
```
* Fetch
```
queries {
  users {
  email,
    username,
    firstName,
    lastName,
    isAdmin,
    role,
    createdDate
  }
}
```

## Running the tests
```
TODO
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [SpringBoot](https://spring.io/guides/gs/spring-boot/) - The web framework used
* [Gradle](https://gradle.org/) - Dependency Management
* [GraphQL](https://graphql.org/) - building API
* [MongoDB](https://docs.mongodb.com/) - NOSQL for data layer

## Authors

* **Rayed Bajwa** - *Initial work* - [RayedBajwa](https://github.com/rayedbajwa)
