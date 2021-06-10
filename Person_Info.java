import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable
{
	public String fName;
	public String lName;
	public String Address;
	public String city;
	public String state;
	public String contact;
	public String email;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee()
	{
		System.out.println("Enter first name of person:");
		fName = sc.next();
		System.out.println("Enter last name of person:");
		lName = sc.next();
		System.out.println("Enter Address of person:");
		Address = sc.next();
		System.out.println("Enter city of person:");
		city = sc.next();
		System.out.println("Enter state of person:");
		state = sc.next();
		System.out.println("Enter Contact of person:");
		contact = sc.next();
		System.out.println("Enter email of person:");
		email = sc.next();

	}
	
	public String getfName()
	{
		return fName;
	}
	
	public String getlName()
	{
		return lName;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getContact()
	{
		return contact;
	}
	
	public String getEmail()
	{
		return email;
	}
	
}

public class Person_Info 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Employee p1 = new Employee();
		Employee p2 = new Employee();
		Employee p3 = new Employee();
		Employee p4 = new Employee();
		Employee p5 = new Employee();
		
		File myfile = new File("D:\\data\\testcase\\file1.txt");
		FileWriter file = new FileWriter("D:\\data\\testcase\\file1.txt");
		
		String Fname1 = p1.getfName();
		String lName1 = p1.getlName();
		String Address1 = p1.getAddress();
		String city1 =  p1.getCity();
		String state1 = p1.getState();
		String contact1 = p1.getContact();
		String email1 =  p1.getEmail();
		
		String Fname2 = p1.getfName();
		String lName2 = p1.getlName();
		String Address2 = p1.getAddress();
		String city2 =  p1.getCity();
		String state2 = p1.getState();
		String contact2 = p1.getContact();
		String email2 =  p1.getEmail();
		
		Scanner sc = new Scanner(myfile);
		while(sc.hasNextLine())
		{
			Fname1 = Fname1.concat(sc.nextLine()); 
			lName1 = lName1.concat(sc.nextLine()); 
			Address1 = Address1.concat(sc.nextLine()); 			
			city1 = city1.concat(sc.nextLine()); 
			state1 = state1.concat(sc.nextLine()); 
			email1 = email1.concat(sc.nextLine()); 
			
			Fname2 = Fname2.concat(sc.nextLine()); 
			lName2 = lName2.concat(sc.nextLine()); 
			Address2 = Address2.concat(sc.nextLine()); 			
			city2 = city2.concat(sc.nextLine()); 
			state2 = state2.concat(sc.nextLine()); 
			email2 = email2.concat(sc.nextLine()); 

		}
		file.write(Fname1);
		file.write(lName1);
		file.write(Address1);
		file.write(city1);
		file.write(state1);
		file.write(contact1);
		file.write(email1);

		file.write(Fname2);
		file.write(lName2);
		file.write(Address2);
		file.write(city2);
		file.write(state2);
		file.write(contact2);
		file.write(email2);

		file.close();
	}

}
