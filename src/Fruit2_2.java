import javax.sound.*;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

	public class Fruit2_2 extends Sound implements ActionListener 
	{
		char a[][]={
				{'P','H','E','G','R','Y','X','E','I','C'},
				{'L','G','O','U','H','R','E','M','R','O'},
				{'U','L','C','A','I','R','B','E','O','C'},
				{'M','J','O','V','L','F','O','L','L','O'},
				{'L','R','C','A','E','R','W','O','A','N'},
				{'D','A','T','E','M','A','L','N','N','U'},
				{'M','H','N','M','A','L','G','O','D','T'},
				{'M','A','N','G','O','U','A','V','A','A'},
				{'R','A','T','C','O','O','N','P','K','N'},
				{'C','H','E','R','R','Y','T','S','Y','O'},
				
				};
		Integer i=0;
		JComboBox box;
		boolean w1=true, w2=true, w3=true, w4=true, w5=true, w6=true, w7=true;
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



		JButton b2=new JButton("Back");
		public Fruit2_2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
			f=new JFrame("WORD PUZZLE");
			p=new JPanel();
			p1=new JPanel();
			l=new JLabel();
			t=new JTextField(20);
			check=new JLabel("SCORE:");
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
		
		
		
			 
	
		public void actionPerformed(ActionEvent e) {
			string=t.getText();
			 if(w1)
			 {
				
			 if (string.equals("cherry")){
				
				 t.setText("");
				 i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[9][0].setForeground(Color.GREEN);
				 objarray[9][1].setForeground(Color.GREEN);
				 objarray[9][2].setForeground(Color.GREEN);
				 objarray[9][3].setForeground(Color.GREEN);
				 objarray[9][4].setForeground(Color.GREEN);
				 objarray[9][5].setForeground(Color.GREEN);
				
				 		 
				 w1=false;
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
					{
				 t.setText("");
					PlayWrongSound();
				
		}}
			 if(w2)
			 {
				 
				 if(string.equalsIgnoreCase("plum"))

			 {
				 t.setText("");
	             i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.RED);
				 objarray[1][0].setForeground(Color.RED);
				 objarray[2][0].setForeground(Color.RED);
				 objarray[3][0].setForeground(Color.RED);
			 w2=false;
			  }else if
			 (!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
						{
		t.setText("");
		PlayWrongSound();
		}
					 } 
		
				 
				 
			if(w3)
			{
				if (string.equalsIgnoreCase("coconut")){
					 t.setText("");
					 i=i+10;
					
			 
			 	 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.orange);
				 objarray[1][9].setForeground(Color.orange);
				 objarray[2][9].setForeground(Color.orange);
				 objarray[3][9].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				 objarray[5][9].setForeground(Color.orange);
				 objarray[6][9].setForeground(Color.orange);
			
			w3=false;
				 
				 }else if
				(!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
								{
			t.setText("");
			PlayWrongSound();
			}
						}
		
			
			
			if(w4)
			{
				if (string.equalsIgnoreCase("date")){
					 t.setText("");
					 i=i+10;
				
					 
			
				 check.setText("Score:"+i.toString());
				 objarray[5][0].setForeground(Color.PINK);
				 objarray[5][1].setForeground(Color.PINK);
				 objarray[5][2].setForeground(Color.PINK);
				 objarray[5][3].setForeground(Color.PINK);
				
			w4=false;
				 
				 }else if
				(!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
							 {
					 t.setText("");
			PlayWrongSound();
			}
						}
		
				 
				 
			 
			  if(w5)
			  {
				  
			  
			 if (string.equalsIgnoreCase("mango")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[7][0].setForeground(Color.CYAN);
				 objarray[7][1].setForeground(Color.CYAN);
				 objarray[7][2].setForeground(Color.CYAN);
				 objarray[7][3].setForeground(Color.CYAN);
				 objarray[7][4].setForeground(Color.CYAN);
				 
			 w5=false;
			 }else if
			 (!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
						{
		t.setText("");
		PlayWrongSound();
		}
					}
	 
				 
			 if(w6)
			 {
			 
			 if (string.equalsIgnoreCase("guava")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][3].setForeground(Color.GREEN);
				 objarray[1][3].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[4][3].setForeground(Color.GREEN);
							
				 w6=false;
			 }else if
			 (!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
							{
		t.setText("");
		PlayWrongSound();
		}
					}

				 
				 
				 
			 if(w7)
			 {
				 
			 
			
			 
			 if (string.equalsIgnoreCase("melon")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[1][7].setForeground(Color.YELLOW);
				 objarray[2][7].setForeground(Color.YELLOW);
				 objarray[3][7].setForeground(Color.YELLOW);
				 objarray[4][7].setForeground(Color.YELLOW);
				 objarray[5][7].setForeground(Color.YELLOW);
				 w7=false;
			 }else if
			 (!string.equalsIgnoreCase("cherry")&&!string.equalsIgnoreCase("plum")&&!string.equalsIgnoreCase("coconut")&&!string.equalsIgnoreCase("date")&&!string.equalsIgnoreCase("mango")&&!string.equalsIgnoreCase("guava")&&!string.equalsIgnoreCase("melon"))
					{
		t.setText("");
		PlayWrongSound();
		}
					}

				 
				 
			 
			
			
			
			
			
		 if (i==70)
		 {
			
			 PlayWinSound();
		 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
		 stop();
		 }
		 
	}
		public static void main(String [] args){
			Fruit2_2 puzz=new Fruit2_2();
		
		
		
	}}



