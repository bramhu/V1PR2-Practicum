package opdracht9_2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{  
	private int WWidth = 350;
	private int WHeight = 320;
	
	private JLabel l1 = new JLabel("Voer een woord in:");
	private JTextField tf1 = new JTextField("", 10);
	private JButton b1 = new JButton("Speler 1");
	
	private JPanel p1 = new JPanel();
	
	private JLabel l2 = new JLabel("Geef letter");
	private JTextField tf2 = new JTextField("", 4);
	private JButton b2 = new JButton("Speler 2");
	private JLabel l3 = new JLabel("geraden: ");
	
	private ArrayList<String> woord = new ArrayList<String>(); //store de geraden letters
	private String antwoord = ""; //store het antwoord
	private int poging = 0; //hoeveel pogingen heeft speler 2 gedaan
	
	
	public MyFrame() {
		setLayout(new FlowLayout());
		add(l1);
		add(tf1);
		tf1.addActionListener(this);
		add(b1);
		b1.addActionListener(this);
		p1.setPreferredSize(new Dimension(350, 200));
		add(p1);
		add(l2);
		add(tf2);
		tf2.addActionListener(this);
		tf2.setEnabled(false);
		add(b2);
		b2.addActionListener(this);
		b2.setEnabled(false);
		add(l3);
		
		
		setSize(WWidth, WHeight);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == b1 || event.getSource() == tf1) {
			antwoord = tf1.getText().toLowerCase();
			if (antwoord.length() < 3 || antwoord.length() > 8) {
				antwoord = "";
			} else {
				for (int i = 0; i < antwoord.length(); i++) {
					woord.add(" ");
				}
				poging = 0;
				tf1.setText("");
				tf1.setEnabled(false);
				b1.setEnabled(false);
				tf2.setEnabled(true);
				b2.setEnabled(true);
			}
		} else if (event.getSource() == b2 || event.getSource() == tf2) {
			String letter = tf2.getText();
			if (letter.length() != 1) {
				return;
			}
			
			tf2.setText("");
			String str = antwoord;
			while (str.contains(letter)) {
				int index = str.indexOf(letter);
				woord.set(index, letter);
				l3.setText("geraden: " + ALtoString(woord));
				str = str.replaceFirst(letter, " ");
			}
			if (!antwoord.contains(letter))
				poging++;

			if (ALtoString(woord).equals(antwoord)) {
				tf1.setEnabled(true);
				b1.setEnabled(true);
				tf2.setEnabled(false);
				b2.setEnabled(false);
				l3.setText("geraden: ");
			}
			
			Graphics g = p1.getGraphics();
			g.clearRect(0,  0,  350, 200);
						
			if (poging > 0) {
				g.drawLine(100, 180, 120, 180);
				g.drawLine(110, 180, 110, 150);
			}
			if (poging > 1) {
				g.drawLine(110, 145, 110, 125);
			}
			if (poging > 2) {
				g.drawLine(110, 120, 110, 100);
			}
			if (poging > 3) {
				g.drawLine(115, 100, 135, 100);
			}
			if (poging > 4) {
				g.drawLine(140, 100, 160, 100);
			}
			if (poging > 5) {
				g.drawLine(160, 105, 160, 125);
			}
			if (poging > 6) {
				g.drawOval(153, 130, 15, 15);
			}
			if (poging > 7) {
				g.drawLine(160, 145, 160, 170);
			}
			if (poging > 8) {
				g.drawLine(150, 150, 170, 150);
			}
			if (poging > 9) {
				g.drawLine(160, 171, 150, 185);
				g.drawLine(160, 171, 170, 185);
				tf1.setEnabled(true);
				b1.setEnabled(true);
				tf2.setEnabled(false);
				b2.setEnabled(false);
				l3.setText("geraden: ");
			}
		}
	}
	public String ALtoString(ArrayList<String> woord) {
		String str = "";
		for (int i = 0; i < woord.size(); i++) {
			str += woord.get(i);
		}
		return str;
	}
}
