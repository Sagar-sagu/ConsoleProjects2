package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentDetailsFromDatabase
{
	public static String UserId;
	public static String Password;
	public static String profileName;
	public static String profilePhoneNumber;
	public static String name;
	public static String age;
    public static String gender;
	public static String address;
	public static String email;
	public static String phone_number;
	public static String school_name;
	public static String classOfstudy;
	public static String school_address;
	public static String ColleageName;
	public static String YearofStudy;
	public static String CourseName;
	public static String CollegeAddress;
	public static String BankName;
	public static String AccountNumber;
	public static String IfscCode;
	public static String bank_branchName;
    public static String choice;

	public static void readUserId() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/profileDatabase/userId.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        UserId = bufferedReader.readLine();
        bufferedReader.close();
     }

    public static void readPassword() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/profileDatabase/passWord.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        Password = bufferedReader.readLine();
        bufferedReader.close();
    }

	public static void readProfileName() throws IOException
	{
			FileReader reader = new FileReader("database/databaseFolders/profileDatabase/name.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			profileName = bufferedReader.readLine();
			bufferedReader.close();
	}

	public static void readProfilePhoneNumber() throws IOException
	{
			FileReader reader = new FileReader("database/databaseFolders/profileDatabase/phoneNumber.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			profilePhoneNumber = bufferedReader.readLine();
			bufferedReader.close();
	}

    public static void readName() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/name.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        name = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readAge() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/age.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        age = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readGender() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/gender.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        gender = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readAddress() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/stuAddress.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        address = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readEmail() throws IOException
    {
       	FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/Email.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        email = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readPhoneNum() throws IOException
    {
      	FileReader reader = new FileReader("database/databaseFolders/persnolDetailesDatabase/phoneNum.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        phone_number = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readSchoolName() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/schoolDetailesDatabase/schoolName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        school_name = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readClassOfStudy() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/schoolDetailesDatabase/classofStudy.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        classOfstudy = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readSchoolAddress() throws IOException
    {
       	FileReader reader = new FileReader("database/databaseFolders/schoolDetailesDatabase/schoolAddress.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        school_address = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readCollegeName() throws IOException
    {
      FileReader reader = new FileReader("database/databaseFolders/collegeDetailesDatabase/colleageName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        ColleageName = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readYearOfStudy() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/collegeDetailesDatabase/yearofStudy.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        YearofStudy = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readCourseName() throws IOException
    {
       	FileReader reader = new FileReader("database/databaseFolders/collegeDetailesDatabase/courseName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        CourseName = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readCollegeAddress() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/collegeDetailesDatabase/collegeAddress.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        CollegeAddress = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readBankName() throws IOException
    {
       	FileReader reader = new FileReader("database/databaseFolders/bankDetailesDatabase/bankName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        BankName = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readAccountNumber() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/bankDetailesDatabase/accountNum.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        AccountNumber = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readIfscCode() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/bankDetailesDatabase/ifscCode.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        IfscCode = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readBranchName() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/bankDetailesDatabase/BankBranchName.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
		bank_branchName = bufferedReader.readLine();
        bufferedReader.close();
    }

    public static void readChoice() throws IOException
    {
        FileReader reader = new FileReader("database/databaseFolders/choiceDatabase/choice.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        choice = bufferedReader.readLine();
        bufferedReader.close();
    }
}
