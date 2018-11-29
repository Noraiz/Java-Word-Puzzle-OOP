
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


	public class Tennis1_2 extends Sound implements ActionListener 
	{
		char a[][]={
				{'D','E','U','C','E','R','X','E','S','P'},
				{'R','O','O','L','H','S','E','L','T','O'},
				{'A','C','E','W','I','L','B','V','R','I'},
				{'O','E','A','O','L','O','O','D','A','N'},
				{'I','L','J','R','E','B','W','T','U','T'},
				{'N','O','H','M','M','E','L','O','B','L'},
				{'T','H','O','U','T','R','K','M','E','U'},
				{'X','R','T','L','D','E','U','C','E','I'},
				{'R','A','C','C','O','Y','N','T','R','N'},
				{'S','E','R','V','E','E','O','N','E','T'},
				
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
		
		public Tennis1_2(){
			
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
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[2][1].setForeground(Color.GREEN);
				 objarray[2][2].setForeground(Color.GREEN);
				 
				 		 
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
				 objarray[0][9].setForeground(Color.RED);
				 objarray[1][9].setForeground(Color.RED);
				 objarray[2][9].setForeground(Color.RED);
				 objarray[3][9].setForeground(Color.RED);
				 objarray[4][9].setForeground(Color.RED);
				 
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
			 	 objarray[2][5].setForeground(Color.orange);
				 objarray[3][5].setForeground(Color.orange);
				 objarray[4][5].setForeground(Color.orange);
				 
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
				 objarray[9][0].setForeground(Color.PINK);
				 objarray[9][1].setForeground(Color.PINK);
				 objarray[9][2].setForeground(Color.PINK);
				 objarray[9][3].setForeground(Color.PINK);
				 objarray[9][4].setForeground(Color.PINK);
				 
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
				 objarray[0][0].setForeground(Color.CYAN);
				 objarray[0][1].setForeground(Color.CYAN);
				 objarray[0][2].setForeground(Color.CYAN);
				 objarray[0][3].setForeground(Color.CYAN);
				 objarray[0][4].setForeground(Color.CYAN);
				 
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
				 objarray[6][2].setForeground(Color.MAGENTA);
				 objarray[6][3].setForeground(Color.MAGENTA);
				 objarray[6][4].setForeground(Color.MAGENTA);
			
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
				 objarray[9][7].setForeground(Color.blue);
				 objarray[9][8].setForeground(Color.blue);
				 objarray[9][9].setForeground(Color.blue);
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
			Tennis1_2 puzz=new Tennis1_2();
		
		
	}}



