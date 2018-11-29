
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

	public class Fruit1_2 extends Sound implements ActionListener 
	{
		char a[][]={
				{'B','P','G','R','A','P','E','E','I','A'},
				{'A','G','O','L','H','R','E','L','B','P'},
				{'N','L','R','W','P','R','B','V','A','P'},
				{'A','J','A','E','A','O','N','D','K','L'},
				{'N','R','N','R','P','R','W','G','A','E'},
				{'A','A','G','M','A','A','L','N','N','L'},
				{'E','H','E','L','Y','R','K','G','A','L'},
				{'X','R','O','R','A','L','E','M','O','N'},
				{'R','A','P','A','P','A','P','A','K','M'},
				{'L','I','M','E','A','U','T','S','Y','E'},

							
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
		
		public Fruit1_2(){
			
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
				 objarray[0][9].setForeground(Color.YELLOW);
				 objarray[1][9].setForeground(Color.YELLOW);
				 objarray[2][9].setForeground(Color.YELLOW);
				 objarray[3][9].setForeground(Color.YELLOW);
				 objarray[4][9].setForeground(Color.YELLOW);
				
				 		 
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
				 objarray[0][2].setForeground(Color.RED);
				 objarray[0][3].setForeground(Color.RED);
				 objarray[0][4].setForeground(Color.RED);
				 objarray[0][5].setForeground(Color.RED);
				 objarray[0][6].setForeground(Color.RED);
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
				 objarray[7][5].setForeground(Color.orange);
				 objarray[7][6].setForeground(Color.orange);
				 objarray[7][7].setForeground(Color.orange);
				 objarray[7][8].setForeground(Color.orange);
				 objarray[7][9].setForeground(Color.orange);
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
				 objarray[1][2].setForeground(Color.ORANGE);
				 objarray[2][2].setForeground(Color.ORANGE);
				 objarray[3][2].setForeground(Color.ORANGE);
				 objarray[4][2].setForeground(Color.ORANGE);
				 objarray[5][2].setForeground(Color.ORANGE);
				 objarray[6][2].setForeground(Color.ORANGE);
				
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
				 objarray[2][4].setForeground(Color.CYAN);
				 objarray[3][4].setForeground(Color.CYAN);
				 objarray[4][4].setForeground(Color.CYAN);
				 objarray[5][4].setForeground(Color.CYAN);
				 objarray[6][4].setForeground(Color.CYAN);
				 objarray[7][4].setForeground(Color.CYAN);
				 
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
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[1][0].setForeground(Color.GREEN);
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
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
				 objarray[9][0].setForeground(Color.YELLOW);
				 objarray[9][1].setForeground(Color.YELLOW);
				 objarray[9][2].setForeground(Color.YELLOW);
				 objarray[9][3].setForeground(Color.YELLOW);
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
			Fruit1_2 puzz=new Fruit1_2();
		}
		
		
	}



