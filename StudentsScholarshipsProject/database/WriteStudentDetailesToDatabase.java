package database;

import java.io.FileWriter;
import java.io.IOException;
import code.SignupFile;
import code.getStudentDetailes;
import code.ApplyForScholarship;


public class WriteStudentDetailesToDatabase
{

	public static void writeUserId() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/profileDatabase/userId.txt");
        WriteDetailes.write(SignupFile.genuserid);
        WriteDetailes.close();
    }
    public static void writePassWord() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/profileDatabase/passWord.txt");
        WriteDetailes.write(SignupFile.password);
        WriteDetailes.close();
    }

		public static void writeSignUpName() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/databaseFolders/profileDatabase/name.txt");
				WriteDetailes.write(SignupFile.name);
				WriteDetailes.close();
		}

		public static void writeSignUpPhoneNum() throws IOException
		{
				FileWriter WriteDetailes = new FileWriter("database/databaseFolders/profileDatabase/phoneNumber.txt");
				WriteDetailes.write(SignupFile.phoneNum);
				WriteDetailes.close();
		}

    public static void writeName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/name.txt");
        WriteDetailes.write(getStudentDetailes.name);
        WriteDetailes.close();
    }

     public static void writeAge() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/age.txt");
        WriteDetailes.write(getStudentDetailes.age);
        WriteDetailes.close();
    }

     public static void writeGender() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/gender.txt");
        WriteDetailes.write(getStudentDetailes.gender);
        WriteDetailes.close();
    }

     public static void writeAddreass() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/stuAddress.txt");
        WriteDetailes.write(getStudentDetailes.address);
        WriteDetailes.close();
    }

     public static void writeEmail() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/Email.txt");
        WriteDetailes.write(getStudentDetailes.email);
        WriteDetailes.close();
    }

     public static void writePhonenum() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/persnolDetailesDatabase/phoneNum.txt");
        WriteDetailes.write(getStudentDetailes.phonenum);
        WriteDetailes.close();
    }

     public static void writeSchoolName() throws IOException
    {
       FileWriter WriteDetailes = new FileWriter("database/databaseFolders/schoolDetailesDatabase/schoolName.txt");
        WriteDetailes.write(getStudentDetailes.schoolName);
        WriteDetailes.close();
    }

     public static void writeClassOfStudy() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/schoolDetailesDatabase/classofStudy.txt");
        WriteDetailes.write(getStudentDetailes.classOfStudy);
        WriteDetailes.close();
    }

     public static void writeSchoolAddress() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/schoolDetailesDatabase/schoolAddress.txt");
        WriteDetailes.write(getStudentDetailes.schoolAddress);
        WriteDetailes.close();
    }

     public static void writeColleageName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/collegeDetailesDatabase/colleageName.txt");
        WriteDetailes.write(getStudentDetailes.collegeName);
        WriteDetailes.close();
    }

     public static void writeCourseName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/collegeDetailesDatabase/courseName.txt");
        WriteDetailes.write(getStudentDetailes.courseName);
        WriteDetailes.close();
    }

     public static void writeYearOfStudy() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/collegeDetailesDatabase/yearofStudy.txt");
        WriteDetailes.write(getStudentDetailes.yearOfStudy);
        WriteDetailes.close();
    }

     public static void writeColleageAddress() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/collegeDetailesDatabase/collegeAddress.txt");
        WriteDetailes.write(getStudentDetailes.collegeAddress);
        WriteDetailes.close();
    }

     public static void writeBankName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/bankDetailesDatabase/bankName.txt");
        WriteDetailes.write(getStudentDetailes.bankName);
        WriteDetailes.close();
    }

     public static void writeAccountNum() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/bankDetailesDatabase/accountNum.txt");
        WriteDetailes.write(getStudentDetailes.accountNumber);
        WriteDetailes.close();
    }

     public static void writeIFSCCode() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/bankDetailesDatabase/ifscCode.txt");
        WriteDetailes.write(getStudentDetailes.ifscCode);
        WriteDetailes.close();
    }

     public static void writeBranchName() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/bankDetailesDatabase/BankBranchName.txt");
        WriteDetailes.write(getStudentDetailes.branchName);
        WriteDetailes.close();
    }

     public static void writeChoice() throws IOException
    {
        FileWriter WriteDetailes = new FileWriter("database/databaseFolders/choiceDatabase/choice.txt");
        WriteDetailes.write(ApplyForScholarship.scanChoice);
        WriteDetailes.close();
    }
}
