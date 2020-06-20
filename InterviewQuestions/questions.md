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
 
