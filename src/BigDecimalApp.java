import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        BigDecimal firstNumber = scanner.nextBigDecimal();

        System.out.print("Enter the second number: ");
        BigDecimal secondNumber = scanner.nextBigDecimal();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        BigDecimal result = performOperation(firstNumber, secondNumber, operator);

        System.out.println("Result: " + result);

        scanner.close();
    }

    private static BigDecimal performOperation(BigDecimal a, BigDecimal b, char operator) {
        switch (operator) {
            case '+':
                return a.add(b);
            case '-':
                return a.subtract(b);
            case '*':
                return a.multiply(b);
            case '/':
                return a.divide(b, BigDecimal.ROUND_HALF_UP);
            default:
                return null;
        }
            }
}
