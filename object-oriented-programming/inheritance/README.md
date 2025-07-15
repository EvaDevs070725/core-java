# 🔄 Java Polymorphism Practice and Questions

A focused guide for mastering Java method overloading, overriding, and polymorphism concepts used in real-world interviews and applications.

---

## 📑 Table of Contents

0. [What is the other name of Method Overloading?](#0--what-is-the-other-name-of-method-overloading)
1. [How will you implement method overloading in Java?](#1--how-will-you-implement-method-overloading-in-java)
2. [What kinds of argument variations are allowed in Method Overloading?](#2--what-kinds-of-argument-variations-are-allowed-in-method-overloading)
3. [Why is it not possible to do method overloading by changing return type of method in Java?](#3--why-it-is-not-possible-to-do-method-overloading-by-changing-return-type-of-method-in-java)
4. [Is it allowed to overload `main()` method in Java?](#4--is-it-allowed-to-overload-main-method-in-java)
5. [How do we implement method overriding in Java?](#5--how-do-we-implement-method-overriding-in-java)
6. [Are we allowed to override a static method in Java?](#6--are-we-allowed-to-override-a-static-method-in-java)
7. [Why does Java not allow overriding a static method?](#7--why-does-java-not-allow-overriding-a-static-method)
8. [Is it allowed to override an overloaded method?](#8--is-it-allowed-to-override-an-overloaded-method)
9. [What is the difference between method overloading and method overriding in Java?](#9--what-is-the-difference-between-method-overloading-and-method-overriding-in-java)
10. [Does Java allow virtual functions?](#10--does-java-allow-virtual-functions)
11. [What is meant by covariant return type in Java?](#11--what-is-meant-by-covariant-return-type-in-java)
12. [What is Runtime Polymorphism?](#12--what-is-runtime-polymorphism)
13. [Is it possible to achieve Runtime Polymorphism by data members in Java?](#13--is-it-possible-to-achieve-runtime-polymorphism-by-data-members-in-java)
14. [Explain the difference between static and dynamic](#14--explain-the-difference-between-static-and-dynamic)

---

## 0. ❓ What is the other name of Method Overloading?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Research and explain "Compile-time Polymorphism" in Java.
- Create two methods with the same name but different parameter lists.

### ❓ Reflection
- Why is compile-time resolution preferred in some cases?
- What are the risks or limitations of method overloading?

---

## 1. ❓ How will you implement method overloading in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Write three overloaded methods with:
  - Different number of parameters.
  - Different parameter types.
  - Different parameter order.

### ❓ Reflection
- What role does the compiler play in selecting overloaded methods?
- Can return type help distinguish overloaded methods?

---

## 2. ❓ What kinds of argument variations are allowed in Method Overloading?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create overloads using:
  - Changing data types.
  - Reordering parameters.
  - Using varargs (`...`).

### ❓ Reflection
- Which of these changes are valid overloads in Java?
- Why is changing return type alone not sufficient?

---

## 3. ❓ Why it is not possible to do method overloading by changing return type of method in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Try defining two methods with same name and parameters but different return types.
- Observe and explain the compile-time error.

### ❓ Reflection
- How does Java resolve method calls?
- How would ambiguity arise with only return type changes?

---

## 4. ❓ Is it allowed to overload main() method in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create multiple `main()` methods with different parameter lists.
- Test which one gets called at runtime.

### ❓ Reflection
- Which `main()` method signature is used by JVM?
- Why might overloading `main()` be useful?

---

## 5. ❓ How do we implement method overriding in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create a superclass with a method.
- Override that method in a subclass using `@Override` annotation.

### ❓ Reflection
- What are the rules for valid method overriding?
- Why is `@Override` useful?

---

## 6. ❓ Are we allowed to override a static method in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create a static method in a superclass.
- Create a method with same name in subclass and observe behavior.

### ❓ Reflection
- What is method hiding vs overriding?
- Can static methods exhibit polymorphism?

---

## 7. ❓ Why Java does not allow overriding a static method?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Attempt to override a static method and test the result.
- Call the method using both class name and object reference.

### ❓ Reflection
- How are static methods bound?
- Why is overriding not meaningful in static context?

---

## 8. ❓ Is it allowed to override an overloaded method?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create overloaded methods in superclass.
- Override one version in subclass.

### ❓ Reflection
- What happens when both overloading and overriding coexist?
- How does the JVM determine which method to execute?

---

## 9. ❓ What is the difference between method overloading and method overriding in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Build one class showing method overloading.
- Create a parent-child class pair showing overriding.

### ❓ Reflection
- Which is compile-time and which is runtime polymorphism?
- Which one supports dynamic dispatch?

---

## 10. ❓ Does Java allow virtual functions?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Define a method in superclass and override it in subclass.
- Call it using parent reference pointing to child object.

### ❓ Reflection
- How does Java support virtual method invocation?
- Are all methods virtual by default in Java?

---

## 11. ❓ What is meant by covariant return type in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create a method in superclass with return type `Object`.
- Override it in subclass with return type `String`.

### ❓ Reflection
- What is the benefit of covariant return types?
- How does it help improve polymorphism?

---

## 12. ❓ What is Runtime Polymorphism?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create a base class and a subclass.
- Declare reference of base class and initialize it with subclass instance.
- Call overridden method and observe behavior.

### ❓ Reflection
- How does JVM determine the method to invoke at runtime?
- What design patterns use runtime polymorphism?

---

## 13. ❓ Is it possible to achieve Runtime Polymorphism by data members in Java?

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Declare same field in superclass and subclass.
- Access the field via parent class reference.

### ❓ Reflection
- What is shadowing in Java?
- Why are methods polymorphic but not fields?

---

## 14. ❓ Explain the difference between static and dynamic

### 🔍 Concept Check
> ...

### 💻 Code Practice
- Create examples showing:
  - Static method and field.
  - Instance method and field.
- Observe resolution behavior during compile vs runtime.

### ❓ Reflection
- How are static members resolved?
- Why is dynamic dispatch powerful in OOP?

---
