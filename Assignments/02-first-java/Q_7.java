import java.util.Scanner;

public class Q_7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = in.nextInt();

        int f1 = 0;
        int f2 = 1;
        int f3, i;

        System.out.print(f1 + " " + f2);

        for (i=2; i<num; i++) {
            f3 = f1+f2;
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;
        }
    }
}