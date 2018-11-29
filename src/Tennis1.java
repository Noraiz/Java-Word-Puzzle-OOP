
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


	public class Tennis1 extends Sound implements ActionListener 
	{
		char a[][]={
				{'A','C','E','M','C','R','X','E','S','P'},
				{'R','O','O','L','H','S','E','L','T','N'},
				{'P','M','L','W','I','E','B','V','R','E'},
				{'O','E','A','O','L','R','O','D','A','T'},
				{'I','L','J','R','E','V','W','T','U','H'},
				{'N','O','H','M','M','E','L','O','B','L'},
				{'T','H','T','L','F','R','K','M','E','U'},
				{'X','R','T','L','D','E','U','C','E','I'},
				{'R','A','C','C','O','Y','N','T','R','N'},
				{'L','O','B','C','H','E','O','U','T','O'},
				
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
		
		public Tennis1(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
			f=new JFrame("WORD PUZZLE-Sports-Tennis");
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
				
			 if (string.equalsIgnoreCase("ace")){
				
				 t.setText("");
				 i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[0][1].setForeground(Color.GREEN);
				 objarray[0][2].setForeground(Color.GREEN);
				 
				 		 
				 w1=false;
				 
			 }
			 else if
			 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
					{
				 t.setText("");
				PlayWrongSound();
				
		}}
			 if(w2)
			 {
				 
				 if(string.equalsIgnoreCase("point"))

			 {
				 t.setText("");
	             i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[2][0].setForeground(Color.RED);
				 objarray[3][0].setForeground(Color.RED);
				 objarray[4][0].setForeground(Color.RED);
				 objarray[5][0].setForeground(Color.RED);
				 objarray[6][0].setForeground(Color.RED);
				 
					 w2=false;
			  }else if
			 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
									{
		t.setText("");
		PlayWrongSound();
		}
					 } 
		
				 
				 
			if(w3)
			{
				if (string.equalsIgnoreCase("lob")){
					 t.setText("");
					 i=i+10;
					
			 
			 	 check.setText("Score:"+i.toString());
			 	 objarray[9][0].setForeground(Color.orange);
				 objarray[9][1].setForeground(Color.orange);
				 objarray[9][2].setForeground(Color.orange);
				 
			w3=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
											{
			t.setText("");
			PlayWrongSound();
			}
						}
		
			
			
			if(w4)
			{
				if (string.equalsIgnoreCase("serve")){
					 t.setText("");
					 i=i+10;
				
					 
			
				 check.setText("Score:"+i.toString());
				 objarray[1][5].setForeground(Color.PINK);
				 objarray[2][5].setForeground(Color.PINK);
				 objarray[3][5].setForeground(Color.PINK);
				 objarray[4][5].setForeground(Color.PINK);
				 objarray[5][5].setForeground(Color.PINK);
				 
			w4=false;
				 
				 }else if
				 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
										 {
					 t.setText("");
			PlayWrongSound();
			}
						}
		
				 
				 
			 
			  if(w5)
			  {
				  
			  
			 if (string.equalsIgnoreCase("deuce")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[7][4].setForeground(Color.CYAN);
				 objarray[7][5].setForeground(Color.CYAN);
				 objarray[7][6].setForeground(Color.CYAN);
				 objarray[7][7].setForeground(Color.CYAN);
				 objarray[7][8].setForeground(Color.CYAN);
				 
			 w5=false;
			 }else if
			 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
								{
		t.setText("");
		PlayWrongSound();
		}
					}
	 
				 
			 if(w6)
			 {
			 
			 if (string.equalsIgnoreCase("out")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[9][6].setForeground(Color.MAGENTA);
				 objarray[9][7].setForeground(Color.MAGENTA);
				 objarray[9][8].setForeground(Color.MAGENTA);
			
				 w6=false;
			 }else if
			 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
										{
		t.setText("");
		PlayWrongSound();
		}
					}

				 
				 
				 
			 if(w7)
			 {
				 
			 
			
			 
			 if (string.equalsIgnoreCase("net")){
					
				 t.setText("");
				  i+=10;
				 check.setText("Score:"+i.toString());
				 objarray[1][9].setForeground(Color.blue);
				 objarray[2][9].setForeground(Color.blue);
				 objarray[3][9].setForeground(Color.blue);
				 w7=false;
			 }else if
			 (!string.equalsIgnoreCase("ace")&&!string.equalsIgnoreCase("net")&&!string.equalsIgnoreCase("out")&&!string.equalsIgnoreCase("lob")&&!string.equalsIgnoreCase("point")&&!string.equalsIgnoreCase("serve")&&!string.equalsIgnoreCase("deuce"))
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
			Tennis1 puzz=new Tennis1();
		
		
	}}



