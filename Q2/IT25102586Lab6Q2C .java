import java.util.Scanner;

public class IT25102586Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersList = "";
        int sum = 0;
        int count = 1;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            numbersList += num + " ";
            sum += num;
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersList);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}