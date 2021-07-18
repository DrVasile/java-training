# Java SE 


## What is Java SE?
Java SE is a programming platform that provides the basic functionalities for Java development.
It is the basic Java specification and, it is provided in the form of the JDK.


## What are JDK, JRE and JVM?

**JDK** stands for Java Development Kit. 
It is necessary for compilation, documentation or packaging Java programs.
It contains JRE and other development tools.

**JRE** stands for Java Runtime Environment.
It refers to a runtime environment in which Java byte code can be executed.
It is an implementation of the JVM abstract Machine.   

**JVM** stands for Java Virtual Machine.
It is an abstract machine. It is a specification of a runtime environment in which Java code can be executed.
It follows three notations: Specification, Implementation and Runtime Instance.


## What is the main method in a Java program?

The main method is the entry point for any Java program.
It needs to be public and static in order to be accessible by the JVM.
It accepts an array of String parameters.


## Why is Java platform independent?

Java is platform independent because the Java code is compiled into byte code which can be run on any system.


## Why Java is not 100% OO? 

Java is not 100% OO because it has also 8 primitive data types which are the following:
- byte: 8 bits (-128 ... 127);
- short: 16 bits (32,768 ... 32,767);
- int: 32 bits (-2^31 ... 2^31 - 1);
- long: 64 bits (-2^63 ... 2^63 - 1);
- float: 32 bits;
- double: 64 bits;
- boolean: True or False;
- char: 16 bits ('\u0000' ... '\uffff');


## What are wrapper classes in Java? 

Wrapper classes in Java are classes that are used to wrap another values / objects.
For example, wrapper classes are used to convert primitives into reference types. 
They wrap the primitive data type into an object.


## What are constructors in Java? 

In Java, a constructor is a method which has the same name as the class and has no return type.
It is called when an object of the respective class is being created.


## What is the difference between equals() and == in Java?

The equals() method is defined in the Object class and is used for checking the equality of two objects.
The "==" operator is a binary operator used to compare primitives or references.


## What is the difference between Heap and Stack memory in Java?

**Stack** memory is used only by one thread of execution. 
It can't be accessed by other threads.
It follows the LIFO manner to free memory. 
The stack exists until the end of execution of the thread.
Stack memory only contains local, primitive and reference variables to objects in the heap memory.

**Heap** memory is used by all the threads of execution.
Objects stored in the heap are globally accessible.
Memory management is based on the generation associated with each object.
Heap memory exists from the start until the end of application execution.
Whenever an object is created, it is always stored in the heap. 


## What is a package and what is it used for?

A package is a bundle of related classes and interfaces. 
Packages can be used to achieve modularity.
The advantages of using packages are as follows: 
- Packages help in avoiding name clashes.
- They provide easier access control.
- They can hide classes or interfaces that are not supposed to be access outside the package.
- Packages create a hierarchical structure of files.


## Why Java doesn't use pointers?
 
Java doesn't use pointers in order to keep the simplicity of the code. 
JVM is responsible for memory management.


## What is JIT compiler in Java? 

**JIT** stands for Just-In-Time compiler. 
It has the purpose of optimizing Java byte code that is subsequently sent to the interpreter.
It is enabled by default in Java.


## What are access modifiers in Java?

In Java, the access modifiers are keywords used to restrict the access of a class, constructor, attribute or method.
There are 2 levels of access control, that is at the top class level and at the member level. 
Java supports 4 access modifiers as follows: 
- public: Accessible anywhere.
- protected: Accessible in the package or in sub-classes from other packages.
- default: Accessible in the package.
- private: Accessible in the class.


## What are the 4 main concepts of OOP in Java?

- **Encapsulation** is a mechanism of grouping and hiding data or implementation details together as a unit.
- **Inheritance** is a process in which a class acquires attributes or methods of another.
- **Abstraction** is a methodology of hiding the implementation and providing only the functionalities by creating abstraction levels.
- **Polymorphism** is the ability of an object to take different forms via different mechanisms(e.g., overloading, overriding, generics).


