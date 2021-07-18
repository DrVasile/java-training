# Aspect Oriented Programming
- A programming paradigm that aims to increase modularity.
- Deals with the separation of cross-cutting concerns.
- Adds behavior to the existing code without modifying it.


## Terminology
- Advice: 
  - An action taken by an aspect at a join point.
  - In spring the advice is modeled as an interceptor.
  - Some types of advice annotations are:
    - @Around: Before and after method run.
    - @Before: Before method run.
    - @After: After method run.
    - @AfterReturning: After the method returns successfully. 
    - @AfterThrowing: After an exception has been thrown.
  
- Aspect: 
  - An aspect is a modularization of a concern that cuts across multiple classes.

- Business Object: 
  - Normal class that contains business logic.
    
- Join point:
  - A point during the execution of a program.
  - Might be a method execution or the handling of an exception.
    
- Pointcut
  - A predicate that helps apply advice at a particular join point.
  - The advice is associated with a pointcut expression and runs at any join point matched by the pointcut.


## Approach
- Identify and write the aspects
- Configure the aspects