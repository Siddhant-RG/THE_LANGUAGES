# Java The language 
---
## Creator
- **James Gosling, Mike Sheridan, and Patrick Naughton** at Sun Microsystems in 1995.
  
<div style="display: flex; align-items: center;">
    <div style="margin-right: 20px;">
        <h3>James Gosling</h3>
        <img src="https://imgs.search.brave.com/rcuKZSpjHq2FIX2nQCd7uIZnS1iWxONjJIiQf9Zg5yY/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly91cGxv/YWQud2lraW1lZGlh/Lm9yZy93aWtpcGVk/aWEvY29tbW9ucy8x/LzE0L0phbWVzX0dv/c2xpbmdfMjAwOC5q/cGc" alt="James Gosling" width="200" height="200">
    </div>
    <div>
        <h3>Mike Sheridan</h3>
        <img src="https://imgs.search.brave.com/T23NSd225_KBidOoaYdVRZV5WHKywmL7bChW9oKKc-o/rs:fit:860:0:0:0/g:ce/aHR0cHM6Ly9md21l/ZGlhLmZhbmRvbXdp/cmUuY29tL3dwLWNv/bnRlbnQvdXBsb2Fk/cy8yMDI0LzA3LzMw/MTYxMjA4L0pvbmF0/aGFuLUJhbmtzLWFz/LU1pa2UtRWhybWFu/dHJhdXQtZnJvbS1C/cmVha2luZy1CYWQt/Q3JlZGl0LUFNQy5q/cGc" alt="Mike Sheridan" width="200" height="200">
    </div>
</div>

---
## Uses of Java

1. **Web Applications**: 
   - Server-side applications
   - Frameworks: Spring, JavaServer Faces (JSF), Apache Struts (MVC)

2. **Mobile Development**: 
   - Android SDK
   - Kotlin

3. **Desktop Applications**: 
   - Swing (GUI)
   - JavaFX

4. **Other Applications**: 
   - Enterprise Systems: Provides a large-scale platform for building enterprise applications
   - Embedded Systems
   - Scientific Systems

---

## Operators and Data Types

### 1. Operators

#### Types of Operators

- **Arithmetic Operators**: Perform arithmetic operations. Can be binary or unary.
  - **Binary Operators**: Operate on two operands. Examples:
    - Addition: `a + b`
    - Subtraction: `a - b`
    - Multiplication: `a * b`
    - Division: `a / b`
    - Modulus: `a % b`
  - **Unary Operators**: Operate on a single operand. Examples:
    - Unary Plus: `+a`
    - Unary Minus: `-a`
    - Increment: `++a` (pre-increment), `a++` (post-increment)
    - Decrement: `--a` (pre-decrement), `a--` (post-decrement)

- **Relational Operators**: Compare values. Examples:
  - Less than: `<`
  - Greater than: `>`
  - Less than or equal to: `<=`
  - Greater than or equal to: `>=`
  - Equal to: `==`
  - Not equal to: `!=`

- **Logical Operators**: Combine multiple boolean expressions. Examples:
  - Logical AND: `&&`
  - Logical OR: `||`
  - Logical NOT: `!`

- **Assignment Operators**: Assign values to variables. Examples:
  - Assignment: `=`
  - Add and assign: `+=`
  - Subtract and assign: `-=`
  - Multiply and assign: `*=`
  - Divide and assign: `/=`
  - Modulus and assign: `%=`


### 2. Data Types in Java

#### Primitive Data Types

| Data Type       | Size (Bytes) | Range                                                                 |
|-----------------|--------------|-----------------------------------------------------------------------|
| `byte`          | 1 byte       | -128 to 127                                                          |
| `short`         | 2 bytes      | -32,768 to 32,767                                                    |
| `char`          | 1 bytes      | 0 to 65,535                                                          |
| `boolean`       | 1 bit        | `true` or `false`                                                    |
| `int`           | 4 bytes      | -2^31 to 2^31 - 1 (`-2.147B to 2.147B`)                              |
| `long`          | 8 bytes      | -2^63 to 2^63 - 1 (`-9.223B to 9.223B`)                              |
| `float`         | 4 bytes      | Approximately ±3.40282347E+38F (6-7 significant decimal digits)      |
| `double`        | 8 bytes      | Approximately ±1.79769313486231570E+308 (15 significant decimal digits)|

