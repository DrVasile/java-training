# Basic Java 

## Q1. What are JDK, JRE and JVM?

**JDK** stands for Java Development Kit. 
It is necessary for compilation, documentation or packaging Java programs.
It contains JRE and other development tools.

**JRE** stands for Java Runtime Environment.
It refers to a runtime environment in which Java byte code can be executed.
It is an implementation of the JVM abstract Machine.   

**JVM** stands for Java Virtual Machine.
It is an abstract machine. It is a specification of a runtime environment in which Java code can be executed.
It follows three notations: Specification, Implementation and Runtime Instance.

## Q2. Explain public static void main(String args[]).

The main method is the entry point for any Java program.
It needs to be public and static in order to be accessible by the JVM.
It accepts the String array parameter.

## Q3. Why is Java platform independent?

Java is platform independent because the Java code is compiled into byte code which can be run on any system.

## Q4. Why Java is not 100% OO? 

Java is not 100% OO because it has also 8 primitive data types.

## Q5. What are wrapper classes in Java? 

Wrapper classes are used to convert primitives into reference types. 
They wrap the primitive data type into an object.

## Q6. What are constructors in Java? 

In Java, a constructor is a method which has the same name as the class and has no return type.
It is called when an object of the respective class is being created.

## Q7. What is a singleton class in Java?

A singleton class in Java is a class which can be instantiated only once in a JVM.
A class can be made a singleton by making its constructor private.

## Q8. What is the difference between Array List and a Vector?

Array List is not thread safe. 
It is fast as it is not synchronized.
If am element is inserted into the Array List, it increases its size by 50%.
Array List doesn't define the increment size.
Array List can only use Iterator for traversing.

Vector is thread safe.
It is slow as it is synchronized.
It defaults to doubling size of its array.
Vector defines the increment size.
Vector can use both Enumeration and Iterator for traversing. 

## Q9. What is the difference between equals() and == in Java?

The equals() is defined in the Object class and is used for checking the equality of two objects.

The "==" is a binary operator provided by Java to compare primitives or references.

## Q10. What is the difference between Heap and Stack memory in Java?

**Stack** memory is used only by one thread of execution. 
It can't be accessed by other threads.
It follows the LIFO manner to free memory. 
The stack exists until the end of execution of the thread.
Stack memory only contains local primitive and reference variables to objects in the heap memory.

**Heap** memory is used by all the threads of execution.
Objects stored in the heap are globally accessible.
Memory management is based on the generation associated with each object.
Heap memory exists from the start till the end of application execution.
Whenever an object is created, it is always stored in the heap. 

## Q11. What is a package and what is it used for?

A package is a bundle of related classes and interfaces. Packages can be used to achieve modularity.
The advantages of using packages are as follows: 
* Packages help in avoiding name clashes.
* They provide easier access control.
* They can hide classes or interfaces that are not supposed to be access outside the package.
* Packages creat a hierarchical structure of files.

## Q12. Why Java doesn't use pointers?
 
Java doesn't use pointers in order to keep the simplicity of the code. JVM is responsible for memory allocation.
 
## Q13. What is JIT compiler in Java? 

**JIT** stands for Just-In-Time compiler in Java. 
It has the purpose of converting Java byte code into binary instructions sent to the processor.
It is enabled by default in Java and it is activated when a method is invoked.
Once a method has been compiled, the JVM summons the code directly rather than interpreting it.

## Q14. What are access modifiers in Java?

In Java, access modifiers are keywords used to restrict the access of a class, constructor, attribute or method.
Java supports 4 access modifiers as follows: public, protected, default, private. 

## Q15. What are the main concepts of OOP in Java?

* **Encapsulation** is a mechanism of grouping and hiding data together as a unit.
* **Inheritance** is a process in which a class acquires attributes or methods of another.
* **Abstraction** is a methodology of hiding the implementation and providing only the functionalities.
* **Polymorphism** is the ability of an object to take different forms via different mechanisms(e.g. overloading, overriding etc.).

