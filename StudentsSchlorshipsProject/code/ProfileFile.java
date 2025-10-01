package code;

import java.io.IOException;
import database.*;
import java.util.Scanner;

public class ProfileFile
{
    public static void profilePage() throws IOException
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to your profile page!");
        System.out.println("Here you can view and update your details.");
        System.out.println("");
        ReadStudentDetailsFromDatabase.readProfileName();
        ReadStudentDetailsFromDatabase.readProfilePhoneNumber();
        ReadStudentDetailsFromDatabase.readPassword();
        System.out.println("ID :- " + ReadStudentDetailsFromDatabase.UserId);
        System.out.println("Password :- " + ReadStudentDetailsFromDatabase.Password);
        System.out.println("Name :- " + ReadStudentDetailsFromDatabase.profileName);
        System.out.println("Phone Number :- " + ReadStudentDetailsFromDatabase.profilePhoneNumber);
        System.out.println("");
        System.out.println("you can Edit your profile details Except UserId...");
        while (true)
        {
            System.out.println("Enter E for Edit or Enter B for Back...");
            String choice=scan.nextLine();
            if (choice.equalsIgnoreCase("E"))
            {
                running:
                while (true)
                {
                    System.out.println("");
                    System.out.println("which one update");
                    System.out.println("1.Name");
                    System.out.println("2.Password");
                    System.out.println("3.MobileNumber");
                    System.out.println("4.Back");                
                    System.out.println("Enter your choice (1/2/3/4)");
                    int choose=scan.nextInt();

                    switch(choose)
                    {
                        case 1:SignupFile.getName();
                                System.out.println(" Updated Name Successfully!");
                                System.out.println("");
                                break running;
                        case 2:SignupFile.getPassword();
                                System.out.println(" Updated Password Successfully!");
                                System.out.println("");
                                break running;
                        case 3:SignupFile.getMobileNumber();
                                System.out.println(" Updated MobileNumber Successfully!");
                                System.out.println("");
                                break running;
                        case 4:System.out.println("your are going back.......");
                                break running;
                        default:System.out.println("invalid choice.....");
                                break;
                    }
                }
            }
            else if (choice.equalsIgnoreCase("B"))
            {
                System.out.println("you are going back.....");
                break;
            }
            else
            {
                System.out.println("Enter valid choice....");
            }
        }
    }
}
