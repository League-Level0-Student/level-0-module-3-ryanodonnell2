//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String yesno = JOptionPane.showInputDialog("Do you like bananna");
		// 2. if they say no,
		if (yesno.equals("no")) {
			JOptionPane.showMessageDialog(null, "you are gdumb as your...");
		} else if (yesno.equals("yes")) {
			String hobby = JOptionPane.showInputDialog(
					"What is your hobby???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????");
			JOptionPane.showMessageDialog(null, hobby
					+ " is a lot better with banannas!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

		}
		// tell them they are crazy
		// and end quiz
		// 3. if they say yes
		// ask them what is their favorite hobby
		// show a pop up that says "<your hobby> is much better with bananas!"

		// 4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		// show a pop up that says â€œYou are bananas!â€�

	}

}
