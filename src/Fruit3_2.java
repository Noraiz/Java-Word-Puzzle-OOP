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

	public class Fruit3_2 extends Sound implements ActionListener 
	{
		char a[][]={
				{'P','U','T','T','Q','P','S','N','W','R'},
				{'E','V','D','O','A','O','T','M','Z','A'},
				{'A','B','F','M','Y','R','R','O','L','S'},
				{'C','X','X','A','L','M','A','N','Y','P'},
				{'H','C','E','T','D','S','W','C','C','B'},
				{'Y','G','E','O','R','Q','B','P','H','E'},
				{'P','O','M','E','L','O','E','N','E','R'},
				{'I','H','F','W','S','U','R','B','E','R'},
				{'K','J','K','Z','T','V','R','G','L','Y'},
				{'F','R','U','I','T','A','Y','I','J','K'},

				
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

		
		public Fruit3_2(){
			
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
				
			 if (string.equals("fruit")){
				
				 t.setText("");
				 i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[9][0].setForeground(Color.GREEN);
				 objarray[9][1].setForeground(Color.GREEN);
				 objarray[9][2].setForeground(Color.GREEN);
				 objarray[9][3].setForeground(Color.GREEN);
				 objarray[9][4].setForeground(Color.GREEN);
				
				 		 
				 w1=false;
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
					{
				 t.setText("");
					PlayWrongSound();
				
		}}
			 if(w2)
			 {
				 
				 if(string.equalsIgnoreCase("pomelo"))

			 {
				 t.setText("");
	             i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[6][0].setForeground(Color.RED);
				 objarray[6][1].setForeground(Color.RED);
				 objarray[6][2].setForeground(Color.RED);
				 objarray[6][3].setForeground(Color.RED);
				 objarray[6][4].setForeground(Color.RED);
				 objarray[6][5].setForeground(Color.RED);
			 
					 w2=false;
			  }else if
			 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
							{
		t.setText("");
		PlayWrongSound();
		}
					 } 
		
				 
				 
			if(w3)
			{
				if (string.equalsIgnoreCase("lychee")){
					 t.setText("");
					 i=i+10;
					
			 
			 	 check.setText("Score:"+i.toString());
				 objarray[2][8].setForeground(Color.orange);
				 objarray[3][8].setForeground(Color.orange);
				 objarray[4][8].setForeground(Color.orange);
				 objarray[5][8].setForeground(Color.orange);
				 objarray[6][8].setForeground(Color.orange);
				 objarray[7][8].setForeground(Color.orange);
				 
				 
			w3=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
								{
			t.setText("");
			PlayWrongSound();
			}
						}
		
			
			
			if(w4)
			{
				if (string.equalsIgnoreCase("raspberry")){
					 t.setText("");
					 i=i+10;
				
					 
			
				 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.PINK);
				 objarray[1][9].setForeground(Color.PINK);
				 objarray[2][9].setForeground(Color.PINK);
				 objarray[3][9].setForeground(Color.PINK);
				 objarray[4][9].setForeground(Color.PINK);
				 objarray[5][9].setForeground(Color.PINK);
				 objarray[6][9].setForeground(Color.PINK);
				 objarray[7][9].setForeground(Color.PINK);
				 objarray[8][9].setForeground(Color.PINK);
				 
			w4=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
								 {
					 t.setText("");
			PlayWrongSound();
			}
						}
		
				 
				 
			 
			  if(w5)
			  {
				  
			  
			 if (string.equalsIgnoreCase("strawberry")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][6].setForeground(Color.CYAN);
				 objarray[1][6].setForeground(Color.CYAN);
				 objarray[2][6].setForeground(Color.CYAN);
				 objarray[3][6].setForeground(Color.CYAN);
				 objarray[4][6].setForeground(Color.CYAN);
				 objarray[5][6].setForeground(Color.CYAN);
				 objarray[6][6].setForeground(Color.CYAN);
				 objarray[7][6].setForeground(Color.CYAN);
				 objarray[8][6].setForeground(Color.CYAN);
				 objarray[9][6].setForeground(Color.CYAN);
				 
				 
			 w5=false;
			 }else if
			 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
						{
		t.setText("");
		PlayWrongSound();
		}
					}
	 
				 
			 if(w6)
			 {
			 
			 if (string.equalsIgnoreCase("tomato")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][3].setForeground(Color.GREEN);
				 objarray[1][3].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[4][3].setForeground(Color.GREEN);
				 objarray[5][3].setForeground(Color.GREEN);
			
				 w6=false;
			 }else if
			 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
								{
		t.setText("");
		PlayWrongSound();
		}
					}

				 
				 
				 
			 if(w7)
			 {
				 
			 
			
			 
			 if (string.equalsIgnoreCase("peach")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.YELLOW);
				 objarray[1][0].setForeground(Color.YELLOW);
				 objarray[2][0].setForeground(Color.YELLOW);
				 objarray[3][0].setForeground(Color.YELLOW);
				 objarray[4][0].setForeground(Color.YELLOW);
				 w7=false;
			 }else if
			 (!string.equalsIgnoreCase("fruit")&&!string.equalsIgnoreCase("pomelo")&&!string.equalsIgnoreCase("lychee")&&!string.equalsIgnoreCase("raspberry")&&!string.equalsIgnoreCase("strawberry")&&!string.equalsIgnoreCase("tomato")&&!string.equalsIgnoreCase("peach"))
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
			Fruit3_2 puzz=new Fruit3_2();
		
		
	}}



