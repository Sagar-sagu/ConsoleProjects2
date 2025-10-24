package code;

import java.io.IOException;
import java.util.Scanner;
import database.WriteStudentDetailesToDatabase;

public class getStudentDetailes
{
    public static String name;
    public static String age;
    public static String gender;
    public static String address;
    public static String email;
    public static String phonenum;
    public static String schoolName;
    public static String classOfStudy;
    public static String schoolAddress;
    public static String collegeName;
    public static String yearOfStudy;
    public static String courseName;
    public static String collegeAddress;
    public static String bankName;
    public static String accountNumber;
    public static String ifscCode;
    public static String branchName;
    public static Scanner input = new Scanner(System.in);

    public static void persnolDetailes() throws IOException
    {
        System.out.println("");
        System.out.println(" ********* PERSONAL DETAILES ******** ");
        System.out.println("");
        System.out.println("Enter your fullname ");
        name = input.nextLine();
        System.out.println("");
        System.out.println("Enter your age:");
        age = input.nextLine();
        System.out.println("");
        System.out.println("Enter your Gender:");
        gender = input.nextLine();
        System.out.println("");
        System.out.println("Enter your current address:");
        address = input.nextLine();
        System.out.println("");
        while(true)
        {
            System.out.println("Enter your email:");
            email = input.nextLine();

            if (email.contains("@") && (email.contains(".")))
            {
                break;
            }
            else
            {
                System.out.println("Enter valid E-mail");
            }
        }
        System.out.println("");
        while (true)
        {
            System.out.println("Enter your phone number:");
            phonenum = input.nextLine();
            
            if (phonenum.length()==10)
            {
                break;
            }    
            else
            {
                System.out.println("Enter valid phonenumber:");
            }
        }
        System.out.println("");
        WriteStudentDetailesToDatabase.writeName();
        WriteStudentDetailesToDatabase.writeAge();
        WriteStudentDetailesToDatabase.writeGender();
        WriteStudentDetailesToDatabase.writeAddreass();
        WriteStudentDetailesToDatabase.writeEmail();
        WriteStudentDetailesToDatabase.writePhonenum();
    }

    public static void SchoolDetailes() throws IOException
      {
        System.out.println("");
        System.out.println(" ********* SCHOOL DETAILES ******** ");
        System.out.println("");
        System.out.println("Enter your school details:");
        System.out.println("Enter your school name:");
        schoolName = input.nextLine();
        System.out.println("");
        System.out.println("Enter which class you studying:");
        classOfStudy = input.nextLine();
        System.out.println("");
        System.out.println("Enter your school address:");
        schoolAddress = input.nextLine();
        WriteStudentDetailesToDatabase.writeSchoolName();
        WriteStudentDetailesToDatabase.writeClassOfStudy();
        WriteStudentDetailesToDatabase.writeSchoolAddress();
      }

    public static void ColleageDetailes() throws IOException
    {
        System.out.println("");
        System.out.println("********* COLLEGE DETAILES ********");
        System.out.println("");
        System.out.println("Enter your college details:");
        System.out.println("Enter your college name:");
        collegeName = input.nextLine();
        System.out.println("");
        System.out.println("Enter your course name:");
        courseName = input.nextLine();
        System.out.println("");
        System.out.println("Enter your year of study:");
        yearOfStudy = input.nextLine();
        System.out.println("");
        System.out.println("Enter your college address:");
        collegeAddress = input.nextLine();
        WriteStudentDetailesToDatabase.writeColleageName();
        WriteStudentDetailesToDatabase.writeCourseName();
        WriteStudentDetailesToDatabase.writeYearOfStudy();
        WriteStudentDetailesToDatabase.writeColleageAddress();
    }

    public static void BankDetailes() throws IOException
    {
        System.out.println("");
        System.out.println(" ********* BANK DETAILES ******** ");
        System.out.println("");
        System.out.println("Enter your bank details:");
        System.out.println("Enter your bank name:");
        bankName = input.nextLine();
        System.out.println("");
        System.out.println("Enter your account number:");
        accountNumber = input.nextLine();
        System.out.println("");
        System.out.println("Enter your IFSC code:");
        ifscCode = input.nextLine();
        System.out.println("");
        System.out.println("Enter your branch name:");
        branchName = input.nextLine();
        System.out.println("");
        WriteStudentDetailesToDatabase.writeBankName();
        WriteStudentDetailesToDatabase.writeAccountNum();
        WriteStudentDetailesToDatabase.writeIFSCCode();
        WriteStudentDetailesToDatabase.writeBranchName();
    }
}

