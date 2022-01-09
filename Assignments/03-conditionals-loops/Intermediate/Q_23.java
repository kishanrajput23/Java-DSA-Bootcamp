import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
		int i, Number, Sum = 0 ;
		Scanner in = new Scanner(System.in);		
		System.out.print("Please Enter any Number: ");
		Number = in.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("% d is a Perfect Number", Number);
		}
		else {
			System.out.format("% d is NOT a Perfect Number", Number);
		}
	}
}