## Q16. What is the final keyword?

The Java keyword final is a non access modifier. It can be assigned to a variable, method or class.
A final variable can't have its value changes once it is assigned.
A final method cannot be overridden by a subclass.
A final class cannot be extended by a subclass, but it can extend other classes.

## Q17. What are the differences between this() and super() in Java? 

The current instance of the class is represented by this().
It is used to call the default constructor or the methods of the class.

The super() represents the current instance os the parent/base class.
It is used to call the default constructor or the methods of the base class.

## Q18. What is Java String Pool? 

Java String Pool is a collection of Strings which are stored in heap memory. 
Whenever a new object is created, the String Pool checks if there is already an object with this value.
If there is one it returns the same reference, otherwise it will create a new object.

## Q19. What is the constructor chaining in Java? 

In Java, constructor chaining is the process of calling a constructor from another.
It is possible only through legacy where the superclass constructor is invoked by the subclass constructor.

## Q20. What are the differences between String, StringBuilder and StringBuffer? 

* **Storage Area**
    * Constant String Pool;
    * Heap Area;
    * Heap Area;
* **Mutability**
    * Immutable;
    * Mutable;
    * Mutable;
* **Thread Safety**
    * Yes;
    * No;
    * Yes;
* **Performance**
    * Fast;
    * More efficient;
    * Less efficient;  
    
## Q21. What is a classloader in Java?

A Java classloader is a subset of the JVM that is responsible for loading class files.
Java provides three built-in classloader types: 
1. Bootstrap Classloader;
2. Extension Classloader;
3. System/Application Classloader;

## Q22. Why Java Strings are immutable? 

In Java, Strings are immutable they are generally cached in the String pool. 
Since String literals are usually shared between multiple clients, action from one client might affect the rest. 
It enhances security, caching, synchronization, and performance of the application. 

## Q23. What are the differences between Array and ArrayList? 

Arrays cannot contain values of different data types.
The size must be defined at the time of the declaration.
In order to add data the index must be specified.
Arrays are not type parameterized.
Arrays can contain primitives as well as objects.

ArrayLists can contain values of different data types.
Size can be dynamically changed.
There is no need to specify the index when adding elements.
ArrayLists are type parameterized.
ArrayLists can contain only objects.

## Q24. What is Map in Java?

In Java, Map is an interface from Util package which doesn't extend Collection.
It stores pairs of values and unique keys.

## Q25. What is a collection in Java?

In Java, a collection is a data structure that stores and manipulates groups of data.
The collections are organized as a framework which includes interfaces, classes and methods.

![Collections Hierarchy](../img/collection_hierarchy.png)

# Java OOP

## Q1. What types of polymorphism are in Java?

There are 2 types of polymorphism: 
* Compile time: Method Overloading;
* Run time: Method Overriding;

## Q2. What is runtime polymorphism or dynamic method dispatch? 

The runtime polymorphism or dynamic method dispatch is achieved by having methods with the same name in a super class and its sub class.
The method implementation is based on what constructor is used when creating an instance of the super class.

## Q3. What is abstraction in Java?

Abstraction is the act of hiding the implementation from the user revealing only the functionalities.
Abstraction can be achieved by abstract classes or interfaces.

## Q4. What is an interface in Java?

An interface is a blueprint for a class.
It contains abstract methods and static constants. 
It can be subsequently implemented by a class.

## Q5. What are the differences between Abstract classes and interfaces?

An abstract class, can provide complete or abstract methods that have to be implemented.
A class can extend only one abstract class.
An abstract class, can have instance variables and constructors.
An abstract class, can have any visibility.
Abstract classes operate fast.

An interface provides only abstract methods.
A class can implement several interfaces.
An interface, cannot have instance variables or constructors.
An interface's visibility must be public or default.
Interfaces operate slow and require extra indirection to find the corresponding method in the actual class.

## Q6. What types of inheritance are in Java?

