package code;

import database.ReadStudentDetailsFromDatabase;
import java.io.IOException;

public class displayStudentDetailes
{
  public static void DisplayPersnolDetailes() throws IOException  
  {
      ReadStudentDetailsFromDatabase.readName();
      ReadStudentDetailsFromDatabase.readAge();
      ReadStudentDetailsFromDatabase.readGender();
      ReadStudentDetailsFromDatabase.readAddress();
      ReadStudentDetailsFromDatabase.readEmail();
      ReadStudentDetailsFromDatabase.readPhoneNum();

      System.out.println("Name :- " + ReadStudentDetailsFromDatabase.name);
      System.out.println("Age :- " + ReadStudentDetailsFromDatabase.age);
      System.out.println("Gender :- " +ReadStudentDetailsFromDatabase.gender);
      System.out.println("Address :- " + ReadStudentDetailsFromDatabase.address);
      System.out.println("E-Mail :- " + ReadStudentDetailsFromDatabase.email);
      System.out.println("PhoneNumber :- " + ReadStudentDetailsFromDatabase.phone_number);
   }

  public static void DisplaySchoolDetailes() throws IOException
  {
      ReadStudentDetailsFromDatabase.readSchoolName();
      ReadStudentDetailsFromDatabase.readClassOfStudy();
      ReadStudentDetailsFromDatabase.readSchoolAddress();

      System.out.println("SchoolName :- " + ReadStudentDetailsFromDatabase.school_name);
      System.out.println("ClassOfStudy :- " + ReadStudentDetailsFromDatabase.classOfstudy);
      System.out.println("SchoolAddress :- " + ReadStudentDetailsFromDatabase.school_address);
  }

  public static void DisplayColleageDetailes()  throws IOException
  {
      ReadStudentDetailsFromDatabase.readCollegeName();
      ReadStudentDetailsFromDatabase.readYearOfStudy();
      ReadStudentDetailsFromDatabase.readCourseName();
      ReadStudentDetailsFromDatabase.readCollegeAddress();

      System.out.println("ColleageName :- " + ReadStudentDetailsFromDatabase.ColleageName);
      System.out.println("YearOfStudy :- " + ReadStudentDetailsFromDatabase.YearofStudy);
      System.out.println("CourseName :- " + ReadStudentDetailsFromDatabase.CourseName);
      System.out.println("ColleageAddress :- " + ReadStudentDetailsFromDatabase.CollegeAddress);
  }

  public static void DisplayBankDetailes()  throws IOException
   {
        ReadStudentDetailsFromDatabase.readBankName();
        ReadStudentDetailsFromDatabase.readAccountNumber();
        ReadStudentDetailsFromDatabase.readIfscCode();
        ReadStudentDetailsFromDatabase.readBranchName();

        System.out.println("BankName :- " + ReadStudentDetailsFromDatabase.BankName);
        System.out.println("AccountNumber :- " + ReadStudentDetailsFromDatabase.AccountNumber);
        System.out.println("IFSC Code :- " + ReadStudentDetailsFromDatabase.IfscCode);
        System.out.println("BranchName :- " + ReadStudentDetailsFromDatabase.bank_branchName);
   }

  public static void PreMatricView() throws IOException
  {
      System.out.println("1. Personal Details");
      System.out.println("--------------------------------------------");
      DisplayPersnolDetailes();
      System.out.println("--------------------------------------------");
      System.out.println("2. School Details");
      DisplaySchoolDetailes();
      System.out.println("--------------------------------------------");
      System.out.println("3. Bank Details");
      DisplayBankDetailes();
      System.out.println("--------------------------------------------");
  }

  public static void PostMetricView() throws IOException
  {
      System.out.println("1. Personal Details");
      System.out.println("--------------------------------------------");
      DisplayPersnolDetailes();
      System.out.println("--------------------------------------------");
      System.out.println("2. College Details");
      DisplayColleageDetailes();
      System.out.println("--------------------------------------------");
      System.out.println("3. Bank Details");
      DisplayBankDetailes();
      System.out.println("--------------------------------------------");
  }

  public static void viewApplication() throws IOException
  {
    ReadStudentDetailsFromDatabase.readChoice();
    String checkPreOrPost = ReadStudentDetailsFromDatabase.choice;

    if (ApplyForScholarship.scanChoice==null || ApplyForScholarship.scanChoice.isEmpty())
    {
      System.out.println(" apply for scholarship then view details");
    }
    else
    {
      System.out.println("View student details...");
      System.out.println("");
      if ("1".equals(checkPreOrPost))
      {
        PreMatricView();
      }
      else if ("2".equals(checkPreOrPost))
      {
        PostMetricView();
      }
    }
  }

  public static void viewScholarshipStatus() throws IOException
  {
     ReadStudentDetailsFromDatabase.readChoice();
     String checkPreOrPost = ReadStudentDetailsFromDatabase.choice;

    if (ApplyForScholarship.scanChoice==null || ApplyForScholarship.scanChoice.isEmpty())
      {
        System.out.println(" apply for scholarship then view Status");
      }
      else
      {
        System.out.println("View Scholarship Status...");
        System.out.println("");     
        if (checkPreOrPost.equals("1") || checkPreOrPost.equals("2"))
        {
            System.out.println("Scholarship Status: Approved");
        }
      
      }
  }
}
