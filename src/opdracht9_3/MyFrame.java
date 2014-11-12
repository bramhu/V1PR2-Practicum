package opdracht9_3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener{  
	private int WWidth = 400;
	private int WHeight = 300;
	
	private String[] order = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "+", "C", "0", "=", "-"};
	private LinkedHashMap<String, JButton> buttons = new LinkedHashMap<String, JButton>();
	private JLabel l1 = new JLabel("                        ");
	private String operation = "";
	private double first = 0;
	private double second = 0;
	
	public MyFrame() {
		setLayout(new FlowLayout());
		add(l1);
		l1.setPreferredSize(new Dimension(390, 20));
		for (int i = 0; i < 16; i++) {
			buttons.put(order[i], new JButton(order[i]));
			add(buttons.get(order[i]));
			buttons.get(order[i]).setPreferredSize(new Dimension(90, 50));
			buttons.get(order[i]).addActionListener(this);
		}
		
		setSize(WWidth, WHeight);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == buttons.get("1")) {
			l1.setText(l1.getText() + "1");
		}
		if (event.getSource() == buttons.get("2")) {
			l1.setText(l1.getText() + "2");
		}
		if (event.getSource() == buttons.get("3")) {
			l1.setText(l1.getText() + "3");
		}
		if (event.getSource() == buttons.get("4")) {
			l1.setText(l1.getText() + "4");
		}
		if (event.getSource() == buttons.get("5")) {
			l1.setText(l1.getText() + "5");
		}
		if (event.getSource() == buttons.get("6")) {
			l1.setText(l1.getText() + "6");
		}
		if (event.getSource() == buttons.get("7")) {
			l1.setText(l1.getText() + "7");
		}
		if (event.getSource() == buttons.get("8")) {
			l1.setText(l1.getText() + "8");
		}
		if (event.getSource() == buttons.get("9")) {
			l1.setText(l1.getText() + "9");
		}
		if (event.getSource() == buttons.get("0")) {
			l1.setText(l1.getText() + "0");
		}
		if (event.getSource() == buttons.get("/")) {
			operation = "/";
			first = Double.parseDouble(l1.getText());
			l1.setText("                        ");
		}
		if (event.getSource() == buttons.get("*")) {
			operation = "*";
			first = Double.parseDouble(l1.getText());
			l1.setText("                        ");
		}
		if (event.getSource() == buttons.get("+")) {
			operation = "+";
			first = Double.parseDouble(l1.getText());
			l1.setText("                        ");
		}
		if (event.getSource() == buttons.get("C")) {
			l1.setText("                        ");
		}
		if (event.getSource() == buttons.get("=")) {
			second = Double.parseDouble(l1.getText());
			
			double result = 0.0;
			if (operation.equals("/"))
				result = first / second;
			if (operation.equals("*"))
				result = first * second;
			if (operation.equals("+"))
				result = first + second;
			if (operation.equals("-"))
				result = first - second;
			l1.setText("                        " + (int)result);
		}
		if (event.getSource() == buttons.get("-")) {
			operation = "-";
			first = Double.parseDouble(l1.getText());
			l1.setText("                        ");
		}
	}
}
