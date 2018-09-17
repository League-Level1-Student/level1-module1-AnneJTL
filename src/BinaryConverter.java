import java.awt.Button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConverter implements MouseListener{
	private JFrame fenetre;
	private JPanel calque;
	private JTextField binaryValue;
	private JButton convertButton;
	private JLabel asciiValue;
	
	private void initGUI(){
		fenetre = new JFrame();
		fenetre.setVisible(true);
		fenetre.setTitle("Convert 8 bits of binary to ASCII");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		calque = new JPanel();
		fenetre.add(calque);
		
		binaryValue = new JTextField(20);
		calque.add(binaryValue);
		
		convertButton = new JButton("convert");	
		convertButton.addMouseListener(this);
		calque.add(convertButton);
		
		asciiValue = new JLabel();
		asciiValue.setText("     ");
		calque.add(asciiValue);
		
		fenetre.pack();
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BinaryConverter().initGUI();

	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		asciiValue.setText(convert(binaryValue.getText()));

	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