### Non-Primitive Data Types

| Data Type       | Size (Bytes) | Range                                                                 |
|-----------------|--------------|-----------------------------------------------------------------------|
| `String`        | Varies       | Depends on the content                                               |
| `Array`         | Varies       | Depends on the type and size of the array                            |
| `Class`         | Varies       | Depends on the class structure                                       |
| `Object`        | Varies       | Depends on the class                                                 |
| `Interface`     | Varies       | Depends on the implementation                                        |

### Note

In Java, when declaring a float variable with a decimal value, you need to append the `f` suffix to the number:
The 'f' is required here because, by default, a decimal number is treated as a double. 

```java
float marks = 99.99f; 
```

---

## Printing OutPut 

In Java, you can print output using the `System.out` object, which provides several methods for printing data to the console. Here are the most common methods:

1. **Print to Console:**
   - `System.out.print()`: Prints text to the console without a newline character at the end.
   - `System.out.println()`: Prints text to the console with a newline character at the end.
   - `System.out.printf()`: Formats and prints text to the console with specific formatting.

**Examples:**

- **Basic Printing:**

  ```java
  System.out.print("Hello, ");
  System.out.print("World!"); // Output: Hello, World!

  System.out.println("Hello, World!"); // Output: Hello, World! (with newline)
  ```

- **Formatted Printing:**

  ```java
  int number = 10;
  double pi = 3.14159;

  System.out.printf("Number: %d\n", number); // Output: Number: 10
  System.out.printf("Pi value: %.2f\n", pi); // Output: Pi value: 3.14
  ```

In `printf()`, `%d` is used for integers, `%f` is used for floating-point numbers, and you can specify precision like `%.2f` for floating-point numbers.

## Checking Data Types in Java

In Java, you can check the data type of an object using various methods. Below are different approaches to achieve this:

## 1. Directly in Main Method

You can check the data type of a primitive or object by casting it to `Object` and then using `getClass().getSimpleName()`. 

```java
float flt = 23.0f;
System.out.println(((Object) flt).getClass().getSimpleName());
```

## 2. Using Wrapper Classes for Primitives

Wrapper classes in Java (e.g., `Integer`, `Double`) can be used to check the type of primitive data.

```java
Integer num = 10;
System.out.println(num.getClass().getSimpleName());
```

## 3. Creating a Custom Function

You can create a custom function to print the type of an object.

```java
public static void printType(Object obj) {
    if (obj == null) {
        System.out.println("The object is null.");
        return;
    }
    
    System.out.println(obj.getClass().getSimpleName());
}
```

**Note:** You cannot directly use `obj.getClass().getSimpleName()` in the `printType` method header or outside the method because Java's method signatures do not allow the direct embedding of statements or expressions in the declaration itself. You can only use expressions inside method bodies, not in method headers.

---


### Taking Input

#### Java
In Java, we use the `Scanner` class from the `java.util` package to take input.
- **Integer Input:**

```java
import java.util.*;

public class App1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int num = scnr.nextInt();
        System.out.println(num);
    }
}
```

- **String Input:**

```java
import java.util.*;

public class App1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // String str = scnr.next(); // Use next() for single word input
        String str = scnr.nextLine(); // Use nextLine() for full line input
        System.out.println(str);
    }
}
```

Different `Scanner` input methods in Java:
- `scnr.next()`: Reads the next token (word) from the input.
- `scnr.nextLine()`: Reads the entire line of input, including spaces.
- `scnr.nextInt()`: Reads the next integer from the input.
- `scnr.nextFloat()`: Reads the next float value from the input.
- `scnr.nextByte()`: Reads the next byte value from the input.
- `scnr.nextLong()`: Reads the next long value from the input.
- `scnr.nextDouble()`: Reads the next double value from the input.

These methods are used to read different types of data from the input stream using the `Scanner` class.

---

