import java.util.*;

public class Q_6 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius of a circle : ");
      float num = sc.nextInt();
      
      double Area = area(num);
      double Circumference = circumference(num);
      
      System.out.println("The area of the circle is " + Area);
      System.out.println("The circumference of the circle is " + Circumference);
      
    }
    
    public static double area(float r) {
        return 3.14 * r * r;
    }
    
    public static double circumference(float r) {
        return 2 * 3.14 * r;
    }
}
