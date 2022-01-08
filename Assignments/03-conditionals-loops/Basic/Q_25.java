import java.util.Scanner;

public class Q_25 {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);
        int largest = 0;
        while(true) {
            System.out.print("Enter the number : ");
            int num = in.nextInt();
            if (num > largest) {
                largest = num;
            }
            else if (num==0) {
                break;
            }
        }
        System.out.println("The largest number is " + largest);
    }
}