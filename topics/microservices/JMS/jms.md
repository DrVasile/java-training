# Java Message Service

The Java Message Service (JMS) API is a Java message-oriented middleware for sending messages between clients.

## Motivation

* Heterogeneous interoperability
* Component decoupling
* High scalability through load-balancing
* Asynchronicity

## JMS Elements

JMS includes the following elements: 
* Provider
* Client
* Producer/Publisher
* Consumer/Subscriber
* Message
* Queue
* Topic

## Messaging Models

* Point-to-point: 
    * Uses queues, producers and consumers;
    * Messages delivered to only one consumer;
    * Supports fire & forget and request-reply messaging;
* Publish-and-subscribe: 
    * Uses topics, publishers and subscribers;
    * Messages delivered to all subscribers;
    * Supports broadcast notifications;
    
## JMS Message Structure 

* Header:
    * Standard JMS properties
    * Extended JMS properties
    * App specific properties
    * Vendor specific properties
* Body: 
    * Text payload
    * Java Object payload
    * Map payload
    * Byte payload
    * Stream payload
    * Event payload
    
## JMS Message Types

* BytesMessage
* TextMessage
* MapMessage
* OrientedMessage
* StreamMessage

## Guaranteed Delivery

Guaranteed delivery required persistence in order to survive system failures.

