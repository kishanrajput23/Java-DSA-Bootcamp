import java.util.Scanner;

public class Q_15 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num, remainder;
        float sum = 0;

        System.out.print("Enter the number : ");
        num = in.nextInt();

        int digit = 0, temp = num;
        int originalNumber = num;

        while (temp != 0){
            digit++;
            temp = temp / 10;
        }

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            originalNumber = originalNumber / 10;
            sum = (float) (sum + Math.pow(remainder, digit));
        }
        if (sum == num) {
            System.out.print("The given number is an armstrong number");
        }
        else {
            System.out.print("The given number is not an armstrong number");
        }
    }
}