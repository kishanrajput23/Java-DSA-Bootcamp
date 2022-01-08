import java.util.Scanner;

public class Q_23 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();

        for (int i=1; i<=num; i++) {
            if (num%i == 0) {
                System.out.print(i + " ");
            }
            else {
                continue;
            }
        }
    }
}
