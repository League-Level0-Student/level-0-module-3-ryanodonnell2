
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
int x=0;
int p=100;
		//3. ask the user what color they would like the robot to draw
String r = JOptionPane.showInputDialog("What R color?");
String b = JOptionPane.showInputDialog("What B color?");
String g = JOptionPane.showInputDialog("What G color?");



Robot r2d2=new Robot();
int R=Integer.parseInt(r);
int G=Integer.parseInt(g);
int B=Integer.parseInt(b);
if (R<1&&R>255||G<=1&&G>=255||B<=1&&B>=255) {
	 R=255;
	 B=0;
	 G=0;
}


		//4. use an if/else statement to set the pen color that the user requested
r2d2.setPenColor(R,B,G);
        //5. if the user doesn�t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		r2d2.setPenWidth(100);
	    //1. make the robot draw a shape (this will take more than one line of code)

r2d2.setSpeed(999999999);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(100);
r2d2.turn(90);
r2d2.move(200);
r2d2.turn(90);
r2d2.penDown();
for (int i = 0; i < 9; i++) {
	
	for (int y = 0; y < 8; y++) {
r2d2.move(p);
r2d2.turn(90);
		}
	x+=10;
	p=100-x;}

	}
}
