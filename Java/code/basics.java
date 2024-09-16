import java.util.*;

public class basics {
    public static void main(String[] args) {
        // Type Conversion Example
        int d = 23;
        long c = d;
        System.out.println("Type Conversion Example:");
        System.out.println("Long value: " + c);

        // Lossy Conversion Example
        double source = 123.456;
        int destination = (int) source;
        System.out.println("\nLossy Conversion Example:");
        System.out.println("Converted int value: " + destination);

        // Type Casting Example
        System.out.println("\nType Casting Examples:");
        double temperature = 36.7;
        int roundedTemperature = (int) temperature;
        System.out.println("Double to int: " + roundedTemperature);

        char letter = 'A';
        int letterCode = (int) letter;
        System.out.println("Char to int: " + letterCode);

        long largeNumber = 123456789L;
        short smallNumber = (short) largeNumber;
        System.out.println("Long to short: " + smallNumber);

        float pi = 3.14f;
        byte piByte = (byte) pi;
        System.out.println("Float to byte: " + piByte);

        // Type Promotion in Expressions
        int intValue = 10;
        long longValue = 20;
        float floatValue = 30.0f;
        double doubleValue = 40.0;

        float result1 = intValue + longValue + floatValue;
        System.out.println("\nResult 1 (float): " + result1);

        long result2 = intValue + longValue;
        System.out.println("Result 2 (long): " + result2);

        double result3 = intValue + doubleValue;
        System.out.println("Result 3 (double): " + result3);

        // Printing Examples
        System.out.println("\nPrinting Examples:");
        System.out.print("Hello, ");
        System.out.print("World!");
        System.out.println();
        System.out.println("Hello, World!");

        int number = 10;
        double piValue = 3.14159;
        System.out.printf("Number: %d\n", number);
        System.out.printf("Pi value: %.2f\n", piValue);

        // Checking Data Types
        float flt = 23.0f;
        System.out.println("\nData Type of float variable:");
        System.out.println(((Object) flt).getClass().getSimpleName());

        Integer num = 10;
        System.out.println("Data Type of Integer object:");
        System.out.println(num.getClass().getSimpleName());

        System.out.println("\nCustom Type Check Function:");
        printType(flt);
        printType(num);

        // Taking Input
        Scanner scnr = new Scanner(System.in);

        System.out.println("\nEnter an integer:");
        int userInt = scnr.nextInt();
        System.out.println("You entered: " + userInt);

        System.out.println("Enter a string:");
        scnr.nextLine(); // Consume the newline
        String userStr = scnr.nextLine();
        System.out.println("You entered: " + userStr);

        // Function Overloading Examples
        System.out.println("\nFunction Overloading Examples:");
        System.out.println("Multiply (2 int): " + multiply(2, 3));
        System.out.println("Multiply (3 int): " + multiply(2, 3, 4));
        System.out.println("Multiply (2 double): " + multiply(2.5, 3.5));

        // Swap Example
        System.out.println("\nSwap Example:");
        int a = 5, b = 10;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        int newA = swap(a, b);
        System.out.println("After swap: a = " + newA + ", b = " + b);
    }

    // Custom Method to Print Type
    public static void printType(Object obj) {
        if (obj == null) {
            System.out.println("The object is null.");
            return;
        }
        System.out.println(obj.getClass().getSimpleName());
    }

    // Overloaded Methods
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    // Swap Method
    public static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }
}
