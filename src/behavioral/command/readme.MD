# Command Pattern

Let's you encapsulate a request/action as an object. Class contains 'what'

- OO callback
- decouple sender from processor
- often used for "undo" functionality
- UI
- Will have command interface: 'execute' method, but may have 'unexecute'
- Examples:
  - java Runnable

Will have Client, Receiver (of command), Command interface, Invoker, ConcreteCommand

Receiver will have the command that the invoker calls

see Memento for using Undo funtionality