Java supports 4 types of inheritance: 
* Single: Between one parent and one child class;
* Multilevel: A class has multiple parents at different levels;
* Hierarchical: More child classes have the same parent class;
* Hybrid: Combination of the above;

## Q7. Can a private or static method be overridden?

A private or static method cannot be overridden.

## Q8. What is multiple inheritance?

Multiple inheritance means having a child class that extends multiple parent classes.
It is not supported by Java because in Java a class can extend only one class.
The problem with this technique is that if some parent classes have a method with the same name, at runtime it is difficult to decide between them.
NOTE: Diamond problem;

## Q9. What is an association?

An association is a relationship in which all the objects have their own lifecycle and there is no owner of the relation.
This can be one to one, one to many, many to one or many to many.

## Q10. What is an aggregation?

An aggregation is a special type of association in which there exists an owner.
Multiple child classes can be owned by the parent class.

## Q11. What is a composition?

A composition is another type of association in which the child classes compose the parent class.
If the parent class is destroyed so are the child ones.

## Q12. What is a marker interface?

A marker interface is an empty interface. 
It is used to mark a class rather that providing abstract methods or constants.

## Q13. What is object cloning?

Cloning an object means creating a new one of the same class as the first one and initiating it with the same state.
Java provides an interface, java.lang.Cloneable which has the method clone().

## Q14. What is a copy constructor?

A copy constructor is a member function used to initialize an object using another object of the same class.
It is not used in Java.

# Java Servlets

## Q1. What is a Servlet?

A servlet is a Java program that runs on a web server.
Servlets receive and respond to requests from web clients.
Java provides javax.servlet and javax.servlet.http packages for writing servlets.
A servlet should implement the javax.servlet.Servlet interface which defines lifecycle methods.

## Q2. What are the HTTP methods?

* GET: 
    * Request doesn't have body;
    * Response has body;
    * Safe;
    * Idempotent;
    * Cacheable;
    * Allowed in HTML forms;
* HEAD 
    * Request has body;
    * Response doesn't have body;
    * Safe;
    * Idempotent;
    * Cacheable;
    * Not allowed in HTML forms;
* POST 
    * Request has body;
    * Response has body;
    * Not safe;
    * Not idempotent;
    * Cacheable only if freshness information is included;
    * Allowed in HTML forms;
* PUT
    * Request has body;
    * Response doesn't have body;
    * Not safe;
    * Idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
* PATCH
    * Request has body;
    * Response has body;
    * Not safe;
    * Not idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
* DELETE
    * Request may have body;
    * Response may have body;
    * Not safe;
    * Idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
* TRACE
    * Request doesn't have body;
    * Response doesn't have body;
    * Not safe;
    * Idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
* OPTIONS
    * Request doesn't have body;
    * Response has body;
    * Safe;
    * Idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
* CONNECT
    * Request doesn't have body;
    * Response has body;
    * Not safe;
    * Not idempotent;
    * Not cacheable;
    * Not allowed in HTML forms;
    
## Q3. What is a Request Dispatcher?

The Request Dispatcher interface is used to forward the requests to another resource.
There are 2 methods defined in this interface: 
* void forward()
* void include()
  
## Q4. What are the differences between forward() and sendRequest() methods?

The forward() method sends the same request to another resource.
It works within the server side.

The sendRequest() method always sends a new request because it uses the URL bar of the browser.
It works on the client side.

## Q5. What is the lifecycle of a servlet?

There are 5 stages in the lifecycle of a servlet: 
* Loading;
* Instantiation;
* Initialization;
* Request;
* Destruction;

## Q6. How do cookies work in Servlets? 

Servlet API provides cookies support through javax.servlet.http.Cookie class, that implements Serializable and Cloneable.
HttpServletRequest getCookies() method gets the array of Cookies from the request.
HttpServletResponse addCookie(Cookie c) method is provided to attach cookies in response header.

## Q7. What are the differences between ServletContext and ServletConfig?

