import java.util.Scanner;

public class Q_14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int sum = 0;
        for (int i=1; i<=num; i++) {
            sum += i;
        }
        System.out.println("The sum of " + num + " numbers are " + sum);
    }
}
