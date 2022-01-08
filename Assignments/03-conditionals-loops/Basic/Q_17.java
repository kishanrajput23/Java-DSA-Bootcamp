import java.util.Scanner;

public class Q_17 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        float radius = in.nextFloat();
        double volume = (4 * 3.14* radius * radius * radius) / 3;
        System.out.println("The volume of sphere is " + volume);
    }
}
