public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table from 0 to 10:");

        // Print the header
        System.out.printf("%5s", ""); // Empty space for formatting
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println("\n--------------------------------------");

        // Print the multiplication table
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-5d|", i);
            for (int j = 0; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%5d", result);
            }
            System.out.println();
        }
    }
}
