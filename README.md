# BookAPI
IT school workshop project. REST API for book management

## General purpose
This application managing inmemory stored books

## Book model content
* Book
    * id;
    * isbn;
    * title;
    * author;
    * publisher;
    * type;
   
## Functionalities
CRUD operations/Available endpoints:
    * .../books (GET) - *list all books*
    * .../books (POST) - *add a book using given data*
    * .../books/{id} (GET) - *show details of the book with given ID*
    * .../books (PUT) - *update the book using given data*
    * .../books/{id} (DELETE) - *delete the book with given ID*

## Technologies and tools used?
* Spring
* Spring WebMVC
* Spring RestController
* Lombok
* Jackson databind
* JSON
* Postman
* InteliJ IDEA
