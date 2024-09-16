## Differences Between Syntax in C++ and Java

### Taking Input

#### Java

In Java, we use the `Scanner` class from the `java.util` package to take input.

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

#### C++

In C++, we use `cin` followed by `>>`, which is included in the `<iostream>` header.

```cpp
#include <iostream>
using namespace std;

int main() {
    int intVal;
    cin >> intVal;
    cout << intVal << endl;
    return 0;
}
```

### Taking String Input

#### Java

For string input in Java, `nextLine()` is used to include spaces.

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

#### C++

In C++, `getline()` is used to read an entire line of text.

```cpp
#include <iostream>
using namespace std;

int main() {
    string str;
    getline(cin, str);
    cout << str << endl;
    return 0;
}
```

### Lossy Conversion

#### Java

In Java, lossy conversion can occur when converting from a data type with higher precision or a larger range to one with lower precision. Java requires explicit casting to handle such conversions.

**Example of lossy conversion:**

```java
import java.util.*;

public class App1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        float flt = 10.00f; 
        int num =  flt; 
        System.out.println(num); 
    }
}
```

#### C++

In C++, you can implicitly convert between types without an explicit cast, which might lead to loss of precision.

**Example of implicit conversion:**

```cpp
#include <iostream>
using namespace std;

int main() {
    float flt = 10.00f;
    int num = flt; // Implicit conversion
    cout << num << endl;
    // Output: 10
    return 0;
}
```

###  Source Type vs. Destination Type

#### Java

In Java, when assigning a value from one type (Source Type) to another type (Destination Type), the conversion behavior depends on the types involved.

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

#### C++

C++ also allows implicit conversion from a smaller data type to a larger data type.

**Example of smaller data type being inserted into a bigger data type:**

```cpp
#include <iostream>
using namespace std;

int main() {
    int smallValue = 42;  // Source Type is `int`
    double largerValue = smallValue;  // Destination Type is `double`

    cout << "Small Value: " << smallValue << endl;  // Output: 42
    cout << "Larger Value: " << largerValue << endl; // Output: 42.0
    return 0;
}
```


### Java
#### Bigger Data Type Cannot Be Inserted into Smaller Data Type

In Java, attempting to assign a larger data type (like `double`) to a smaller data type (like `int`) requires explicit casting. Without casting, it will result in a compile-time error.

**Example of error due to implicit conversion:**

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

#### C++

In C++, implicit conversion can be done from a larger data type to a smaller data type, but it might lead to loss of precision.

**Example of implicit conversion:**

```cpp
#include <iostream>
using namespace std;

int main() {
    double source = 123.456;  // Source Type is `double`
    int destination = source; // Implicit conversion

    cout << destination << endl; // Output: 123
    return 0;
}
```
---

### Remember

#### Java

- **Implicit Conversion:**
  - Conversion from decimal numbers to integers **cannot** be done. ❌

- **Explicit Conversion:**
  - Conversion from decimal numbers to integers **can** be done. ✔️

- **Smaller Data Type to Bigger Data Type:**
  - Insertion is **allowed**. ✔️

- **Bigger Data Type to Smaller Data Type:**
  - Implicit conversion **cannot** be done. ❌
  - Explicit conversion **can** be done. ✔️

#### C++

- **Implicit Conversion:**
  - Conversion from decimal numbers to integers **can** be done. ✔️
  - Conversion from a bigger data type to a smaller data type is **allowed**, but the range may be truncated. ✔️

- **Explicit Conversion:**
  - Conversion from decimal numbers to integers **can** be done. ✔️
  - Conversion from a bigger data type to a smaller data type is **allowed**, but the range may be truncated. ✔️

---




