# Chapter 2

## Java Data Types

* __Primitive variables__ :

    * Primitive data types : 
        * char;
        * byte;
        * short;
        * int;
        * long;
        * float;
        * double;
        * boolean;
        
    * Flavors of integer types : 
        * Binary - prefix 0b or 0B;
        * Octal - prefix 0;
        * Decimal;
        * Hexadecimal - prefix 0x or 0X;
        **NOTE** - For long number use l or L suffix;
        
    * Floating-point types :
        **NOTE** - Use suffix f or F for float;
        **NOTE** - Use suffix d or D for double;
        
* __Reference variables__ :

    * Literal default value - null;
    
* __Operators__ :

    * Easy...
    
* __Wrapper classes__ :

    * All wrapper classes are immutable;
    * All except Character have constructor which accepts String parameters;              
        
    
* Twist in the Tale : 

    * 2.1 Answer : 
        * Output : 534 534 
        
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
            
    