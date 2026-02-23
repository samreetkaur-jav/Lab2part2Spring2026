import java.util.Scanner;
/**
 * The ProChall12 class prompts the user to enter the name of a city. 
 * Using String methods, the program determines and displays the number of 
 * characters in the city name, converts the name to uppercase and lowercase,
 * and displays the first character entered.
 *
 *
 * @author Samreet Kaur
 * @since 2/21/2026
 * @version v1.0
 * 
 */
public class ProChall12 
{

    public static void main(String[] args) 
    {
        String city;
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt user for city name
        System.out.print("Enter a city: ");
        city = keyboard.nextLine();
        
        System.out.println("The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));
        
        // Close the scanner
        keyboard.close();
    }
}