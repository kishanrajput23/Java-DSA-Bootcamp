import java.util.Scanner;

public class Q_21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print(f1 + " " + f2);

        for (int i=2; i<=num; i++) {
            int f3 = f1+f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}
