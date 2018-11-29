

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class MoviesNames2 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'H','L','L','N','O','T','O','S','L','V'},
						{'B','A','O','O','I','O','O','O','S','D'},
						{'O','R','T','V','V','P','L','U','N','A'},
						{'B','E','I','G','E','E','G','L','O','R'},
						{'O','V','T','R','O','N','P','E','W','K'},
						{'N','O','A','S','F','O','C','U','S','N'},
						{'D','W','N','T','W','L','E','R','A','I'},
						{'D','S','P','E','C','T','R','E','L','G'},
						{'A','A','C','L','O','V','E','O','V','H'},
						{'S','N','O','W','F','A','L','L','N','T'}};
						
				JButton b2=new JButton("Back");		
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
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9=true;
		
		public MoviesNames2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - MOVIES NAMES");
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
				}
					
			}
			 
		}
		
		
		
			 
		Integer i=0;
		public void actionPerformed(ActionEvent e) {
			 string=t.getText();
				if(w1){
			 if (string.equalsIgnoreCase("BOND")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
				
				 
				 
				 
				 w1=false;
				 
					
			 } 
			 else if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 }
				
				
				
			 if(w2){
			 if(string.equalsIgnoreCase("SNOWFALL")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][0].setForeground(Color.RED);
				 objarray[9][1].setForeground(Color.RED);
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 objarray[9][6].setForeground(Color.RED);
				 objarray[9][7].setForeground(Color.RED);
				 
				 w2=false;
				 
					
			 } 
			 else if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 }	 
				 
			 
			
			 if(w4){
			 if (string.equalsIgnoreCase("FOCUS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][4].setForeground(Color.PINK);
				 objarray[5][5].setForeground(Color.PINK);
				 objarray[5][6].setForeground(Color.PINK);
				 objarray[5][7].setForeground(Color.PINK);
				 objarray[5][8].setForeground(Color.PINK);
				 
				 
				 w4=false;
				 
					
			 }
			 else if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 }
			 if(w5){
			 if (string.equalsIgnoreCase("SOUL")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][7].setForeground(Color.GREEN);
				 objarray[1][7].setForeground(Color.GREEN);
				 objarray[2][7].setForeground(Color.GREEN);
				 objarray[3][7].setForeground(Color.GREEN);
				 
				 
				 
				 w5=false;
			 }	 
				 else if
				 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
			 {
			t.setText("");
			PlayWrongSound();
			}	 
				 }	
		 
			 
			 if(w6)
			 
			 if (string.equalsIgnoreCase("DARKNIGHT")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][9].setForeground(Color.ORANGE);
				 objarray[2][9].setForeground(Color.ORANGE);
				 objarray[3][9].setForeground(Color.ORANGE);
				 objarray[4][9].setForeground(Color.ORANGE);
				 objarray[5][9].setForeground(Color.ORANGE);
				 objarray[6][9].setForeground(Color.ORANGE);
				 objarray[7][9].setForeground(Color.ORANGE);
				 objarray[8][9].setForeground(Color.ORANGE);
				 objarray[9][9].setForeground(Color.ORANGE);
				 	 
				 w6=false;
				 
					
			 } 
			 else if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 	 
			 
			 if(w7){
			 if (string.equalsIgnoreCase("LOVE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][2].setForeground(Color.ORANGE);
				 objarray[1][3].setForeground(Color.ORANGE);
				 objarray[2][4].setForeground(Color.ORANGE);
				 objarray[3][5].setForeground(Color.ORANGE);
				 
				 w7=false;
				 
					
			 }	 
			 else	 if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 }
			 if(w8){
			 if (string.equalsIgnoreCase("SPECTRE")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[7][1].setForeground(Color.YELLOW);
				 objarray[7][2].setForeground(Color.YELLOW);
				 objarray[7][3].setForeground(Color.YELLOW);
				 objarray[7][4].setForeground(Color.YELLOW);
				 objarray[7][5].setForeground(Color.YELLOW);
				 objarray[7][6].setForeground(Color.YELLOW);
				 objarray[7][7].setForeground(Color.YELLOW);
			
			 w8=false;
			 
			
			 }
			 
			 else	 if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}				 
			 
			 
			 
			 }
			if(w9){ 
			 if (string.equalsIgnoreCase("WAR")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[6][1].setForeground(Color.YELLOW);
				 objarray[5][2].setForeground(Color.YELLOW);
				 objarray[4][3].setForeground(Color.YELLOW);
				w9=false;
			 }
		
			 else	
		 if
			 (!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("SOUL")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SPECTRE"))
		 {
		t.setText("");
		PlayWrongSound();
		}	
		 
			}
			 
			 else
			t.setText("");
			 
			 if (i==80)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			MoviesNames2 puzz=new MoviesNames2();
		
		
	}}

