import java.util.Scanner;

public class Q_8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        float radius = in.nextFloat();
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The perimeter of circle is " + perimeter);
    }
}
