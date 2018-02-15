import org.jointheleague.graphical.robot.Robot;

public class Valentine {
public static void main(String[] args) {
	
	Robot ryan=new Robot();
	ryan.setWindowImage("sadness.jpg");
	ryan.setPenColor(255,0,0);
	ryan.move(100);
	ryan.penDown();
	ryan.setSpeed(10000);
	for (int i = 0; i < 180; i++) {
		ryan.turn(1);
		ryan.move(2);
	}
	ryan.turn(45);
	ryan.move(325);
	ryan.setAngle(0);
	ryan.move(33);
	ryan.turn(45);
	ryan.move(28);
	ryan.turn(-90);
	ryan.move(28);
	for (int g = 0; g < 4; g++) {
		ryan.turn(90);
		ryan.move(28);
		ryan.turn(-90);
		ryan.move(28);
	}
	ryan.turn(-45);
	ryan.penUp();
	ryan.move(25);
	ryan.penDown();
	ryan.turn(90);
	for (int i = 0; i < 180; i++) {
		ryan.turn(-1);
		ryan.move(2);
	}
	ryan.turn(-45);
	ryan.move(325);
	ryan.setAngle(0);
	ryan.move(33);
	
	
	
	
	
	ryan.turn(45);
	ryan.move(28);
	ryan.turn(-90);
	ryan.move(28);
	for (int g = 0; g < 4; g++) {
		ryan.turn(90);
		ryan.move(28);
		ryan.turn(-90);
		ryan.move(28);
	}
	ryan.hide();
	
}
}
