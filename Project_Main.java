// Packages to import
import java.util.ArrayList;

import javax.swing.JOptionPane;

// OOP - Project System Main driver
public class Project_Main {

	// Main - Driver
	public static void main(String[] args) {
		// Create Array list to store user input
		// access later for input methods
		ArrayList<Project> projects = new ArrayList<Project>();

		// while loop to go through the Choices and take user to desired input
		while (true) {
			String choice = input("Select your choice:\n" + "1. Add a project\n" + "2. Update deadline\n"
					+ "3. Update fees\n" + "4. Update Contractor details\n" + "5. Exit\n" + "");

			// if statements to take user to desired input
			if (choice.equals("1")) {
				createProject(projects);

			} else if (choice.equals("2")) {
				updateDeadline(projects);

			} else if (choice.equals("3")) {
				updateFee(projects);

			} else if (choice.equals("4")) {
				updateContractor(projects);

			} else if (choice.equals("5")) {
				break;

			} else {
				System.out.println("Invallid input!");
				// display relevant message to user if wrong input is entered
			}
		}
	}

	// method to add a new project to the list
	// user can update various information about the project
	private static void createProject(ArrayList<Project> projects) {
		// Read the user's input
		// Add a project
		int projectNum = Integer.parseInt(input("What is the project number? "));
		String projectName = input("\nWhat is the project name? ");
		String typeOfBuilding = input("What is the type of building? ");
		String physicalAddress = input("What is the physical address? ");
		int erfNum = Integer.parseInt(input("What is the erf number? "));
		int totalFee = Integer.parseInt(input("What is the total fees? "));
		int totalPaidalready = Integer.parseInt(input("What is the fees paid already? "));
		String deadline = input("What is the deadline/ due date? ");

		// create attribute to fetch all of architects details
		String[] details = getDetails("architect");
		Architect architect = new Architect(details[0], details[1], details[2], details[3]);

		// create attribute to fetch all contractors details
		String[] details1 = getDetails("contractor");
		Contractor contractor = new Contractor(details[0], details[1], details[2], details[3]);

		// create attribute to fetch all customers details
		String[] details2 = getDetails("customer");
		Customer customer = new Customer(details[0], details[1], details[2], details[3]);

		// create constructor
		// Call the project object to create a new project
		Project obj = new Project(projectNum, projectName, typeOfBuilding, physicalAddress, erfNum, totalFee,
				totalPaidalready, deadline, architect, contractor, customer);

		projects.add(obj);
		System.out.println("New Project added: \n" + obj);
	}

	// create method to get details of architect/ contractor or customer
	public static String[] getDetails(String role) {
		String name = input("Enter the name of the " + role);
		String telephone = input("Enter the telephone of the " + role);
		String emailAddress = input("Enter the email address of the " + role);
		String contrPhysicalAddress = input("Enter the address of the " + role);

		String[] contents = { name, telephone, emailAddress, contrPhysicalAddress };
		return contents;
	}

	// method to update the deadline for the project
	private static void updateDeadline(ArrayList<Project> projects) {
		// Update Deadline date
		// Using index and set method
		int index = Integer.parseInt(input("To adjust the deadline date, select the project index? "));
		String deadline1 = input("What is the new deadline date? ");
		// Get an index reference to the actual object using the ArrayList
		Project proj1 = projects.get(index);
		proj1.setDeadline(deadline1);
	}

	// method to update the total cost of the project
	private static void updateFee(ArrayList<Project> projects) {
		// Update Fee paid already
		// Using index and set method
		int index1 = Integer.parseInt(input("To adjust the fee paid already, select the project index? "));
		int totalPaidalready1 = Integer.parseInt(input("What is the adjusted fees paid already? "));
		// Get an index reference to the actual object using the ArrayList
		Project proj2 = projects.get(index1);
		proj2.setPaidToDate(totalPaidalready1);
		System.out.println("Deadline date and the Total fee paid adjusted: \n" + projects);
	}

	// method to update the details of the contractor of the project
	private static void updateContractor(ArrayList<Project> projects) {
		// Update Contractor contact details
		// Using index and set method
		int index2 = Integer.parseInt(input("To change the contractor contact details, select the project index? "));

		String[] details = getDetails("contractor");
		Contractor newContractor = new Contractor(details[0], details[1], details[2], details[3]);

		// Get an index reference to the actual object using the ArrayList
		Project proj2 = projects.get(index2);
		proj2.setContractor(newContractor);
		System.out.println("Contractor contact details changed: \n" + projects);
	}

	// To get USER INPUT using JOptionsPane
	public static String input(String message) {
		return JOptionPane.showInputDialog(null, message);
	}
}

// References:

// Reading multiple user inputs on StackOverflow - Accessed 23 May 2022 https://stackoverflow.com/questions/8469882/reading-multiple-scanner-inputs
// User String input on W3Schools - Accessed 23 May 2022 https://www.w3schools.com/java/java_user_input.asp
// Changes to class variables - Accessed 23 May 2022 https://stackoverflow.com/questions/43630510/is-it-possible-to-use-input-data-to-change-object-variables-java