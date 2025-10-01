package code;

import database.WriteStudentDetailesToDatabase;
import java.io.IOException;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class SignupFile
{
    public static String genuserid;
    public static String password;
    public static String name;
    public static String phoneNum;
    public static Scanner input = new Scanner(System.in);

    public static void getName() throws IOException
    {
        System.out.println("");
        System.out.println("Enter Your Name ");
        name = input.nextLine();
        WriteStudentDetailesToDatabase.writeSignUpName();
    }

    public static void getMobileNumber() throws IOException
    {
        while (true)
        {
            System.out.println("");
            System.out.println("Enter Your Phone Number");
            phoneNum = input.nextLine();
            if (phoneNum.length()==10)
            {
                System.out.println("You Ready For Create Password ");
                WriteStudentDetailesToDatabase.writeSignUpPhoneNum();
                break; // Exit the loop if phone number is valid
            }
            else
            {
                System.out.println("Invalid Phone Number");
            }
        }
    }

    public static void getPassword() throws IOException
    {
      
        System.out.println("");
        System.out.println("Note: you Create Atleast 8 Character and Maximum 15 Character");
        System.out.println("Create Password");
        password = input.nextLine();
        while (password.length() < 8 || password.length() > 15)
        {
            System.out.println("Password must be between 8 and 15 characters. Please try again.");
            password = input.nextLine();

        }
        System.out.println("Created password SuccesFully");
        WriteStudentDetailesToDatabase.writePassWord();
    }

    public static void generateUserId() throws Exception
    {
        int currentYear = Year.now().getValue();
        int length = 10; // Length of the user ID
        String characters = "0123456789";
        Random random = new Random();
        StringBuilder userId = new StringBuilder();
        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            userId.append(characters.charAt(index));
        }
        String generatedUserId = userId.toString();
        System.out.println("");
        System.out.println("you can note it down this user id for login use");
        genuserid = currentYear + generatedUserId; // Concatenate current year with generated user ID
        WriteStudentDetailesToDatabase.writeUserId();
        System.out.println("Generated User ID: " + genuserid);
        System.out.println("");
        System.out.println("Enter E for Exit OR else B for Back");
        String choice = input.nextLine();
        while (true)
        {
            if (choice.equalsIgnoreCase("E"))
            {
                System.out.println("Exiting the portel...");
                System.exit(0);
            }
            else if (choice.equalsIgnoreCase("B"))
            {
                System.out.println("Going back to the main menu...");
                System.out.println("");
                break;
            }
            else
            {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void signupPage() throws IOException
    {
        getName();
        getMobileNumber();
        getPassword();
        try {
            generateUserId();
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
