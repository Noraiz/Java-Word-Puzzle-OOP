import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class MoviesNames extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'W','H','A','N','G','O','V','E','R','O'},
						{'A','O','S','T','D','F','B','V','G','T'},
						{'R','F','N','I','N','O','L','O','O','T'},
						{'L','O','O','T','S','C','K','L','N','X'},
						{'M','C','W','A','P','G','O','O','X','D'},
						{'T','U','F','N','O','P','P','V','P','K'},
						{'S','S','A','I','S','O','T','E','O','L'},
						{'O','T','L','C','D','M','R','S','B','M'},
						{'N','D','D','I','L','W','A','L','E','N'},
						{'D','A','R','K','N','I','G','H','T','L'}};
						
				
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
		public MoviesNames(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - MOVIES NAMES");
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
				if(w1)
				{
			 if (string.equalsIgnoreCase("TITANIC")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[1][3].setForeground(Color.GREEN);
				 objarray[2][3].setForeground(Color.GREEN);
				 objarray[3][3].setForeground(Color.GREEN);
				 objarray[4][3].setForeground(Color.GREEN);
				 objarray[5][3].setForeground(Color.GREEN);
				 objarray[6][3].setForeground(Color.GREEN);
				 objarray[7][3].setForeground(Color.GREEN);
				 
				 w1=false;
				 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();}	
				}
				
				if(w2)
				{
			 if(string.equalsIgnoreCase("DARKNIGHT")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][0].setForeground(Color.RED);
				 objarray[9][1].setForeground(Color.RED);
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 objarray[9][6].setForeground(Color.RED);
				 objarray[9][7].setForeground(Color.RED);
				 objarray[9][8].setForeground(Color.RED);
				 
				 w2=false; }
			 else 
				 if(!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();}
				
				}
				
				if(w3)
				{
			 if (string.equalsIgnoreCase("BOND")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][6].setForeground(Color.orange);
				 objarray[2][7].setForeground(Color.orange);
				 objarray[3][8].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				w3=false;
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
				
				}
			 if(w4)
			 {
			 if (string.equalsIgnoreCase("WAR")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.PINK);
				 objarray[1][0].setForeground(Color.PINK);
				 objarray[2][0].setForeground(Color.PINK);
				 
				 
			w4=false;
				 
				 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			 if(w5)
			 {
			 if (string.equalsIgnoreCase("FOCUS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][1].setForeground(Color.GREEN);
				 objarray[3][1].setForeground(Color.GREEN);
				 objarray[4][1].setForeground(Color.GREEN);
				 objarray[5][1].setForeground(Color.GREEN);
				 objarray[6][1].setForeground(Color.GREEN); 
				w5=false; 
			 }
			 else 
				 if	 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 }
			if(w6){
			 
			 if (string.equalsIgnoreCase("HANGOVER")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.ORANGE);
				 objarray[0][2].setForeground(Color.ORANGE);
				 objarray[0][3].setForeground(Color.ORANGE);
				 objarray[0][4].setForeground(Color.ORANGE);
				 objarray[0][5].setForeground(Color.ORANGE);
				 objarray[0][6].setForeground(Color.ORANGE);
				 objarray[0][7].setForeground(Color.ORANGE);
				 objarray[0][8].setForeground(Color.ORANGE);
								 
				w6=false; 
				 
			 }
			 else 
				 if(!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			
			}
			if(w7){
			 if (string.equalsIgnoreCase("LOVE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][7].setForeground(Color.ORANGE);
				 objarray[2][7].setForeground(Color.ORANGE);
				 objarray[1][7].setForeground(Color.ORANGE);
				 objarray[0][7].setForeground(Color.ORANGE);

				w7=false;				 
				 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			
			
			}
			 if(w8){
			 if (string.equalsIgnoreCase("SNOWFALL")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][2].setForeground(Color.YELLOW);
				 objarray[2][2].setForeground(Color.YELLOW);
				 objarray[3][2].setForeground(Color.YELLOW);
				 objarray[4][2].setForeground(Color.YELLOW);
				 objarray[5][2].setForeground(Color.YELLOW);
				 objarray[6][2].setForeground(Color.YELLOW);
				 objarray[7][2].setForeground(Color.YELLOW);
				 
			 w8=false;
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 
			 
			 }
			 if(w9){
			 if (string.equalsIgnoreCase("DILWALE")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][2].setForeground(Color.YELLOW);
				 objarray[8][3].setForeground(Color.YELLOW);
				 objarray[8][4].setForeground(Color.YELLOW);
				 objarray[8][5].setForeground(Color.YELLOW);
				 objarray[8][6].setForeground(Color.YELLOW);
				 objarray[8][7].setForeground(Color.YELLOW);
				 objarray[8][8].setForeground(Color.YELLOW);
				
				 w9=false;
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TITIANIC")&&!string.equalsIgnoreCase("DARKNIGHT")&&!string.equalsIgnoreCase("BOND")&&!string.equalsIgnoreCase("WAR")&&!string.equalsIgnoreCase("FOCUS")&&!string.equalsIgnoreCase("HANGOVER")&&!string.equalsIgnoreCase("LOVE")&&!string.equalsIgnoreCase("SNOWFALL")&&!string.equalsIgnoreCase("DILWALE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 
			 }
				 
			 
			
			
			 else
			t.setText("");
			 
			 if (i==90)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			MoviesNames puzz=new MoviesNames();
		
		
	}}

