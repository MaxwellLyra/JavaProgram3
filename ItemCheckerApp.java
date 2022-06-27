/*
* ItemCheckerApp.java
* @author Maxwell Lyra
* 15/05/2022
*/
import javax.swing.JOptionPane;

public class ItemCheckerApp{
	public static void main (String args []){

	// Variables
	int number; // variable used to determine number of user ID's to be generated
	String userIDs []; // Array of Strings containing all user ID's

	// Object
	ItemChecker myIC = new ItemChecker ();

	// Input

	number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of ID's to be generated")); // Prompt user for input


	// Process
	myIC.setNumber(number); // sending number to instantiable class
	myIC.compute2(); // calling compute method


	// Output
	userIDs = myIC.getUserIDs(); // getting back array with new generated user ID's

	for (int i = 0; i < userIDs.length; i++){ // for loop iterating over array to show all user ID's one by one
		JOptionPane.showMessageDialog(null,"User ID created: " + userIDs[i]);
	}


	} // MAIN

} // CLASS