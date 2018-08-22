# Chain of Responsibility Pattern

Decouples a request from handling object in a chain of handlers until it is finally recognized

- Decoupling of sender and receiver
- Receiver contains reference to next receiver/ Success or 
- Promotes loose coupling
- Can have no handler
- Examples:
  - java.util.logging.Logger#log()  :the debug levels
  - Spring Security Filter Chain
  