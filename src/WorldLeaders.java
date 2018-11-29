import java.awt.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class WorldLeaders extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'E','A','J','R','U','D','E','A','U','P'},
						{'E','B','P','K','I','O','M','R','S','P'},
						{'R','R','J','T','L','P','O','O','F','L'},
						{'D','A','I','I','O','U','D','M','O','U'},
						{'O','H','N','A','N','N','I','E','A','T'},
						{'G','A','P','B','N','N','R','M','D','I'},
						{'O','M','I','T','W','L','A','R','A','N'},
						{'N','U','N','I','O','B','E','H','L','W'},
						{'S','Z','A','U','O','I','E','O','M','E'},
						{'O','I','M','R','A','N','K','H','A','N'}};
				
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
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9 = true;
		public WorldLeaders(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - WORLD LEADERS");
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
			 if (string.equalsIgnoreCase("ERDOGON")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[1][0].setForeground(Color.GREEN);
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
				 objarray[7][0].setForeground(Color.GREEN);
				 
				 
				w1=false; 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
				
				
				
				}
				if(w2){
			 if(string.equalsIgnoreCase("ABRAHAM")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.RED);
				 objarray[1][1].setForeground(Color.RED);
				 objarray[2][1].setForeground(Color.RED);
				 objarray[3][1].setForeground(Color.RED);
				 objarray[4][1].setForeground(Color.RED);
				 objarray[5][1].setForeground(Color.RED);
				 objarray[6][1].setForeground(Color.RED);
				 
				 
				w2=false; 
				 
				 
				 
			 }
			 
				
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
				
				
				}
				if(w3){
			 if (string.equalsIgnoreCase("JINPIN")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][2].setForeground(Color.orange);
				 objarray[3][2].setForeground(Color.orange);
				 objarray[4][2].setForeground(Color.orange);
				 objarray[5][2].setForeground(Color.orange);
				 objarray[6][2].setForeground(Color.orange);
				 objarray[7][2].setForeground(Color.orange);
				
				 w3=false;
				 
			 }
			 
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
				}
				if(w4){
			 if (string.equalsIgnoreCase("PLUTIN")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][9].setForeground(Color.orange);
				 objarray[2][9].setForeground(Color.orange);
				 objarray[3][9].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				 objarray[5][9].setForeground(Color.orange);
				 objarray[6][9].setForeground(Color.orange);
				 
				 w4=false;
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
				
				}
				if(w5){
			 if (string.equalsIgnoreCase("OBAMA")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][4].setForeground(Color.orange);
				 objarray[7][5].setForeground(Color.orange);
				 objarray[6][6].setForeground(Color.orange);
				 objarray[5][7].setForeground(Color.orange);
				 objarray[4][8].setForeground(Color.orange);
				 
				 w5=false;
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
				
				}
			 if(w6){
			 if (string.equalsIgnoreCase("JRUDEAU")){
					
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
				 
				 w6=false;
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
			 
			 }
			  if(w7){
			 			 
			 if (string.equalsIgnoreCase("JINNAH")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][2].setForeground(Color.GREEN);
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[4][4].setForeground(Color.GREEN);
				 objarray[5][5].setForeground(Color.GREEN);
				 objarray[6][6].setForeground(Color.GREEN);
				 objarray[7][7].setForeground(Color.GREEN);
				 
				 
				 w7=false;
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		} 
			  
			  
			  }
			if(w8){
			 
			 if (string.equalsIgnoreCase("MODI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][6].setForeground(Color.YELLOW);
				 objarray[2][6].setForeground(Color.YELLOW);
				 objarray[3][6].setForeground(Color.YELLOW);
				 objarray[4][6].setForeground(Color.YELLOW);
		
						w8=false;		 
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}  
			
			}
			if(w9){
			 if (string.equalsIgnoreCase("IMRANKHAN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][1].setForeground(Color.YELLOW);
				 objarray[9][2].setForeground(Color.YELLOW);
				 objarray[9][3].setForeground(Color.YELLOW);
				 objarray[9][4].setForeground(Color.YELLOW);
				 objarray[9][5].setForeground(Color.YELLOW);
				 objarray[9][6].setForeground(Color.YELLOW);
				 objarray[9][7].setForeground(Color.YELLOW);
				 objarray[9][8].setForeground(Color.YELLOW);
				 objarray[9][9].setForeground(Color.YELLOW) ;

						w9=false;		 
				 
				 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("ERDOGON")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("JRUDEAU")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("IMRANKHAN"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			
			
			}
			 if (i==90)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			WorldLeaders puzz=new WorldLeaders();
		
		
	}}

