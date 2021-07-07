# Web Services

## REST
An Architectural style for designing network applications, driven by a set of constraints.

### Resource
Key abstraction of information in REST identified by a unique URI;

### Representation
The state of the resource, which at different levels can have different formats;
    
### HTTP Request
* URI - Unique string identifying a resource;
* URL - A URI with network information;
* Verb - HTTP Method;
* Message - Payload of the action(XML/JSON);
    
### HTTP Verbs
* CONNECT;
* DELETE - Remove resource;
* GET - Retrieval operation(Has no payload);
* HEAD - Retrieve headers and status code;
* OPTIONS - Describe communication options;
* PATCH - Partially update a resource;
* POST - Create new resource;
* PUT - Fully update a resource;
* TRACE;
    
### HTTP Response Codes
* 1XX - Informational;
* 2XX - Successful;
* 3XX - Redirection;
* 4XX - Client Error;
* 5XX - Server Error;