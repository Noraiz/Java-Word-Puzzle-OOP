
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

public class Countries1_2 extends Sound implements ActionListener 
{
	
	
	

	char a[][]={
			{'S','A','C','C','O','O','N','O','N','F'},
			{'P','G','W','I','N','D','I','A','E','R'},
			{'A','L','W','W','E','R','F','V','Y','A'},
			{'I','W','U','R','A','F','R','D','I','N'},
			{'N','O','S','M','E','R','O','G','T','C'},
			{'E','R','A','K','M','A','G','N','A','E'},
			{'N','M','E','C','H','I','N','A','L','U'},
			{'X','R','T','E','A','G','L','E','Y','I'},
			{'M','O','N','K','O','Y','N','P','E','N'},
			{'P','E','C','A','N','A','D','A','Y','O'},
			

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

	
	public Countries1_2(){
		
		font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE-COUNRTRIES");
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
			
		 if (string.equals("italy")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[3][8].setForeground(Color.GREEN);
			 objarray[4][8].setForeground(Color.GREEN);
			 objarray[5][8].setForeground(Color.GREEN);
			 objarray[6][8].setForeground(Color.GREEN);
			 objarray[7][8].setForeground(Color.GREEN);
			
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
	{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("spain"))

		 {
			 t.setText("");
            i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][0].setForeground(Color.RED);
			 objarray[1][0].setForeground(Color.RED);
			 objarray[2][0].setForeground(Color.RED);
			 objarray[3][0].setForeground(Color.RED);
			 objarray[4][0].setForeground(Color.RED);
			 
		w2=false;
		  }else if
		 (!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
					{
	t.setText("");
	PlayWrongSound();
	}
				 } 
	
			 
			 
		if(w3)
		{
			if (string.equalsIgnoreCase("canada")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
			 objarray[9][2].setForeground(Color.orange);
			 objarray[9][3].setForeground(Color.orange);
			 objarray[9][4].setForeground(Color.orange);
			 objarray[9][5].setForeground(Color.orange);
			 objarray[9][6].setForeground(Color.orange);
			 objarray[9][7].setForeground(Color.orange);
			 
			 w3=false;
			 
			 }else if
			(!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
					{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("india")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[1][3].setForeground(Color.PINK);
			 objarray[1][4].setForeground(Color.PINK);
			 objarray[1][5].setForeground(Color.PINK);
			 objarray[1][6].setForeground(Color.PINK);
			 objarray[1][7].setForeground(Color.PINK);
			 w4=false;
			 
			 }else if
			(!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
			 {	
				 t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("france")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][9].setForeground(Color.CYAN);
			 objarray[1][9].setForeground(Color.CYAN);
			 objarray[2][9].setForeground(Color.CYAN);
			 objarray[3][9].setForeground(Color.CYAN);
			 objarray[4][9].setForeground(Color.CYAN);
			 objarray[5][9].setForeground(Color.CYAN);
			  w5=false;
		 }else if
		 (!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
				{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("china")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[6][3].setForeground(Color.GREEN);
			 objarray[6][4].setForeground(Color.GREEN);
			 objarray[6][5].setForeground(Color.GREEN);
			 objarray[6][6].setForeground(Color.GREEN);
			 objarray[6][7].setForeground(Color.GREEN);
		w6=false;
		 }else if
		 (!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
				{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
			 
			 
		 if(w7)
		 {
			 
		 
		
		 
		 if (string.equalsIgnoreCase("usa")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[3][2].setForeground(Color.YELLOW);
			 objarray[4][2].setForeground(Color.YELLOW);
			 objarray[5][2].setForeground(Color.YELLOW);
			 	 
			 w7=false;
		 }else if
		 (!string.equalsIgnoreCase("italy")&&!string.equalsIgnoreCase("spain")&&!string.equalsIgnoreCase("canada")&&!string.equalsIgnoreCase("india")&&!string.equalsIgnoreCase("france")&&!string.equalsIgnoreCase("china")&&!string.equalsIgnoreCase("usa"))
				
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
		Countries1_2 puzz=new Countries1_2();
}
}
