import java.util.Scanner;

public class Task6_Fundamentals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a float value: ");
        float floatNum = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleNum = sc.nextDouble();

        System.out.println("\\nOriginal Values:");
        System.out.println("Integer: " + num);
        System.out.println("Float: " + floatNum);
        System.out.println("Double: " + doubleNum);

        // Widening conversions (implicit)
        double convertedDouble = num;
        double convertedFromFloat = floatNum;

        System.out.println("\\nImplicit Type Casting:");
        System.out.println("Integer to Double: " + convertedDouble);
        System.out.println("Float to Double: " + convertedFromFloat);

        // Narrowing conversions (explicit)
        int convertedInt = (int) doubleNum;
        int floatToInt = (int) floatNum;

        System.out.println("\\nExplicit Type Casting:");
        System.out.println("Double to Integer: " + convertedInt);
        System.out.println("Float to Integer: " + floatToInt);

        sc.close();
    }
}
