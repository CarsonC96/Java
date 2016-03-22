/* Viren Mohindra
 * Modify the Tic-Tac-Tac game program to use a two dimensional array, and simulates playing a game.
 * The basic flow for populating the board is:
 * 
 * For Player 1, pick a random space to move, if empty - place 1 in that space.
 * 
 * Now its Player 2 turn.
 * For Player 2, pick a random space to move, if empty - place 2 in that space.
 * 
 * Now its Player 1 turn again.
 * Keep moving until the board is full or a player wins.
 * 
 * Then play 1000 iterations of the game, within 3 modes.
 * After the thousand games in each mode, display the number of times X won, O won and ties. The three modes are:
 * 
 * 1) X and O move randomly as described above. If a random square chosen has been played, have the player choose again.
 * 2) X always moves to the middle square in the first move.
 * 3) O always moves to the middle square in the first move, is X has not moved there.
 * 
 * Your program should be structured like the following:
 * 
 * For mode from 1 to 3 {
 *  	For each game 1 to 1000 {
 *  	Play game – considering the current mode
 *  	Add result to totals
 * }
 * Print totals  (#Xwins, #Owins, #Ties)
 * }
 */

public class TicTacToe2DArray_Worksheet_Part2 {

	public static void main(String[] args) {

	}

}