Servlet Context represents the whole web application running on a JVM and is common for all the servlets.
It is accessed with the method getServletContext().
Used for application scope wide or session data.

Servlet Config represents a single servlet.
It is accessed with the method getServletConfig().
Used for servlet scope wide data. 

## Q8. What are the methods of session management in servlets?

A session is a conversational state between the client and the server and it can consist of multiple requests and responses.
Since HTTP and Web Server are both stateless, the only way to maintain a session is through a unique information which is passed in every request.
The common ways of session management are: 
* User Authentication
* HTML hidden field
* Cookies
* URL Rewriting
* Session Management API

# JDBC 

## Q1. What is a JDBC Driver?

A JDBC Driver is a software that enables Java code to communicate with the database.
There are 4 types of JDBC drivers:
* JDBC-ODBC
* Native-API driver (partially java driver)
* Network Protocol driver (fully java driver)
* Thin driver (fully java driver)

## Q2. What are the steps to connect to a database?

1. Registering the driver class
2. Creating connection
3. Creating statement
4. Executing queries
5. Closing connection

## Q3. What are the JDBC API components?

The java.sql package contains interfaces and classes for JDBC API.

Interfaces:
* Connection
* Statement
* PreparedStatement
* ResultSet
* ResultSetMetaData
* DatabaseMetaData
* CallableStatement
* etc.

Classes:
* DriverManager
* Blob
* Clob
* Types
* SQLException
* etc.

## Q4. What is the role of JDBC DriverManager class?

The JDBC DriverManager class has the role to manage the registered drivers. 
It provides a factory method that created instances of Connection.

## Q5. What is JDBC Connection interface?

The JDBC Connection interface maintains a session with the database. 
It can be used to manage transactions.
It provides factory methods that return instances of Statement, PreparedStatement and others.

## Q6. What is JDBC ResultSet interface? 

The ResultSet object represents a row in a table.
It can be used to change the cursor pointer and get the information from the database.

## Q7. What is JDBC ResultSetMetaData interface? 

The ResultSetMetaData interface returns the information about a table such as number of columns, column name etc.

## Q8. What is JDBC DatabaseMetaData interface? 

The DatabaseMetaData interface returns the information about a database such as username, driver information, number of tables etc.

## Q9. What is a JDBC statement? 

A JDBC statement is a set of instructions used to communicate with the database.
JDBC supports 3 types of statements: 
* Statement: Used for general purpose access to the database executing static SQL queries at runtime.
* Prepared Statement: Used to execute queries with parameters that are provided during execution.
* Callable Statement: Used to access stored procedures and helps in accepting runtime parameters.

## Q10. What do you mean by batch processing in JDBC? 

Batch processing helps to group related SQL statements and to execute them together in a query.

## Q11. What is the difference between execute, executeQuery and executeUpdate?

The execute statement is used to execute any SQL query, and it returns a boolean value.
It returns true when there is a result set and false otherwise.
The result set can be retrieved using getResultSet().
The update count can be retrieved using getUpdateCount().

The executeQuery statement is used to execute SELECT queries, and it returns the ResultSet.
The returned ResultSet is never null.
In case for DML statements it throws java.sql.SQLException.

The executeUpdate statement is used to execute DML or DDL statements that return nothing.
The output is an int, and it is the row count.

# Spring Framework

## Q1. What is Spring? 

Spring is an application framework and inversion of control container for the Java platform.

## Q2. What are the modules of Spring framework?

Some of the most important modules are: 
* Spring Context: Dependency Injection;
* Spring AOP: Aspect Oriented Programming;
* Spring DAO: Database operations with Data Access Object pattern;
* Spring JDBC: JDBC and DataSource support;
* Spring ORM: Object Relational Mapping;
* Spring Web Module: For Web Applications;
* Spring MVC: Model View Controller;

## Q3. What is a bean and what are its scopes? 

