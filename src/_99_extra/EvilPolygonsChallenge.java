package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Rob = new Robot();
		//2. Set the speed to 100
		Rob.setSpeed(100);
		final int RED = 0;
		final int GREEN = 1;
		final int BLUE = 2;
		int colorChoice=JOptionPane.showOptionDialog(null, "What Color would you like your polygon to be?", "Polygon Drawer", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(BLUE == colorChoice) {
			Rob.setPenColor(0,0,255);
		}
		if(RED == colorChoice){
			Rob.setPenColor(255,0,0);
		}
		if(GREEN == colorChoice) {
			Rob.setPenColor(0,255,0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String bruh = JOptionPane.showInputDialog("How many polygons would you like it to draw? (Type in I, for example: (You want two: II) (You want three: III");
		//5. Use the robot to draw the number of polygons the user requested.
		Rob.penDown();
		Rob.turn(-360/4);
		for (int i = 0; i < bruh.length(); i++) {
		for (int p = 0; p < 5; p++) {
			Rob.move(50);
			Rob.turn(360/5);
		}
		Rob.move(80);
		}
		//6. Make it so your shapes do not overlap
		
		//7. Challenge: add more colors to the Option Dialog.
	}
}

