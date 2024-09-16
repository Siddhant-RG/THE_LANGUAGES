
---

# Java Programming Questions

### 1. Check if a Given Number is Prime

```java
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        boolean isPrime = true;

        if(num <= 1) {
            System.out.println("Enter a valid number");
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    isPrime = false;
                    System.out.println("It is not a prime number");
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
```

### 2. Reverse a Number and Check if it is a Palindrome

```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        int numCpy = num;
        int reversedNumber = 0;

        while(num > 0) {
            int LD = num % 10;
            reversedNumber = reversedNumber * 10 + LD;
            num /= 10;
        }

        if(reversedNumber == numCpy) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
```

### 3. Check if a Given Year is a Leap Year

```java
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int year = scnr.nextInt();

        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
```

### 4. Sum of First N Numbers (Two Methods)

**Method 1: Using a Loop**

```java
import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " numbers is: " + sum);
    }
}
```

**Method 2: Using Formula**

```java
import java.util.Scanner;

public class SumOfNFormula {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();

        System.out.println("The sum of first " + n + " numbers is: " + (n * (n + 1)) / 2);
    }
}
```

### 5. Convert Decimal to Binary

```java
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int Deci = 10;
        int Byrn = 0;
        int Power = 0;

        while (Deci > 0) {
            int rem = Deci % 2;
            Byrn = Byrn + rem * (int) Math.pow(10, Power);
            Deci /= 2;
            Power++;
        }

        System.out.print(Byrn);
    }
}
```

### 6. Convert Binary to Decimal

```java
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int Deci = 0;
        int Byrn = 10000;
        int Power = 0;

        while (Byrn > 0) {
            int rem = Byrn % 2;
            Deci = Deci + rem * (int) Math.pow(2, Power);
            Byrn /= 10;
            Power++;
        }

        System.out.print(Deci);
    }
}
```
---

### 1. Check if a Number is Prime

**Question:**
Write a program to check if a number is prime or not.

**Solution:**
```java
public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
```

### 2. Find the Factorial of a Number

**Question:**
Write a program to find the factorial of a number.

**Solution:**
```java
public static int factorial(int num) {
    int fact = 1;
    if (num < 0) {
        throw new IllegalArgumentException("Number must be non-negative");
    }
    if (num <= 1) {
        return 1;
    }
    // Method 1: Recursive Approach
    // return num * factorial(num - 1);

    // Method 2: Iterative Approach
    for (int i = 1; i <= num; i++) {
        fact *= i;
    }
    return fact;
}
```

### 3. Check if a Number is an Armstrong Number

**Question:**
Write a program to check if a number is an Armstrong number or not.

**Solution:**
```java
public static boolean isArmstrong(int num) {
    int numCopy = num; 
    int tempAms = 0;
    int pow = 0;

    // Method 1: Calculate the number of digits
    while (num > 0) {
        pow++;
        num /= 10;
    }

  // MEthod 2  System.out.println( String.valueOf(Math.abs(num)).length());

    // Reset num to original value
    num = numCopy;

    while (num > 0) {
        int ld = num % 10; 
        tempAms += Math.pow(ld, pow);
        num /= 10; 
    }

    return tempAms == numCopy;
}
```


---

Here's a markdown document with the patterns and their solutions. I’ve added the code for each pattern as specified and arranged it in a clear format.

---

# Pattern Programs

## Patterns - EASY

### 1. Star Pattern
**Question:** Write a program to print a star pattern.
```
*
**
***
****
```
**Solution:**
```java
public class App {
    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starPattern(4);
    }
}
```

### 2. Inverted Star Pattern
**Question:** Write a program to print an inverted star pattern.
```
****
***
**
*
```
**Solution:**
```java
public class App {
    public static void invertedStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedStarPattern(4);
    }
}
```

### 3. Number Pattern
**Question:** Write a program to print a number pattern.
```
1
12
123
1234
```
**Solution:**
```java
public class App {
    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPattern(4);
    }
}
```

### 4. Alphabet Triangle Pattern
**Question:** Write a program to print an alphabet triangle pattern.
```
A
BC
DEF
GHIJ
KLMNO
PQRSTU
```
**Solution:**
```java
public class App {
    public static void alphabetTrianglePattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphabetTrianglePattern(6);
    }
}
```

## Patterns - ADV

### 1. Hollow Rectangle
**Question:** Write a program to print a hollow rectangle of `*` with a given number of rows and columns.
```
For example, for 5 rows and 5 columns:
*****
*   *
*   *
*   *
*****
```
**Solution:**
```java
public class App {
    public static void hollowRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(5, 5);
    }
}
```

### 2. Inverted Half Pyramid with Numbers
**Question:** Write a program to print an inverted half-pyramid pattern with numbers.
```
For example, for 5 rows:
12345
1234
123
12
1
```
**Solution:**
```java
public class App {
    public static void invertedHalfPyramidNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidNumbers(5);
    }
}
```

### 3. Floyd's Triangle
**Question:** Write a program to print Floyd's Triangle.
```
For example, for 5 rows:
1  
2  3  
4  5  6  
7  8  9  10  
11 12 13 14 15
```
**Solution:**
```java
public class App {
    public static void floydsTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydsTriangle(5);
    }
}
```

### 4. Binary Triangle
**Question:** Write a program to print a binary triangle pattern.
```
For example, for 5 rows:
1
01
101
0101
10101
```
**Solution:**
```java
public class App {
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        binaryTriangle(5);
    }
}
```

### 5. Butterfly Pattern
**Question:** Write a program to print a butterfly pattern.
```
For example, for 5 rows:
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
```
**Solution:**
```java
public class App {
    public static void butterflyPattern(int n) {
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
```

### 6. Solid Rhombus
**Question:** Write a program to print a solid rhombus pattern.
```
For example, for 5 rows:
    *****
   *****
  *****
 *****
*****
```
**Solution:**
```java
public class App {
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solidRhombus(5);
    }
}
```

### 7. Hollow Rhombus
**Question:** Write a program to print a hollow rhombus pattern.
```
For example, for 5 rows:
    *****
   *   *
  *   *
 *   *
*****
```
**Solution:**
```java
public class App {
    public static void hollowRhombus(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(5);
    }
}
```

### 8. Diamond Pattern
**Question:** Write a program to print a diamond pattern.
```
For example, for 5 rows:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
**Solution:**
```java
public class App {
    public static void diamondPattern(int n) {
        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");


            }
            System.out.println();
        }
        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamondPattern(5);
    }
}
```

### 9. Numbers Pyramid
**Question:** Write a program to print a pyramid pattern using numbers.
```
For example, for 5 rows:
    1
   212
  32123
 4321234
543212345
```
**Solution:**
```java
public class App {
    public static void numbersPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numbersPyramid(5);
    }
}
```

### 10. Palindrome Number Pyramid
**Question:** Write a program to print a palindrome number pyramid.
```
For example, for 5 rows:
    1
   121
  12321
 1234321
123454321
```
**Solution:**
```java
public class App {
    public static void palindromeNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palindromeNumberPyramid(5);
    }
}
```

---