## What is the final keyword?

The Java keyword final is a non access modifier. 
It can be assigned to a variable, method or class.
A final variable can't have its value changes once it is assigned.
A final method cannot be overridden by a subclass.
A final class cannot be extended by a subclass, but it can extend other classes.


## What are the differences between this() and super() in Java? 

The current instance of the class is represented by this() keyword.
It is used to call the default constructor or the methods of the class.
The super() keyword represents the current instance of the base class.
It is used to call the default constructor or the methods of the base class.


## Why Java Strings are immutable?

In Java, Strings are immutable they are generally cached in the String pool.
Since String literals are usually shared between multiple clients, action from one client might affect the rest.
It enhances security, caching, synchronization, and performance of the application.


## What is Java String Pool? 

Java String Pool is a collection of Strings which are stored in heap memory. 
Whenever a new object is created, the String Pool checks if there is already an object with this value.
If there is one it returns the same reference, otherwise it will create a new object.


## What is meant by constructor chaining in Java? 

In Java, constructor chaining is the process of calling a constructor from another.
It is possible only through legacy where the base class constructor is invoked by the derived class constructor.


## What are the differences between String, StringBuilder and StringBuffer? 

- **Storage Area**
    - Heap Area / Constant String Pool;
    - Heap Area;
    - Heap Area;
- **Mutability**
    - Immutable;
    - Mutable;
    - Mutable;
- **Thread Safety**
    - Yes;
    - No;
    - Yes;
- **Performance**
    - Fast;
    - More efficient;
    - Less efficient;


## What is a classloader in Java?

A Java classloader is a subset of the JVM that is responsible for loading class files.
Java provides three built-in classloader types: 
1. Bootstrap Classloader;
2. Extension Classloader;
3. System / Application Classloader;


## What is a collection in Java?

In Java, a collection is a data structure that stores and manipulates groups of data.
The collections are organized as a framework which includes interfaces, classes and methods.

![Collections Hierarchy](../img/collection_hierarchy.png)


## What is the difference between Array List and a Vector?

**ArrayList**:
- Array List is not thread safe.
- It is fast as it is not synchronized.
- In case of the capacity being reached the size is incremented by 50%.
- Array List doesn't define the increment size.
- Array List can only use Iterator for traversing.

**Vector**:
- Vector is thread safe.
- It is slow as it is synchronized.
- It defaults to doubling size of its array.
- Vector defines the increment size.
- Vector can use both Enumeration and Iterator for traversing.


## What are the differences between Array and ArrayList? 

**Array**:
- The size must be defined at the time of the declaration.
- In order to add data the index must be specified.
- Arrays are not type parameterized.
- Arrays can contain primitives as well as objects.

**ArrayList**:
- Size can be dynamically changed.
- There is no need to specify the index when adding elements.
- ArrayLists are type parameterized.
- ArrayLists can contain only objects.


## What is a Map in Java?

In Java, Map is an interface from Util package which doesn't extend the Collection interface.
It stores pairs of values and unique keys.


## What is a Hashtable?
A hashtable is a synchronized collection object.
It allows null value but not duplicate values.



# Java OOP


## What is an association?

An association is a relationship in which all the objects have their own lifecycle and there is no owner of the relation.
This can be one to one, one to many, many to one or many to many.


## What is an aggregation?

An aggregation is a special type of association in which there exists an owner.
Multiple child classes can be owned by the parent class.


## What is a composition?

A composition is another type of association in which the child classes compose the parent class.
In case the parent class is destroyed so are the child ones.


## What types of inheritance are in Java?

Java supports 4 types of inheritance:
- Single: Between one parent and one child class;
- Multilevel: A class has multiple parents at different levels;
- Hierarchical: More child classes have the same parent class;
- Hybrid: Combination of the above;


