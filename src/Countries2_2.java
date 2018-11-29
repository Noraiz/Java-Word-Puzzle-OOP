
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

public class Countries2_2 extends Sound implements ActionListener 
{
	char a[][]={
			{'I','O','N','O','R','W','A','Y','Y','N'},
			{'R','G','W','L','E','G','E','U','N','E'},
			{'A','L','W','W','E','Y','B','S','R','P'},
			{'N','J','I','O','A','P','O','S','U','A'},
			{'L','R','C','R','E','T','W','I','S','L'},
			{'P','A','K','I','S','T','A','N','S','G'},
			{'N','H','E','L','F','R','O','G','I','U'},
			{'X','E','E','G','Y','P','T','D','A','I'},
			{'R','A','C','C','O','O','N','P','K','N'},
			{'E','N','G','L','A','N','D','N','Y','O'},	
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
	
	public Countries2_2(){
		
		font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE-Countries");
		p=new JPanel();p1.add(b2);
		p1=new JPanel();
		l=new JLabel();
		t=new JTextField(20);
		check=new JLabel("SCORE:");
		p.setLayout(new GridLayout(10,10));
		bt1=new JButton("Enter");
		f.add(p);
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
			
		 if (string.equals("pakistan")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[5][0].setForeground(Color.GREEN);
			 objarray[5][1].setForeground(Color.GREEN);
			 objarray[5][2].setForeground(Color.GREEN);
			 objarray[5][3].setForeground(Color.GREEN);
			 objarray[5][4].setForeground(Color.GREEN);
			 objarray[5][5].setForeground(Color.GREEN);
			 objarray[5][6].setForeground(Color.GREEN);
			 objarray[5][7].setForeground(Color.GREEN);
						 
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))
	{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("england"))

		 {
			 t.setText("");
             i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[9][0].setForeground(Color.RED);
			 objarray[9][1].setForeground(Color.RED);
			 objarray[9][2].setForeground(Color.RED);
			 objarray[9][3].setForeground(Color.RED);
			 objarray[9][4].setForeground(Color.RED);
			 objarray[9][5].setForeground(Color.RED);
			 objarray[9][6].setForeground(Color.RED);
		 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))
	{
	t.setText("");
	PlayWrongSound();
	}
				 } 
	
			 
			 
		if(w3)
		{
			if (string.equalsIgnoreCase("nepal")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
			 objarray[0][9].setForeground(Color.orange);
			 objarray[1][9].setForeground(Color.orange);
			 objarray[2][9].setForeground(Color.orange);
			 objarray[3][9].setForeground(Color.orange);
			 objarray[4][9].setForeground(Color.orange);
			 w3=false;
			 
			 }else if
			(!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))
		{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("egypt")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[7][2].setForeground(Color.PINK);
			 objarray[7][3].setForeground(Color.PINK);
			 objarray[7][4].setForeground(Color.PINK);
			 objarray[7][5].setForeground(Color.PINK);
			 objarray[7][6].setForeground(Color.PINK);
			 w4=false;
			 
			 }else if
			(!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran")){
		t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("russia")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][8].setForeground(Color.CYAN);
			 objarray[3][8].setForeground(Color.CYAN);
			 objarray[4][8].setForeground(Color.CYAN);
			 objarray[5][8].setForeground(Color.CYAN);
			 objarray[6][8].setForeground(Color.CYAN);
			 objarray[7][8].setForeground(Color.CYAN);
			 w5=false;
		 }else if
		 (!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))
	{
	t.setText("");
	PlayWrongSound();
	}
				}
 
			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("norway")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][2].setForeground(Color.GREEN);
			 objarray[0][3].setForeground(Color.GREEN);
			 objarray[0][4].setForeground(Color.GREEN);
			 objarray[0][5].setForeground(Color.GREEN);
			 objarray[0][6].setForeground(Color.GREEN);
			 objarray[0][7].setForeground(Color.GREEN);
				w6=false;
		 }else if
		 (!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))
	{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
			 
			 
		 if(w7)
		 {
			 
		 
		
		 
		 if (string.equalsIgnoreCase("iran")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][0].setForeground(Color.YELLOW);
			 objarray[1][0].setForeground(Color.YELLOW);
			 objarray[2][0].setForeground(Color.YELLOW);
			 objarray[3][0].setForeground(Color.YELLOW);
			 w7=false;
		 }else if
		 (!string.equalsIgnoreCase("norway")&&!string.equalsIgnoreCase("pakistan")&&!string.equalsIgnoreCase("egypt")&&!string.equalsIgnoreCase("nepal")&&!string.equalsIgnoreCase("england")&&!string.equalsIgnoreCase("russia")&&!string.equalsIgnoreCase("iran"))

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
		Countries2_2 puzz=new Countries2_2();
}
	
}
