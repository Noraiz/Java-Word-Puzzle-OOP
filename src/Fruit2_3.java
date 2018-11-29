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

	public class Fruit2_3 extends Sound implements ActionListener 
	{
		char a[][]={
				{'D','A','T','E','R','Y','X','E','M','C'},
				{'T','G','O','L','H','R','E','L','A','H'},
				{'G','U','A','V','A','R','B','V','N','E'},
				{'P','J','O','O','L','F','O','D','G','R'},
				{'L','R','C','R','E','R','W','G','O','R'},
				{'M','E','L','O','N','A','L','N','N','Y'},
				{'M','H','N','M','A','M','G','O','D','U'},
				{'X','R','U','L','G','U','P','L','U','M'},
				{'R','A','T','C','O','O','N','P','K','N'},
				{'C','O','C','O','N','U','T','S','Y','O'},

					

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


		
		public Fruit2_3(){
			
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
				 objarray[0][9].setForeground(Color.GREEN);
				 objarray[1][9].setForeground(Color.GREEN);
				 objarray[2][9].setForeground(Color.GREEN);
				 objarray[3][9].setForeground(Color.GREEN);
				 objarray[4][9].setForeground(Color.GREEN);
				 objarray[5][9].setForeground(Color.GREEN);
				 
					 		 
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
				 objarray[7][6].setForeground(Color.RED);
				 objarray[7][7].setForeground(Color.RED);
				 objarray[7][8].setForeground(Color.RED);
				 objarray[7][9].setForeground(Color.RED);
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
				 objarray[9][0].setForeground(Color.orange);
				 objarray[9][1].setForeground(Color.orange);
				 objarray[9][2].setForeground(Color.orange);
				 objarray[9][3].setForeground(Color.orange);
				 objarray[9][4].setForeground(Color.orange);
				 objarray[9][5].setForeground(Color.orange);
				 objarray[9][6].setForeground(Color.orange);
			
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
				 objarray[0][0].setForeground(Color.PINK);
				 objarray[0][1].setForeground(Color.PINK);
				 objarray[0][2].setForeground(Color.PINK);
				 objarray[0][3].setForeground(Color.PINK);
				
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
				 objarray[0][8].setForeground(Color.CYAN);
				 objarray[1][8].setForeground(Color.CYAN);
				 objarray[2][8].setForeground(Color.CYAN);
				 objarray[3][8].setForeground(Color.CYAN);
				 objarray[4][8].setForeground(Color.CYAN);
				 
				 
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
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[2][1].setForeground(Color.GREEN);
				 objarray[2][2].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[2][4].setForeground(Color.GREEN);
							
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
				 objarray[5][0].setForeground(Color.YELLOW);
				 objarray[5][1].setForeground(Color.YELLOW);
				 objarray[5][2].setForeground(Color.YELLOW);
				 objarray[5][3].setForeground(Color.YELLOW);
				 objarray[5][4].setForeground(Color.YELLOW);
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
			Fruit2_3 puzz=new Fruit2_3();
		
		
		
	}}



