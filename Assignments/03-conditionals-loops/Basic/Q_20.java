import java.util.Scanner;

public class Q_20 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of cube");
        float side = in.nextFloat();
        double tsa = 6 * side * side;
        System.out.println("The total surface area of cube is " + tsa);
    }
}
