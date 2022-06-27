/*
* ItemChecker.java
* @author Maxwell Lyra 20246943
* 15/05/2022
*/
import java.util.Random; // used to generate different digits and characters for user ID

public class ItemChecker{

	//Variables
	private int number;
	private String userIDs []; // creating Array of Strings containing all user ID's
	private char [] randomNumbers = new char [] {'1', '3', '5', '7', '9'}; // array of charactes to hold number established for validation;
	private char [] randomLetters = new char [] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'}; // array of charactes to hold all alphabet letters;
	StringBuffer sBuff; // Stringbuffer created to hold values momentarily (letters and numbers);
	String newID; // String created to hold values created in the StringBuffer and insert them into the array of Strings;

	// Constructor
	public ItemChecker (){ //Initializing variables
		newID = " ";
		number = 0;
	}

	// Method - Generating user ID's
	public void compute2 (){
		userIDs = new String [number]; // Instantiating the array of String to hold the Users ID

	for (int i = 0; i < number ; i++){ // for loop to save each "newID" inside the array of objects
		sBuff = new StringBuffer ();

		for (int j = 0; j < 5 ; j++){ // for loop to generate all five Letters one by one
			Random myR = new Random(); // Creating an instance of Random here so that the numbers and letters will be created of different types

			int index = myR.nextInt(randomLetters.length); // Defining the range between 0 (default) and 26 (array of letter's length) to generate a random number

			char randomLetter = randomLetters[index]; // creating a variable to hold a character present inside the array of letters accesed by its index (genrated previously)

				sBuff.append(randomLetter); // appending the characters inside sBuff
			}

		for (int k = 0; k < 3 ; k++){ // for loop to generate all three Numbers one by one
			Random myR = new Random();

			int index = myR.nextInt(randomNumbers.length); // Defining the range between 0 (default) and 5 (array of number's length) to generate a random number

			char randomNumber = randomNumbers[index];  // creating a variable to hold a character present inside the array of letters accesed by its index (genrated previously)

				sBuff.append(randomNumber); // appending the number generated from the last available index/slot in sBuff

				newID = sBuff.toString(); // Turning a StringBuffer into a String
		}

			userIDs[i] = newID; // Inserting the newID into the array of Strings

	}

}

// Getters and Setters

	 	public int getNumber() {
	 		return number;
	    	}

	    public void setNumber(int number) {
	        this.number = number;
	    	}

	    public String[] getUserIDs() {
	        return userIDs;
	   		}

	    public void setuserIDs(String[] userIDs) {
	        this.userIDs = userIDs;
	    	}

	    public char[] getRandomNumbers() {
	        return randomNumbers;
	    	}

	    public void setRandomNumbers(char[] randomNumbers) {
	        this.randomNumbers = randomNumbers;
	    	}

	    public char[] getRandomLetters() {
	        return randomLetters;
	    	}

	    public void setRandomLetters(char[] randomLetters) {
	        this.randomLetters = randomLetters;
	    	}

	    public StringBuffer getsBuff() {
	        return sBuff;
	    	}

	    public void setsBuff(StringBuffer sBuff) {
	        this.sBuff = sBuff;
	    	}

	    public String getNewID() {
	        return newID;
	    	}

	    public void setNewID(String newID) {
	        this.newID = newID;
    	}


}



