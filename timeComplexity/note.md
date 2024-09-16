### LEC 23: Pillars of Programming (Inshort)
- **Readable:**  
  Code ko likhna aur samajhna easy ho, taki aap ya koi aur usko easily samajh sake.

- **Speed (Time Complexity):**  
  Code jitna fast chale, utna better. Time complexity ka dhyan rakhna important hai.

- **Memory (Space Complexity):**  
  Code kitna memory use karta hai, yeh bhi zaroori hai. Kam memory mein kaam ho toh efficient hota hai.

  ### Time Complexity

Time Complexity batata hai ki ek algorithm ka **runtime** kaise badhta hai jab input size badhta hai. Iska purpose yeh samajhna hota hai ki algorithm chhoti input ke liye jaldi chalega, lekin badi input ke liye kitna slow hoga. Hum time complexity ko **Big-O** notation ke zariye dikhate hain.

**Example:**  
Agar aapke paas ek list hai jisme 5 elements hain, aur aapko us list ko traverse karna hai, toh aap ek `for loop` use karenge. Is case mein agar list mein `n` elements hain, toh time complexity **O(n)** hogi kyunki aapko har element ko dekhna padega.

```python
# Example of O(n) time complexity
arr = [1, 2, 3, 4, 5]
for i in arr:
    print(i)
```

Yahaan loop n times chalega, isliye time complexity O(n) hai.

---

### What Can Cause Time in a Function?

1. **Operations (+, -, *, /):**  
   Jab aapko koi mathematical operation perform karna hota hai, jaise addition, subtraction, multiplication, ya division, toh har operation constant time mein hota hai, jo O(1) kehlata hai.  
   
   **Example:**
   ```python
   a = b + c   # This operation takes constant time, O(1)
   ```

2. **Comparisons (<, >, ==):**  
   Comparison operations bhi constant time mein hoti hain. Jab aap kisi condition ko check karte hain, toh time complexity O(1) hoti hai.

   **Example:**
   ```python
   if a < b:
       print("a is smaller")  # This comparison is O(1)
   ```

3. **Looping (for, while):**  
   Looping se time complexity kaafi increase hoti hai. Agar aap ek loop use karte hain jo input ke size ke hisaab se chale, toh time complexity input size ke proportional hoti hai.

   **Example:**
   ```python
   for i in range(n):
       print(i)  # Time complexity is O(n)
   ```

4. **Outside Function Call (function()):**  
   Jab aap kisi function ko call karte hain, uske andar ka code uske time complexity ko decide karta hai. Agar function O(n) time leta hai, toh usko call karna bhi O(n) time lega.

   **Example:**
   ```python
   def print_items(arr):
       for item in arr:
           print(item)  # O(n)

   print_items([1, 2, 3, 4, 5])  # O(n)
   ```

---

### Rule Book for Calculating Time Complexity

1. **Always worst case:**  
   Jab hum time complexity calculate karte hain, toh hum hamesha worst-case scenario ko consider karte hain.  
   
   **Example:** Agar aapko sorted array mein ek element dhoondhna hai using binary search, toh worst-case complexity O(log n) hogi, kyunki sabse zyada time lagega jab element last mein milega.

2. **Remove Constants:**  
   Jab hum Big-O notations likhte hain, toh hum constants ko ignore kar dete hain.  
   
   **Example:**
   ```python
   for i in range(n):
       for j in range(10):   # Even though inner loop runs 10 times, we ignore it
           print(i, j)  # O(n) not O(10n)
   ```
   Yahaan inner loop 10 times chalega, lekin Big-O notation mein hum constant factors ko consider nahi karte, isliye O(n) likhte hain.

3. **Different inputs should have different variables:**  
   Agar aapke pass do different input arrays hain, toh aapko unko different variables ke saath consider karna padega.

   **Example:**
   ```python
   def combine_arrays(arr1, arr2):
       for i in arr1:   # O(a)
           print(i)
       for j in arr2:   # O(b)
           print(j)
   ```
   Yahaan time complexity O(a + b) hogi, kyunki dono arrays ke size different ho sakte hain.

4. **Drop Non-dominant terms:**  
   Jab multiple terms hoti hain, toh sabse zyada affect karne wali term ko consider karte hain.

   **Example:**
   ```python
   def process_array(arr):
       for i in arr:   # O(n)
           print(i)
       for j in arr:   # O(n)
           print(j)
   ```
   Yahaan time complexity O(2n) hai, lekin hum 2 ko ignore karte hain, isliye final time complexity O(n) hogi.

---

### **Additional Rules for Time Complexity Calculation:**

