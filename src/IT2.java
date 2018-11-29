
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
	public class IT2 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'I','T','T','N','G','J','V','E','R','O'},
						{'M','I','R','T','G','A','T','E','S','G'},
						{'Y','M','U','I','N','N','L','B','A','G'},
						{'A','C','D','T','S','N','O','L','M','O'},
						{'H','O','E','A','P','J','O','O','E','O'},
						{'O','O','A','P','P','L','E','V','R','G'},
						{'O','K','U','A','S','O','T','E','O','L'},
						{'A','T','B','C','M','O','D','I','N','E'},
						{'N','A','N','D','R','O','I','D','I','N'},
						{'Z','U','K','E','R','B','E','R','G','L'}};
				
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
	    ImageIcon I1;
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9=true;
	    JButton b2=new JButton("Back");
		public IT2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CEO's and IT COMPANIES");
		p=new JPanel();
		p1=new JPanel();
		l=new JLabel();
		t=new JTextField(20);
		check=new JLabel("0");
		I1=new ImageIcon("images/grass_tile.jpg");
		
		
		p1.setLocation(350,20);
		
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
		
		
		
			 
		Integer i=0;
		public void actionPerformed(ActionEvent e) {
			 string=t.getText();
				
			
			if(w1){
			 if (string.equalsIgnoreCase("TIMCOOK")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.orange);
				 objarray[1][1].setForeground(Color.orange);
				 objarray[2][1].setForeground(Color.orange);
				 objarray[3][1].setForeground(Color.orange);
				 objarray[4][1].setForeground(Color.orange);
				 objarray[5][1].setForeground(Color.orange);
				 objarray[6][1].setForeground(Color.orange);
				 
				w1=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			
			}
			if(w2){
			 if (string.equalsIgnoreCase("ANDROID")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][1].setForeground(Color.RED);
				 objarray[8][2].setForeground(Color.RED);
				 objarray[8][3].setForeground(Color.RED);
				 objarray[8][4].setForeground(Color.RED);
				 objarray[8][5].setForeground(Color.RED);
				 objarray[8][6].setForeground(Color.RED);
				 objarray[8][7].setForeground(Color.RED);
				 
				w2=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			}
			if(w3){
			 if (string.equalsIgnoreCase("GATES")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][4].setForeground(Color.orange);
				 objarray[1][5].setForeground(Color.orange);
				 objarray[1][6].setForeground(Color.orange);
				 objarray[1][7].setForeground(Color.orange);
				 objarray[1][8].setForeground(Color.orange);
				 
				w3=false; 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			}
			 if(w4){
			 if (string.equalsIgnoreCase("ZUKERBERG")){
					
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
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			  
			 	if(w5){		 
			 if (string.equalsIgnoreCase("GOOGLE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][9].setForeground(Color.GREEN);
				 objarray[3][9].setForeground(Color.GREEN);
				 objarray[4][9].setForeground(Color.GREEN);
				 objarray[5][9].setForeground(Color.GREEN);
				 objarray[6][9].setForeground(Color.GREEN);
				 objarray[7][9].setForeground(Color.GREEN);
				 
				 
				w5=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 }
			if(w6){
			 
			 if (string.equalsIgnoreCase("YAHOO")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][0].setForeground(Color.BLUE);
				 objarray[3][0].setForeground(Color.BLUE);
				 objarray[4][0].setForeground(Color.BLUE);
				 objarray[5][0].setForeground(Color.BLUE);
				 objarray[6][0].setForeground(Color.BLUE);
		
								 
				w6=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			}
			if(w7){
			 if (string.equalsIgnoreCase("APPLE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][2].setForeground(Color.YELLOW);
				 objarray[5][3].setForeground(Color.YELLOW);
				 objarray[5][4].setForeground(Color.YELLOW);
				 objarray[5][5].setForeground(Color.YELLOW);
				 objarray[5][6].setForeground(Color.YELLOW);
				

								 
				w7=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			}
			 if(w8){
			 if (string.equalsIgnoreCase("JOBS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[4][5].setForeground(Color.YELLOW);
				 objarray[3][0].setForeground(Color.YELLOW);
				 objarray[4][0].setForeground(Color.YELLOW);
				 objarray[5][0].setForeground(Color.YELLOW);
				 objarray[6][0].setForeground(Color.YELLOW);
		
				w8=false;				 
				 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TIMCOOK")&&!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("GooGle")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("JOBS"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			
			
			
			 else
			t.setText("");
			 
			 if (i==80)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
			
		}
		public static void main(String [] args){
			IT2 puzz=new IT2();
		
		
	}}

