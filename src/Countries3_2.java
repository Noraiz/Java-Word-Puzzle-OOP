
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

public class Countries3_2 extends Sound implements ActionListener 
{
	char a[][]={
			{'C','H','I','L','E','N','X','E','I','P'},
			{'T','G','O','L','H','R','E','L','R','E'},
			{'B','R','A','Z','I','L','B','V','E','R'},
			{'R','J','A','O','L','F','O','D','L','U'},
			{'I','R','E','L','A','N','D','G','A','I'},
			{'E','A','D','M','M','A','L','N','M','L'},
			{'P','O','L','A','N','D','K','G','A','U'},
			{'X','R','T','L','P','E','R','U','L','I'},
			{'R','A','C','C','O','O','N','P','T','N'},
			{'T','U','R','K','E','Y','T','S','A','O'},

			
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

	
	public Countries3_2(){
		
		font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE-COUNTRIES");
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
			
		 if (string.equals("turkey")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[9][0].setForeground(Color.GREEN);
			 objarray[9][1].setForeground(Color.GREEN);
			 objarray[9][2].setForeground(Color.GREEN);
			 objarray[9][3].setForeground(Color.GREEN);
			 objarray[9][4].setForeground(Color.GREEN);
			 objarray[9][5].setForeground(Color.GREEN);
			 
			 		 
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
	{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("poland"))

		 {
			 t.setText("");
             i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[6][0].setForeground(Color.RED);
			 objarray[6][1].setForeground(Color.RED);
			 objarray[6][2].setForeground(Color.RED);
			 objarray[6][3].setForeground(Color.RED);
			 objarray[6][4].setForeground(Color.RED);
			 objarray[6][5].setForeground(Color.RED);
			 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
				{
	t.setText("");
	PlayWrongSound();
	}
				 } 
	
			 
			 
		if(w3)
		{
			if (string.equalsIgnoreCase("chile")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
			 objarray[0][0].setForeground(Color.orange);
			 objarray[0][1].setForeground(Color.orange);
			 objarray[0][2].setForeground(Color.orange);
			 objarray[0][3].setForeground(Color.orange);
			 objarray[0][4].setForeground(Color.orange);
		w3=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
					{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("ireland")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[4][0].setForeground(Color.PINK);
			 objarray[4][1].setForeground(Color.PINK);
			 objarray[4][2].setForeground(Color.PINK);
			 objarray[4][3].setForeground(Color.PINK);
			 objarray[4][4].setForeground(Color.PINK);
			 objarray[4][5].setForeground(Color.PINK);
			 objarray[4][6].setForeground(Color.PINK);
		w4=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
					 {
				 t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("brazil")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][0].setForeground(Color.CYAN);
			 objarray[2][1].setForeground(Color.CYAN);
			 objarray[2][2].setForeground(Color.CYAN);
			 objarray[2][3].setForeground(Color.CYAN);
			 objarray[2][4].setForeground(Color.CYAN);
			 objarray[2][5].setForeground(Color.CYAN);

	 
		 w5=false;
		 }else if
		 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
					{
	t.setText("");
	PlayWrongSound();
	}
				}
 
			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("peru")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][9].setForeground(Color.GREEN);
			 objarray[1][9].setForeground(Color.GREEN);
			 objarray[2][9].setForeground(Color.GREEN);
			 objarray[3][9].setForeground(Color.GREEN);
			 
		
			 w6=false;
		 }else if
		 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
				{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
			 
			 
		 if(w7)
		 {
			 
		 
		
		 
		 if (string.equalsIgnoreCase("malta")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[5][8].setForeground(Color.YELLOW);
			 objarray[6][8].setForeground(Color.YELLOW);
			 objarray[7][8].setForeground(Color.YELLOW);
			 objarray[8][8].setForeground(Color.YELLOW);
			 objarray[9][8].setForeground(Color.YELLOW);
			 w7=false;
		 }else if
		 (!string.equalsIgnoreCase("turkey")&&!string.equalsIgnoreCase("poland")&&!string.equalsIgnoreCase("chile")&&!string.equalsIgnoreCase("ireland")&&!string.equalsIgnoreCase("brazil")&&!string.equalsIgnoreCase("peru")&&!string.equalsIgnoreCase("malta"))
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
		Countries3_2 puzz=new Countries3_2();
}
	
}
