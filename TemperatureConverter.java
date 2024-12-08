import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("------------------------");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("Choose an option: ");
        
        int option = scanner.nextInt();

        if (option == 1) {
          System.out.print("Enter temperature in Celsius:");
          double celsius = scanner.nextDouble();
          double fahrenheit = (celsius + 9/5) + 32;
          System.out.printf("%.2f Celsius is %.2f Fahrenheit. \n", celsius, fahrenheit);
        }else if (option == 2) {
          System.out.print("Enter temperature in Fahrenheit:");
          double fahrenheit = scanner.nextDouble();
          double celsius = (fahrenheit - 32) * 5/9;
          System.out.printf("%.2f Fahrenheit is %.2f Celsius. \n", fahrenheit, celsius);
        }else {
          System.out.println("Invalid option");
        
        scanner.close();
    }
}
