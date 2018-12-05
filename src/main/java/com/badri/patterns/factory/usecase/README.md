**Factory**

Is creational pattern that abstracts or hides the object creation process.

Think about the Car Factory, A car factory is responsible for manufacturing the cars.
A Car dealer need not worry about how the car is manufactured.Simply ask the car factory to deliver it to Dealer.
what essentially it does, it hides the complexity of object creation.


Example : 
From JDBC space, when you connect to different database like Oracle, Mysql and Sql Server, we use jdbc driver which is an interface.
The implementation of Driver interface is provided by different vendors, responsibility of driver is to connect to a particular database and execute sql statements.    
To get a connection, we need not remember each and every driver and how it works internally.  


