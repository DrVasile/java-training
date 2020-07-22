# Chapter 1

## Java Basics

* __The structure of Java files__ :

    * Two types of files : 
        * Name.java - Source code file;
        * Name.class - Byte code file;
        
    * Java class : 
        * Package statement;
        * Import statements;
        * Comments (Optional wherever);
        * Class declaration { 
            * Variables;
            * Constructors;
            * Methods;
            * Nested classes / interfaces / Enums;
        * }
    
    * Java entities :  
        * Class;
        * Interface;
        * Enum;
        * Annotation;
        
    * Interface - Contract between classes which implement it, with related fields and methods;
    
        **NOTE** : Classes and interfaces can be declared in any order in a source code file.
     
* __Executable Java applications__ : 
    
    * Main method : 
    
        public static void main(String[] args)
        {
            // statements
        }
       
    * Command Line : 
        
        java ClassName params...
        
* __Packages__ : 

    * Rules of thumb : 
        * Package names should be all in lowercase;
        * Package and Sub-Package names are separated by dots;
        * Only one package statement can be in one file;
        
    * Classpath : 
        * Variable which lets JRE know where to look for the packages/classes;
        
    * Import : 
        * The import statement doesnt embed the contents in the class, which means 
        importing more doesnt increase the size of the class;
        
    * Wildcard (*) : 
        * By specifying * it will import all public members of a package;
        * It won't import members from subpackages;
        
    * Default package : 
        * Not named package;
        * Members from named package cannot access members from default package;
    
    * Static imports : 
        * Import static members;
        * import static someMemberName;

* __Access modifiers__ : 
    
    * public : 
        * Least restrictive; 
        * Accessible across all packages, from derived and unrelated classes;
        
    * protected :
        * Members are accessible to classes/interfaces from the same package or 
        derived classes by inheritance;
          
    * default :
        * Package accessible/Package private;
        * Protected can be referred to as Package private + derived classes by inheritance;
          
    * private :
        * Most restrictive;
        * Accessible only in the class members are defined;
        * Exception when using reflection;                                         

* __Non-Access modifiers__ : 

    * abstract : 
        * On a class that cannot be instantiated;
        * The class becomes abstract even if doesnt contain any abstract methods;
        * On an interface is redundant, it is abstract by default;
        * On a method it specifies that it will be implemented by a derived class; 
        
    * static : 
        * Static variables belong to the class not instance;
        * Constants are defined with final and static together;
        * Static methods a.k.a. utility methods can only use static variables;
        * On a class or interface can be used only for nested ones;
    
    * final : 
        * On a class makes it non-extendable;
        * On a variable makes it constant i.e. cannot modify it value once assigned;
        * On a method makes it not able to be overridden;  
    
    * synchronized :
        * On a method or block which can be accessed by multiple threads concurrently;
    
    * native : 
        * On a method which makes use of libraries and methods from different language 
        like C or C++;
        
    * strictfp : 
        * On classes, interfaces and methods which ensures calculations using
        floating-point numbers that are identical on all platforms;
    
    * transient :
        * A transient variable isn't serialized when the corresponding object is serialized; 
    
    * volatile :
        * A volatile variables value can be safely modified by different threads concurrently;      

* __Features of Java__ : 
    * Released in 1995;
    * Platform independent;
    * Object oriented;
    * Abstraction;
    * Encapsulation;
    * Inheritance;
    * Polymorphism;
    * Type safe;
    * Automatic memory management - garbage collector;
    * Multithreading and concurrency;
    * Security - digital signatures, certificates, key store;
    
* __Twist in the Tale__ : 

    * 1.1 Answer : 
        * A Java source code file can define multiple interfaces and classes;
        * The code won't compile if the name of the public interface/class doesn't match the file name;
        
    * 1.2 Answer : 
        * Code fails to compile because it has 2 public classes/interfaces;
        * Removing the definition of the class with different name from the source code file resolves the problem;
        * Removing the public modifier from that class also resolves the problem;
      
    * 1.3 Answer : 
        * Mains with signature like this will do (Variants a, b) : 
            
            public static void main(String[] nameArgs) 
            {
                // statements
            } 
            
    