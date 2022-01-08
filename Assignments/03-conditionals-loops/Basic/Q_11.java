import java.util.Scanner;

public class Q_11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        float length = in.nextFloat();
        System.out.println("Enter the width of rectangle");
        float width = in.nextFloat();
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of rectangle is " + perimeter);
    }
}