## What is multiple inheritance?

Multiple inheritance means having a child class that extends multiple parent classes.
It is not supported by Java because in Java a class can extend only one class.
The problem with this technique is that if some parent classes have a method with the same name, at runtime it is not clear which one to be taken.
NOTE: Diamond problem;


## What is an interface in Java?

An interface is a blueprint for a class.
It contains abstract methods and static constants.
It can be subsequently implemented by a class.


## What are the differences between Abstract classes and interfaces?

**Abstract class**:
- It can provide complete or abstract methods that have to be implemented.
- Another class can extend only one abstract class.
- It can have instance variables and constructors.
- It can have any visibility.
- Abstract classes operate fast.

**Interface**:
- It provides only abstract methods.
- A class can implement several interfaces.
- It cannot have instance variables or constructors.
- The visibility must be public or default.
- Interfaces operate slow and require extra indirection to find the corresponding method in the actual class.


## What is abstraction in Java?

Abstraction is the act of hiding the implementation from the user revealing only the functionalities.
This can be done by creating abstraction levels.
Abstraction can be achieved by using abstract classes or interfaces.


## What types of polymorphism are in Java?

There are 2 types of polymorphism: 
- Compile time: Method Overloading;
- Run time: Method Overriding;


## What is runtime polymorphism or dynamic method dispatch? 

The runtime polymorphism or dynamic method dispatch is achieved by having methods with the same name in a superclass and its subclass.
The method implementation is based upon what constructor is used when creating an instance of the object.


## Can a private or static method be overridden?

A private or static method cannot be overridden.


## What is a marker interface?

A marker interface is an empty interface. 
It is used to mark a class rather that providing abstract methods or constants.


## What is object cloning?

Cloning an object means creating a new one of the same class as the first one and initiating it with the same state.
Java provides an interface, java.lang.Cloneable which has the method clone().


## What is a copy constructor?

A copy constructor is a member function used to initialize an object using another object of the same class.
It is not used in Java.


## What is a singleton class in Java?

A singleton class in Java is a class which can be instantiated only once in a JVM.
A class can be made a singleton by making its constructor private and providing a public accessor method.



# Exception handling


## What are the differences between Error and Exception?

An error is an irrecoverable condition occurring at runtime, for example OutOfMemoryError.
Although an error can be caught in the catch block, but the execution of application will come to a halt and is not recoverable.

An exception on the other hand, occurs because of bad input or programmer errors.
These can be handled by providing a feedback for the programmer.


## How exceptions can be handled in Java?

There are 5 mechanisms for exception handling in Java:
1. try
2. catch
3. finally
4. throw
5. throws


## What are the differences between checked and unchecked exceptions?

The checked exceptions extend the Exception class excepting the Runtime hierarchy.
These are checked at compile time.

The unchecked exceptions extend RuntimeException class.
These are not checked at compile time.


## What do the keywords finally and finalize do?

The "finally" keyword is used to place code that will be executed whether the exception is handled or not.
The finalize method is used to perform clean up processing just before the object is garbage collected.


## What are the differences between throw and throws?

The "throw" keyword is used:
- to explicitly throw an exception.
- in a method, and it is followed by a new instance.

The "throws" keyword is used 
- to declare a possible exception. 
- in the method signature, to propagate checked exceptions.


## What is the exception hierarchy in Java?

![Exception Hierarchy Diagram](../img/exception_hierarchy.png)


## How to create a custom Exception?

To create a custom exception the new class needs to extend the Exception class or any of its subclasses.


## What are the main methods of Throwable class?

The main methods defined in Throwable class:
- String getMessage(): Returns the message String of Throwable, and the message can be provided while creating the exception through its constructor.
- String getLocalizedMessage(): This method is provided so that subclasses can override it to provide locale specific message to the calling program.
  Throwable class implementation of this method simply use getMessage() method to return the exception message.
