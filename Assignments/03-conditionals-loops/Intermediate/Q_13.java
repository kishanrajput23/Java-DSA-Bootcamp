import java.util.Scanner;

public class Q_13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n1, n2, sum;
        System.out.print("Enter the fisrt number : ");
        n1 = in.nextInt();  

        System.out.print("Enter the second number : ");
        n2 = in.nextInt();

        sum = n1+n2;
        System.out.print("The sum of two numbers are : "+ sum);
    }
}