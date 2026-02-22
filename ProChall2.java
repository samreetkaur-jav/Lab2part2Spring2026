import java.util.Scanner;

/**
 * This program asks the user for their first, middle, and last name.
 * It then displays the full name and the initials.
 *
 * @author: Samreet Kaur
 * @since: 2/20/2026
 * @version: v1.0
 * 
 */
public class ProChall2  
{

    public static void main(String[] args){
        String firstName, middleName, lastName;
        char firstInit, middleInit, lastInit;

        Scanner keyboard = new Scanner(System.in);

        // Collect the user's first, middle, and last name
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();

        System.out.print("Enter your middle name: ");
        middleName = keyboard.next();

        System.out.print("Enter your last name: ");
        lastName = keyboard.next();

        // Extract the first character from each name
        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit =lastName.charAt(0);

        // Output
        // User's full name
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        // User's initials
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);

        keyboard.close();
    }
}