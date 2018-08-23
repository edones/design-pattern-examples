# Memento Pattern

Used to externalize an object state to provide rollback functionality/ restore previous state

- Examples:
  - java.util.Date
  - java.io.Serializable
  
Needs:
  - Originator - object we want a copy/ save. Makes actual copy of memento.
  - Caretaker - manages the copies or memento's created. List of undos available
  - Memento - represents the copy of the originator that we want to store. 
    - Magic Cookie - stored inside memento
    
Might also be useful for save games?