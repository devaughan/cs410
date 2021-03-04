import java.util.Scanner;

public class EmployeeID {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String lastName;
		String department;
		String monthOfBirth;
		String employeeID;
		String lastNameLength;
		
		// Prompts user for their last name
		System.out.print("Enter your last name: ");
		lastName = input.next();
		lastName.toLowerCase();
		
		// Prompts user for their department
		System.out.print("Enter your department: ");
		department = input.next();
		department.toLowerCase();
		
		// Prompts user for their month of birth
		System.out.print("Enter your month of birth: ");
		monthOfBirth = input.next();
		monthOfBirth.toLowerCase();
		
		// determines first character of id code 
		switch (lastName.charAt(0))
		{
			case 'a':
				employeeID = "V";
				break;
			case 'e':
				employeeID = "V";
				break;
			case 'i':
				employeeID = "V";
				break;
			case 'o':
				employeeID = "V";
				break;
			case 'u':
				employeeID = "V";
				break;
			default:
				employeeID = "C";
				break;
		}
		
		// creates the id code for the department
		switch (department)
		{
			case "acc":
				employeeID = employeeID.concat("101");
				break;
			case "hrs":
				employeeID = employeeID.concat("102");
				break;
			case "sal":
				employeeID = employeeID.concat("103");
				break;
			case "fin":
				employeeID = employeeID.concat("104");
				break;
			case "adv":
				employeeID = employeeID.concat("105");
				break;
			case "com":
				employeeID = employeeID.concat("106");
				break;
			default:
				employeeID = employeeID.concat("110");
				break;
		}
		
		// creates the id code for the month of birth
		switch (monthOfBirth) 
		{
			case "jan":
				employeeID = employeeID.concat("01");
				break;
			case "feb":
				employeeID = employeeID.concat("01");
				break;
			case "mar":
				employeeID = employeeID.concat("02");
				break;
			case "apr":
				employeeID = employeeID.concat("02");
				break;
			case "may":
				employeeID = employeeID.concat("03");
				break;
			case "jun":
				employeeID = employeeID.concat("03");
				break;
			case "jul":
				employeeID = employeeID.concat("04");
				break;
			case "aug":
				employeeID = employeeID.concat("04");
				break;
			case "sep":
				employeeID = employeeID.concat("05");
				break;
			case "oct":
				employeeID = employeeID.concat("05");
				break;
			default:
				employeeID = employeeID.concat("06");
				break;
		}
		
		lastNameLength = String.valueOf(lastName.length());
		if (lastName.length() < 10)
			lastNameLength = "0" + lastNameLength;
		employeeID = employeeID.concat(lastNameLength);
		
		
		// Prints the employee ID
		System.out.println("ID: " + employeeID);
		
	}
}