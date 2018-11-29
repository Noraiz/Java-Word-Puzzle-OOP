

import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class Vehicles1 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'E','Y','I','H','O','N','D','A','L','P'},
						{'B','M','P','K','I','O','C','R','S','O'},
						{'O','R','M','T','L','P','H','O','F','R'},
						{'N','W','A','A','O','U','E','M','O','S'},
						{'D','V','M','A','O','N','R','E','R','C'},
						{'X','O','C','B','N','V','R','O','D','H'},
						{'T','X','O','T','W','L','Y','R','A','E'},
						{'L','U','D','I','O','B','E','R','L','W'},
						{'S','U','Z','U','K','I','E','O','M','E'},
						{'T','I','T','A','N','I','C','B','N','E'}};
				
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

		
		public Vehicles1(){
			
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
			 if (string.equalsIgnoreCase("HONDA")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][3].setForeground(Color.GREEN);
				 objarray[0][4].setForeground(Color.GREEN);
				 objarray[0][5].setForeground(Color.GREEN);
				 objarray[0][6].setForeground(Color.GREEN);
				 objarray[0][7].setForeground(Color.GREEN);
				 
				w1=false; 
				 
				 
			 }
			 
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
			
}
if(w2){
			 if(string.equalsIgnoreCase("EMMA")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][0].setForeground(Color.RED);
				 objarray[1][1].setForeground(Color.RED);
				 objarray[2][2].setForeground(Color.RED);
				 objarray[3][3].setForeground(Color.RED);

				 
				w2=false; 
				 
				 
				 
			 }
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
						 

}
if(w3){
			 if (string.equalsIgnoreCase("CHERRY")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][6].setForeground(Color.orange);
				 objarray[2][6].setForeground(Color.orange);
				 objarray[3][6].setForeground(Color.orange);
				 objarray[4][6].setForeground(Color.orange);
				 objarray[5][6].setForeground(Color.orange);
				 objarray[6][6].setForeground(Color.orange);
				 
				w3=false; 
			 }
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
						 


}
			 if(w4){
			 if (string.equalsIgnoreCase("BMW")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][7].setForeground(Color.PINK);
				 objarray[8][8].setForeground(Color.PINK);
				 objarray[7][9].setForeground(Color.PINK);
				
				w4=false; 
				 
			 }
			 
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
			
			 
			 }
			  if(w5){
			 			 
			 if (string.equalsIgnoreCase("SUZUKI")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[8][0].setForeground(Color.GREEN);
				 objarray[8][1].setForeground(Color.GREEN);
				 objarray[8][2].setForeground(Color.GREEN);
				 objarray[8][3].setForeground(Color.GREEN);
				 objarray[8][4].setForeground(Color.GREEN);
				 objarray[8][5].setForeground(Color.GREEN);
				 
				 
				w5=false; 
				 
				 
			 }
			 
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
			
			  
			  }
			if(w6){
			 
			 if (string.equalsIgnoreCase("FORD")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][8].setForeground(Color.YELLOW);
				 objarray[3][8].setForeground(Color.YELLOW);
				 objarray[4][8].setForeground(Color.YELLOW);
				 objarray[5][8].setForeground(Color.YELLOW);
		
								 
				w6=false; 
				 
			 }
				
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
			 
			
			
			}
			if(w7){
			 if (string.equalsIgnoreCase("PORSCHE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[0][9].setForeground(Color.YELLOW);
				 objarray[1][9].setForeground(Color.YELLOW);
				 objarray[2][9].setForeground(Color.YELLOW);
				 objarray[3][9].setForeground(Color.YELLOW);
				 objarray[4][9].setForeground(Color.YELLOW);
				 objarray[5][9].setForeground(Color.YELLOW);
				 objarray[6][9].setForeground(Color.YELLOW);
				 

				w7=false;				 
				 
				 
			 }
			 
			
			 else 
				 if
					 (!string.equalsIgnoreCase("HONDA")&&!string.equalsIgnoreCase("EMMA")&&!string.equalsIgnoreCase("CHERRY")&&!string.equalsIgnoreCase("BMW")&&!string.equalsIgnoreCase("SUZUKI")&&!string.equalsIgnoreCase("FORD")&&!string.equalsIgnoreCase("PORSCHE"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			
			
			
			
			}
			 
			 	
			
			
			 else
			t.setText("");
			 
			 if (i==70)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
		}
		public static void main(String [] args){
			Vehicles1 puzz=new Vehicles1();
		
		
	}}

