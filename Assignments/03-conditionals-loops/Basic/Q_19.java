import java.util.Scanner;

public class Q_19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        float radius = in.nextFloat();
        System.out.println("Enter the height of cylinder");
        float height = in.nextFloat();
        double csa = (2 * 3.14 * radius * height);
        System.out.println("The curved surface area of cylinder is " + csa);
    }
}
