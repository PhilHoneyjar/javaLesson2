import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {
        double number1, number2, result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        number1 = scanner.nextDouble();

        System.out.print("Enter operation (*, /, +, -): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        number2 = scanner.nextDouble();

        scanner.close();

        switch (operator) {
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            default -> System.out.println("Incorrect operation");
        }

        System.out.printf("Result: %f", result);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt", true));
            writer.write(number1 + " " + operator + " " + number2 + " = " + result + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
}