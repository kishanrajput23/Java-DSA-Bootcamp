import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float p, r, n, t;
        System.out.print("Enter the initial principal balance (P) : ");
        p = in.nextFloat();

        System.out.print("Enter the interest rate (R) : ");
        r = in.nextFloat();

        System.out.print("number of times interest applied per time period (n) : ");
        n = in.nextFloat();

        System.out.print("Enter the number of time periods elapsed (t) : ");
        t = in.nextFloat();

        double A = (p *  Math.pow((1 + (r/n)), (n*t)));

        System.out.println("The final amount is " + A);
    }
}