import java.util.Scanner;

public class Q_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter the first number : ");
        num1 = in.nextInt();

        System.out.println("Enter the second number : ");
        num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number");
        }
        else {
            System.out.println(num2 + " is the largest number");
        }
    }
}