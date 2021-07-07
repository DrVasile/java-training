# Polymorphism
- Usage of a common interface instead of concrete implementations.
- The code will be capable to adopt new enhancements by implementing the interface.

## Method Overloading
- The method signature changes.


## Method Overriding
- The method signature remains the same.
- Allows the JRE to invoke a method based on the object at hand.


## Parametric Polymorphism / Generics
- The type of the objects is a parameter of the generic type.


## Usage

### Variable type
- The super type can be used for variables that are created by a factory method for example.
- This makes the variable more flexible as it can accept any sub-type.

### Method arguments
- The super type can be used as method argument type. 
- The method will accept any implementations or child classes of the super type.

### Method return type
- Return the super type so that any sub-type could be returned.
