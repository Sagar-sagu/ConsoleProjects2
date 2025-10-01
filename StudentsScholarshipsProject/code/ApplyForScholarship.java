package code;

import java.io.IOException;
import java.util.Scanner;
import database.WriteStudentDetailesToDatabase;

public class ApplyForScholarship
{
    public static String scanChoice;
    public static Scanner input = new Scanner(System.in);

    public static void PreMetricScholarshipPage() throws IOException
    {
		System.out.println("");
        System.out.println(" ********* APPLY FOR PRE-METRIC SCHOLARSHIP ******** ");
		running:
        while (true)
        {
			System.out.println("");
			System.out.println("you are must enter all detaile in the following below ");
			System.out.println("1.PersnalDetailes");
			System.out.println("2.SchoolDetailes");
			System.out.println("3.BankDetailes");
			System.out.println("4.Back");
			System.out.println("");
           
			System.out.println("enter number (1,2,3,4):");
			int num = input.nextInt();
			switch (num)
			{
				case 1:getStudentDetailes.persnolDetailes();
						break;
				case 2:getStudentDetailes.SchoolDetailes();
						break;
				case 3:getStudentDetailes.BankDetailes();
						break;
				case 4:System.out.println("your are going back.........");
						System.out.println("");
						break running;
				default:System.out.println("Invalid choice, please try again.");
						break;
			}
		}
    }

    public static void PostMetricScholarshipPage() throws IOException
    {
        System.out.println("");
        System.out.println(" ********* APPLY FOR POST-METRIC SCHOLARSHIP ******** ");
        System.out.println("");
        
        running:
		while (true)
		{
	        System.out.println("you can enter all detaile in the following below ");
	        System.out.println("1.PersnalDetailes");
	        System.out.println("2.ColleageDetailes");
	        System.out.println("3.BankDetailes");
	        System.out.println("4.Back");
	        System.out.println("");
      
			System.out.println("enter number (1,2,3,4):");
			int num = input.nextInt();
			switch (num)
			{
				case 1:getStudentDetailes.persnolDetailes();
						break;
				case 2:getStudentDetailes.ColleageDetailes();
						break;
				case 3:getStudentDetailes.BankDetailes();
						break;
				case 4:System.out.println("you are going back......");
						System.out.println("");
						break running;
				default:System.out.println("Invalid choice, please try again.");
						break;
			}
		}
    }

    public static void MenuBar() throws IOException
    {
        System.out.println("");
        System.out.println(" ********* APPLY FOR SCHOLARSHIP ******** ");
        System.out.println("");
        System.out.println("Please select the type of scholarship you want to apply for:");
        System.out.println("");
        
        running:
        while (true)
        {
            System.out.println("1.PreMetricScholarship (this is for school students)");
            System.out.println("2.ProMetricScholarship (this is for college students)");
            System.out.println("3.Back");
            System.out.println("");
            System.out.println("Enter your choice (1,2,3) ");
            scanChoice = input.nextLine();
            if ((scanChoice.equals("1")) || (scanChoice.equals("2")))
            {
            WriteStudentDetailesToDatabase.writeChoice();
            }

            switch (scanChoice)
            {

                case "1":PreMetricScholarshipPage();
                        break;
                case "2":PostMetricScholarshipPage();
                        break;
                case "3":System.out.println("you are going back.......");
                        System.out.println("");
                        break running;
                default:System.out.println("Invalid choice, please try again.");
                        break;

            }
        }
    }


}
