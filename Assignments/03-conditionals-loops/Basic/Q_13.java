import java.util.Scanner;

public class Q_13 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of rhombus");
        float side = in.nextFloat();
        double perimeter = 4 * side;
        System.out.println("The perimeter of rhombus is " + perimeter);
    }
}
