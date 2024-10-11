# Spring Boot CRUD User API

This is a RESTful API built using Spring Boot for managing user data, including creating, reading, updating, and deleting user records. The API allows for operations such as individual user lookups, CPF-based searches, and listing all users.

## Features

- **Create User**: Add a new user to the system.
- **Read User**: Retrieve user details based on ID or CPF.
- **List Users**: List all users in the system.
- **Update User**: Update existing user information.
- **Delete User**: Soft delete user by marking the user as inactive.
  
## Technologies

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL** (or in-memory database support)
- **Hibernate**
- **Maven**

## Endpoints

- `POST /users`: Create a new user.
- `GET /users/{id}`: Get user by ID.
- `GET /users`: Get user by CPF (via query parameter).
- `GET /users/list`: List all users.
- `PUT /users/{id}`: Update user information.
- `DELETE /users/{id}`: Soft delete user by marking them as inactive.

## Getting Started

### Prerequisites

- Java 17
- Maven
- PostgreSQL (if using database integration)

### Installation

1. Clone the repository:

```bash
git clone https://github.com/yourusername/springboot-crud-user-api.git
```

2. Navigate to the project directory:

```bash
cd springboot-crud-user-api
```

3. Update the application.properties with your database connection details (if using PostgreSQL).

4. Build the project:

```bash
mvn clean install
```
5. Run the application:

```bash
mvn spring-boot:run
```
## API Testing

You can use tools like Postman or curl to test the API. Example requests:

Create a user:

```bash
POST /users
{
  "name": "John Doe",
  "cpf": "123.456.789-10",
  "age": 30,
  "address": "123 Main St",
  "favoriteColor": "Blue"
}
```
List all users:

```bash
GET /users/list
```

Update a user:

```bash
PUT /users/{id}
{
  "name": "John Smith",
  "cpf": "123.456.789-10",
  "age": 31,
  "address": "456 Another St",
  "favoriteColor": "Green"
}
```
## Demo Video

[![Demo Video](https://img.youtube.com/vi/nsaZfQFc3W-sZydM5e9uHHJQVIGVhhTe/0.jpg)](https://drive.google.com/file/d/1nsaZfQFc3W-sZydM5e9uHHJQVIGVhhTe/view?usp=sharing)

## Screenshots

### Create User
![Create User](https://drive.google.com/uc?id=1F1Vihv5XT_p8KUJGU5kHiHUmxqQ6OQTR)

### Find User by ID
![Find User by ID](https://drive.google.com/uc?id=1XzyJTB1GDWDuhBM9aXc8iAlSnN7y2zB9)

### Find User by CPF
![Find User by CPF](https://drive.google.com/uc?id=1PPfmJSWHjGpA_rVydOIsLi-kr8NnJ4Rd)

### List All Users
![List All Users](https://drive.google.com/uc?id=1X0BLn8QEnZ3EQfQLm98zWzzD9EVj4aNl)

### Application Running on IntelliJ
![Application Running on IntelliJ](https://drive.google.com/uc?id=1O4-NNEOLlbNTzjd8hmVBquIDOgrqvIq3)

## License

This project is licensed under the MIT License.

## Contact
For questions or feedback, feel free to reach out to me at [gabriel.cafe@ufrpe.br].

## 🖋️ Author

Developed by **[Gabrielcafens](https://github.com/Gabrielcafens)**.


```                         ___

                          ___
                      .-'   `'.
                     /         \
                     |         ;
                     |         |           ___.--,
            _.._     |0) = (0) |    _.---'`__.-( (_.
     __.--'`_.. '.__.\    '--. \_.-' ,.--'`     `""`
    ( ,.--'`   ',__ /./;   ;, '.__.'`    __
    _`) )  .---.__.' / |   |\   \__..--""  """--.,_
   `---' .'.''-._.-'`_./  /\ '.  \ _.--''````'''--._`-.__.'
         | |  .' _.-' |  |  \  \  '.               `----`
          \ \/ .'     \  \   '. '-._)
           \/ /        \  \    `=.__`'-.
           / /\         `) )    / / `"".`\
     , _.-'.'\ \        / /    ( (     / /
      `--'`   ) )    .-'.'      '.'.  | (
             (/`    ( (`          ) )  '-;    
            
  ( (                ( (                 ( (                
   ) )                ) )                 ) )               
.........           .........         .........           
|       |]         |       |]         |       |]                
\       /           \       /         \       /              
 `-----'             `-----'           `-----'  
