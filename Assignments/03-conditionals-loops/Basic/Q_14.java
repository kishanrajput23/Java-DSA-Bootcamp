import java.util.Scanner;

public class Q_14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cone");
        float radius = in.nextFloat();
        System.out.println("Enter the height of cone");
        float height = in.nextFloat();
        double volume = (3.14 * radius * radius * height) / 3;
        System.out.println("The volume of cone is " + volume);
    }
}
