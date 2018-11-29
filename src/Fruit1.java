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

	public class Fruit1 extends Sound implements ActionListener 
	{
		char a[][]={
				{'A','P','P','L','E','N','X','E','I','B'},
				{'T','G','O','L','H','R','E','L','B','R'},
				{'G','L','L','W','I','R','B','V','A','Y'},
				{'R','J','L','E','M','O','N','D','N','G'},
				{'A','R','N','R','E','R','W','G','A','I'},
				{'P','A','D','M','M','A','L','N','N','L'},
				{'E','H','E','L','F','R','K','G','A','L'},
				{'X','R','O','R','A','N','G','E','C','I'},
				{'R','A','P','A','P','A','Y','A','K','M'},
				{'M','A','L','T','A','U','T','S','Y','E'},

				
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
		
		public Fruit1(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
			f=new JFrame("WORD PUZZLE-FRUIT");
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
				
			 if (string.equals("apple")){
				
				 t.setText("");
				 i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.RED);
				 objarray[0][1].setForeground(Color.RED);
				 objarray[0][2].setForeground(Color.RED);
				 objarray[0][3].setForeground(Color.RED);
				 objarray[0][4].setForeground(Color.RED);
				 
				 		 
				 w1=false;
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
		{
				 t.setText("");
					PlayWrongSound();
				
		}}
			 if(w2)
			 {
				 
				 if(string.equalsIgnoreCase("grape"))

			 {
				 t.setText("");
	             i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
				 w2=false;
			  }else if
			 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
								{
		t.setText("");
		PlayWrongSound();
		}
					 } 
		
				 
				 
			if(w3)
			{
				if (string.equalsIgnoreCase("lemon")){
					 t.setText("");
					 i=i+10;
					
			 
			 	 check.setText("Score:"+i.toString());
				 objarray[3][2].setForeground(Color.YELLOW);
				 objarray[3][3].setForeground(Color.YELLOW);
				 objarray[3][4].setForeground(Color.YELLOW);
				 objarray[3][5].setForeground(Color.YELLOW);
				 objarray[3][6].setForeground(Color.YELLOW);
				w3=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
								{
			t.setText("");
			PlayWrongSound();
			}
						}
		
			
			
			if(w4)
			{
				if (string.equalsIgnoreCase("orange")){
					 t.setText("");
					 i=i+10;
				
					 
			
				 check.setText("Score:"+i.toString());
				 objarray[7][2].setForeground(Color.ORANGE);
				 objarray[7][3].setForeground(Color.ORANGE);
				 objarray[7][4].setForeground(Color.ORANGE);
				 objarray[7][5].setForeground(Color.ORANGE);
				 objarray[7][6].setForeground(Color.ORANGE);
				 objarray[7][7].setForeground(Color.ORANGE);
				
			w4=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
							 {
					 t.setText("");
			PlayWrongSound();
			}
						}
		
				 
				 
			 
			  if(w5)
			  {
				  
			  
			 if (string.equalsIgnoreCase("papaya")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[8][2].setForeground(Color.CYAN);
				 objarray[8][3].setForeground(Color.CYAN);
				 objarray[8][4].setForeground(Color.CYAN);
				 objarray[8][5].setForeground(Color.CYAN);
				 objarray[8][6].setForeground(Color.CYAN);
				 objarray[8][7].setForeground(Color.CYAN);
				 
			 w5=false;
			 }else if
			 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
					{
		t.setText("");
		PlayWrongSound();
		}
					}
	 
				 
			 if(w6)
			 {
			 
			 if (string.equalsIgnoreCase("banana")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[1][8].setForeground(Color.YELLOW);
				 objarray[2][8].setForeground(Color.YELLOW);
				 objarray[3][8].setForeground(Color.YELLOW);
				 objarray[4][8].setForeground(Color.YELLOW);
				 objarray[5][8].setForeground(Color.YELLOW);
				 objarray[6][8].setForeground(Color.YELLOW);
					 w6=false;
			 }else if
			 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
							{
		t.setText("");
		PlayWrongSound();
		}
					}

				 
				 
				 
			 if(w7)
			 {
				 
			 
			
			 
			 if (string.equalsIgnoreCase("lime")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[6][9].setForeground(Color.YELLOW);
				 objarray[7][9].setForeground(Color.YELLOW);
				 objarray[8][9].setForeground(Color.YELLOW);
				 objarray[9][9].setForeground(Color.YELLOW);
				 w7=false;
			 }else if
			 (!string.equalsIgnoreCase("apple")&&!string.equalsIgnoreCase("grape")&&!string.equalsIgnoreCase("lemon")&&!string.equalsIgnoreCase("orange")&&!string.equalsIgnoreCase("papaya")&&!string.equalsIgnoreCase("banana")&&!string.equalsIgnoreCase("lime"))
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
		public static void main(String [] args)
		{
			Fruit1 puzz=new Fruit1();
		}
		
		
	}



