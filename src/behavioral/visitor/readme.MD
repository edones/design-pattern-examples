# Visitor Pattern

A way to separate an algorithm from object structure

- Expecting a lot of changes/features but cannot change existing architecture
- Maintain open close principle
- Changes are in Visitor
- Interface based
- Multiple Visitor
- Externalized Changes

Needs:
  - Visitor, Element, ConcreteVisitor, ConcreteElement

- Example:
  - java.lang.model.element.Element
  - java.lang.model.element.ElementVisitor