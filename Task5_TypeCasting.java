public class Task5_TypeCasting {
    public static void main(String[] args) {
        // Implicit casting: int is widened to double automatically.
        int num = 100;
        double doubleNum = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Before Casting (int): " + num);
        System.out.println("After Casting (double): " + doubleNum);

        // Explicit casting: double is narrowed to int manually.
        double value = 99.99;
        int intValue = (int) value;

        System.out.println("\\nExplicit Type Casting:");
        System.out.println("Before Casting (double): " + value);
        System.out.println("After Casting (int): " + intValue);
    }
}
