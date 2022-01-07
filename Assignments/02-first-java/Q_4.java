import java.util.Scanner;

public class Q_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the choice for perform the following operations\n [+, -, *, /]");

        System.out.println("Enter the first number : ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = in.nextInt();

        System.out.println("Enter the operator : ");
        char choice = in.next().charAt(0);
        double result = 0;
        
        if (choice == '+') {
            result = num1 + num2;
        }
        else if (choice == '-') {
            result = num1 - num2;
        }
        else if (choice == '*') {
            result = num1 * num2;
        }
        else if (choice == '/') {
            result = num1 / num2;
        }
        else {
            System.out.println("Please enter valid input");
        }
        System.out.println("The result is " + result);
    }
}