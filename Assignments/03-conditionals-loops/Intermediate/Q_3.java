import java.util.Scanner;

public class Q_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int sum = 0;
        double avg;
        
        for (int i=1; i<=num; i++) {
            int n = in.nextInt();
            sum += n;
        }
        avg = sum / num;
        System.out.println("The average of " + num + " numbers are " + avg);
    }
}
