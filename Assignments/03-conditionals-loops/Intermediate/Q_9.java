import java.util.Scanner;

class Q_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Runs: ");
        int runs = input.nextInt();

        System.out.print("Enter number of matches: ");
        int matches = input.nextInt();

        System.out.print("Enter number of not-out matches: ");
        int notout = input.nextInt();

        int outmatches = matches - notout;

        double batting_avg = runs / outmatches;

        System.out.println("Batting Average = "+batting_avg);

    }
}
