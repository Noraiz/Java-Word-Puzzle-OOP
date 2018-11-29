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


public class PuzzleWord extends Sound implements ActionListener
{
	
	char a[][]={
			{'a','p','p','l','e'},
			{'a','b', 'h', 'n' , 't'},
			{'n', 'g', 'j', 'e','k' },
			{'t', 'g', 'o', 'a','t'}
			};
	Integer i=0;
	JComboBox box;
	boolean w1=true, w2=true, w3=true;
	int counter=0;
	Color c;
	Font font;
	JFrame f;
	JPanel p;
	JPanel p1;
	JLabel l;
	JTextField t;
	JButton bt1;
	JButton b2;
	String string;
	JLabel check;
	JLabel [][] objarray=new JLabel [4][5];  
	
	public PuzzleWord(){

	font=new Font("SansSerif", Font.BOLD, 28);
	f=new JFrame("WORD PUZZLE");
	p=new JPanel();
	p1=new JPanel();
	l=new JLabel();
	t=new JTextField(20);
	check=new JLabel("SCORE:");
	p.setLayout(new GridLayout(4,5));
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
		 if (string.equalsIgnoreCase("apple"))
		 {
			 i+=10;
			 t.setText("");
			 check.setText("Score:"+((i).toString()));
			 objarray[0][0].setForeground(Color.GREEN);
			 objarray[0][1].setForeground(Color.GREEN);
			 objarray[0][2].setForeground(Color.GREEN);
			 objarray[0][3].setForeground(Color.GREEN);
			 objarray[0][4].setForeground(Color.GREEN);
			 w1=false;
			 } 
		 else 
			 if
				 (!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("Ant")&&!string.equalsIgnoreCase("goat"))
			 {
			t.setText("");
			PlayWrongSound();
			}
		 
		       } 
					
		  		
				if(w2)
				{
		 if(string.equalsIgnoreCase("ant"))
		 {
			 t.setText("");
			 i=i+10;
			 check.setText("Score:"+i.toString());
			 objarray[1][0].setForeground(Color.RED);
			 objarray[2][0].setForeground(Color.RED);
			 objarray[3][0].setForeground(Color.RED);
			 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("Ant")&&!string.equalsIgnoreCase("goat"))
	{
	t.setText("");
	PlayWrongSound();
	}
				 } 
				if(w3){
		 if (string.equalsIgnoreCase("goat")){
			 t.setText("");
			 i=i+10;
			
			 check.setText("Score:"+i.toString());
			 objarray[3][1].setForeground(Color.orange);
			 objarray[3][2].setForeground(Color.orange);
			 objarray[3][3].setForeground(Color.orange);
			 objarray[3][4].setForeground(Color.orange);
			 w3=false;
			 
		 }else if
		 (!string.equalsIgnoreCase("Apple")&&!string.equalsIgnoreCase("Ant")&&!string.equalsIgnoreCase("goat"))
	{
	t.setText("");
	PlayWrongSound();
	}
				}
		 
			 
		 
		 if (i==30)
		 {
			
			 PlayWinSound();
		 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
		 stop();
		 }
		 
	}
	
	
	
	
}
