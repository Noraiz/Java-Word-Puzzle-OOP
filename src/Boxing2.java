

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

	public class Boxing2 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'H','U','P','P','E','R','C','U','T','T'},
						{'E','H','J','U','K','L','D','J','C','V'},
						{'A','V','Q','A','G','H','J','A','C','N'},
						{'D','A','B','G','B','P','L','L','B','V'},
						{'G','M','R','T','X','Z','J','A','M','W'},
						{'E','I','A','S','P','V','H','L','L','G'},
						{'A','R','G','L','O','V','E','S','N','G'},
						{'R','B','J','V','B','W','Q','I','R','C'},
						{'Z','X','Z','X','C','E','R','B','J','K'},
						{'I','O','B','O','X','I','N','G','H','A'}};
						
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
		public Boxing2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - SPORTS - BOXING");
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
			 if (string.equalsIgnoreCase("JAB")){
				
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[1][2].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[3][4].setForeground(Color.GREEN);
			
				 
				 w1=false;}
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			 }
		if(w2){
			 if(string.equalsIgnoreCase("BOXING")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 objarray[9][6].setForeground(Color.RED);
				 objarray[9][7].setForeground(Color.RED);
				 
				 
				w2=false; 
				 	 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
		}
		if(w3){
			 if (string.equalsIgnoreCase("HEADGEAR")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.BLUE);
				 objarray[1][0].setForeground(Color.BLUE);
				 objarray[2][0].setForeground(Color.BLUE);
				 objarray[3][0].setForeground(Color.BLUE);
				 objarray[4][0].setForeground(Color.BLUE);
				 objarray[5][0].setForeground(Color.BLUE);
				 objarray[6][0].setForeground(Color.BLUE);
				 objarray[7][0].setForeground(Color.BLUE);
				
				 w3=false;
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
		
		
		}
			 if(w4){
			 if (string.equalsIgnoreCase("JALAL")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][7].setForeground(Color.PINK);
				 objarray[2][7].setForeground(Color.PINK);
				 objarray[3][7].setForeground(Color.PINK);
				 objarray[4][7].setForeground(Color.PINK);
				 objarray[5][7].setForeground(Color.PINK);
				 
				 w4=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			 
			 }
			 
			 if(w5){
			 if (string.equalsIgnoreCase("RING")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][6].setForeground(Color.GREEN);
				 objarray[7][7].setForeground(Color.GREEN);
				 objarray[6][8].setForeground(Color.GREEN);
				 objarray[5][9].setForeground(Color.GREEN);
				 
				 
				w5=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			 }
			if(w6){
			 
			 if (string.equalsIgnoreCase("UPPERCUT")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.ORANGE);
				 objarray[0][2].setForeground(Color.ORANGE);
				 objarray[0][3].setForeground(Color.ORANGE);
				 objarray[0][4].setForeground(Color.ORANGE);
				 objarray[0][5].setForeground(Color.ORANGE);
				 objarray[0][6].setForeground(Color.ORANGE);
				 objarray[0][7].setForeground(Color.ORANGE);
				 objarray[0][8].setForeground(Color.ORANGE);
				 	 
				w6=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			 }
			if(w7){
			 if (string.equalsIgnoreCase("GLOVES")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[6][2].setForeground(Color.CYAN);
				 objarray[6][3].setForeground(Color.CYAN);
				 objarray[6][4].setForeground(Color.CYAN);
				 objarray[6][5].setForeground(Color.CYAN);
				 objarray[6][6].setForeground(Color.CYAN);
				 objarray[6][7].setForeground(Color.CYAN);

				 
								 
				w7=false; 		 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			
			
			}
			if(w8){
			 if (string.equalsIgnoreCase("AMIR")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][1].setForeground(Color.ORANGE);
				 objarray[4][1].setForeground(Color.ORANGE);
				 objarray[5][1].setForeground(Color.ORANGE);
				 objarray[6][1].setForeground(Color.ORANGE);

				 
								 
				 w8=false;
				 
			 }	 
			 else 
				 if
					 (!string.equalsIgnoreCase("JAB")&&!string.equalsIgnoreCase("BOXING")&&!string.equalsIgnoreCase("JALAL")&&!string.equalsIgnoreCase("HEADGEAR")&&!string.equalsIgnoreCase("RING")&&!string.equalsIgnoreCase("GLOVES")&&!string.equalsIgnoreCase("UPPERCUT")&&!string.equalsIgnoreCase("AMIR"))
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
	Boxing2 puzz=new Boxing2();
		
		
	}}

