package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String height;
		
		height=JOptionPane.showInputDialog(null, "How Tall are you in inches");
	int tallness =Integer.parseInt(height);
	if(tallness > 48) {
	JOptionPane.showMessageDialog(null, "GOOD FOR YOU, YOU ARE tall");
	}
	else {
		JOptionPane.showMessageDialog(null,"grow more first");
	}
	}
	}


