import java.util.Scanner;

public class Q_2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of a triangle");
        double base = input.nextDouble();
        System.out.println("Enter the height of a triangle");
        double height = input.nextDouble();
        double area  = 0.5 * base * height;
        System.out.println("The area of the traingle is " + area);
    }
}
