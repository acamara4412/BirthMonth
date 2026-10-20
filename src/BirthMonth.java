import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Create scanner and initialize variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";

        // Prompt user for their birth month
        System.out.print("Enter your birth month (1 - 12): ");

        // Check if input is a valid integer
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // clear buffer

            // Check if month is within the valid 1 - 12 range
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }

        } else {
            // Handle non-integer text input
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }
    }
}