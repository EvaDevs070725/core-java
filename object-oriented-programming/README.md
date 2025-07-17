# 🧱 Java OOP Interview Practice and Questions

---

## 📑 Table of Contents

1. [What are the main principles of Object-Oriented Programming?](#1--what-are-the-main-principles-of-object-oriented-programming)
2. [What is the difference between Object-Oriented Programming language and Object-Based Programming language?](#2--what-is-the-difference-between-object-oriented-programming-language-and-object-based-programming-language)
3. [In Java, what is the default value of an object reference defined as an instance variable?](#3--in-java-what-is-the-default-value-of-an-object-reference-defined-as-an-instance-variable)
4. [In Java what is the default value of an object reference defined as an instance variable in an Object?](#4--in-java-what-is-the-default-value-of-an-object-reference-defined-as-an-instance-variable-in-an-object)
5. [Why do we need constructor in Java?](#5--why-do-we-need-constructor-in-java)
6. [Why do we need default constructor in Java classes?](#6--why-do-we-need-default-constructor-in-java-classes)
7. [What is the value returned by Constructor in Java?](#7--what-is-the-value-returned-by-constructor-in-java)
8. [Can we inherit a Constructor?](#8--can-we-inherit-a-constructor)
9. [Why constructors cannot be final, static, or abstract in Java?](#9--why-constructors-cannot-be-final-static-or-abstract-in-java)

---

## 1. ❓ What are the main principles of Object-Oriented Programming?

### 🔍 Concept Check

- **Encapsulation:**
  > ...

- **Abstraction:**
  > ...

- **Inheritance:**
  > ...

- **Polymorphism:**
  > ...

### 💻 Code Practice

- Define a class with private fields and provide public getters and setters.
- Create a superclass and a subclass demonstrating inheritance.
- Include a method in the subclass that overrides a method from the superclass.
- Define an abstract class or interface and implement it.
- Demonstrate method overloading with different parameter lists.

### ❓ Reflection

- Which OOP principle helps hide implementation details?
- Which principle enables code reuse through hierarchy?

---

## 2. ❓ What is the difference between Object-Oriented Programming language and Object-Based Programming language?

### 🔍 Concept Check

| Feature              | OOP Language (e.g., Java) | Object-Based (e.g., JavaScript, VBScript) |
|----------------------|---------------------------|-------------------------------------------|
| Inheritance          | Supported                 | Not supported                             |
| Polymorphism         | Supported                 | Limited                                   |
| Encapsulation        | Supported                 | Supported                                 |
| Class-based design   | Yes                       | No (Prototype-based)                      |

### 💻 Code Practice

- Create a class in Java with inheritance and method overriding.
- Simulate object-based behavior using a class with static methods only (no inheritance).
- Attempt a prototype-style object pattern in JavaScript (optional).

### ❓ Reflection

- Why is Java considered a "true" object-oriented language?
- Can JavaScript fully support OOP concepts?

---

## 3. ❓ In Java, what is the default value of an object reference defined as an instance variable?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Create a class with a non-initialized object field.
- Print the value of the object reference in the main method.
- Observe the default value when no constructor is used.

### ❓ Reflection

- Why does Java set default values to uninitialized variables?
- What is the default value of `String` and other objects?

---

## 4. ❓ In Java what is the default value of an object reference defined as an instance variable in an Object?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Create a class with a reference-type field and no constructor.
- Instantiate the object and print the field value.

### ❓ Reflection

- How is memory allocated for object references?
- What happens if you try to access methods on a `null` object?

---

## 5. ❓ Why do we need constructor in Java?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Create a class with a constructor that initializes fields.
- Print the initialized values in the main method.
- Create another class without a constructor and observe behavior.

### ❓ Reflection

- How does a constructor improve object setup?
- What if you omit the constructor?

---

## 6. ❓ Why do we need default constructor in Java classes?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Define a class with no constructors and instantiate it.
- Define a custom constructor and try to instantiate the class without passing arguments.
- Add a default constructor manually and observe changes.

### ❓ Reflection

- What role does the compiler play in default constructor creation?
- When should you define your own default constructor?

---

## 7. ❓ What is the value returned by Constructor in Java?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Define a constructor and try assigning its value to a variable.
- Observe how object references work post-construction.
- Try returning a value from a constructor and see the compilation result.

### ❓ Reflection

- Why can't a constructor return anything explicitly?
- How does object creation work behind the scenes?

---

## 8. ❓ Can we inherit a Constructor?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Create a superclass with a parameterized constructor.
- Create a subclass and observe compilation error if constructor is not explicitly called.
- Use `super()` to call the parent constructor from subclass.

### ❓ Reflection

- Why must constructors be explicitly defined in subclass?
- What happens when superclass constructor has arguments?

---

## 9. ❓ Why constructors cannot be final, static, or abstract in Java?

### 🔍 Concept Check

> ...

### 💻 Code Practice

- Try marking a constructor `final`, `static`, and `abstract`.
- Observe compilation errors and explain them.

### ❓ Reflection

- Why is `final` or `abstract` meaningless for constructors?
- How does `static` conflict with the instance-based nature of constructors?

---
