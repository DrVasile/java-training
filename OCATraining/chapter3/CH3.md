# Chapter 3

## Methods and Encapsulation

* __Variables scope__ :

    * Local variables - method variables;
    * Method parameters - method arguments;
    * Instance variables - attributes, fields and nonstatic variables;
    * Class variables - static variables;
    
    **NOTE** : Static methods can be called with uninitialized objects;       
    * Overlapping variable scopes :

        * Class > Instance > Method > Local;
        * Shadowing;
        
* __Object's lifecycle__ : 

    * Object creation;
    * Object becomes accessible;
    * Object becomes inaccessible;
    * Garbage collection;
    
* __Method Overloading__ :
    
    * The list of arguments differs;
    * It can differ by : 
        * Number of parameters;
        * Their types;
        * Position if they have different types;
    * A constructor can call another constructor using keyword this it being the first statement;
        
* __Initializer blocks__ *
    
    * Are executed in the order of appearance;
    * It can create local variables, it can access and modify instance and class variables,
    can call methods, define loops and other blocks;         
    