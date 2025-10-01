package code;

import java.io.IOException;
import java.util.Scanner;

public class HomeFile
{
    public static Scanner input=new Scanner(System.in);

    public static void homePage() throws IOException
    {
        running:
        while (true)
        {
            System.out.println("");
            System.out.println("1.Profile");
            System.out.println("2.ApplyForScholarship");
            System.out.println("3.viewApplication");
            System.out.println("4.ViewScholarshipStatus");
            System.out.println("5.Back");
            System.out.println("6.Exit");
            System.out.println("");

                System.out.println("Enter your choice(1,2,3,4,5,6) : ");
                int choice = input.nextInt();

                switch (choice)
                {
                    case 1:ProfileFile.profilePage();
                        break;
                    case 2:ApplyForScholarship.MenuBar();
                        break;
                    case 3:displayStudentDetailes.viewApplication();
                        break;
                    case 4:displayStudentDetailes.viewScholarshipStatus();
                        break;
                    case 5:System.out.println("you are going back.....");
                        	System.out.println("");
                         break running;
                    case 6:System.out.println("Exiting the portel...");
                            System.exit(0);
                    default:System.out.println("Invalid choice. Please try again.");
                        break;
                }
        }

    }
}
