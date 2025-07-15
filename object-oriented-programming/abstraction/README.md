# 🔄 Java Abstraction Practice and Questions

Master Java abstraction with hands-on practice and conceptual clarity.

---

## 📑 Table of Contents

0. [What is Abstraction in Object-Oriented programming?](#0--what-is-abstraction-in-object-oriented-programming)
1. [How is Abstraction different from Encapsulation?](#1--how-is-abstraction-different-from-encapsulation)
2. [What is an abstract class in Java?](#2--what-is-an-abstract-class-in-java)
3. [Is it allowed to mark a method abstract method without marking the class abstract?](#3--is-it-allowed-to-mark-a-method-abstract-method-without-marking-the-class-abstract)
4. [Is it allowed to mark a method abstract as well as final?](#4--is-it-allowed-to-mark-a-method-abstract-as-well-as-final)
5. [Can we instantiate an abstract class in Java?](#5--can-we-instantiate-an-abstract-class-in-java)
6. [What is an interface in Java?](#6--what-is-an-interface-in-java)
7. [Is it allowed to mark an interface method as static?](#7--is-it-allowed-to-mark-an-interface-method-as-static)
8. [Why an Interface cannot be marked as final in Java?](#8--why-an-interface-cannot-be-marked-as-final-in-java)
9. [What is a marker interface?](#9--what-is-a-marker-interface)
10. [What can we use instead of Marker interface?](#10--what-can-we-use-instead-of-marker-interface)
11. [How Annotations are better than Marker Interfaces?](#11--how-annotations-are-better-than-marker-interfaces)
12. [What is the difference between abstract class and interface in Java?](#12--what-is-the-difference-between-abstract-class-and-interface-in-java)
13. [Does Java allow us to use private and protected modifiers for variables in interfaces?](#13--does-java-allow-us-to-use-private-and-protected-modifiers-for-variables-in-interfaces)
14. [How can we cast to an object reference to an interface reference?](#14--how-can-we-cast-to-an-object-reference-to-an-interface-reference)

---

## 0. ❓ What is Abstraction in Object-Oriented programming?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Define an abstract class with both abstract and concrete methods.
- Create a subclass that implements the abstract methods.
- Use the abstract class to demonstrate hiding internal implementation.

### ❓ Reflection
- How does abstraction improve code maintainability?
- What happens if you forget to implement an abstract method?

---

## 1. ❓ How is Abstraction different from Encapsulation?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Implement a class with private fields (encapsulation).
- Implement an abstract class/interface (abstraction).
- Compare how both hide data or implementation.

### ❓ Reflection
- Can a class use both abstraction and encapsulation?
- Which one hides "how" and which hides "what"?

---

## 2. ❓ What is an abstract class in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create an abstract class with constructors and both abstract and non-abstract methods.
- Extend the abstract class and provide implementations for the abstract methods.

### ❓ Reflection
- Why can't abstract classes be instantiated?
- When would you use an abstract class over an interface?

---

## 3. ❓ Is it allowed to mark a method abstract method without marking the class abstract?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Try declaring an abstract method in a non-abstract class and observe the compiler error.
- Refactor the class to be abstract and resolve the issue.

### ❓ Reflection
- Why does Java restrict this behavior?
- What does this imply about abstract class design?

---

## 4. ❓ Is it allowed to mark a method abstract as well as final?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Try combining `abstract` and `final` modifiers and observe the compiler behavior.
- Write a final method and explain why it can't be abstract.

### ❓ Reflection
- What does "final" mean for a method?
- Why are these two modifiers incompatible?

---

## 5. ❓ Can we instantiate an abstract class in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Attempt to instantiate an abstract class directly and observe the error.
- Instantiate the abstract class using an anonymous subclass or subclass implementation.

### ❓ Reflection
- Why is abstraction incompatible with direct instantiation?
- What are practical use cases of abstract classes?

---

## 6. ❓ What is an interface in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Define an interface with multiple abstract methods.
- Implement the interface in a class.
- Create a reference of interface type to access implementing class methods.

### ❓ Reflection
- How are interfaces different from abstract classes?
- Why are interfaces preferred for loose coupling?

---

## 7. ❓ Is it allowed to mark an interface method as static?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Add a static method to an interface and call it using the interface name.
- Compare static methods in interface vs class.

### ❓ Reflection
- Can static interface methods be overridden?
- When are static methods in interfaces useful?

---

## 8. ❓ Why an Interface cannot be marked as final in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Try to declare an interface as `final` and observe the compilation issue.
- Create a subclass that implements the interface to show extensibility.

### ❓ Reflection
- What is the purpose of interfaces being extensible?
- How would final interfere with polymorphism?

---

## 9. ❓ What is a marker interface?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create an empty interface and use `instanceof` to check if a class implements it.
- Demonstrate how marker interfaces affect behavior in built-in Java APIs (e.g., `Serializable`).

### ❓ Reflection
- How do marker interfaces provide metadata?
- What are the limitations of marker interfaces?

---

## 10. ❓ What can we use instead of Marker interface?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Define a custom annotation and apply it to a class.
- Use reflection to detect the annotation at runtime.

### ❓ Reflection
- What are the advantages of annotations over marker interfaces?
- Can annotations and marker interfaces coexist?

---

## 11. ❓ How Annotations are better than Marker Interfaces?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Replace a marker interface implementation with a custom annotation and read it via reflection.
- Show how annotations can accept parameters unlike interfaces.

### ❓ Reflection
- How do annotations improve flexibility?
- When is it better to use annotations than interfaces?

---

## 12. ❓ What is the difference between abstract class and interface in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create both an abstract class and interface with the same method.
- Implement them in two different classes and observe behavior differences.

### ❓ Reflection
- Which allows constructors?
- Which supports multiple inheritance?

---

## 13. ❓ Does Java allow us to use private and protected modifiers for variables in interfaces?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Declare variables in an interface using different access modifiers and observe behavior.
- Show that variables in interfaces are implicitly public, static, and final.

### ❓ Reflection
- Why doesn’t Java allow private/protected variables in interfaces?
- How should state be handled in interfaces?

---

## 14. ❓ How can we cast to an object reference to an interface reference?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create a class that implements an interface.
- Instantiate the class and assign it to a reference of the interface type.
- Demonstrate method access through interface reference.

### ❓ Reflection
- What benefits does casting to interface provide?
- Can you call class-specific methods on interface references?

---
