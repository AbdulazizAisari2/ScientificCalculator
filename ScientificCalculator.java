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
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    performSquareRoot(scanner);
                    break;
                case 6:
                    performPower(scanner);
                    break;
                case 7:
                    performSine(scanner);
                    break;
                case 8:
                    performCosine(scanner);
                    break;
                case 9:
                    performTangent(scanner);
                    break;
				case 10:
                    performNaturalLog(scanner);
                    break;
                case 11:
                    performLogBase10(scanner);
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

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return num1 / num2;
    }

    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(num);
    }

    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double calculateSine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    public static double calculateCosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    public static double calculateTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        double cos = Math.cos(radians);
        if (Math.abs(cos) < 1e-10) {
            throw new ArithmeticException("Tangent is undefined at " + degrees + " degrees.");
        }
        return Math.tan(radians);
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

    private static void performDivision(Scanner scanner) {
        try {
            System.out.print("Enter the numerator: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the denominator: ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return;
            }

            double result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        try {
            System.out.print("Enter a number: ");
            double num = scanner.nextDouble();

            if (num < 0) {
                System.out.println("Error: Cannot calculate square root of a negative number.");
                return;
            }

            double result = calculateSquareRoot(num);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void performPower(Scanner scanner) {
        try {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the exponent: ");
            double exponent = scanner.nextDouble();

            double result = calculatePower(base, exponent);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void performSine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            double result = calculateSine(degrees);
            System.out.println("Result (sin): " + result);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }
    }

    private static void performCosine(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            double result = calculateCosine(degrees);
            System.out.println("Result (cos): " + result);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }
    }

    private static void performTangent(Scanner scanner) {
        try {
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();

            double result = calculateTangent(degrees);
            System.out.println("Result (tan): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }
    }
	public static double calculateNaturalLogarithm(double num) {
        if (num <= 0) {
            throw new ArithmeticException("Natural log undefined for zero or negative numbers.");
        }
        return Math.log(num);
    }

    public static double calculateLogarithmBase10(double num) {
        if (num <= 0) {
            throw new ArithmeticException("Log base 10 undefined for zero or negative numbers.");
        }
        return Math.log10(num);
    }

    private static void performNaturalLog(Scanner scanner) {
        try {
            System.out.print("Enter a positive number: ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                System.out.println("Error: ln is undefined for zero or negative numbers.");
                return;
            }

            double result = calculateNaturalLogarithm(num);
            System.out.println("Result (ln): " + result);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }
    }

    private static void performLogBase10(Scanner scanner) {
        try {
            System.out.print("Enter a positive number: ");
            double num = scanner.nextDouble();

            if (num <= 0) {
                System.out.println("Error: log₁₀ is undefined for zero or negative numbers.");
                return;
            }

            double result = calculateLogarithmBase10(num);
            System.out.println("Result (log₁₀): " + result);
        } catch (Exception e) {
            System.out.println("Invalid input.");
            scanner.nextLine();
        }
    }
}