- Synchronized Throwable getCause(): Returns the cause of the exception or null if the cause is unknown. 
- String toString(): Returns the information about Throwable in String format.
  The returned String contains the name of Throwable class and localized message.
- void printStackTrace(): This method prints the stack trace information to the standard error stream.
  This method is overloaded, and we can pass PrintStream or PrintWriter as an argument to write the stack trace information to the file or stream. 
- Throwable fillInStackTrace(): Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.


## Is there a case when "finally" block will not execute?

The "finally" block will not be executed if:
- the program exits either by calling "System.exit()" method. 
- fatal error appears that causes the process to abort.


## Can a try block be followed by multiple catch blocks?

There can be multiple catch blocks under single try block, but the exceptions should be from specific to general.


## What is OutOfMemoryError in Java?

OutOfMemoryError is a subclass of java.lang.Error which generally occurs when our JVM runs out of memory.



# Multithreading


## What are the differences between processes and threads?

**Process**:
- An executing instance of a program.
- Processes must use inter-process communication to communicate with sibling processes.
- Processes can only exercise control over child processes.
- Any change in the parent process does not affect child processes.
- Processes run in separate memory space.
- A process is controlled by the operating system.
- Processes are independent.

**Thread**:
- A thread is a subset of a process.
- Threads can directly communicate with other threads of its process.
- Threads can exercise considerable control over threads of the same process.
- Any change in the main thread may affect the behavior of the other threads of the process.
- Threads run in shared memory space.
- Threads are controlled by the programmer.
- Threads are dependent.


## What is synchronization?

Synchronization refers to multithreading.
A synchronized block of code can be executed by only one thread at a time.
As Java supports execution of multiple threads, two or more threads may access the same fields or objects.
Synchronization avoids memory consistency errors caused due to inconsistent view of shared memory.
When a method is declared as synchronized the thread holds the monitor for that method’s object.
If another thread is trying to execute the synchronized method the thread is blocked until that thread releases the monitor.


## What is a thread?

A thread is the smallest piece of programmed instructions which can be executed independently by a scheduler.
In Java, all the programs will have at least one thread which is known as the main thread.
This main thread is created by the JVM when the program starts its execution.
The main thread is used to invoke the main() of the program.


## How a thread can be created in Java?

In Java, there are two ways of creating threads:
- By implementing the Runnable interface;
- By extending the Thread class;


# Garbage Collection


## What is a garbage collector in Java?

A garbage collector in Java is a program which helps in implicit memory management.
Since in Java, using the new keyword you can create objects dynamically, which once created will consume some memory.
Once the job is done and there are no more references left to the object, the garbage collection destroys the object and relieves the memory occupied by it.
Java provides four types of garbage collectors:
- Serial
- Parallel
- CMS
- G1



# J2EE


## What is J2EE

Java Enterprise Edition (J2EE) is a programming platform that is used to develop and run large scale applications.
It is based off of J2SE and add facilities like: web frameworks, servlets, JSP etc.


## What are the components of J2EE applications?

The components of J2EE applications include the following:
- Client tier components which run on client machines.
- Web tier components which run on J2EE server.
- Business tier components which run on J2EE server.
- Enterprise Information System Software (EIS Software) which runs on the EIS server.


## What are the J2EE client types?

The types of J2EE clients are:
- Applets.
- Application clients.
- Java Web Start clients.
- Wireless clients, based on Mobile Information Device Profile (MIDP) technology.


## What is a J2EE container?

A J2EE container is the interface between a component, and the low level platform that executes the functions provided by the component.


## What are defined as web components?

Examples of web components can be:
- Servlets: Java programs that run on servers.
- Java Server Pages (JSP): Java syntax for creatign static content.


## What is MVC in Apache Struts?

MVC stands for Model View Controller.
- Model: the internal representation of the data.
- View: the client view, usually constructed using Java Server Pages (JSP) technology.
- Controller: the component that focuses on receiving client requests and producing responses.


