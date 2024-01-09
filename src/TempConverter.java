import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Choose conversion (1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double fahrenheit = (temperature*5/9)+32;
                System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
                break;
            case 2:
                double celsius = (temperature-32) * 5/9;
                System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }

}
