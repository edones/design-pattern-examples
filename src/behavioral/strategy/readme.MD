# Strategy Pattern

To eliminate conditional statements

- Behavior encapsulated in classes
- Difficult to add new strategies
- Client aware of strategies and chooses strategy
- OCP - behaviors of a class should not be inherited but should be encapsulated using interfaces
- Composition instead of inheritance

- Examples:
  - java.util.Comparator

Can be implemented using an Interface but typically uses an Abstract base class
Concrete classes are created per strategy
Client knows different strategies but strategies might not know of other strategies

Needed: Context, Strategy, ConcreteStrategy