## What is JSF?

JSF stands for Java Server Faces.
It is a UI designing framework for Java Web application developments.
It contains a set of reusable UI components associated with JSF.
Also, JSF has based on Model-View-Controller (MVC).


## What is a thin client?

A program interface that does not have any
- operations like database queries;
- complex business rules;
- any connection to a third-party application;


## What are the .jar, .war and .ear files?

- __*.jar files__: Include property files containing libraries, resources, and accessories.
- __*.war files__: Include the files that are required for the development of web applications (HTML, java scripts, JSP).
- __*.ear files__: Include the files for Enterprise Java Beans modules.


## What is Enterprise Java Beans (EJB)?

EJB is the server-side component that executes in EJB container and encapsulates the business logic for the enterprise application.


## What are the system services of EJB?

EJB Container provides the following system services:
- Persistence
- Security
- Transaction
- Connection pooling
- Component lifecycle management
- Threading


## What are the basic and subtypes of Enterprise Java Beans (EJB)?

There are two main types and subtypes of EJB are as follows:
- Session Beans:
  - Stateful session beans
  - Stateless session beans
- Entity Beans
  - Bean Managed Persistence (BMP)
  - Container Managed Persistence (CMP)
  - Message Driven Beans



# Java Servlets


## What is a Servlet?

A servlet is a Java program that runs on a web server.
Servlets receive requests and respond to web clients.
Java provides javax.servlet and javax.servlet.http packages for writing servlets.
A servlet should implement the javax.servlet.Servlet interface which defines lifecycle methods.
The most commonly used protocol for the servlet is Hypertext Transfer Protocol (HTTP).


## What are the HTTP methods?

- GET: 
  - Request doesn't have body;
  - Response has body;
  - Safe;
  - Idempotent;
  - Cacheable;
  - Allowed in HTML forms;
  
- HEAD 
  - Request has body;
  - Response doesn't have body;
  - Safe;
  - Idempotent;
  - Cacheable;
  - Not allowed in HTML forms;
  
- POST 
  - Request has body;
  - Response has body;
  - Not safe;
  - Not idempotent;
  - Cacheable only if freshness information is included;
  - Allowed in HTML forms;
  
- PUT
  - Request has body;
  - Response doesn't have body;
  - Not safe;
  - Idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;
  
- PATCH
  - Request has body;
  - Response has body;
  - Not safe;
  - Not idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;
  
- DELETE
  - Request may have body;
  - Response may have body;
  - Not safe;
  - Idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;
  
- TRACE
  - Request doesn't have body;
  - Response doesn't have body;
  - Not safe;
  - Idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;
  
- OPTIONS
  - Request doesn't have body;
  - Response has body;
  - Safe;
  - Idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;

- CONNECT
  - Request doesn't have body;
  - Response has body;
  - Not safe;
  - Not idempotent;
  - Not cacheable;
  - Not allowed in HTML forms;


## What is a Request Dispatcher?

The Request Dispatcher interface is used to forward the requests to another resource.
There are 2 methods defined in this interface: 
- void forward()
- void include()


## What are the differences between forward() and sendRequest() methods?

The forward() method sends the same request to another resource.
It works within the server side.

The sendRequest() method always sends a new request because it uses the URL bar of the browser.
It works on the client side.


## What is the lifecycle of a servlet?

There are 5 stages in the lifecycle of a servlet: 
- Class Loading: Web container loads the servlet class file (*.class).
- Instantiation: By calling default no-arg constructor, the servlet class gets instantiated.
- Initialization: The method init() is called in this phase. 
- Request Handling: The servlet provides the services to various requests.
- Destruction: The destroy() method is called before servlet destruction.


## How do cookies work in Servlets? 

