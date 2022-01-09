import java.util.Scanner;

public class Q_12 {
    public static void main(String arg[]) {
       Scanner in = new Scanner(System.in);
       int sum = 0;
       int count = 0;
       System.out.println("After fillings the marks press 0");
       while(true) {
           System.out.print("Enter the marks : ");
           double marks = in.nextDouble();
           if (marks==0) {
               break;
            }
            else {
                sum += marks;
                count += 1;
            }
       }
       double avg = sum/count;
       System.out.println("The average of all the marks are : " + avg);
    }
}
