import java.util.Scanner;

public class IT25102586Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquares += Math.pow(num, 2);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("\nNo valid numbers were entered.");
        }

        scanner.close();
    }
}