Servlet API provides cookies support through javax.servlet.http.Cookie class, that implements Serializable and Cloneable.
HttpServletRequest getCookies() method gets the array of Cookies from the request.
HttpServletResponse addCookie(Cookie c) method is provided to attach cookies in response header.


## What are the differences between ServletContext and ServletConfig?

Servlet Context represents the whole web application running on a JVM and is common for all the servlets.
It is accessed with the method getServletContext().
Used for application scope wide or session data.

Servlet Config represents a single servlet.
It is accessed with the method getServletConfig().
Used for servlet scope wide data.


## What are the methods of session management in servlets?

A session is a conversational state between the client and the server.
Since HTTP and Web Server are both stateless, the only way to maintain a session is through an information which is passed in every request.
The common ways of session management are: 
* User Authentication
* HTML hidden field
* Cookies
* URL Rewriting
* Session Management API



# JSP


## What JSP tags are there?
There are 4 different types of tags associated with JSP. 
These are mentioned below:
- Directives
- Declarations
- Scriptlets
- Expressions


## What are the lifecycle methods of a JSP?

- __public void jspInit()__: It is invoked only once, in order to init the instance.
- __public void _jspService(ServletRequest request, ServletResponse response) throws ServletException, IOException__: It is invoked at each request.
- __public void jspDestroy()__: It is invoked only once, in order to destroy the instance.


## What are the implicit JSP objects?

The implicit JSP objects are:
1. out: JspWriter;
2. request: HttpServletRequest;
3. response: HttpServletResponse;
4. config: ServletConfig;
5. session: HttpSession;
6. application: ServletContext;
7. pageContext: PageContext;
8. page: Object;
9. exception: Throwable;


## What are the differences between "include directive" and "include action"?

The "include directive" includes the content at page translation time.
It includes the original content of the page, so the page resizes at runtime.
It is better for static pages.

The include action includes the content at request time.
It doesn't include the original content rather invokes the include method of the vendor provided class.
It is better for dynamic pages.


## How to disable caching on back button of the browser?

```
response.setHeader("Cache-Control", "no-store");
response.setHeader("Pragma", "no-cache");
response.setHeader("Expires", "0");
```


## What are the tag types provided in JSTL?

There are 5 types of JSTL tags:
1. Core tags
2. SQL tags
3. XML tags
4. Internationalization tags
5. Function tags


## How to disable a session in a JSP?

```
<%@ page session="false" %>
```


## How to delete a cookie in a JSP?

```
Cookie cookie = new Cookie("name1", "value1");
response.addCookie(cookie);
Cookie killCookie = new Cookie("name1","value1");
killCookie.setMaxAge(0);
killCookie.setPath("/");
killCookie.addCookie(killCookie);
```


## What is the jspDestroy method?

The jspDestroy method is invoked from javax.servlet.jsp.JspPage interface whenever a JSP page is about to be destroyed.
Servlets destroy methods can be easily overridden to perform cleanup, like when closing a database connection.


## How is JSP better than Servlet technology?

JSP is a technology on the server’s side to make content generation simple.
They are document-centric, whereas servlets are programs.
A Java server page can contain fragments of Java program, which execute and instantiate Java classes.
However, they occur inside an HTML template file.
It provides the framework for the development of a Web Application.


## How to use JSP EL in order to get the HTTP method name?

Using pageContext JSP EL implicit object one can get the request object reference and make use of the dot operator to retrieve the HTTP method name in the JSP page.
The JSP EL code for this purpose will look like:
```
${pageContext.request.method}
```


## What is an action form?

A Java bean that is associated with a single or multiple action mappings is called an action form. 
Action form objects are automatically populated at the server end when data has been entered from the client side through a user interface (UI).
Session states of a web application are maintained by action forms.



# Spring Framework


## What is Spring?

Spring is an application framework and inversion of control container for the Java Enterprise Edition platform.


