import code.LoginFile;
import code.SignupFile;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
    
        Scanner input = new Scanner(System.in);
        System.out.println(" ********* WELCOME TO STUDENT SCHOLERSHIPS  PORTEL ******** ");
        while (true) // Assuming you have a condition to keep the loop running
        {
            System.out.println("");
            System.out.println("1.LogIn (if you have an account then press 1 for login)");
            System.out.println("2.SignUp (if you don't have an account then press 2 for signup)");
            System.out.println("3.Exit (if you want to exit then press 3)");
            System.out.println("");

            System.out.println("Enter your choice (1/2/3):");
            int choice=input.nextInt();
            switch (choice)
            {
            case 1:LoginFile.loginPage();
                    break;
            case 2:SignupFile.signupPage();
                    break;
            case 3:System.out.println("Exiting the portel...");
                    System.exit(0);
            default:System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }

}