A bean is an object that is instantiated, assembled and managed by the IoC container.
There are five possible bean scopes:
* Singleton: 
    One instance is created for a container. 
    This is the default scope for spring beans.
    This kind of beans should not have shared instance variables because are not thread safe.
* Prototype: 
    A copy is created every time the bean is requested.
* Request: 
    This is the same as the prototype, but it is meant for HTTP requests in a web application.
* Session
    A new bean is created for each HTTP session.
* Global-Session
    A new bean is created for a global session in a Portlet application.
    
## Q4. What are the roles of DispatcherServlet and ContextLoaderListener? 

DispatcherServlet is the front controller in the Spring MVC applications.
DispatcherServlet has the role of loading the spring bean configuration files and all the defined beans.
If annotations are enabled it also scans the packages for any bean annotated with @Component, Controller, Repository or Service.

ContextLoaderListener is the listener that starts up and shuts down the WebApplicationContext in Spring root.
Its functions include tying up the lifecycle of Application Context to the lifecycle of the ServletContext and automating the creation of ApplicationContext.

## Q5. What is autowiring in Spring? 

Autowiring gives the possibility to inject beans automatically without additional logic.

## Q6. What autowiring modes exist in Spring? 

There are 4 autowiring modes: 
* no: The default mode, which means that autowiring is not enabled.
* byName: Injects the bean based on the name property. It uses the setter.
* byType: Injects the bean based on the type property. It uses the setter.
* constructor: Injects the bean using the constructor. 

## Q7. What are the differences between constructor and setter injection? 
 
In the case of constructor injection, a new instance is created if any modification occurs.
Constructor injection doesn't support partial injection.
It is better when there are many properties.
Doesn't override the setter property.

In the case of setter injection, the existing instance is updated.
Setter injection does support partial injection.
It is better for few properties.
Does override the constructor property if both are defined.

## Q8. How to handle exceptions in Spring MVC framework? 

Spring MVC framework provides the following mechanisms for exception handling: 
* Controller based: Define exception handler in the controller classes. 
Annotate the methods with ExceptionHandler annotation.
* Global Exception Handler: Spring provides ControllerAdvice annotation that can be used with any class to define the global exception handler.
* HandlerExceptionResolver implementation: Spring Framework provides HandlerExceptionResolver interface that we can implement to create global exception handler.

## Q9. How is Hibernate integrated with Spring? 

The Spring ORM module is used to integrate Spring and Hibernate frameworks.
In Hibernate 3+ where SessionFactory provides the current session.
For the integration use DAO pattern with dependency injection.
Spring ORM provides support for using Spring declarative transaction management.

## Q10. What are the types of transaction management that Spring supports? 

Spring supports two types of transaction management:
* Programmatic transaction management: The transaction is managed with the help of programming. 
It provides extreme flexibility, but it is very difficult to maintain.
* Declarative transaction management: The transaction management is separated from the business code. 
Only annotations or XML based configurations are used to manage the transactions. 

# Hibernate

# Q1. What is Hibernate? 

Hibernate is a Java based ORM tool that provides a framework for mapping domain models to database tables and vice-versa.
It is an implementation of Java Persistence API. 

# Q2. What are the benefits of using Hibernate?

1. No need for the boiler-plate code that comes with JDBC and takes care of resource management.
2. It provides support for XML as well as JPA annotations.
3. It provides a query language, HQL that is similar to SQL. However, HQL is fully OO and understands the OOP concepts.
4. It is open source.
5. It is easy to integrate with other Java EE frameworks.
6. Has support for lazy initialization using proxy objects.

# Q3. How is organized the architecture of Hibernate? 

![Hibernate Architecture](../img/hibernate_architecture.png)

# Q4. What are the differences between get and load methods?

The get method returns null if the object is not found.
It always hits the database.
It returns a real object.
It should be used if the existence of the object is not guaranteed.

The load methods throws ObjectNotFoundException if the object is not found.
It doesn't hit the database.
It returns a proxy object.
It should be used if the existence of the object is guaranteed.