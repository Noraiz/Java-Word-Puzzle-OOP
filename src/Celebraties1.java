import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class Celebraties1 extends Sound implements ActionListener 
	{
		
				
						char a[][]={
								{'P','T','X','D','G','Z','A','B','T','S'},
								{'C','O','Y','L','O','Q','B','A','A','W'},
								{'H','M','S','H','A','N','K','Y','Y','I'},
								{'A','C','V','X','Y','U','I','O','L','F'},
								{'R','R','A','N','G','E','L','I','O','T'},
								{'L','U','O','P','F','M','E','E','R','A'},
								{'I','I','G','W','N','B','X','Z','O','K'},
								{'E','S','D','O','N','H','K','L','C','F'},
								{'Z','E','G','V','V','O','P','O','O','Z'},
								{'X','G','R','O','B','E','R','T','S','Y'}};
				
				
		int counter=0;
		Color c;
		Font font;
		JFrame f;
		JPanel p;
		JPanel p1;
		JLabel l;
		JTextField t;
		JButton bt1;
		String string;
		JLabel check;
		JLabel [][] objarray=new JLabel [10][10];
	    ImageIcon I1;
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9 = true;
	    JButton b2=new JButton("Back");
		public Celebraties1(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CELEBRATIES");
		p=new JPanel();
		p1=new JPanel();
		l=new JLabel();
		t=new JTextField(20);
		check=new JLabel("0");
		I1=new ImageIcon("images/grass_tile.jpg");
		
		
		p1.setLocation(350,20);
		
	    p.setLayout(new GridLayout(10,10));
		
		
		 bt1=new JButton("Enter");
		f.add(p);p1.add(b2);
		p1.add(t);
		p1.add(bt1);
		f.add(p1,BorderLayout.SOUTH);
		f.setSize(600,400);
		MakePuzzle();
		bt1.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p1.add(check);
		f.setVisible(true);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				f.dispose();
				category c=new category();
			}
		});
		}
		public void MakePuzzle()
		{
			
			for(int row=0; row<=a.length-1; row++ )
			{
				for(int col=0; col<=(a[row]).length-1; ++col )
				{
					
				objarray[row][col]=new JLabel(" "+a[row][col]);
				objarray[row][col].setFont(font);
					p.add(objarray[row][col]);
				}}}
					

		Integer i=0;
		public void actionPerformed(ActionEvent e) {
			 string=t.getText();
				if(w1){
			 if(string.equalsIgnoreCase("ROBERTS")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 objarray[9][6].setForeground(Color.RED);
				 objarray[9][7].setForeground(Color.RED);
				 objarray[9][8].setForeground(Color.RED);
				
				 
				w1=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
				
				}		 
				 if(w2){
			 
			 if (string.equalsIgnoreCase("TAYLOR")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][8].setForeground(Color.orange);
				 objarray[1][8].setForeground(Color.orange);
				 objarray[2][8].setForeground(Color.orange);
				 objarray[3][8].setForeground(Color.orange);
				 objarray[4][8].setForeground(Color.orange);
				 objarray[5][8].setForeground(Color.orange);
				 
			
				w2=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
				 
				 }
			 if(w3){
			 if (string.equalsIgnoreCase("TOMCRUISE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.PINK);
				 objarray[1][1].setForeground(Color.PINK);
				 objarray[2][1].setForeground(Color.PINK);
				 objarray[3][1].setForeground(Color.PINK);
				 objarray[4][1].setForeground(Color.PINK);
				 objarray[5][1].setForeground(Color.PINK);
				 objarray[6][1].setForeground(Color.PINK);
				 objarray[7][1].setForeground(Color.PINK);
				 objarray[8][1].setForeground(Color.PINK);
				
				 w3=false;
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 }
			  if(w4){
			 if (string.equalsIgnoreCase("SHAN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][2].setForeground(Color.CYAN);
				 objarray[2][3].setForeground(Color.CYAN);
				 objarray[2][4].setForeground(Color.CYAN);
				 objarray[2][5].setForeground(Color.CYAN);
				 w4=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				}  
			  
			  }
			 if(w5){
			 if (string.equalsIgnoreCase("ROCK")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][6].setForeground(Color.GREEN);
				 objarray[8][7].setForeground(Color.GREEN);
				 objarray[7][8].setForeground(Color.GREEN);
				 objarray[6][9].setForeground(Color.GREEN);
				 
			w5=false; }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 }
			
			 if(w6){
			 if (string.equalsIgnoreCase("SWIFT")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.BLUE);
				 objarray[1][9].setForeground(Color.BLUE);
				 objarray[2][9].setForeground(Color.BLUE);
				 objarray[3][9].setForeground(Color.BLUE);
				 objarray[4][9].setForeground(Color.BLUE);
				 	 
				w6=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				}  
			 
			 }
			 if(w7){
			 if (string.equalsIgnoreCase("ANGELI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[4][2].setForeground(Color.YELLOW);
				 objarray[4][3].setForeground(Color.YELLOW);
				 objarray[4][4].setForeground(Color.YELLOW);
				 objarray[4][5].setForeground(Color.YELLOW);
				 objarray[4][6].setForeground(Color.YELLOW);
				 objarray[4][7].setForeground(Color.YELLOW);
				 
				 w7=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 }
			 if(w8){
				 if (string.equalsIgnoreCase("MEERA")){
						
					 t.setText("");
					 i=i+10;
					 check.setText("Score:"+i.toString());
					 objarray[5][5].setForeground(Color.YELLOW);
					 objarray[5][6].setForeground(Color.YELLOW);
					 objarray[5][7].setForeground(Color.YELLOW);
					 objarray[5][8].setForeground(Color.YELLOW);
					 objarray[5][9].setForeground(Color.YELLOW);
					 
					 w8=false; 
					 }
				 else 
					 if
						 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
					 {
					t.setText("");
					PlayWrongSound();
					}  	 
			 }
			 if(w9){
			 if (string.equalsIgnoreCase("DON")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][3].setForeground(Color.ORANGE);
				 objarray[1][4].setForeground(Color.ORANGE);
				 objarray[2][5].setForeground(Color.ORANGE);
				 
				w9=false;				 
				 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("DON")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ANGELI")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 }	 else
			t.setText("");
			 
			 if (i==90)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			Celebraties1 puzz=new Celebraties1();
		}}