## What are the advantages of using Spring?
The advantages of using Spring are:
- Plain Old Java Object (POJO) based development facilitates to re-use existing components.
- Reduce development cost by improving the productivity of the application development.
- Improve the testability of application with dependency injection. 
- Improve maintainability with reduced code coupling.
- No need to have an application server.


## What are the modules of Spring?

Some of the most important modules are:
- Spring Context: Dependency Injection;
- Spring AOP: Aspect Oriented Programming;
- Spring DAO: Database operations with Data Access Object pattern;
- Spring JDBC: JDBC and DataSource support;
- Spring ORM: Object Relational Mapping;
- Spring Web Module: For Web Applications;
- Spring MVC: Model View Controller;


## What is a bean and what are its scopes?

A bean is an object that is instantiated, assembled and managed by the IoC container.
There are five possible bean scopes:
- Singleton:
  - One instance is created for a container.
  - This is the default scope for spring beans.
  - This kind of beans should not have shared instance variables because are not thread safe.
- Prototype:
  - A copy is created every time the bean is requested.
- Request:
  - This is the same as the prototype, but it is meant for HTTP requests in a web application.
- Session:
  - A new bean is created for each HTTP session.
- Global-Session:
  - A new bean is created for a global session in a Portlet application.


## What are the roles of DispatcherServlet and ContextLoaderListener?

DispatcherServlet is the front controller in the Spring MVC applications.
It has the role of loading the spring bean configuration files and all the defined beans.
If annotations are enabled it also scans the packages for any bean annotated with @Component, @Controller, @Repository or @Service.

ContextLoaderListener is the listener that starts up and shuts down the WebApplicationContext in Spring root.
Its functions include tying up the lifecycle of Application Context to the lifecycle of the ServletContext and automating the creation of ApplicationContext.


## What is autowiring in Spring?

Autowiring gives the possibility to inject beans automatically without additional logic.


## What autowiring modes exist in Spring?

There are 4 autowiring modes:
- no: The default mode, which means that autowiring is not enabled.
- byName: Injects the bean based on the name property. It uses the setter.
- byType: Injects the bean based on the type property. It uses the setter.
- constructor: Injects the bean using the constructor.


## What are the differences between constructor and setter injection?

In the case of constructor injection, a new instance is created if any modification occurs.
Constructor injection doesn't support partial injection.
It is better when there are many properties.
Doesn't override the setter property.

In the case of setter injection, the existing instance is updated.
Setter injection does support partial injection.
It is better for few properties.
Does override the constructor property if both are defined.


## How to handle exceptions in Spring MVC framework?

Spring MVC framework provides the following mechanisms for exception handling:
- Controller based: 
  - Define exception handler in the controller classes.
  - Annotate the methods with ExceptionHandler annotation.
- Global Exception Handler:
  - Spring provides ControllerAdvice annotation that can be used with any class to define the global exception handler.
- HandlerExceptionResolver implementation:
  - Spring Framework provides HandlerExceptionResolver interface that we can implement to create global exception handler.


## How is Hibernate integrated with Spring?

The Spring ORM module is used to integrate Spring and Hibernate frameworks.
For the integration use DAO pattern with dependency injection.
Spring ORM provides support for using Spring declarative transaction management.


## What are the types of transaction management that Spring supports?

Spring supports two types of transaction management:
- Programmatic transaction management: 
  - The transaction is managed with the help of programming.
  - It provides extreme flexibility, but it is very difficult to maintain.
- Declarative transaction management:
  - The transaction management is separated from the business code.
  - Only annotations or XML based configurations are used to manage the transactions.


TODO:
# JDBC

## What is a JDBC Driver?

A JDBC Driver is a software that enables Java code to communicate with the database.
There are 4 types of JDBC drivers:
* JDBC-ODBC
* Native-API driver (partially java driver)
* Network Protocol driver (fully java driver)
* Thin driver (fully java driver)

## What are the steps to connect to a database?

1. Registering the driver class
2. Creating connection
3. Creating statement
4. Executing queries
5. Closing connection

