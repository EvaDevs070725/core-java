# 🧠 Java Core Interview Questions - Practice Assignments

Designed for aspiring Java developers to understand and master core interview concepts through **explanations, code, and reflection**.

---

## 1. ❓ What is the difference between JDK and JRE?

### 🔍 Concept Check
**Your Answer:**

> ...

### 💻 Code Practice
Compile and run a basic Java class manually using CLI:

```bash
javac HelloWorld.java
java HelloWorld
```

### ❓ Reflection
**Question:** Why can't you compile Java code using only the JRE?

> ...

---

## 2. ❓ What is Java Virtual Machine (JVM)?
   
### 🔍 Concept Check
**Your Answer:**

> ...

### 💻 Code Practice
Print JVM version:

```
System.out.println(System.getProperty("java.vm.version"));
```

### ❓ Reflection
Question: What would happen if your class is compiled with Java 21 but run on Java 8?

> ...

---

## 3. ❓ What are the different types of memory areas allocated by JVM?
   
### 🔍 Concept Check
   List & Description:

- Heap:
- Stack:
- Method Area:
- PC Register:
- Native Method Stack:

### 💻 Code Practice

Write a Java program that:
- Creates an object (Heap)
- Calls a method with local variables (Stack)
- Uses a static variable (Method Area)

### ❓ Reflection
Why is `static` data not on the heap?

> ...

---

## 4. ❓ What is JIT compiler?

  Write a short summary: what is JIT, when does it compile, 
  and what performance benefit does it provide?

### 🔍 Concept Check
    Write a short summary: what is JIT, when does it compile, 
    and what performance benefit does it provide?

**Your Answer:**

> ...

### 💻 Code Practice
Create a simple method (e.g., a loop that runs 1 million times) and
measure execution time with System.nanoTime().

---

## 5. ❓ How is Java platform different from other platforms?
   
### 🔍 Concept Check

Explain platform independence vs platform dependency.

**Your Answer:**

> ...

### 💻 Code Practice
Write and compile a Java program on one OS, and run the 
`.class` file on another OS (e.g., from Windows to Linux or macOS, or using Docker).

### ❓ Reflection
Why is Java platform-independent but C is not?

> ...

---

## 6. ❓ Why is Java called "write once, run anywhere"?
   
### 🔍 Concept Check
Explain the role of bytecode and JVM in platform independence.
**Your Answer:**

> ...

### 💻 Code Practice
Use `javap` to view the bytecode of a class file.

### ❓ Reflection
What is required to run Java bytecode on any system?

> ...

---

## 7. ❓ How does ClassLoader work in Java?
   
### 🔍 Concept Check
Describe the three types of class loaders: 
- `Bootstrap`:
- `Extension`:
- `System`:

### 💻 Code Practice
Write a program that:
- Loads a class
- Prints the class loader:

### ❓ Reflection
Why does the class loader hierarchy follow a parent delegation model?

> ...

---

## 8. ❓ Is `main` a keyword in Java?
   
### 🔍 Concept Check
**Your Answer:**
Try using main as a variable name:

> ...

### 💻 Code Practice

### ❓ Reflection
Why is main required if it's not a keyword?

> ...

---

## 9. ❓ Can we write public void static instead of public static void?
   
### 🔍 Concept Check
Reorder `public`, `static`, and `void` correctly and incorrectly. 
Explain what happens.

### 💻 Code Practice
Try the incorrect version and observe the compiler error.

### ❓ Reflection
Why is static required before void?

> ...

---

## 10. ❓ What is the default value of local variables?
    
### 🔍 Concept Check
Check if local variables are automatically initialized.

**Your Answer:**

> ...

### 💻 Code Practice
Write this class
```java
public class DefaultLocal {
    public static void main(String[] args) {
        int x;
        System.out.println(x); // What happens?
    }
}

```

### ❓ Reflection
Why are local variables not auto-initialized?

> ...

---

## 11. ❓ What is the value of args if no arguments are passed?
    
### 🔍 Concept Check
Write a program to print args.length.

**Your Answer:**

> ...

### 💻 Code Practice
Run the program with and without command-line arguments.
```java
public class ArgsTest {
    public static void main(String[] args) {
        System.out.println("Length: " + args.length);
    }
}

```
### ❓ Reflection
Why is args not null but an empty array?

> ...

---

## 12. ❓ What is the difference between byte and char?

### 🔍 Concept Check
List size, range, and encoding format for both.

### 💻 Code Practice
Write a program that prints the value of a char and a byte, including casting between them.

```java
byte b = 65;
char c = 'A';
System.out.println((char)b); // what does this print?
System.out.println((byte)c); // what does this print?

```
### ❓ Reflection
Why does Java use 16-bit char?
