import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in)
        Scanner in = new Scanner(System.in);

        // int birthMonth = 0
        // String trash = ""
        int birthMonth = 0;
        String trash = "";

        // output "Enter your birth month (1 - 12): "
        System.out.print("Enter your birth month (1 - 12): ");

        // if hasNextInt then
        if (in.hasNextInt()) {
            // birthMonth = nextInt
            birthMonth = in.nextInt();
            in.nextLine(); // clear buffer

            // if birthMonth >= 1 AND birthMonth <= 12 then
            if (birthMonth >= 1 && birthMonth <= 12) {
                // output "Your birth month is: " + birthMonth
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                // output "You entered an incorrect month value: " + birthMonth
                System.out.println("You entered an incorrect month value: " + birthMonth);
            } // endIf

        } else {
            // trash = nextLine
            // output "You entered an incorrect month value: " + trash
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        } // endIf
    }
}