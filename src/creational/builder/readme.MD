# Builder Pattern

- Helps determine which constructor to use (flexibility over telescoping functions)
- Typically use static inner class
- For construction of objects that take a lot of parameters (complex constructors)
- Force/Want to make the object immutable to enforce contract (setters not needed)
- Works for old code
- Examples:
  - StringBuilder
