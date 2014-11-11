package opdracht9_1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{  
	private int WWidth = 220;
	private int WHeight = WWidth;
	
	private JButton[][] button = new JButton[3][3];
	
	private String turn = "O";
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				button[row][col] = new JButton("");
				button[row][col].setPreferredSize(new Dimension(50, 50));
				add(button[row][col]);
				button[row][col].addActionListener(this);
			}
		}
		
		setSize(WWidth, WHeight);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (event.getSource() == button[row][col]) {
					JButton b = button[row][col];
					if (b.getText() == "") {
						b.setText(turn);
						if (turn == "O") {
							turn = "X";
						} else if (turn == "X") {
							turn = "O";
						}
					}
				}
			}
		}
		
		String winner = "";
		boolean full = true;
		
		//Board full checking
		for (int col = 0; col < 3; col++) {
			for (int row = 0; row < 3; row++) {
				if (button[row][col].getText() == "")
					full = false;
			}
		}
		if (full) {
			JOptionPane.showMessageDialog(null, "Het spel is over, er is geen winnaar.");
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					button[row][col].setText("");
				}
			}
		}
		
		//Winner checking
		
		//Rows
		for (int row = 0; row < 3; row++) {
			if (button[row][0].getText() != "" && button[row][0].getText() == button[row][1].getText() && button[row][1].getText() == button[row][2].getText()) {
				winner = button[row][0].getText();
			}
		}
		
		//Columns
		for (int col = 0; col < 3; col++) {
			if (button[0][col].getText() != "" && button[0][col].getText() == button[1][col].getText() && button[1][col].getText() == button[2][col].getText()) {
				winner = button[0][col].getText();
			}
		}
		
		//Diagonal
		if (button[0][0].getText() != "" && button[0][0].getText() == button[1][1].getText() && button[1][1].getText() == button[2][2].getText()) {
			winner = button[0][0].getText();
		}
		if (button[0][2].getText() != "" && button[0][2].getText() == button[1][1].getText() && button[1][1].getText() == button[2][0].getText()) {
			winner = button[0][2].getText();
		}
		if (winner != "") {
			JOptionPane.showMessageDialog(null, "Gefeliciteerd! Speler " + winner + " wint.");
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					button[row][col].setText("");
				}
			}
		}
	}
}	
