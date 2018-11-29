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

	public class Fruit3_3 extends Sound implements ActionListener 
	{
		char a[][]={
				{'S','T','R','A','W','B','E','R','R','Y'},
				{'Y','A','T','S','R','P','P','F','O','P'},
				{'T','O','M','A','T','O','O','F','R','L'},
				{'I','E','A','O','L','P','M','R','A','Y'},
				{'T','L','J','R','E','B','E','U','W','C'},
				{'P','E','A','C','H','E','L','I','B','H'},
				{'Y','H','T','L','F','R','O','T','E','E'},
				{'X','R','T','L','P','R','R','A','R','E'},
				{'R','A','C','C','O','Y','N','T','R','K'},
				{'R','A','S','P','B','E','R','R','Y','O'},

				
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

		
		public Fruit3_3(){
			
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
				 objarray[2][7].setForeground(Color.GREEN);
				 objarray[3][7].setForeground(Color.GREEN);
				 objarray[4][7].setForeground(Color.GREEN);
				 objarray[5][7].setForeground(Color.GREEN);
				 objarray[6][7].setForeground(Color.GREEN);
		
				 		 
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
				 objarray[1][6].setForeground(Color.RED);
				 objarray[2][6].setForeground(Color.RED);
				 objarray[3][6].setForeground(Color.RED);
				 objarray[4][6].setForeground(Color.RED);
				 objarray[5][6].setForeground(Color.RED);
				 objarray[6][6].setForeground(Color.RED);
				 
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
				 objarray[2][9].setForeground(Color.orange);
				 objarray[3][9].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				 objarray[5][9].setForeground(Color.orange);
				 objarray[6][9].setForeground(Color.orange);
				 objarray[7][9].setForeground(Color.orange);
				 
				 
				 
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
				 objarray[9][0].setForeground(Color.PINK);
				 objarray[9][1].setForeground(Color.PINK);
				 objarray[9][2].setForeground(Color.PINK);
				 objarray[9][3].setForeground(Color.PINK);
				 objarray[9][4].setForeground(Color.PINK);
				 objarray[9][5].setForeground(Color.PINK);
				 objarray[9][6].setForeground(Color.PINK);
				 objarray[9][7].setForeground(Color.PINK);
				 objarray[9][8].setForeground(Color.PINK);
				 
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
				 objarray[0][0].setForeground(Color.CYAN);
				 objarray[0][1].setForeground(Color.CYAN);
				 objarray[0][2].setForeground(Color.CYAN);
				 objarray[0][3].setForeground(Color.CYAN);
				 objarray[0][4].setForeground(Color.CYAN);
				 objarray[0][5].setForeground(Color.CYAN);
				 objarray[0][6].setForeground(Color.CYAN);
				 objarray[0][7].setForeground(Color.CYAN);
				 objarray[0][8].setForeground(Color.CYAN);
				 objarray[0][9].setForeground(Color.CYAN);
				 
				 
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
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[2][1].setForeground(Color.GREEN);
				 objarray[2][2].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[2][4].setForeground(Color.GREEN);
				 objarray[2][5].setForeground(Color.GREEN);
				 
			
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
				 objarray[5][0].setForeground(Color.YELLOW);
				 objarray[5][1].setForeground(Color.YELLOW);
				 objarray[5][2].setForeground(Color.YELLOW);
				 objarray[5][3].setForeground(Color.YELLOW);
				 objarray[5][4].setForeground(Color.YELLOW);
								 
				 
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
			Fruit3_3 puzz=new Fruit3_3();
		
		
	}}



