import java.util.Scanner;

public class Q_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the following terms for calculating : ");

        System.out.println("Enter the Principal Amount : ");
        int P = in.nextInt();

        System.out.println("Enter the Rate : ");
        float R = in.nextFloat();

        System.out.println("Enter the Time : ");
        int T = in.nextInt();

        float simpleInterest = (P * R * T) / 100;
        System.out.println("The calculated Simple Interest is " + simpleInterest);

    }
}