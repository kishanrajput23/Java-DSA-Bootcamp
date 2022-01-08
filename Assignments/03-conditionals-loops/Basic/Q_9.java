import java.util.Scanner;

public class Q_9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of equilateral traingle");
        float side = in.nextFloat();
        double perimeter = 3 * side;
        System.out.println("The perimeter of equilateral traingle is " + perimeter);
    }
}