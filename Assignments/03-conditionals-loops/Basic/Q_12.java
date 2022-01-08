import java.util.Scanner;

public class Q_12 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of square");
        float side = in.nextFloat();
        double perimeter = 4 * side;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
