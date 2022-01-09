import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Alphabet : ");
        char a = input.next().trim().charAt(0);

        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U') {
            System.out.println("Its a Vowel");
        } 
        else {
            System.out.println("It's a Consonant");
        }
    }
}
