package _15_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {

	public static void main(String[] args) {
    String Age;
    Age=JOptionPane.showInputDialog(null,"How old are you");
    int voting=Integer.parseInt(Age);
    if(voting >=18) {
    	JOptionPane.showMessageDialog(null,"Who do you think should be the next president");
    }
    else {
    	JOptionPane.showMessageDialog(null,"YOU ARE NOT OLD ENOUGH");
    }
    }
    }
	


