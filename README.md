# core-design-pattern

Patterns catalog are divided into two major part -

1. Gang of four (GOF) pattern catalog(Core Pattern)
    * Creational Patterns  -  Provides guidelines to instantiate single object or group of objects. Its all about object creation. 
        * Singleton
        * Factory 
        * Abstract Factory
        * Builder 
        * Prototype 
    * Structural Patterns  -   Provide a manner to define the relationships between classes.
        * Adaptor 
        * Bridge 
        * Flyweight 
        * Decorator 
        * Proxy 
    * Behavioural Patterns  - How the communicate should happen between classes and objects.
        * Command 
        * Interpreter 
        * Template Method
        * Observer
        * Visitor 
        * Momento
2. JEE Pattern catalog (Every java app is organised with multiple logical layers)
    * DAO Layer - Responsible to perforation database operation
        * Data Access Object 
    * Service(Business) Layer - Responsible for all business logic operation 
        * Business Delegate - delegate the business logic 
        * Transfer object - To carry the data around
        * Session facade  - Will wrap a lot of data instead making multiple calls
        * Service Locator - look up for appreciate service which needs to be invoked
    * Presentation  Layer - this will be present to our end client
        * Interceptor Filter Pattens
        * Front Controller 
        * MVC 
        * Context object 
    * Integration Layer - Responsible for integrating with other applications or communicating with other layers.
        * Service Activator
        * Web Service Broker

