package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {
		
		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		
        // 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i ++) {
			robots[i] = new Robot();
			
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robots[i].setY(500);
			robots[i].setX(50 + i*100);
		}
		
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
		boolean chickenDinner = false;
		while(chickenDinner == false) {
			
			// 5. use another for loop to iterate through the array and make each robot move
	        // a random amount less than 50.
			Random movement = new Random();
			for (int j = 0; j < robots.length; j ++) {
				robots[j].move(movement.nextInt(50));
				if (robots[j].getY() < 0) {
					chickenDinner = true;
					
					// 7. declare that robot the winner and throw it a party!
					System.out.println("Unit " + j + " has managed to reach the top!");
				}
			}
		}
		
		
    }

        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
