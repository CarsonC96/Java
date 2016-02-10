/* Viren Mohindra
 * 1. A company uses codes the status of an account. Zero means “closed”, One means “active’,
 * Two means “joint”. Write code that inputs a status code (0,1, or 2),  and outputs the status text
 * (closed, active,or joint). Use JOptionPane methods.
 */

import javax.swing.*;

public class StatusCode_Worksheet_Question1 {

	public static void main(String[] args) {
		String statusCode_in = JOptionPane.showInputDialog("Input Status Code (0, 1, or 2): ");
		
		int statusCode = Integer.parseInt(statusCode_in);
		
		switch(statusCode) {
		case 0:
			JOptionPane.showMessageDialog(null, "Closed.");
		break;
		case 1:
			JOptionPane.showMessageDialog(null, "Active.");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Joint.");
		break;
		default:
			JOptionPane.showMessageDialog(null, "Not a valid status code, please try again.");		
		}
	}
}
