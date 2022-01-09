import java.util.Scanner;

public class Q_15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num, remainder, sum = 0;

        System.out.print("Enter the number : ");
        num = in.nextInt();

        int originalNumber = num;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            sum = sum + (remainder * remainder * remainder);
            originalNumber = originalNumber / 10;
        }
        if (sum == num) {
            System.out.print("The given number is an armstrong number");
        }
        else {
            System.out.print("The given number is not an armstrong number");
        }
    }
}