## What are the JDBC API components?

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

## What is the role of JDBC DriverManager class?

The JDBC DriverManager class has the role to manage the registered drivers. 
It provides a factory method that created instances of Connection.

## What is JDBC Connection interface?

The JDBC Connection interface maintains a session with the database. 
It can be used to manage transactions.
It provides factory methods that return instances of Statement, PreparedStatement and others.

## What is JDBC ResultSet interface? 

The ResultSet object represents a row in a table.
It can be used to change the cursor pointer and get the information from the database.

## What is JDBC ResultSetMetaData interface? 

The ResultSetMetaData interface returns the information about a table such as number of columns, column name etc.

## What is JDBC DatabaseMetaData interface? 

The DatabaseMetaData interface returns the information about a database such as username, driver information, number of tables etc.

## What is a JDBC statement? 

A JDBC statement is a set of instructions used to communicate with the database.
JDBC supports 3 types of statements: 
* Statement: Used for general purpose access to the database executing static S
* Prepared Statement: Used to execute queries with parameters that are provided during execution.
* Callable Statement: Used to access stored procedures and helps in accepting runtime parameters.

## What do you mean by batch processing in JDBC? 

Batch processing helps to group related S

## What is the difference between execute, executeQuery and executeUpdate?

The execute statement is used to execute any S
It returns true when there is a result set and false otherwise.
The result set can be retrieved using getResultSet().
The update count can be retrieved using getUpdateCount().

The execute
The returned ResultSet is never null.
In case for DML statements it throws java.sql.S

The executeUpdate statement is used to execute DML or DDL statements that return nothing.
The output is an int, and it is the row count.



# Hibernate


## What is Hibernate?

Hibernate is an open-source object-relational mapping and query service which facilitates writing Hibernate Query Language (HQL) scripts instead of Structured Query Language (SQL) scripts.
It is an implementation of Java Persistence API.
It is a fast and easy process than writing native SQL. 
Hibernate has more powerful object-oriented contents like associations, inheritance, and polymorphism.
Also, it has powerful compositions and collections. 
Hibernate allows making queries using a Java-based approach.


## What are the benefits of using Hibernate?

The advantages of using Hibernate are:
- No need for the boiler-plate code that comes with JDBC.
- It takes care of resource management.
- It provides support for XML as well as JPA annotations.
- It is independent of what database vendor is used.
- It is easy to integrate with other Java EE frameworks.
- Has support for lazy initialization using proxy objects.


## What are the limitations of using Hibernate?
Some limitations of using Hibernate are:
- In execution of HQL queries take more time than if executed directly in SQL.
- Only composite key support is available, and it prevents advanced query options.
- No shared value type references are available.


## How is organized the architecture of Hibernate? 

![Hibernate Architecture](../img/hibernate_architecture.png)


## What is the use of save() method?
In hibernate, the save() method is used to store objects into the database.
There is a check for duplicate records before inserting it.


## What is the use of saveOrUpdate() method?
In hibernate, the method saveOrUpdate() is used to update an object using the identifier.
When the value for the identifier is NULL then the method is directed to call save().


## What are the differences between get and load methods?

The get method returns null if the object is not found in the database or cache.
It always hits the database.
It returns a real object.
It should be used if the existence of the object is not guaranteed.

The load methods throws ObjectNotFoundException if the object is not found in the database or cache.
It doesn't hit the database.
It returns a proxy object.
It should be used if the existence of the object is guaranteed.


## What is meant by connection pooling?
Connection pooling is a mechanism of reusing the existing connections.
The pooling mechanism maintains a number of already created object connections.
When needed, the mechanism directly uses the existing connection without creating a new one.


## What are the collection types in Hibernate?
One-to-many relation is defined as a collection.
There are five main collection types associated with J2EE. 
These are:
- Set type
- List type
- Array type
- Map type
- Bag type