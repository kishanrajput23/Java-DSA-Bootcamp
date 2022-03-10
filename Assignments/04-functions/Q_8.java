import java.util.*;

public class Q_8 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter your marks : ");
      int num = sc.nextInt();
      grades(num);
    }
    public static void grades(int num) {
        if (num>100) {
            System.out.println("Please enter valid marks.");
        }
        else if (num>90) {
            System.out.println("Your grade is AA");
        }
        else if (num>80) {
            System.out.println("Your grade is AB");
        }
        else if (num>70) {
            System.out.println("Your grade is BB");
        }
        else if (num>60) {
            System.out.println("Your grade is BC");
        }
        else if (num>50) {
            System.out.println("Your grade is CD");
        }
        else if (num>40) {
            System.out.println("Your grade is DD");
        }
        else if (num<=40) {
            System.out.println("Sorry you got Fail");
        }
    }
}
