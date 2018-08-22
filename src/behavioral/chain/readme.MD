# Chain of Responsibility Pattern

Decouples a request from handling object in a chain of handlers until it is finally recognized

Request - an object to process

Handler - Has a method for handling a the request, and a successor to call if it can't handle the request

- Decoupling of sender and receiver
- Receiver contains reference to next receiver/ Success or 
- Promotes loose coupling
- Can have no handler
- Examples:
  - java.util.logging.Logger#log()  :the debug levels
  - Spring Security Filter Chain
  
Pitfalls:
- Handling/ handler guarantee
- Runtime configuration risk
- Chain length / performance issues
  