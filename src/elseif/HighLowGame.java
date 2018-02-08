//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		int q = 0;
		for (int i = 0; i < 11; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String x=JOptionPane.showInputDialog("What is your guess?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int y = Integer.parseInt(x);
			// 5. if the guess is correct
		if (y==random) {
	JOptionPane.showMessageDialog(null, "HOW???????? HOW DID YOU WIN??????? YOU ARE A HACKER!!!!!!!!!!!!!!!!! GET AWAY!!!!!!!!!!!!!!!");
	q++;
	System.exit(0);
		} else {
if (y>random) {
	JOptionPane.showMessageDialog(null, "too High");
} else {
	JOptionPane.showMessageDialog(null, "too Low");
}
		}}
				// 6. win
			// 7. if the guess is high
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
if (q==0) {
	JOptionPane.showMessageDialog(null, "YOU LOSSE! HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
		// 12. tell them they lose
	}

}


