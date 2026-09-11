public class VariablesDataTypes {
    public static void main(String[] args) {

        // 1. Declare variables of different data types
        int a = 15, b = 5;
        double x = 10.5, y = 2.5;
        char letter = 'J';
        boolean isEasy = true;
        String text = "Java";

        // 2. Perform arithmetic operations
        int add = a + b;
        int subtract = a - b;
        int multiply = a * b;

        double doubleAdd = x + y;
        double doubleMultiply = x * y;

        // 3. String concatenation
        String result = text + " Programming is fun!";

        // 4. Display results
        System.out.println("Integer Values: " + a + ", " + b);
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);

        System.out.println("\nDouble Values: " + x + ", " + y);
        System.out.println("Addition (double): " + doubleAdd);
        System.out.println("Multiplication (double): " + doubleMultiply);

        System.out.println("\nCharacter Value: " + letter);
        System.out.println("Boolean Value: " + isEasy);

        System.out.println("\nString Concatenation:");
        System.out.println(result);
    }
}

