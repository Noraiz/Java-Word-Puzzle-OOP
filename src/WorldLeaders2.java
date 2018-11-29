import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class WorldLeaders2 extends Sound implements ActionListener 
	{
				char a[][]={
						{'A','V','T','R','U','D','E','A','U','X'},
						{'P','G','G','O','U','K','A','J','F','C'},
						{'L','H','T','O','I','R','B','G','B','J'},
						{'U','C','O','D','O','L','R','A','J','I'},
						{'T','A','O','A','A','O','A','S','I','N'},
						{'I','M','R','A','N','K','H','A','N','N'},
						{'N','N','M','O','D','L','A','F','P','A'},
						{'Y','O','M','R','F','R','M','I','I','H'},
						{'O','C','A','M','E','R','O','N','N','U'},
						{'P','O','B','A','M','A','A','B','K','N'}};
				
				JButton b2=new JButton("Back");
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
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true,w9 = true;
		
		public WorldLeaders2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - WORLD LEADERS");
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
			 if (string.equalsIgnoreCase("TRUDEAU")){
				
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][2].setForeground(Color.CYAN);
				 objarray[0][3].setForeground(Color.CYAN);
				 objarray[0][4].setForeground(Color.CYAN);
				 objarray[0][5].setForeground(Color.CYAN);
				 objarray[0][6].setForeground(Color.CYAN);
				 objarray[0][7].setForeground(Color.CYAN);
				 objarray[0][8].setForeground(Color.CYAN);				 
				 w1=false;
				 
				 
			 }
			 
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
				
				
				}
				if(w2){
			 if(string.equalsIgnoreCase("CAMERON")){
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
			 
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
				
				}
				if(w3){
			 if (string.equalsIgnoreCase("PLUTIN")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][0].setForeground(Color.orange);
				 objarray[2][0].setForeground(Color.orange);
				 objarray[3][0].setForeground(Color.orange);
				 objarray[4][0].setForeground(Color.orange);
				 objarray[5][0].setForeground(Color.orange);
				 objarray[6][0].setForeground(Color.orange);
				 
				w3=false; 
			 }
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
				
				
				
				}
			 if(w4){
			 if (string.equalsIgnoreCase("MODI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][1].setForeground(Color.PINK);
				 objarray[4][2].setForeground(Color.PINK);
				 objarray[3][3].setForeground(Color.PINK);
				 objarray[2][4].setForeground(Color.PINK);
				 
				w4=false; 
			 }
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
			 
			 
			 
			 }
			  if(w5){
			 if (string.equalsIgnoreCase("JINNAH")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][9].setForeground(Color.ORANGE);
				 objarray[3][9].setForeground(Color.ORANGE);
				 objarray[4][9].setForeground(Color.ORANGE);
				 objarray[5][9].setForeground(Color.ORANGE);
				 objarray[6][9].setForeground(Color.ORANGE);
				 objarray[7][9].setForeground(Color.ORANGE);
				 
				w5=false; 
				 
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
			  
			  
			  
			  }
			 if(w6){
			 if (string.equalsIgnoreCase("JINPIN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][8].setForeground(Color.GREEN);
				 objarray[4][8].setForeground(Color.GREEN);
				 objarray[5][8].setForeground(Color.GREEN);
				 objarray[6][8].setForeground(Color.GREEN);
				 objarray[7][8].setForeground(Color.GREEN);
				 objarray[8][8].setForeground(Color.GREEN);
				 
				 
				w6=false; 
				 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
			 
			 
			 }
			 if(w7){
			 if (string.equalsIgnoreCase("OBAMA")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][1].setForeground(Color.YELLOW);
				 objarray[9][2].setForeground(Color.YELLOW);
				 objarray[9][3].setForeground(Color.YELLOW);
				 objarray[9][4].setForeground(Color.YELLOW);
				 objarray[9][5].setForeground(Color.YELLOW);
				
				 
				 w7=false;
				 
				 
			 }
			 
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
			 }
			 if(w8){
			 if (string.equalsIgnoreCase("ABRAHAM")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][6].setForeground(Color.YELLOW);
				 objarray[2][6].setForeground(Color.YELLOW);
				 objarray[3][6].setForeground(Color.YELLOW);
				 objarray[4][6].setForeground(Color.YELLOW);
				 objarray[5][6].setForeground(Color.YELLOW);
				 objarray[6][6].setForeground(Color.YELLOW);
				 objarray[7][6].setForeground(Color.YELLOW);
				 
				w8=false; 
				 
			 }
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
		 {
		t.setText("");
		PlayWrongSound();
		}
			
			 
			 
			 }
			 if(w9){
			 if (string.equalsIgnoreCase("IMRANKHAN")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[5][1].setForeground(Color.GREEN);
				 objarray[5][2].setForeground(Color.GREEN);
				 objarray[5][3].setForeground(Color.GREEN);
				 objarray[5][4].setForeground(Color.GREEN);
				 objarray[5][5].setForeground(Color.GREEN);
				 objarray[5][6].setForeground(Color.GREEN);
				 objarray[5][7].setForeground(Color.GREEN);
				 objarray[5][8].setForeground(Color.GREEN);
				 
w9=false;
								 
				 
				 
			 }
			 
			 if
			 (!string.equalsIgnoreCase("TRUDEAU")&&!string.equalsIgnoreCase("CAMERON")&&!string.equalsIgnoreCase("PLUTIN")&&!string.equalsIgnoreCase("MODI")&&!string.equalsIgnoreCase("JINNAH")&&!string.equalsIgnoreCase("JINPIN")&&!string.equalsIgnoreCase("OBAMA")&&!string.equalsIgnoreCase("ABRAHAM")&&!string.equalsIgnoreCase("IMRANKHAN"))
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
			WorldLeaders2 puzz=new WorldLeaders2();
		
		
	}}

