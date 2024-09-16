import java.util.Scanner;

public class JavaPrograms {

    // Method to check if a given number is prime
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

    // Method to reverse a number and check if it is a palindrome
    public static boolean isPalindrome(int num) {
        int numCpy = num;
        int reversedNumber = 0;
        while (num > 0) {
            int LD = num % 10;
            reversedNumber = reversedNumber * 10 + LD;
            num /= 10;
        }
        return reversedNumber == numCpy;
    }

    // Method to check if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Method to compute sum of first N numbers using a loop
    public static int sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Method to compute sum of first N numbers using a formula
    public static int sumOfNFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    // Method to convert decimal to binary
    public static int decimalToBinary(int deci) {
        int byr = 0;
        int power = 0;
        while (deci > 0) {
            int rem = deci % 2;
            byr = byr + rem * (int) Math.pow(10, power);
            deci /= 2;
            power++;
        }
        return byr;
    }

    // Method to convert binary to decimal
    public static int binaryToDecimal(int byr) {
        int deci = 0;
        int power = 0;
        while (byr > 0) {
            int rem = byr % 10;
            deci = deci + rem * (int) Math.pow(2, power);
            byr /= 10;
            power++;
        }
        return deci;
    }

    // Method to find the factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int numCopy = num;
        int tempAms = 0;
        int pow = 0;
        while (num > 0) {
            pow++;
            num /= 10;
        }
        num = numCopy;
        while (num > 0) {
            int ld = num % 10;
            tempAms += Math.pow(ld, pow);
            num /= 10;
        }
        return tempAms == numCopy;
    }

    // Method to print a star pattern
    public static void starPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print an inverted star pattern
    public static void invertedStarPattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print a number pattern
    public static void numberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method to print an alphabet triangle pattern
    public static void alphabetTrianglePattern(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    // Method to print a hollow rectangle pattern
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

    // Method to print an inverted half-pyramid pattern with numbers
    public static void invertedHalfPyramidNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Method to print Floyd's Triangle
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

    // Method to print a binary triangle pattern
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2);
            }
            System.out.println();
        }
    }

    // Method to print a butterfly pattern
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

    // Method to print a solid rhombus pattern
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

    // Method to print a hollow rhombus pattern
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

    // Method to print a diamond pattern
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

    // Method to print a numbers pyramid pattern
    public static void numbersPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Method to convert a decimal number to hexadecimal
    public static String decimalToHexadecimal(int dec) {
        return Integer.toHexString(dec).toUpperCase();
    }

    // Method to convert a hexadecimal number to decimal
    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Example usage of methods
        // System.out.println("Enter a number to check for prime, palindrome, factorial, or Armstrong:");
        // int num = scanner.nextInt();
        // 
        // System.out.println(num + " is prime: " + isPrime(num));
        // System.out.println(num + " is palindrome: " + isPalindrome(num));
        // System.out.println(num + " factorial: " + factorial(num));
        // System.out.println(num + " is Armstrong: " + isArmstrong(num));
// 
        // System.out.println("Enter a number for sum calculations:");
        // int n = scanner.nextInt();
        // System.out.println("Sum of first " + n + " numbers (loop): " + sumOfN(n));
        // System.out.println("Sum of first " + n + " numbers (formula): " + sumOfNFormula(n));
// 
        // System.out.println("Enter a decimal number to convert to binary:");
        // int decimal = scanner.nextInt();
        // System.out.println("Binary representation: " + decimalToBinary(decimal));
// 
        // System.out.println("Enter a binary number to convert to decimal:");
        // int binary = scanner.nextInt();
        // System.out.println("Decimal representation: " + binaryToDecimal(binary));
// 
        // System.out.println("Enter a number of rows for patterns:");
        // int rows = scanner.nextInt();
// 
        // System.out.println("Star pattern:");
        // starPattern(5);
        // 
        // System.out.println("Inverted star pattern:");
        // invertedStarPattern(5);
        // 
        // System.out.println("Number pattern:");
        // numberPattern(5);
        // 
        // System.out.println("Alphabet triangle pattern:");
        // alphabetTrianglePattern(5);
        // 
        // System.out.println("Hollow rectangle pattern (5 x cols):");
        // int cols = scanner.nextInt();
        // hollowRectangle(5, cols);
        // 
        // System.out.println("Inverted half pyramid numbers:");
        // invertedHalfPyramidNumbers(5);
        // 
        // System.out.println("Floyd's triangle:");
        // floydsTriangle(5);
        // 
        // System.out.println("Binary triangle pattern:");
        // binaryTriangle(5);
        // 
        // System.out.println("Butterfly pattern:");
        // butterflyPattern(5);
        // 
        // System.out.println("Solid rhombus pattern:");
        // solidRhombus(5);
        // 
        // System.out.println("Hollow rhombus pattern:");
        // hollowRhombus(5);
        // 
        // System.out.println("Diamond pattern:");
        // diamondPattern(5);
        // 
        // System.out.println("Numbers pyramid pattern:");
        // numbersPyramid(5);
        // 
        // System.out.println("Enter a decimal number to convert to hexadecimal:");
        // int dec = scanner.nextInt();
        // System.out.println("Hexadecimal representation: " + decimalToHexadecimal(dec));
// 
        // System.out.println("Enter a hexadecimal number to convert to decimal:");
        // String hex = scanner.next();
        // System.out.println("Decimal representation: " + hexadecimalToDecimal(hex));

        scanner.close();
    }
}
