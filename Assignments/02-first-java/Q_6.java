import java.util.Scanner;

public class Q_6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter amount in ₹ : ");

        int rupee = in.nextInt();

        System.out.println("Amount in $ : " + (rupee * 0.013));
    }
}