- **Use + for steps in order:**  
   Jab steps sequential hote hain, hum time complexities ko add karte hain.

   **Example:**
   ```python
   def process_array(arr1, arr2):
       for i in arr1:   # O(a)
           print(i)
       for j in arr2:   # O(b)
           print(j)
   ```
   Yahaan total time complexity O(a + b) hogi.

- **Use * for nested steps:**  
   Agar ek loop doosre loop ke andar hai, toh time complexity ko multiply karte hain.

   **Example:**
   ```python
   def process_nested(arr1, arr2):
       for i in arr1:   # O(a)
           for j in arr2:   # O(b)
               print(i, j)   # O(a * b)
   ```
   Yahaan nested loop hone ki wajah se time complexity O(a * b) hai.

---

### **What Causes Space Complexity?**

1. **Variables:**  
   Har variable jo aap define karte hain, memory space leta hai. Agar aap ek integer variable define karte hain, toh space complexity O(1) hoti hai.

   **Example:**
   ```python
   a = 10  # O(1)
   ```

2. **Data Structures:**  
   Data structures jaise arrays ya lists ka size unke elements ke hisaab se decide hota hai. Agar ek array mein `n` elements hain, toh space complexity O(n) hoti hai.

   **Example:**
   ```python
   arr = [1, 2, 3, 4, 5]  # O(n) where n is the number of elements
   ```

3. **Function Call:**  
   Jab aap ek function call karte hain, toh har function call stack mein space leta hai. Recursion mein space complexity function calls ke number par depend karti hai.

   **Example:**
   ```python
   def recursive_func(n):
       if n == 0:
           return
       recursive_func(n-1)  # Space complexity O(n) due to recursion
   ```

4. **Allocations:**  
   Har naya object ya structure jo aap allocate karte hain, wo space leta hai.

   **Example:**
   ```python
   arr = [0] * n  # O(n) space allocated for the array
   ```
   ---

   ### **What is Space Complexity?**


---

### **What Causes Space Complexity?**

1. **Variables:**
   Every variable takes up space. For example, creating an integer or string will require some fixed memory.

2. **Data Structures:**
   Arrays, objects, or other data structures consume memory based on the number of elements they store.

3. **Function Calls:**
   Recursion or function calls add frames to the call stack, using more memory.

4. **Dynamic Allocations:**
   Dynamically created objects or arrays require additional memory.

---

### **Different Types of Space Complexity in JavaScript:**

1. **Constant Space Complexity (O(1)):**
   Uses a fixed amount of memory, regardless of input size.

   **Example:**
   ```javascript
   function checkFirstElement(arr) {
       console.log(arr[0]);  // O(1)
   }
   ```

2. **Linear Space Complexity (O(n)):**
   Memory usage grows linearly with the size of the input.

   **Example:**
   ```javascript
   function createArray(n) {
       let arr = new Array(n);  // O(n)
       return arr;
   }
   ```

3. **Logarithmic Space Complexity (O(log n)):**
   Memory usage grows logarithmically, often seen in recursive algorithms like binary search.

   **Example:**
   ```javascript
   function binarySearch(arr, target, low, high) {
       if (low <= high) {
           let mid = Math.floor((low + high) / 2);
           if (arr[mid] === target) return mid;
           return arr[mid] > target ? 
               binarySearch(arr, target, low, mid - 1) : 
               binarySearch(arr, target, mid + 1, high);
       }
       return -1;
   }
   ```

4. **Quadratic Space Complexity (O(n^2)):**
   Memory usage grows as the square of the input size.

   **Example:**
   ```javascript
   function createMatrix(n) {
       let matrix = Array.from({ length: n }, () => new Array(n));  // O(n^2)
       return matrix;
   }
   ```

| **Time Complexity** | **Performance** | **Space Complexity** | **Performance** |
|---------------------|-----------------|----------------------|-----------------|
| O(2^n)              | Exponential      | O(n^2)               | Quadratic       |
| O(n!)               | Factorial        | O(n^2)               | Quadratic       |
| O(n^2)              | Quadratic        | O(n * log n)         | n log n         |
| O(n * log n)        | n log n          | O(n)                 | Linear          |
| O(n)                | Linear           | O(log n)             | Logarithmic     |
| O(log n)            | Logarithmic      | O(1)                 | Constant        |
| O(1)                | Constant         | O(1)                 | Constant        |

### Key Points:
- **Time Complexity:** As you go from **O(2^n)** to **O(1)**, the performance improves (i.e., the algorithm becomes faster).
- **Space Complexity:** As you go from **O(n^2)** to **O(1)**, the memory usage improves (i.e., less space is used). 
