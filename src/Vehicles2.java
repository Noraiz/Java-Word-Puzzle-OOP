import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
	public class Vehicles2 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'F','P','E','B','T','M','G','C','H','C'},
						{'O','O','H','A','R','V','R','H','C','O'},
						{'R','R','O','O','A','W','A','E','Z','R'},
						{'D','S','N','I','I','D','C','R','V','O'},
						{'A','S','D','G','N','H','I','R','N','L'},
						{'W','R','A','U','P','L','M','Y','J','L'},
						{'E','M','M','A','Y','U','I','C','D','A'},
						{'W','E','T','F','E','R','R','A','R','I'},
						{'P','O','R','S','C','H','E','W','Y','I'},
						{'A','F','H','N','I','S','S','A','N','O'}};
				
				
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
	    JButton b2=new JButton("Back");
	    boolean w1=true, w2=true, w3=true, w4=true, w5=true,w6=true,w7=true,w8=true,w9=true;
		
		public Vehicles2(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE -VEHICLES NAMES");
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
			 if (string.equalsIgnoreCase("FORD")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[1][0].setForeground(Color.GREEN);
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 				 
				 
				 w1=false;
				 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				} 
				
				
				}
				if(w2){
			 if (string.equalsIgnoreCase("TRAIN")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][4].setForeground(Color.GREEN);
				 objarray[1][4].setForeground(Color.GREEN);
				 objarray[2][4].setForeground(Color.GREEN);
				 objarray[3][4].setForeground(Color.GREEN);
				 objarray[4][4].setForeground(Color.GREEN);
				 				 
				 
				 w2=false;
				 
			 }
			 
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}	 
				
				
				}
			 if(w3){
			 if(string.equalsIgnoreCase("EMMA")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[6][0].setForeground(Color.RED);
				 objarray[6][1].setForeground(Color.RED);
				 objarray[6][2].setForeground(Color.RED);
				 objarray[6][3].setForeground(Color.RED);

				 
				 w3=false;
				 
				 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}		 
			 
			 }
			 if(w4){
			 if (string.equalsIgnoreCase("HONDA")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][2].setForeground(Color.orange);
				 objarray[2][2].setForeground(Color.orange);
				 objarray[3][2].setForeground(Color.orange);
				 objarray[4][2].setForeground(Color.orange);
				 objarray[5][2].setForeground(Color.orange);
				 
				 w4=false;
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			
			  
			 if(w5){
			 if (string.equalsIgnoreCase("FERRARI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[7][3].setForeground(Color.GREEN);
				 objarray[7][4].setForeground(Color.GREEN);
				 objarray[7][5].setForeground(Color.GREEN);
				 objarray[7][6].setForeground(Color.GREEN);
				 objarray[7][7].setForeground(Color.GREEN);
				 objarray[7][8].setForeground(Color.GREEN);
				 objarray[7][9].setForeground(Color.GREEN);
				 
				 w5=false;
				 
				 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 }
			
			 if(w6){
			 if (string.equalsIgnoreCase("COROLLA")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.PINK);
				 objarray[1][9].setForeground(Color.PINK);
				 objarray[2][9].setForeground(Color.PINK);
				 objarray[3][9].setForeground(Color.PINK);
				 objarray[4][9].setForeground(Color.PINK);
				 objarray[5][9].setForeground(Color.PINK);
				 objarray[6][9].setForeground(Color.PINK);
				 w6=false;
		
								 
				 
				 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 }
			 if(w7){
			 if (string.equalsIgnoreCase("CHERRY")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][7].setForeground(Color.YELLOW);
				 objarray[1][7].setForeground(Color.YELLOW);
				 objarray[2][7].setForeground(Color.YELLOW);
				 objarray[3][7].setForeground(Color.YELLOW);
				 objarray[4][7].setForeground(Color.YELLOW);
				 objarray[5][7].setForeground(Color.YELLOW);
			
				 w7=false;
				 }
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			 if(w8){
			 if (string.equalsIgnoreCase("PORSCHE")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][0].setForeground(Color.YELLOW);
				 objarray[8][1].setForeground(Color.YELLOW);
				 objarray[8][2].setForeground(Color.YELLOW);
				 objarray[8][3].setForeground(Color.YELLOW);
				 objarray[8][4].setForeground(Color.YELLOW);
				 objarray[8][5].setForeground(Color.YELLOW);
				 objarray[8][6].setForeground(Color.YELLOW);
				
			
				 w8=false;
				 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 
			 }
			 if(w9){
			 if (string.equalsIgnoreCase("NISSAN")){
					
				 t.setText("");
				  i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][3].setForeground(Color.BLUE);
				 objarray[9][4].setForeground(Color.BLUE);
				 objarray[9][5].setForeground(Color.BLUE);
				 objarray[9][6].setForeground(Color.BLUE);
				 objarray[9][7].setForeground(Color.BLUE);
				 objarray[9][8].setForeground(Color.BLUE);
				 
			
w9=false;
				 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("NISSAN")&&!string.equalsIgnoreCase("FERRARI")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("TRAIN")&&!string.equalsIgnoreCase("COROLLA")&&!string.equalsIgnoreCase("PORSCHE"))
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
			Vehicles2 puzz=new Vehicles2();
		
		
	}}