### Type Conversion / Widening / Implicit Conversion

## Type Conversion
Type conversion occurs when:

### a. Types are Compatible
This means you can convert between compatible numeric data types, such as converting from `float` to `int` or `long`. However, you cannot convert from `integer` to `boolean`.

### b. Destination Type is Larger than Source Type
This means you can store a smaller data type in a larger data type, but not the other way around. For example, you can store an `int` in a `long`, but you cannot store a `long` in an `int` without potential data loss.

```java
int d = 23;
long c = d;
```

In this example, `c` is the destination type and `d` is the source type.

### Conversion Hierarchy
The common conversion hierarchy is as follows:
- `byte` → `short` → `int` → `float` → `long` → `double`

### Lossy Conversion
Lossy conversion occurs when data is lost during conversion, such as trying to fit 8 bytes of data into 2 bytes. Java does not allow lossy conversion; it ensures that data loss does not occur during type conversion.


### Source Type vs. Destination Type

**Example of smaller data type being inserted into a bigger data type:**

```java
public class Main {
    public static void main(String[] args) {
        int smallValue = 42;  // Source Type is `int`
        double largerValue = smallValue;  // Destination Type is `double`

        System.out.println("Small Value: " + smallValue);  // Output: 42
        System.out.println("Larger Value: " + largerValue); // Output: 42.0
    }
}
```

**Explanation:**
- **Source Type (`int`)**: The variable `smallValue` holds an integer.
- **Destination Type (`double`)**: The variable `largerValue` can hold a `double`, so the `int` value `42` is implicitly converted to `42.0` without losing any data.





**Example of bigger data type being inserted into a smaller data type:**

```java
public class Main {
    public static void main(String[] args) {
        double source = 123.456;  // Source Type is `double`
        int destination = source;  

        System.out.println(destination); 
    }
}
```

**Error:**
- Possible lossy conversion from `double` to `int`

---

## Type Casting in Java

### Introduction
 Type casting is the process of converting a variable from one data type to another. Java performs automatic type conversions (widening) when safe, but explicit (narrowing) casting is required when converting to a smaller or less precise type. This explicit casting is done using a cast operator.

### Syntax for Explicit Casting
```java
(type) value
```
- **`type`**: The target data type to which you want to convert the value.
- **`value`**: The value to be converted.

### Example of Type Casting

```java
public class App1 {
    public static void main(String[] args) {
        // Example 1: Casting from double to int
        double temperature = 36.7;
        int roundedTemperature = (int) temperature;
        System.out.println("Double to int: " + roundedTemperature); // Output: 36

        // Example 2: Casting from char to int
        char letter = 'A';
        int letterCode = (int) letter;
        System.out.println("Char to int: " + letterCode); // Output: 65

        // Example 3: Casting from long to short
        long largeNumber = 123456789L;
        short smallNumber = (short) largeNumber;
        System.out.println("Long to short: " + smallNumber); // Output: -16961 (data loss due to narrowing)

        // Example 4: Casting from float to byte
        float pi = 3.14f;
        byte piByte = (byte) pi;
        System.out.println("Float to byte: " + piByte); // Output: 3 (data loss due to narrowing)
    }
}
```

---

### Type Promotion in Expressions

When performing arithmetic operations in Java, the type of the result is determined by the highest precision data type involved in the expression. Here’s a simple rule to remember:

**"The result of an expression will be promoted to the highest precision type involved in that expression."**

Here’s how it works:

1. **If the expression involves `float`, `long`, and `int`:**
   - **If `float` is present**: The entire expression is promoted to `float`. This is because `float` has a lower precision than `double`, but it’s higher than `int` and `long`.
   - **If `float` is not present, but `long` is**: The entire expression is promoted to `long`. This is because `long` has a higher precision than `int`.
   - **If neither `float` nor `long` is present, only `int` values**: The result is of type `int`.

2. **If `double` is present in the expression:**
   - **The entire expression is promoted to `double`**. This is because `double` has the highest precision among standard numeric types.


 
### Example

