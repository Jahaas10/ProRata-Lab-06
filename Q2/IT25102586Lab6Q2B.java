import java.util.Scanner;

public class IT25102586Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbersList = "";
        int count = 1;

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            numbersList += num + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersList);

        scanner.close();
    }
}