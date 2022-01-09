import java.util.Scanner;

public class Q_17 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String str, rev = "";
        System.out.println("Enter the string : ");

        str = in.nextLine();
        int len = str.length();

        for (int i=len-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("The reverse of given string is " + rev);
    }
}
