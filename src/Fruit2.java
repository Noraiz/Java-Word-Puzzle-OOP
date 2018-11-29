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

	public class Fruit2 extends Sound implements ActionListener 
	{
		char a[][]={
				{'C','H','E','R','R','Y','X','E','I','M'},
				{'T','G','O','L','H','R','E','L','R','E'},
				{'U','L','C','W','I','R','B','V','E','L'},
				{'P','J','O','O','L','F','O','D','L','O'},
				{'L','R','C','R','E','R','W','G','A','N'},
				{'U','A','O','M','M','A','L','N','N','L'},
				{'M','H','N','M','A','N','G','O','D','U'},
				{'X','R','U','L','G','U','A','V','A','A'},
				{'R','A','T','C','O','O','N','P','K','N'},
				{'D','A','T','E','A','U','T','S','Y','O'},

				
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

		
		public Fruit2(){
			
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
				 objarray[0][0].setForeground(Color.RED);
				 objarray[0][1].setForeground(Color.RED);
				 objarray[0][2].setForeground(Color.RED);
				 objarray[0][3].setForeground(Color.RED);
				 objarray[0][4].setForeground(Color.RED);
				 objarray[0][5].setForeground(Color.RED);
				 
				 		 
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
				 objarray[3][0].setForeground(Color.RED);
				 objarray[4][0].setForeground(Color.RED);
				 objarray[5][0].setForeground(Color.RED);
				 objarray[6][0].setForeground(Color.RED);
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
				 objarray[2][2].setForeground(Color.orange);
				 objarray[3][2].setForeground(Color.orange);
				 objarray[4][2].setForeground(Color.orange);
				 objarray[5][2].setForeground(Color.orange);
				 objarray[6][2].setForeground(Color.orange);
				 objarray[7][2].setForeground(Color.orange);
				 objarray[8][2].setForeground(Color.orange);
			
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
				 objarray[9][0].setForeground(Color.orange);
				 objarray[9][1].setForeground(Color.orange);
				 objarray[9][2].setForeground(Color.orange);
				 objarray[9][3].setForeground(Color.orange);
				
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
				 objarray[6][3].setForeground(Color.CYAN);
				 objarray[6][4].setForeground(Color.CYAN);
				 objarray[6][5].setForeground(Color.CYAN);
				 objarray[6][6].setForeground(Color.CYAN);
				 objarray[6][7].setForeground(Color.CYAN);
				 
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
				 objarray[7][4].setForeground(Color.GREEN);
				 objarray[7][5].setForeground(Color.GREEN);
				 objarray[7][6].setForeground(Color.GREEN);
				 objarray[7][7].setForeground(Color.GREEN);
				 objarray[7][8].setForeground(Color.GREEN);
							
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
				 objarray[0][9].setForeground(Color.YELLOW);
				 objarray[1][9].setForeground(Color.YELLOW);
				 objarray[2][9].setForeground(Color.YELLOW);
				 objarray[3][9].setForeground(Color.YELLOW);
				 objarray[4][9].setForeground(Color.YELLOW);
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
			Fruit2 puzz=new Fruit2();
		
		
		
	}}



