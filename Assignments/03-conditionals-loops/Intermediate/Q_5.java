import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("Enter the coordinates of first point : ");

        System.out.print("Enter the x1 point : ");
        x1 = in.nextInt();

        System.out.print("Enter the x2 point : ");
        x2 = in.nextInt();

        System.out.println("Enter the coordinates of second point : ");

        System.out.print("Enter the y1 point : ");
        y1 = in.nextInt();

        System.out.print("Enter the y2 point : ");
        y2 = in.nextInt();

        double distance = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        
        System.out.println("The distance between two points are : " + distance);
    }
}
