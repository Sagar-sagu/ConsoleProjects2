package code;

import database.ReadStudentDetailsFromDatabase;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class LoginFile
{
    public static Scanner input=new Scanner(System.in);

    public static void CheckUserID() throws IOException
    {
        while (true)
        {
            System.out.println("");
            System.out.println("Enter UserId :");
            String userid = input.nextLine();
            if (userid.equals(ReadStudentDetailsFromDatabase.UserId))
            {
                System.out.println("ready for enter password");
                break; // Exit the loop if user ID is valid
            }
            else
            {
                System.out.println();
                System.out.println("incorrect userID");
            }
        }
    }

    public static void CheckPassWord() throws IOException
    {
        while (true)
        {
            System.out.println("");
            System.out.println("Enter Password :");
            String password = input.nextLine();
            if (password.equals(ReadStudentDetailsFromDatabase.Password))
            {
                System.out.println("Password is correct, proceeding to captcha verification...");
                break; // Exit the loop if password is valid
            }
            else
            {
                System.out.println("Incorrect password, please try again.");
            
            }
        }
    }

    public static String ForgetUserID() throws IOException
    {
        String forgetUserID = ReadStudentDetailsFromDatabase.UserId;
        return forgetUserID;
    }

    public static String ForgetPassWord() throws IOException
    {
        String forgetPassword = ReadStudentDetailsFromDatabase.Password;
        return forgetPassword;
    }

    public static String generateCaptcha() throws IOException
    {
        int length = 6; // Length of the user ID
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuiopasdfghjklzxcvbnm0123456789";
        Random random = new Random();
        StringBuilder Captcha = new StringBuilder();

        for (int i = 0; i < length; i++)
        {
            int index = random.nextInt(characters.length());
            Captcha.append(characters.charAt(index));
        }

        String generatedCaptcha = Captcha.toString();
        return generatedCaptcha; // Return the generated captcha
    }

    public static void CheckGenerateCaptcha() throws IOException
    {

        String generatedCaptcha = generateCaptcha();
        System.out.println("");
        while (true)
        {
            System.out.println("Captcha: " + generatedCaptcha);
            System.out.println("");
            System.out.println("Note: Captcha is case-sensitive......");
            System.out.println("");
            System.out.println("Enter Captcha :");
            String captcha = input.nextLine();

            if (captcha.equals(generatedCaptcha))
            {
                System.out.println("**********.Login successful! Welcome to the Student Scholarship Portal.*********");
                HomeFile.homePage(); 
                break; // Exit the loop if captcha is correct

            }
            else
            {
                System.out.println("");
                System.out.println("incorrect captcha.....");
                System.out.println("");
            }
        }
    }

    public static void RetriveDetailes() throws IOException
    {
        running:
         while (true)
            {
                String showUserID= ForgetUserID();
                String showPassWord= ForgetPassWord();
                System.out.println("");
                System.out.println("What do you want to retrive ?");
                System.out.println("");
                System.out.println("1.UserId");
                System.out.println("2.Password");
                System.out.println("3.Both");
                System.out.println("Choose (1/2/3)");
                int choose=input.nextInt();

                switch(choose)
                {
                    case 1:System.out.println("UserID: "+ showUserID);
                    		System.out.println("");                          
                            break running;
                    case 2:System.out.println("Password: "+ showPassWord);
                    		System.out.println("");
                    		 break running;
                    case 3:System.out.println("UserID: " + showUserID);
                           System.out.println("Password: " + showPassWord);
                           System.out.println("");
                           break running;
                    default:System.out.println("Invalid choice, Enter valid choice");
                        break;
                }
            }
    }

    public static void loginPage() throws IOException
    {
        ReadStudentDetailsFromDatabase.readUserId();
        ReadStudentDetailsFromDatabase.readPassword();
        System.out.println("Note: If in Case Forget Your UserId and Password You can Retrive it.....");
        System.out.println("");

        while (true) 
        {    
            System.out.println("Enter R for Retrive detailes OR else, Enter C for continue If you Remember all detailes");
            String choice=input.nextLine();
            if (choice.equalsIgnoreCase("R"))
            {
               RetriveDetailes();
            }
            else if (choice.equalsIgnoreCase("C"))
            {
                CheckUserID();
                CheckPassWord();
                CheckGenerateCaptcha();
                break;
            }
            else
            {
                System.out.println("Invalid choice, Enter valid choice");
            }
        }
    }
}
