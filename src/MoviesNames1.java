import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class MoviesNames1 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'T','Y','S','N','O','W','F','A','L','L'},
						{'I','R','P','K','S','O','O','D','D','T'},
						{'T','E','O','B','L','P','W','E','I','B'},
						{'A','V','S','T','O','N','G','C','L','O'},
						{'N','O','U','A','M','N','P','E','W','N'},
						{'I','G','C','P','N','W','D','M','A','D'},
						{'C','N','O','S','A','S','T','R','L','G'},
						{'Z','A','F','R','D','O','W','N','E','W'},
						{'B','H','O','X','P','T','L','O','V','E'},
						{'B','V','A','L','E','N','T','I','N','E'}};
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
		public MoviesNames1(){
			
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
			 if (string.equalsIgnoreCase("TITANIC")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[1][0].setForeground(Color.GREEN);
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
				 
				 
				w1=false; 
				 
			 }
			 else 
			 if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 }
		if(w2){
			 if (string.equalsIgnoreCase("BOND")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][9].setForeground(Color.orange);
				 objarray[3][9].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				 objarray[5][9].setForeground(Color.orange);
				
				w2=false; 
			 }
			 else	 if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
		
		
		}
			 
			 if(w3){
			 
			 if(string.equalsIgnoreCase("HANGOVER")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[8][1].setForeground(Color.RED);
				 objarray[7][1].setForeground(Color.RED);
				 objarray[6][1].setForeground(Color.RED);
				 objarray[5][1].setForeground(Color.RED);
				 objarray[4][1].setForeground(Color.RED);
				 objarray[3][1].setForeground(Color.RED);
				 objarray[2][1].setForeground(Color.RED);
				 objarray[1][1].setForeground(Color.RED);
		
				 
				 
				w3=false; 
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 
			 }
			 if(w4){
			 if (string.equalsIgnoreCase("LOVE")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][6].setForeground(Color.orange);
				 objarray[8][7].setForeground(Color.orange);
				 objarray[8][8].setForeground(Color.orange);
				 objarray[8][9].setForeground(Color.orange);
				w4=false;
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 }
			 if(w5){
			 if (string.equalsIgnoreCase("SNOWFALL")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][2].setForeground(Color.PINK);
				 objarray[0][3].setForeground(Color.PINK);
				 objarray[0][4].setForeground(Color.PINK);
				 objarray[0][5].setForeground(Color.PINK);
				 objarray[0][6].setForeground(Color.PINK);
				 objarray[0][7].setForeground(Color.PINK);
				 objarray[0][8].setForeground(Color.PINK);
				 objarray[0][9].setForeground(Color.PINK);
				 
				 
				 
			w5=false;
				 
				 
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 }
			 if(w6){
			 if (string.equalsIgnoreCase("DILWALE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][8].setForeground(Color.GREEN);
				 objarray[2][8].setForeground(Color.GREEN);
				 objarray[3][8].setForeground(Color.GREEN);
				 objarray[4][8].setForeground(Color.GREEN);
				 objarray[5][8].setForeground(Color.GREEN);
				 objarray[6][8].setForeground(Color.GREEN);
				 objarray[7][8].setForeground(Color.GREEN);
				 
				 
				 
				w6=false; 
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 }
			
			 if(w7){
			 if (string.equalsIgnoreCase("VALENTINE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				
				 objarray[9][1].setForeground(Color.ORANGE);
				 objarray[9][2].setForeground(Color.ORANGE);
				 objarray[9][3].setForeground(Color.ORANGE);
				 objarray[9][4].setForeground(Color.ORANGE);
				 objarray[9][5].setForeground(Color.ORANGE);
				 objarray[9][6].setForeground(Color.ORANGE);
				 objarray[9][7].setForeground(Color.ORANGE);
				 objarray[9][8].setForeground(Color.ORANGE);
				 objarray[9][9].setForeground(Color.ORANGE);
								 
				w7=false; 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 }
			 if(w8){
			 if (string.equalsIgnoreCase("FOCUS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[7][2].setForeground(Color.ORANGE);
				 objarray[6][2].setForeground(Color.ORANGE);
				 objarray[5][2].setForeground(Color.ORANGE);
				 objarray[4][2].setForeground(Color.ORANGE);
				 objarray[3][2].setForeground(Color.ORANGE);

								 
				w8=false; 
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
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
				 objarray[5][5].setForeground(Color.ORANGE);
				 objarray[6][4].setForeground(Color.ORANGE);
				 objarray[7][3].setForeground(Color.ORANGE);
				 
								 
				w9=false; 
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE")&&!string.equalsIgnoreCase("VALENTINE")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("WAR"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 }
			
			 
			
			
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
			MoviesNames1 puzz=new MoviesNames1();
		
		
	}}

