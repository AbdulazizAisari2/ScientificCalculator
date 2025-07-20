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
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;
                case 5: performSquareRoot(scanner); break;
                case 6: performPower(scanner); break;
                case 7: performSine(scanner); break;
                case 8: performCosine(scanner); break;
                case 9: performTangent(scanner); break;
                case 10: performNaturalLog(scanner); break;
                case 11: performLogBase10(scanner); break;
                case 12: performAbsoluteValue(scanner); break;
                case 13: performRound(scanner); break;
                case 14: performCeiling(scanner); break;
                case 15: performFloor(scanner); break;
                case 0: System.out.println("Exiting calculator. Goodbye!"); break;
                default: System.out.println("Invalid choice. Please try again.");
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
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // --- Logic Methods ---
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
        return a / b;
    }
    public static double calculateSquareRoot(double a) {
        if (a < 0) throw new ArithmeticException("Cannot calculate square root of a negative number.");
        return Math.sqrt(a);
    }
    public static double calculatePower(double base, double exp) {
        return Math.pow(base, exp);
    }
    public static double calculateSine(double deg) {
        return Math.sin(Math.toRadians(deg));
    }
    public static double calculateCosine(double deg) {
        return Math.cos(Math.toRadians(deg));
    }
    public static double calculateTangent(double deg) {
        double radians = Math.toRadians(deg);
        double cos = Math.cos(radians);
        if (Math.abs(cos) < 1e-10)
            throw new ArithmeticException("Tangent undefined at " + deg + " degrees.");
        return Math.tan(radians);
    }
    public static double calculateNaturalLogarithm(double a) {
        if (a <= 0) throw new ArithmeticException("ln undefined for non-positive values.");
        return Math.log(a);
    }
    public static double calculateLogarithmBase10(double a) {
        if (a <= 0) throw new ArithmeticException("log10 undefined for non-positive values.");
        return Math.log10(a);
    }
    public static double calculateAbsoluteValue(double a) {
        return Math.abs(a);
    }
    public static long roundNumber(double a) {
        return Math.round(a);
    }
    public static double ceilingNumber(double a) {
        return Math.ceil(a);
    }
    public static double floorNumber(double a) {
        return Math.floor(a);
    }

    // --- Interaction Methods ---
    private static void performAddition(Scanner s) {
        try {
            System.out.print("Enter first number: ");
            double a = s.nextDouble();
            System.out.print("Enter second number: ");
            double b = s.nextDouble();
            System.out.println("Result: " + add(a, b));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performSubtraction(Scanner s) {
        try {
            System.out.print("Enter first number: ");
            double a = s.nextDouble();
            System.out.print("Enter second number: ");
            double b = s.nextDouble();
            System.out.println("Result: " + subtract(a, b));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performMultiplication(Scanner s) {
        try {
            System.out.print("Enter first number: ");
            double a = s.nextDouble();
            System.out.print("Enter second number: ");
            double b = s.nextDouble();
            System.out.println("Result: " + multiply(a, b));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performDivision(Scanner s) {
        try {
            System.out.print("Enter numerator: ");
            double a = s.nextDouble();
            System.out.print("Enter denominator: ");
            double b = s.nextDouble();
            System.out.println("Result: " + divide(a, b));
        } catch (Exception e) {
            System.out.println("Math error: " + e.getMessage());
            s.nextLine();
        }
    }

    private static void performSquareRoot(Scanner s) {
        try {
            System.out.print("Enter number: ");
            double a = s.nextDouble();
            System.out.println("Result: " + calculateSquareRoot(a));
        } catch (Exception e) {
            System.out.println("Math error: " + e.getMessage());
            s.nextLine();
        }
    }

    private static void performPower(Scanner s) {
        try {
            System.out.print("Enter base: ");
            double base = s.nextDouble();
            System.out.print("Enter exponent: ");
            double exp = s.nextDouble();
            System.out.println("Result: " + calculatePower(base, exp));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performSine(Scanner s) {
        try {
            System.out.print("Enter angle in degrees: ");
            double deg = s.nextDouble();
            System.out.println("Result (sin): " + calculateSine(deg));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performCosine(Scanner s) {
        try {
            System.out.print("Enter angle in degrees: ");
            double deg = s.nextDouble();
            System.out.println("Result (cos): " + calculateCosine(deg));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performTangent(Scanner s) {
        try {
            System.out.print("Enter angle in degrees: ");
            double deg = s.nextDouble();
            System.out.println("Result (tan): " + calculateTangent(deg));
        } catch (Exception e) {
            System.out.println("Math error: " + e.getMessage());
            s.nextLine();
        }
    }

    private static void performNaturalLog(Scanner s) {
        try {
            System.out.print("Enter a positive number: ");
            double a = s.nextDouble();
            System.out.println("Result (ln): " + calculateNaturalLogarithm(a));
        } catch (Exception e) {
            System.out.println("Math error: " + e.getMessage());
            s.nextLine();
        }
    }

    private static void performLogBase10(Scanner s) {
        try {
            System.out.print("Enter a positive number: ");
            double a = s.nextDouble();
            System.out.println("Result (log₁₀): " + calculateLogarithmBase10(a));
        } catch (Exception e) {
            System.out.println("Math error: " + e.getMessage());
            s.nextLine();
        }
    }

    private static void performAbsoluteValue(Scanner s) {
        try {
            System.out.print("Enter number: ");
            double a = s.nextDouble();
            System.out.println("Result (abs): " + calculateAbsoluteValue(a));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performRound(Scanner s) {
        try {
            System.out.print("Enter number: ");
            double a = s.nextDouble();
            System.out.println("Result (rounded): " + roundNumber(a));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performCeiling(Scanner s) {
        try {
            System.out.print("Enter number: ");
            double a = s.nextDouble();
            System.out.println("Result (ceiling): " + ceilingNumber(a));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }

    private static void performFloor(Scanner s) {
        try {
            System.out.print("Enter number: ");
            double a = s.nextDouble();
            System.out.println("Result (floor): " + floorNumber(a));
        } catch (Exception e) {
            System.out.println("Invalid input."); s.nextLine();
        }
    }
}
