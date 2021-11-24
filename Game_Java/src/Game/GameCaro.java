package Game;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameCaro implements ActionListener{
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel =new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[100];
	boolean player1_turn;
	
	public GameCaro() {
		// TODO Auto-generated constructor stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(80,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(100,25,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("game caro");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(9,9));
		button_panel.setBackground(new Color(150,150,150));
			
		for(int i=0;i<81;i++) {
			buttons[i]=new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,27));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<81;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
						}
				}
				else {
					if(buttons[i].getText()==""){
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
					
				}
		}
		}
	}
	}
	public void firstTurn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		
		}
		else {
			player1_turn = false;
			textfield.setText("O turn");
		}
	}
	public void check() {
		//check O win 
//		JButton[][]tick[][] =new JButton();
//		for(int i=0;i<91;i++) {
//			for(int j=0;j<91;j++) {
//				if(buttons[i]=="0") {
//					
//				}
//			}
//		}
		//check X win
//		For(int int i = 1;i<91;i++)
//		{
//		  If((buttons[i].getText()=="X")&&((buttons[i]div9==0))
//				  {xWins(i);
//		  }
//		Else {xWins(i);}
//		}
		byte dem=0;
		for(byte i=0;i<91;i++) {
			for(byte j=i;j<91;j++) {
				if(dem==3) {
					continue;
				}
				//check O win
				if(buttons[j].getText()=="O") {
					
					dem++;
					
				}
				//check X win
			
			}
			for(int j=i;j<91;j=j+9) {
				if(dem==3) {
					continue;
				}
				if(buttons[j].getText()=="O") {
					
					dem++;
					
				}
			}
			for(int j=i;j<91;j=j+10) {
				if(dem==3) {
					continue;
				}
				if(buttons[j].getText()=="O") {
					
					dem++;
					
				}}
		}
		
		if((buttons[0].getText()=="X")&&
			(buttons[1].getText()=="X")&&
			(buttons[2].getText()=="X")&&
			(buttons[3].getText()=="X")&&
			(buttons[4].getText()=="X")
			) {
			xWins(0,1,2,3,4);
		}
		if ((buttons[2].getText()=="X")&&
				(buttons[3].getText()=="X")&&
				(buttons[4].getText()=="X")&&
				(buttons[5].getText()=="X")&&
				(buttons[6].getText()=="X")) {
				xWins(2,3,4,5,6);
			}
		if ((buttons[5].getText()=="X")&&
			(buttons[6].getText()=="X")&&
			(buttons[7].getText()=="X")&&
			(buttons[8].getText()=="X")&&
			(buttons[9].getText()=="X")) {
			xWins(5,6,7,8,9);
		}
		
		if ((buttons[0].getText()=="X")&&
				(buttons[1].getText()=="X")&&
				(buttons[2].getText()=="X")&&
				(buttons[3].getText()=="X")&&	
				(buttons[4].getText()=="X")) {
				xWins(0,1,2,3,4);
			}
	}
	private void For(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}
	public void XetDong() {
		
	}
	public void xWins(int a, int b, int c, int d, int e) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		buttons[e].setBackground(Color.GREEN);
		
		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X wins");
	}
	public void oWins(int a, int b, int c, int d, int e) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		buttons[d].setBackground(Color.GREEN);
		buttons[e].setBackground(Color.GREEN);
		
		for (int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O wins");
	}
}
