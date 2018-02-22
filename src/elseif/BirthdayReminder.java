
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String db = "September 12th";
		String mb = "September 26th";
		String myb = "October 5th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String BD = JOptionPane.showInputDialog("Whom's birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(BD);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (BD.equals("mom")) {
			JOptionPane.showMessageDialog(null, mb);
		}
		else if (BD.equals("dad")) {
			JOptionPane.showMessageDialog(null, db);			
		}
		else if (BD.equals("ryan")) {
			JOptionPane.showMessageDialog(null, myb);			
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry we don't know your Birthday");
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
