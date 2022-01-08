import java.util.Scanner;

public class Q_10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of parallelogram");
        float base = in.nextFloat();
        System.out.println("Enter the side of parallelogram");
        float side = in.nextFloat();
        double perimeter = 2 * (base + side);
        System.out.println("The perimeter of parallelogram is " + perimeter);
    }
}
