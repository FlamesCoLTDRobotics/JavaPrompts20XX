import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    // create a scanner to read input from the user
    Scanner scanner = new Scanner(System.in);

    // create a DecimalFormat object to format the output
    DecimalFormat format = new DecimalFormat("#.##");

    // prompt the user for the first number
    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();

    // prompt the user for the second number
    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();

    // prompt the user for the operation
    System.out.print("Enter the operation (+, -, *, /): ");
    char operation = scanner.next().charAt(0);

    // perform the calculation and print the result
    double result = 0;
    switch (operation) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
    }
    System.out.println("Result: " + format.format(result));
  }
}
