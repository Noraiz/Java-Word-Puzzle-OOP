
import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class IT extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'H','G','I','Y','A','H','O','O','L','T'},
						{'B','O','A','N','D','R','O','I','D','I'},
						{'O','O','N','T','L','P','L','O','N','M'},
						{'N','G','A','A','P','P','L','E','O','C'},
						{'A','L','U','A','O','N','P','E','W','O'},
						{'D','E','C','S','G','A','T','E','S','O'},
						{'E','X','O','T','W','L','E','R','A','K'},
						{'L','Z','U','K','E','R','B','E','R','G'},
						{'L','S','T','E','V','E','J','O','B','S'},
						{'A','I','T','A','N','I','C','I','N','E'}};
						
				
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
	    JButton b2=new JButton("Back");
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9=true;
		public IT(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CEO's and IT COMAPNIES");
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
			if(w1)	{
			 if (string.equalsIgnoreCase("TIMCOOK")){
				
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][9].setForeground(Color.GREEN);
				 objarray[1][9].setForeground(Color.GREEN);
				 objarray[2][9].setForeground(Color.GREEN);
				 objarray[3][9].setForeground(Color.GREEN);
				 objarray[4][9].setForeground(Color.GREEN);
				 objarray[5][9].setForeground(Color.GREEN);
				 objarray[6][9].setForeground(Color.GREEN);
				 
				 w1=false;}
				 else 
					 if
						 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("SteveJOBs"))
					 {
					t.setText("");
					PlayWrongSound();
					}
			 }
		if(w2){
			 if(string.equalsIgnoreCase("NADELLA")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][0].setForeground(Color.RED);
				 objarray[4][0].setForeground(Color.RED);
				 objarray[5][0].setForeground(Color.RED);
				 objarray[6][0].setForeground(Color.RED);
				 objarray[7][0].setForeground(Color.RED);
				 objarray[8][0].setForeground(Color.RED);
				 objarray[9][0].setForeground(Color.RED);
				 
				 
				w2=false; 
				 	 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("SteveJOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}
		}
		if(w3){
			 if (string.equalsIgnoreCase("GOOGLE")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.BLUE);
				 objarray[1][1].setForeground(Color.BLUE);
				 objarray[2][1].setForeground(Color.BLUE);
				 objarray[3][1].setForeground(Color.BLUE);
				 objarray[4][1].setForeground(Color.BLUE);
				 objarray[5][1].setForeground(Color.BLUE);
				
				 w3=false;
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("SteveJOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}}
			 if(w4){
			 if (string.equalsIgnoreCase("STEVEJOBS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][1].setForeground(Color.PINK);
				 objarray[8][2].setForeground(Color.PINK);
				 objarray[8][3].setForeground(Color.PINK);
				 objarray[8][4].setForeground(Color.PINK);
				 objarray[8][5].setForeground(Color.PINK);
				 objarray[8][6].setForeground(Color.PINK);
				 objarray[8][7].setForeground(Color.PINK);
				 objarray[8][8].setForeground(Color.PINK);
				 objarray[8][9].setForeground(Color.PINK);
				 
				 w4=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("SteveJOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}}
			 
			 if(w5){
			 if (string.equalsIgnoreCase("APPLE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[3][4].setForeground(Color.GREEN);
				 objarray[3][5].setForeground(Color.GREEN);
				 objarray[3][6].setForeground(Color.GREEN);
				 objarray[3][7].setForeground(Color.GREEN);
				 
				 
				w5=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("JOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 }
			if(w6){
			 
			 if (string.equalsIgnoreCase("ANDROID")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][2].setForeground(Color.ORANGE);
				 objarray[1][3].setForeground(Color.ORANGE);
				 objarray[1][4].setForeground(Color.ORANGE);
				 objarray[1][5].setForeground(Color.ORANGE);
				 objarray[1][6].setForeground(Color.ORANGE);
				 objarray[1][7].setForeground(Color.ORANGE);
				 objarray[1][8].setForeground(Color.ORANGE);
				 	 
				w6=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("JOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 }
			if(w7){
			 if (string.equalsIgnoreCase("YAHOO")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][3].setForeground(Color.CYAN);
				 objarray[0][4].setForeground(Color.CYAN);
				 objarray[0][5].setForeground(Color.CYAN);
				 objarray[0][6].setForeground(Color.CYAN);
				 objarray[0][7].setForeground(Color.CYAN);
				 
								 
				w7=false; 		 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("JOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}}
			if(w8){
			 if (string.equalsIgnoreCase("GATES")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][4].setForeground(Color.ORANGE);
				 objarray[5][5].setForeground(Color.ORANGE);
				 objarray[5][6].setForeground(Color.ORANGE);
				 objarray[5][7].setForeground(Color.ORANGE);
				 objarray[5][8].setForeground(Color.ORANGE);
				 
								 
				 w8=false;
				 
			 }	 
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("JOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}}
			if(w9){
			 if (string.equalsIgnoreCase("ZUKERBERG")){
					
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
				 objarray[7][8].setForeground(Color.YELLOW);
				 objarray[7][9].setForeground(Color.YELLOW);
				
				 w9=false;
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("Zukerberg")&&!string.equalsIgnoreCase("gates")&&!string.equalsIgnoreCase("yahoo")&&!string.equalsIgnoreCase("Android")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("NADELLA")&&!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("JOBs"))
				 {
				t.setText("");
				PlayWrongSound();
				}}
			
			 
			
			 else
			t.setText("");
			 
			 if (i==90)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
			
		}
		public static void main(String [] args){
	IT puzz=new IT();
		
		
	}}

