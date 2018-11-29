

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


import javax.swing.ImageIcon;
	public class Vehicles extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'A','V','Q','N','I','S','S','A','N','X'},
						{'L','S','U','Z','U','K','I','J','F','C'},
						{'C','H','T','O','O','R','Y','G','B','H'},
						{'H','C','O','R','O','L','L','A','M','E'},
						{'E','A','L','A','A','O','O','S','W','R'},
						{'R','D','E','N','S','U','R','A','D','Y'},
						{'R','N','M','Y','D','A','D','F','S','K'},
						{'Y','O','M','R','F','R','D','I','F','L'},
						{'O','H','A','T','O','S','G','H','M','U'},
						{'P','I','I','F','R','H','M','B','K','N'}};
				
				
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
		JButton b2=new JButton("Back");
		JLabel [][] objarray=new JLabel [10][10];
	    ImageIcon I1;
	    boolean w1=true, w2=true, w3=true, w4=true, w5=true,w6=true,w7=true,w8=true,w9=true;

		
		public Vehicles(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE -VEHICLES NAMES");
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
		p1.add(b2);
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
			 if (string.equalsIgnoreCase("HONDA")){
				 
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][1].setForeground(Color.magenta);
				 objarray[7][1].setForeground(Color.magenta);
				 objarray[6][1].setForeground(Color.magenta);
				 objarray[5][1].setForeground(Color.magenta);
				 objarray[4][1].setForeground(Color.magenta);
			 
			 w1=false;
			 }
			 
			 else	 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}	 
			 
			 }
				if(w2){
			 if (string.equalsIgnoreCase("NISSAN")){
				
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][3].setForeground(Color.GREEN);
				 objarray[0][4].setForeground(Color.GREEN);
				 objarray[0][5].setForeground(Color.GREEN);
				 objarray[0][6].setForeground(Color.GREEN);
				 objarray[0][7].setForeground(Color.GREEN);
				 objarray[0][8].setForeground(Color.GREEN);
				 
				 w2=false;
				 
				 
			 }
			 
			 else	 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}		
				
				
				
				
				}
				
				if(w3){
			 if(string.equalsIgnoreCase("SUZUKI")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][1].setForeground(Color.RED);
				 objarray[1][2].setForeground(Color.RED);
				 objarray[1][3].setForeground(Color.RED);
				 objarray[1][4].setForeground(Color.RED);
				 objarray[1][5].setForeground(Color.RED);
				 objarray[1][6].setForeground(Color.RED);
				 
				 
				 
				w3=false; 
				 
			 }
			 else	 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				
				}
				
				if(w4){
			 if (string.equalsIgnoreCase("CHERRY")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][0].setForeground(Color.orange);
				 objarray[3][0].setForeground(Color.orange);
				 objarray[4][0].setForeground(Color.orange);
				 objarray[5][0].setForeground(Color.orange);
				 objarray[6][0].setForeground(Color.orange);
				 objarray[7][0].setForeground(Color.orange);
				 
				 w4=false;
			 }
			 

				
				 else	 if
				 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
			 {
			t.setText("");
			PlayWrongSound();
			}	
				
				
				}
				if(w5){
			 if (string.equalsIgnoreCase("EMMA")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][2].setForeground(Color.PINK);
				 objarray[6][2].setForeground(Color.PINK);
				 objarray[7][2].setForeground(Color.PINK);
				 objarray[8][2].setForeground(Color.PINK);
				 
				w5=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
				 {
				t.setText("");
				PlayWrongSound();
				}
				
				
				 else	 if
				 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
			 {
			t.setText("");
			PlayWrongSound();
			}				
				
				
				
				
				
				}
				if(w6){
			 if (string.equalsIgnoreCase("FORD")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][3].setForeground(Color.CYAN);
				 objarray[8][4].setForeground(Color.CYAN);
				 objarray[7][5].setForeground(Color.CYAN);
				 objarray[6][6].setForeground(Color.CYAN);
			
				 
				 
				w6=false; 
				 
			 }
			 
			 else	 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				}
				if(w7){
			 if (string.equalsIgnoreCase("BMW")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][8].setForeground(Color.GREEN);
				 objarray[3][8].setForeground(Color.GREEN);
				 objarray[4][8].setForeground(Color.GREEN);
				 
				 
				 
				 w7=false;
				 
			 } 
			 
			 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}
				
				
				
				}
			
			 if(w8){
			 if (string.equalsIgnoreCase("COROLLA")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][1].setForeground(Color.YELLOW);
				 objarray[3][2].setForeground(Color.YELLOW);
				 objarray[3][3].setForeground(Color.YELLOW);
				 objarray[3][4].setForeground(Color.YELLOW);
				 objarray[3][5].setForeground(Color.YELLOW);
				 objarray[3][6].setForeground(Color.YELLOW);
				 objarray[3][7].setForeground(Color.YELLOW);
								 
				 
				 w8=false;
			 }
			 
			 
			 if
			 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			 
			 
			 
			 
			 }
			 
			 if(w9){
			 if (string.equalsIgnoreCase("AUDI")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[4][4].setForeground(Color.YELLOW);
				 objarray[5][5].setForeground(Color.YELLOW);
				 objarray[6][6].setForeground(Color.YELLOW);
				 objarray[7][7].setForeground(Color.YELLOW);

								 
				 w9=false;
				 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("AUDI"))
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
			Vehicles puzz=new Vehicles();
		
		
	}}

