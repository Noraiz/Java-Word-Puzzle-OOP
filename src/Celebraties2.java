import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class Celebraties2 extends Sound implements ActionListener 
	{
		
				
						char a[][]={
								{'D','T','A','Y','L','O','R','A','S','S'},
								{'A','O','S','E','C','F','B','V','W','H'},
								{'S','O','N','I','H','O','K','S','I','A'},
								{'W','B','S','H','A','U','K','H','F','F'},
								{'R','E','W','A','R','U','R','J','T','T'},
								{'T','O','M','S','L','R','O','U','S','S'},
								{'L','T','S','C','I','N','B','L','H','H'},
								{'Y','S','M','C','E','M','E','I','A','A'},
								{'A','O','D','I','L','W','A','E','N','N'},
								{'T','R','O','M','E','O','I','T','T','L'}};
				
				
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
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true;
	    JButton b2=new JButton("Back");
		public Celebraties2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CELEBRATIES");
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
				}}}
					

		Integer i=0;
		public void actionPerformed(ActionEvent e) {
			 string=t.getText();
				if(w1){
			 if(string.equalsIgnoreCase("TAYLOR")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][1].setForeground(Color.RED);
				 objarray[0][2].setForeground(Color.RED);
				 objarray[0][3].setForeground(Color.RED);
				 objarray[0][4].setForeground(Color.RED);
				 objarray[0][5].setForeground(Color.RED);
				 objarray[0][6].setForeground(Color.RED);
				
				 
				w1=false; 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
				
				
				}		 
				 if(w2){
			 
			 if (string.equalsIgnoreCase("JULIET")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[4][7].setForeground(Color.orange);
				 objarray[5][7].setForeground(Color.orange);
				 objarray[6][7].setForeground(Color.orange);
				 objarray[7][7].setForeground(Color.orange);
				 objarray[8][7].setForeground(Color.orange);
				 objarray[9][7].setForeground(Color.orange);
				 
			
				w2=false; 
				 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
				 
				 
				 
				 }
			 if(w3){
			 if (string.equalsIgnoreCase("TOMS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][0].setForeground(Color.PINK);
				 objarray[5][1].setForeground(Color.PINK);
				 objarray[5][2].setForeground(Color.PINK);
				 objarray[5][3].setForeground(Color.PINK);
				
				 w3=false;
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 }
			  if(w4){
			 if (string.equalsIgnoreCase("SHAN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[5][8].setForeground(Color.CYAN);
				 objarray[6][8].setForeground(Color.CYAN);
				 objarray[7][8].setForeground(Color.CYAN);
				 objarray[8][8].setForeground(Color.CYAN);
				 w4=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			  
			  
			  }
			 if(w5){
			 if (string.equalsIgnoreCase("ROMEO")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][1].setForeground(Color.GREEN);
				 objarray[9][2].setForeground(Color.GREEN);
				 objarray[9][3].setForeground(Color.GREEN);
				 objarray[9][4].setForeground(Color.GREEN);
				 objarray[9][5].setForeground(Color.GREEN);
			w5=false; }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 }
			
			 if(w6){
			 if (string.equalsIgnoreCase("SWIFT")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][8].setForeground(Color.BLUE);
				 objarray[1][8].setForeground(Color.BLUE);
				 objarray[2][8].setForeground(Color.BLUE);
				 objarray[3][8].setForeground(Color.BLUE);
				 objarray[4][8].setForeground(Color.BLUE);
				 	 
				w6=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 }
			 if(w7){
			 if (string.equalsIgnoreCase("CHARLIE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][4].setForeground(Color.YELLOW);
				 objarray[2][4].setForeground(Color.YELLOW);
				 objarray[3][4].setForeground(Color.YELLOW);
				 objarray[4][4].setForeground(Color.YELLOW);
				 objarray[5][4].setForeground(Color.YELLOW);
				 objarray[6][4].setForeground(Color.YELLOW);
				 objarray[7][4].setForeground(Color.YELLOW);
				 w7=false; 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 }
			 if(w8){
			 if (string.equalsIgnoreCase("DON")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.ORANGE);
				 objarray[1][1].setForeground(Color.ORANGE);
				 objarray[2][2].setForeground(Color.ORANGE);
				 
				w8=false;				 
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("TAYLOR")&&!string.equalsIgnoreCase("JULIET")&&!string.equalsIgnoreCase("TOMS")&&!string.equalsIgnoreCase("SHAN")&&!string.equalsIgnoreCase("ROMEO")&&!string.equalsIgnoreCase("SWIFT")&&!string.equalsIgnoreCase("CHARLIE")&&!string.equalsIgnoreCase("DON"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
			 
			 
			 }	 else
			t.setText("");
			 
			 if (i==80)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			Celebraties2 puzz=new Celebraties2();
		}}

