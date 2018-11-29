


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class Celebraties extends Sound implements ActionListener 
	{
		
				
						char a[][]={
								{'T','H','A','M','E','E','R','A','A','R'},
								{'A','A','S','T','D','F','B','V','G','O'},
								{'S','N','Y','I','N','O','K','K','O','B'},
								{'W','G','O','L','O','C','C','C','N','E'},
								{'I','E','W','A','O','O','O','H','X','R'},
								{'F','L','G','R','R','R','R','A','P','T'},
								{'T','I','S','H','A','N','N','R','O','S'},
								{'O','O','L','C','D','M','R','L','B','M'},
								{'N','T','O','M','C','R','U','I','S','E'},
								{'D','A','R','R','O','C','K','E','T','L'}};
				
				
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
		
		public Celebraties(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CELEBRATIES");
		p=new JPanel();
		p1=new JPanel();
		l=new JLabel();
		t=new JTextField(20);
		check=new JLabel("0");
		I1=new ImageIcon("images/grass_tile.jpg");
		
		JButton b2=new JButton("Back");
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
			 if (string.equalsIgnoreCase("TAYLOR")){
				
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[1][1].setForeground(Color.GREEN);
				 objarray[2][2].setForeground(Color.GREEN);
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[4][4].setForeground(Color.GREEN);
				 objarray[5][5].setForeground(Color.GREEN);
				
				 
				 w1=false;
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			
			}
			if(w2){
			 if(string.equalsIgnoreCase("ROBERTS")){
				 t.setText("");
	             i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.RED);
				 objarray[1][9].setForeground(Color.RED);
				 objarray[2][9].setForeground(Color.RED);
				 objarray[3][9].setForeground(Color.RED);
				 objarray[4][9].setForeground(Color.RED);
				 objarray[5][9].setForeground(Color.RED);
				 objarray[6][9].setForeground(Color.RED);
				 
				 w2=false;
				 
				 
				 
			 }
		
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 
			 
			 
			 
			
			}
			if(w3){
			 if (string.equalsIgnoreCase("TOMCRUISE")){
				 t.setText("");
				 i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[8][1].setForeground(Color.orange);
				 objarray[8][2].setForeground(Color.orange);
				 objarray[8][3].setForeground(Color.orange);
				 objarray[8][4].setForeground(Color.orange);
				 objarray[8][5].setForeground(Color.orange);
				 objarray[8][6].setForeground(Color.orange);
				 objarray[8][7].setForeground(Color.orange);
				 objarray[8][8].setForeground(Color.orange);
				 objarray[8][9].setForeground(Color.orange);
				 
			
				 w3=false;
				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 
			 
			 
			 
			}
			 if(w4){
			 if (string.equalsIgnoreCase("MEERA")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][3].setForeground(Color.PINK);
				 objarray[0][4].setForeground(Color.PINK);
				 objarray[0][5].setForeground(Color.PINK);
				 objarray[0][6].setForeground(Color.PINK);
				 objarray[0][7].setForeground(Color.PINK);
				
				 w4=false;
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			  }
			  if(w5){
			 if (string.equalsIgnoreCase("ROCK")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[5][3].setForeground(Color.CYAN);
				 objarray[4][4].setForeground(Color.CYAN);
				 objarray[3][5].setForeground(Color.CYAN);
				 objarray[2][6].setForeground(Color.CYAN);
				 
			
				 
				 
				w5=false; 
				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
	
			  }
			 if(w6){
			 if (string.equalsIgnoreCase("SWIFT")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
			
				w6=false; 
				 
				 
				 
			 }
		
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 
			 
			 
			 
			 
			 
			 }
			
			  if(w7){
			 if (string.equalsIgnoreCase("CHARLIE")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[3][7].setForeground(Color.BLUE);
				 objarray[4][7].setForeground(Color.BLUE);
				 objarray[5][7].setForeground(Color.BLUE);
				 objarray[6][7].setForeground(Color.BLUE);
				 objarray[7][7].setForeground(Color.BLUE);
				 objarray[8][7].setForeground(Color.BLUE);
				 objarray[9][7].setForeground(Color.BLUE);
				 	 				 	 
				 w7=false;
				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			  }
			  if(w8){
			 if (string.equalsIgnoreCase("SHAN")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[6][2].setForeground(Color.YELLOW);
				 objarray[6][3].setForeground(Color.YELLOW);
				 objarray[6][4].setForeground(Color.YELLOW);
				 objarray[6][5].setForeground(Color.YELLOW);
				 
				 
				 
				
				 		 w8=false;
				 
				 
						 }
		
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			  }
			 if(w9){
			 if (string.equalsIgnoreCase("ANGELI")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[1][1].setForeground(Color.ORANGE);
				 objarray[2][1].setForeground(Color.ORANGE);
				 objarray[3][1].setForeground(Color.ORANGE);
				 objarray[4][1].setForeground(Color.ORANGE);
				 objarray[5][1].setForeground(Color.ORANGE);
				 objarray[6][1].setForeground(Color.ORANGE);
				
								 
				w9=false; 
				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("ROBERTS")&&!string.equalsIgnoreCase("TOMCRUISE")&&!string.equalsIgnoreCase("MEERA")&&!string.equalsIgnoreCase("ROCK")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ANGELI"))
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
			Celebraties puzz=new Celebraties();
		
		
	}}

