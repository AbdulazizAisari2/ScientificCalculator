import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); // discard invalid input
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 0:
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n--- Scientific Calculator ---");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Square Root (√x)");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine (sin x)");
        System.out.println("8. Cosine (cos x)");
        System.out.println("9. Tangent (tan x)");
        System.out.println("10. Natural Logarithm (ln x)");
        System.out.println("11. Base 10 Logarithm (log₁₀ x)");
        System.out.println("12. Absolute Value (|x|)");
        System.out.println("13. Round Number");
        System.out.println("14. Ceiling (Round Up)");
        System.out.println("15. Floor (Round Down)");
        System.out.println("16. Minimum of Two Numbers");
        System.out.println("17. Maximum of Two Numbers");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // --- Logic Methods ---
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // --- Interaction Methods ---
    private static void performAddition(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = add(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void performSubtraction(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = subtract(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void performMultiplication(Scanner scanner) {
        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result = multiply(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine(); // clear invalid input
        }
    }
}
