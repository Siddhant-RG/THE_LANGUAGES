### Module 14 - Object-Oriented Programming (OOP) in JavaScript

**Programming Paradigms:**

1. **Functional Programming (FP)**  
2. **Object-Oriented Programming (OOP)**  
3. **Procedural Programming (PP)**  
4. **Structured Programming (SP)**  

**Additional Paradigms:**

1. **Declarative Programming**  
2. **Logic Programming**  
3. **Event-Driven Programming**  
4. **Concurrent Programming**  
5. **Reactive Programming**  
6. **Aspect-Oriented Programming (AOP)**  

**JavaScript Specific:**

1. Are there classes in JavaScript?  
2. What is the difference between Procedural Programming (PP) and Object-Oriented Programming (OOP)?  
3. What is OOP and why do we use it?  

**Object-Oriented Programming (OOP) Concepts:**

1. Pillars of OOP:  
   - Abstraction  
   - Encapsulation  
   - Inheritance  
   - Polymorphism  


2. Parts of OOP: Language-Specific Features  

- 1. Object Literals  
- 2. Constructor Functions  
        - `this` Keyword  
          - `this` with different contexts  
        - Constructor Function & Instance  
        - Instances (`new` Keyword) & `instanceof` Method, `instance.constructor`  
        - Why Use `new` Keyword  
        - Definition of Constructor Function

  # 5. Prototypes & Prototype Inheritance

## Addon - Info for New Keyword

### Topics:
- What happens when the `new` keyword is used:
  - A new object is created.
  - A prototype is linked.
  - The constructor is called.
  - The new object is returned.

### JavaScript Default Behavior:
- Prototypical behavior.
- Everything is an object.

### Ways to Add Methods to a Constructor Function:
- `this.methodName`.
- `functionName.prototype.methodName`.

### Inheritance:
- Older Way: `student.__proto__ = teacher`.
- Modern Way: `Object.setPrototypeOf(student, teacher)`.


   6. `call`, `apply`, `bind`  
   7. Classes, `extends`, `super()`  
   8. Creating Static Methods, Private Variables, Private Fields  
   9.  Getter and Setter Methods  
      - By Class  
      - By Function  
      - By Objects  
   10. `Object.getOwnPropertyDescriptor` & `Object.defineProperty`  
   11. `Object.create()`

1. **4 Pillars of OOP With Examples**  
   - Abstraction  
   - Encapsulation  
   - Inheritance  
   - Polymorphism