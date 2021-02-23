package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JFrame frame = new JFrame();
	JTextField text = new JTextField(20);
	JLabel label = new JLabel();
	
	public void showButton() {
	
		JPanel panel = new JPanel();
		
		frame.add(panel);
		panel.add(text);
		frame.setTitle("convert 8 bits of binary to ASCII");
		frame.setPreferredSize(new Dimension(500,75));
		frame.setVisible(true);
		JButton button = new JButton();
		button.setText("convert");
		panel.add(button);
		panel.add(label);
		frame.pack();
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String input = text.getText();
		input = convert(input);
		label.setText(input);
		frame.pack();
		
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	
}
