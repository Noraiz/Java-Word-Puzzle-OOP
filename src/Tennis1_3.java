import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;


	public class Tennis1_3 extends Sound implements ActionListener 
	{
		char a[][]={
				{'N','E','T','M','C','R','X','E','S','P'},
				{'R','O','O','L','H','D','E','L','T','A'},
				{'P','M','P','W','I','E','B','V','R','C'},
				{'O','E','O','O','L','U','O','D','A','E'},
				{'I','L','I','R','E','C','W','T','U','H'},
				{'N','O','N','M','M','E','L','O','B','L'},
				{'U','H','T','L','F','R','K','M','E','U'},
				{'X','R','T','L','S','E','R','V','E','I'},
				{'R','A','C','C','O','Y','N','T','R','N'},
				{'O','U','T','C','H','E','L','O','B','O'},
				
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
		
		public Tennis1_3(){
			
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
				 objarray[1][9].setForeground(Color.GREEN);
				 objarray[2][9].setForeground(Color.GREEN);
				 objarray[3][9].setForeground(Color.GREEN);
				 
				 		 
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
				 objarray[2][2].setForeground(Color.RED);
				 objarray[3][2].setForeground(Color.RED);
				 objarray[4][2].setForeground(Color.RED);
				 objarray[5][2].setForeground(Color.RED);
				 objarray[6][2].setForeground(Color.RED);
				 
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
			 	 objarray[9][6].setForeground(Color.orange);
				 objarray[9][7].setForeground(Color.orange);
				 objarray[9][8].setForeground(Color.orange);
				 
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
				 objarray[7][4].setForeground(Color.DARK_GRAY);
				 objarray[7][5].setForeground(Color.DARK_GRAY);
				 objarray[7][6].setForeground(Color.DARK_GRAY);
				 objarray[7][7].setForeground(Color.DARK_GRAY);
				 objarray[7][8].setForeground(Color.DARK_GRAY);
				 
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
				 objarray[1][5].setForeground(Color.CYAN);
				 objarray[2][5].setForeground(Color.CYAN);
				 objarray[3][5].setForeground(Color.CYAN);
				 objarray[4][5].setForeground(Color.CYAN);
				 objarray[5][5].setForeground(Color.CYAN);
				 
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
				 objarray[9][0].setForeground(Color.MAGENTA);
				 objarray[9][1].setForeground(Color.MAGENTA);
				 objarray[9][2].setForeground(Color.MAGENTA);
			
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
				 objarray[0][0].setForeground(Color.blue);
				 objarray[0][1].setForeground(Color.blue);
				 objarray[0][2].setForeground(Color.blue);
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
			Tennis1_3 puzz=new Tennis1_3();
		
		
	}}



