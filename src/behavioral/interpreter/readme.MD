# Interpreter Pattern

Used to represent a grammar of a language. For a specific case.

- For parsing source code
- Interpret sentence
- Map a domain
- Parser
- AST - Abstract Syntax Tree
- Access to properties
- Functions as methods
- Examples:
  - java.util.Pattern
  - java.text.Format
  
Design: 
  - AbstractExpression - abstract base class that defines interface. provides contract on how these interact with one another
  - Interpret -sort of the command
  - TerminalExpression - can be evaluated in their current form
  - NonterminalExpression - will be evaluated again. non compound expression
  - Context - contains info global to the interpreter
  - Client
   