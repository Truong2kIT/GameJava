package Login;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Game.*;

public final class HomePage {
	JFrame frame = new JFrame();
	JLabel homeLabel = new JLabel("Hello!");
	
	 HomePage(String userID){
		
		homeLabel.setBounds(0,0,200,35);
		homeLabel.setFont(new Font(null,Font.PLAIN,25));
		homeLabel.setText("Hello "+userID);
		
		frame.add(homeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
