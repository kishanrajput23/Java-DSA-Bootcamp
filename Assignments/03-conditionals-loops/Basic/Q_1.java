import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the circle radius : ");
        float radius = in.nextFloat();
        System.out.println("The area of circle is " + (3.14 * radius * radius));
    }
}