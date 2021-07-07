# Chain of Responsibility
Delegate a request to a chain of handlers.

## Problem
Having an incoming request, it is possible to have a variable number of handlers.
The requests need to be efficiently processed without tightly coupling the request to its handler.

## Structure
A super class which is the handler is derived by multiple handler classes.
If the current handler is not able to handle the request it delegates the request to the supper class which in turn will continue with the next handler.
