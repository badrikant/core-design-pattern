Singleton Pattern

Is creational Pattern and which allows application to create one and only one object of particular class. No matter how many times that class is used in application.
Example : 
* PropertyReader class which reads data from properties file and can be used in multiple times in different class in application. But we create a single object of PropertyReader Class which is shared across multiple classes in application which saves memory.
* Logger class which is used to log different type of information such as Error, Debug and general Info. A good example of singleton pattern.
* DataSource class in JDBC world is responsible for maintaining a connection pool and giving connection from connection pool. 

How to create singleton object (Minimum Steps )- 
*  By declaring private constructor -  No other class can create the object of that class directly.
*  By declaring a static method  -  other class can use to create a object 
*  By declaring a static member of the same class type in the class - return the same type of that class. 
