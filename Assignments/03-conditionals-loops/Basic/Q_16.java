import java.util.Scanner;

public class Q_16 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        float radius = in.nextFloat();
        System.out.println("Enter the height of cylinder");
        float height = in.nextFloat();
        double volume = (3.14 * radius * radius * height);
        System.out.println("The volume of cylinder is " + volume);
    }
}
