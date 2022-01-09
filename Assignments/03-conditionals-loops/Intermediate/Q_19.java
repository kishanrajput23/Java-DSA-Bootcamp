import java.util.Scanner;

class Q_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p,r,t;
        System.out.print("Enter Principal amount : ");
        p = input.nextDouble();

        System.out.print("Enter Rate of Interest : ");
        r = input.nextDouble();

        System.out.print("Enter Time period in years : ");
        t = input.nextDouble();
        
        double res = p+((p*r*t)/100);
        System.out.println("Future Investment value : "+res);
    }
}
