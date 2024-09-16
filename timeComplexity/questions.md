
1. **Loop Over Array**
   ```javascript
   function loopOverArray(arr) {
       for (let i = 0; i < arr.length; i++) {
           console.log(arr[i]);
       }
   }
   ```
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)

   (The function iterates over the array once, using a constant amount of space for the loop counter `i`.)

2. **Nested Loops**
   ```javascript
   function nestedLoops(n) {
       for (let i = 0; i < n; i++) {
           for (let j = 0; j < n; j++) {
               console.log(i, j);
           }
       }
   }
   ```
   - **Time Complexity:** O(n^2)  
   - **Space Complexity:** O(1)

   (Two nested loops, each running `n` times, but only constant space is used for the loop counters.)

3. **Loop With Conditional**
   ```javascript
   function loopWithCondition(arr) {
       for (let i = 0; i < arr.length; i++) {
           if (arr[i] % 2 === 0) {
               console.log(arr[i]);
           }
       }
   }
   ```
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)

   (The loop runs `n` times, but the space remains constant since no extra memory is allocated.)

4. **Variable Assignment in Loop**
   ```javascript
   function variableAssignment(arr) {
       let total = 0;
       for (let i = 0; i < arr.length; i++) {
           total += arr[i];
       }
       return total;
   }
   ```
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)

   (The loop iterates over the array, but only a fixed amount of space is used for the variable `total`.)

5. **Logarithmic Search (Binary Search)**
   ```javascript
   function binarySearch(arr, target) {
       let left = 0;
       let right = arr.length - 1;
       while (left <= right) {
           let mid = Math.floor((left + right) / 2);
           if (arr[mid] === target) {
               return mid;
           } else if (arr[mid] < target) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       return -1;
   }
   ```
   - **Time Complexity:** O(log n)  
   - **Space Complexity:** O(1)

   (The search halves the array size each iteration, and only a fixed amount of space is used for `left`, `right`, and `mid`.)

6. **Condition Inside Nested Loops**
   ```javascript
   function conditionInNestedLoops(n) {
       for (let i = 0; i < n; i++) {
           for (let j = 0; j < n; j++) {
               if (i === j) {
                   console.log(i, j);
               }
           }
       }
   }
   ```
   - **Time Complexity:** O(n^2)  
   - **Space Complexity:** O(1)

   (Two nested loops with an if condition, but the space complexity remains constant as no additional data is stored.)

7. **Exponential Growth (Recursive Function)**
   ```javascript
   function exponentialGrowth(n) {
       if (n <= 0) return;
       exponentialGrowth(n - 1);
       exponentialGrowth(n - 1);
   }
   ```
   - **Time Complexity:** O(2^n)  
   - **Space Complexity:** O(n)

   (Each call generates two recursive calls. The recursion depth is `n`, so the space complexity is O(n) due to the stack.)

8. **Single Loop with Linear Operation**
   ```javascript
   function singleLoopLinearOperation(arr) {
       for (let i = 0; i < arr.length; i++) {
           for (let j = 0; j < 10; j++) {
               console.log(arr[i]);
           }
       }
   }
   ```
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)

   (The outer loop runs `n` times, and the inner loop runs a constant 10 times. Space usage is constant since no new memory is allocated.)


---


---

### 1. **Sum of Array Elements:**
   Write a function that calculates the sum of all elements in an array.

   ```javascript
   function sumArray(arr) {
       let sum = 0;
       for (let i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       return sum;
   }
   ```

---

### 2. **Factorial using Recursion:**
   Write a recursive function to calculate the factorial of a number.

   ```javascript
   function factorial(n) {
       if (n === 0) return 1;
       return n * factorial(n - 1);
   }
   ```

---

### 3. **Reverse a String:**
   Write a function that reverses a given string.

   ```javascript
   function reverseString(str) {
       let reversed = '';
       for (let i = str.length - 1; i >= 0; i--) {
           reversed += str[i];
       }
       return reversed;
   }
   ```

---

### 4. **Find Maximum Element in Array:**
   Write a function to find the maximum element in an array.

   ```javascript
   function findMax(arr) {
       let max = arr[0];
       for (let i = 1; i < arr.length; i++) {
           if (arr[i] > max) {
               max = arr[i];
           }
       }
       return max;
   }
   ```

---

### 5. **Binary Search:**
   Implement binary search to find a target element in a sorted array.

   ```javascript
   function binarySearch(arr, target) {
       let low = 0, high = arr.length - 1;
       while (low <= high) {
           let mid = Math.floor((low + high) / 2);
           if (arr[mid] === target) return mid;
           else if (arr[mid] < target) low = mid + 1;
           else high = mid - 1;
       }
       return -1;
   }
   ```

---

### 6. **Check if Array is Sorted:**
   Write a function that checks if an array is sorted in ascending order.

   ```javascript
   function isSorted(arr) {
       for (let i = 1; i < arr.length; i++) {
           if (arr[i] < arr[i - 1]) return false;
       }
       return true;
   }
   ```

---

### 7. **Fibonacci using Recursion:**
   Write a recursive function to generate the Fibonacci number for a given `n`.

   ```javascript
   function fibonacci(n) {
       if (n <= 1) return n;
       return fibonacci(n - 1) + fibonacci(n - 2);
   }
   ```

---

### 8. **Merge Two Sorted Arrays:**
   Write a function to merge two sorted arrays into one sorted array.

   ```javascript
   function mergeArrays(arr1, arr2) {
       let merged = [];
       let i = 0, j = 0;
       while (i < arr1.length && j < arr2.length) {
           if (arr1[i] < arr2[j]) {
               merged.push(arr1[i++]);
           } else {
               merged.push(arr2[j++]);
           }
       }
       return merged.concat(arr1.slice(i)).concat(arr2.slice(j));
   }
   ```

---

### 9. **Bubble Sort:**
   Write a function to sort an array using bubble sort.

   ```javascript
   function bubbleSort(arr) {
       let n = arr.length;
       for (let i = 0; i < n - 1; i++) {
           for (let j = 0; j < n - i - 1; j++) {
               if (arr[j] > arr[j + 1]) {
                   [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
               }
           }
       }
       return arr;
   }
   ```

---

### 10. **Find Duplicates in Array:**
   Write a function to find duplicates in an array.

   ```javascript
   function findDuplicates(arr) {
       let seen = {};
       let duplicates = [];
       for (let i = 0; i < arr.length; i++) {
           if (seen[arr[i]]) {
               duplicates.push(arr[i]);
           } else {
               seen[arr[i]] = true;
           }
       }
       return duplicates;
   }
   ```

---
