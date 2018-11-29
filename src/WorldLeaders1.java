import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class WorldLeaders1 extends Sound implements ActionListener 
	{
		
				
						char a[][]={
								{'I','H','T','N','G','J','V','E','R','O'},
								{'M','P','R','T','D','I','B','V','C','T'},
								{'R','L','U','I','N','N','L','O','A','T'},
								{'A','U','D','T','S','N','K','L','M','X'},
								{'N','T','E','A','P','A','O','O','E','D'},
								{'K','I','A','N','M','H','P','V','R','K'},
								{'H','N','U','A','S','O','T','E','O','L'},
								{'A','T','B','C','M','O','D','I','N','M'},
								{'N','O','D','I','J','I','N','P','I','N'},
								{'D','A','B','R','A','H','A','M','T','L'}};
				
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
		
		public WorldLeaders1(){
			
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
	    JButton b2=new JButton("Back");
		
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
			 if(string.equalsIgnoreCase("ABRAHAM")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][1].setForeground(Color.RED);
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 objarray[9][6].setForeground(Color.RED);
				 objarray[9][7].setForeground(Color.RED);
				 
				 
				w1=false; 
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				
				}
				if(w2){
			 if(string.equalsIgnoreCase("CAMERON")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][8].setForeground(Color.RED);
				 objarray[2][8].setForeground(Color.RED);
				 objarray[3][8].setForeground(Color.RED);
				 objarray[4][8].setForeground(Color.RED);
				 objarray[5][8].setForeground(Color.RED);
				 objarray[6][8].setForeground(Color.RED);
				 objarray[7][8].setForeground(Color.RED);
				 
				 
				 w2=false;
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				}
				if(w3){
			 if (string.equalsIgnoreCase("IMRANKHAN")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.orange);
				 objarray[1][0].setForeground(Color.orange);
				 objarray[2][0].setForeground(Color.orange);
				 objarray[3][0].setForeground(Color.orange);
				 objarray[4][0].setForeground(Color.orange);
				 objarray[5][0].setForeground(Color.orange);
				 objarray[6][0].setForeground(Color.orange);
				 objarray[7][0].setForeground(Color.orange);
				 objarray[8][0].setForeground(Color.orange);
				
			w3=false;
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				}
			 if(w4){
			 if (string.equalsIgnoreCase("OBAMA")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][1].setForeground(Color.PINK);
				 objarray[7][2].setForeground(Color.PINK);
				 objarray[6][3].setForeground(Color.PINK);
				 objarray[5][4].setForeground(Color.PINK);
				 objarray[4][5].setForeground(Color.PINK);
				
				 w4=false;
			 }
			 
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 }
	if(w5){
			 if (string.equalsIgnoreCase("MODI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[7][4].setForeground(Color.PINK);
				 objarray[7][5].setForeground(Color.PINK);
				 objarray[7][6].setForeground(Color.PINK);
				 objarray[7][7].setForeground(Color.PINK);
				
				 w5=false;
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}		 
	
	}
			  
			 if(w6){
			 if (string.equalsIgnoreCase("TRUDEAU")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][2].setForeground(Color.CYAN);
				 objarray[1][2].setForeground(Color.CYAN);
				 objarray[2][2].setForeground(Color.CYAN);
				 objarray[3][2].setForeground(Color.CYAN);
				 objarray[4][2].setForeground(Color.CYAN);
				 objarray[5][2].setForeground(Color.CYAN);
				 objarray[6][2].setForeground(Color.CYAN);
				 
			w6=false;
			 }
				 
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}		 
				 
			 }
			 if(w7){
			 if (string.equalsIgnoreCase("PLUTIN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][1].setForeground(Color.GREEN);
				 objarray[2][1].setForeground(Color.GREEN);
				 objarray[3][1].setForeground(Color.GREEN);
				 objarray[4][1].setForeground(Color.GREEN);
				 objarray[5][1].setForeground(Color.GREEN);
				 objarray[6][1].setForeground(Color.GREEN);
				 
				 
				 w7=false;
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 }
if(w8){
			 if (string.equalsIgnoreCase("JINNAH")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][5].setForeground(Color.GREEN);
				 objarray[1][5].setForeground(Color.GREEN);
				 objarray[2][5].setForeground(Color.GREEN);
				 objarray[3][5].setForeground(Color.GREEN);
				 objarray[4][5].setForeground(Color.GREEN);
				 objarray[5][5].setForeground(Color.GREEN);
				 
				 
				w8=false; 
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
		 {
		t.setText("");
		PlayWrongSound();
		}			 


}	
			 if(w9){
			 if (string.equalsIgnoreCase("JINPIN")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][4].setForeground(Color.BLUE);
				 objarray[8][5].setForeground(Color.BLUE);
				 objarray[8][6].setForeground(Color.BLUE);
				 objarray[8][7].setForeground(Color.BLUE);
				 objarray[8][8].setForeground(Color.BLUE);
				 objarray[8][9].setForeground(Color.BLUE);
				 	 
				 
				w9=false; 
			 }
			 if
			 (!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("IMRANKHAN")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("ABRAHAM"))
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
			WorldLeaders1 puzz=new WorldLeaders1();
		
		
	}}

