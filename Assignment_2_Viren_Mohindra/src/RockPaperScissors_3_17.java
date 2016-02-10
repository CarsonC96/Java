/* Viren Mohindra
 * (Game: scissor, rock, paper)
 * Write a program that plays the popular scissor-rock- paper game.
 * (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
 * The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
 * The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
 * whether the user or the computer wins, loses, or draws. Here are sample runs:
 * 
 *  scissor (0), rock (1), paper (2): 1
 *  The computer is scissor. You are rock. You won
 *  
 * scissor (0), rock (1), paper (2): 2
 * The computer is paper. You are paper too. It is a draw 
 */

import javax.swing.*;

public class RockPaperScissors_3_17 {

	public static void main(String[] args) {
		 
		String user_in = JOptionPane.showInputDialog("scissor (0), rock (1), paper (2): ");
		
		int user = Integer.parseInt(user_in);
		String userGuess = "";

		switch (user) {
		case 0:
		   userGuess = "scissor";
		  break;
		case 1:
		   userGuess = "rock";
		  break;
		case 2:
		   userGuess = "paper";
		   break;
		  default:
			  JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
		  }
		
		//rotate between 1, 2, and 3
		int computer = (int) (Math.random() * 3);
		
		//randomize computer chance of scissor, rock, or paper
		String computerGuess = "";
		 
		  switch (computer) {
		  case 0:
		   computerGuess = "scissor";
		   break;
		  case 1:
		   computerGuess = "rock";
		   break;
		  case 2:
		   computerGuess = "paper";
		   break;
		  }

		  JOptionPane.showMessageDialog(null, "The computer is " + computerGuess + ". You are " + userGuess + ".");
		 
		  int count = 0;
		  
		  if (computer == user) {
			  JOptionPane.showMessageDialog(null, "It is a draw. You have won " + count + " time(s).");
		  }
		  
		  else if (computer - user == 1 || computer - user == -2) {
			  JOptionPane.showMessageDialog(null, "Computer won. You have won " + count + " time(s).");
			  
		  }
		  
		  else if (computer - user == -1 || computer - user == 2) {
			  count++;
			  JOptionPane.showMessageDialog(null, "You won! " + "You have won " + count + " time(s).");
			  
		  }
		}
	}
