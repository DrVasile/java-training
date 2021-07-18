

# Java 15
- Sealed classes:
  - A sealed class can be extended by the permitted classes, or those from the same file.
  - The sub-class of a sealed class needs to have a modifier from the following: final, sealed, non-sealed.
  
- Pattern matching for instanceof operator
  
- Records
  - Have the purpose of reducing boilerplate code for POJO classes.
  - Record classes are final, but can implement interfaces.
  - Record classes extend implicitly the Record class.
  
- Text Blocks
- Hidden classes
- Remove the Nashorn JavaScript engine
- Reimplement the Legacy DatagramSocket API
- Disable and deprecate biased locking 
- Shenandoah: A Low-Pause-Time Garbage Collector
- Remove the Solaris and SPARC Ports 
- Foreign-Memory Access API
- Deprecate RMI Activation for Removal