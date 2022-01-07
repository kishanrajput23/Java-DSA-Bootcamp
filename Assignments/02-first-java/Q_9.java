import java.util.Scanner;

public class Q_9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num1, num2, n1, n2, sum=0;

        System.out.println("Enter the fisrt number : ");
        num1 = in.nextInt();

        System.out.println("Enter the second number : ");
        num2 = in.nextInt();

        for (int i=num1; i<=num2; i++) {
            n1 = i;
            while (n1>0) {
                n2 = n1%10;
                sum = sum + (n2 * n2 *n2);
                n1 = n1/10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum=0;
        }
    }
}