```java
int intValue = 10;
long longValue = 20;
float floatValue = 30.0f;
double doubleValue = 40.0;

// The expression involves `float`, `long`, and `int`
// Since `float` is present, the entire expression is promoted to `float`
float result1 = intValue + longValue + floatValue;
System.out.println("Result 1 (float): " + result1);

// The expression involves `long`, and `int`
// Since `float` is not present, the expression is promoted to `long`
long result2 = intValue + longValue;
System.out.println("Result 2 (long): " + result2);

// The expression involves `double` and `int`
// Since `double` is present, the entire expression is promoted to `double`
double result3 = intValue + doubleValue;
System.out.println("Result 3 (double): " + result3);
```

In summary, always remember: *The highest precision type in the expression determines the result type.*
---



---

**Summary for Data Conversions**

- **Implicit Conversion:**
  - Conversion from decimal numbers to integers **cannot** be done. ❌

- **Explicit Conversion:**
  - Conversion from decimal numbers to integers **can** be done. ✔️

- **Smaller Data Type to Bigger Data Type:**
  - Insertion is **allowed**. ✔️

- **Bigger Data Type to Smaller Data Type:**
  - Implicit conversion **cannot** be done. ❌
  - Explicit conversion **can** be done. ✔️



#### **Key** Points
- **Narrowing Conversion**: Converting from a larger data type to a smaller one (e.g., `double` to `int`) can result in data loss. Explicit casting is required and should be used with caution.
- **Widening Conversion**: Automatically handled by Java when converting from a smaller data type to a larger one (e.g., `int` to `double`). Explicit casting is not required.

---

# Java Methods and Function Overloading

## 1. Methods

### Syntax with Parameters
A method in Java is a block of code that performs a specific task. It can take parameters as inputs, which are used within the method.

**Example:**

```java
public static int addNumbers(int a, int b) {
    return a + b;
}
```

### Parameters vs Arguments
- **Parameters** are variables defined in the method declaration.
- **Arguments** are the actual values passed to the method when it is called.

**Example:**

In the method `addNumbers(int a, int b)`, `a` and `b` are parameters. When you call `addNumbers(5, 10)`, `5` and `10` are arguments.

## 2. Function Overloading

Function overloading in Java occurs when two or more methods in the same class have the same name but different parameter lists (number or type of parameters).

### Overloading Using Number of Parameters

**Example:**

```java
public static int multiply(int a, int b) {
    return a * b;
}

public static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

### Overloading Using Data Types

**Example:**

```java
public static int multiply(int a, int b) {
    return a * b;
}

public static double multiply(double a, double b) {
    return a * b;
}
```

## 3. Theory

### Call by Value (in Java)
- In Java, arguments are passed to methods by value.
- This means a copy of the actual parameter’s value is made in memory.
- The original value remains unchanged, even if the method modifies the parameter.

**Example:**

```java
public static int Swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    return a;
}
```

### What Happens in Memory (Call Stack)
- When a method is called, a new frame is created on the call stack for that method.
- All the local variables and parameters are stored in this frame.
- Once the method execution is complete, the frame is removed from the call stack.

### Inbuilt vs User-defined Methods
- **Inbuilt methods** are provided by Java, such as `Math.sqrt()` or `System.out.println()`.
- **User-defined methods** are created by the programmer to perform specific tasks.

### Method Scope
- The scope of a method defines where that method can be called within the code.
- Methods in Java can have a scope defined by access modifiers like `public`, `private`, `protected`, or package-private (no modifier).

### Block Scope
- Variables declared inside a block `{}` have block scope, meaning they are only accessible within that block.

## 4. Example Code

```java
public static void main(String[] args) {

    int a = 10;
    int b = 20;

    // Call the Swap method
    int res = Swap(a, b);

    // Print the result
    System.out.print("After Swap, value of a: " + res);
    // Note: In Java, `b` remains unchanged in the `main` method because Java is pass-by-value.
}
```

## 5. Function Overloading Summary
- Function overloading allows the same method name to be used in the same class as long as the parameter lists are different.
- Overloading depends on:
  1. Type of parameters
  2. Number of parameters
- **Note:** The return type alone cannot distinguish overloaded methods in Java.

---








