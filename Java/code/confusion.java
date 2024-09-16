import java.util.*;

public class confusion {

    public static void main(String[] args) {
        // Taking Input
        System.out.println("Enter an integer:");
        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();
        System.out.println("You entered: " + num);
        
        // Taking String Input
        scnr.nextLine(); // Consume the newline left-over
        System.out.println("Enter a string:");
        String str = scnr.nextLine();
        System.out.println("You entered: " + str);
        
        // Lossy Conversion
        System.out.println("Lossy Conversion Example:");
        float flt = 10.00f;
        int lossyNum = (int) flt; // Explicit casting required
        System.out.println("Converted number: " + lossyNum);
        
        // Source Type vs. Destination Type
        System.out.println("Source Type vs. Destination Type Example:");
        int smallValue = 42;  // Source Type is `int`
        double largerValue = smallValue;  // Destination Type is `double`
        System.out.println("Small Value: " + smallValue);  // Output: 42
        System.out.println("Larger Value: " + largerValue); // Output: 42.0
        
        // Error Due to Implicit Conversion
        System.out.println("Error Due to Implicit Conversion Example:");
        double source = 123.456;  // Source Type is `double`
        int destination = (int) source;  // Explicit casting required
        System.out.println("Converted value: " + destination);
    }
}
