
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

public class Animal2_3 extends Sound implements ActionListener 
{
	char a[][]={
			{'M','O','L','E','S','B','A','Q','E','T'},
			{'I','G','T','U','R','T','L','E','H','I'},
			{'C','D','J','S','H','A','R','K','A','G'},
			{'A','J','P','A','R','P','O','T','R','E'},
			{'M','R','L','M','O','R','O','I','K','R'},
			{'E','A','M','S','N','A','K','E','K','O'},
			{'L','H','I','E','I','U','I','P','E','O'},
			{'O','R','S','M','D','I','J','L','I','H'},
			{'L','R','P','A','R','R','O','T','J','O'},
			{'T','U','R','T','L','E','P','Q','K','O'},
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
	
	public Animal2_3(){
		
		font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE-Animals");
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
			
		 if (string.equals("camel")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][0].setForeground(Color.RED);
			 objarray[3][0].setForeground(Color.RED);
			 objarray[4][0].setForeground(Color.RED);
			 objarray[5][0].setForeground(Color.RED);
			 objarray[6][0].setForeground(Color.RED);

			 		 
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
						{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("parrot"))

		 {
			 t.setText("");
            i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[8][2].setForeground(Color.orange);
			 objarray[8][3].setForeground(Color.orange);
			 objarray[8][4].setForeground(Color.orange);
			 objarray[8][5].setForeground(Color.orange);
			 objarray[8][6].setForeground(Color.orange);
			 objarray[8][7].setForeground(Color.orange);
			 
				 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
									{
	t.setText("");
	PlayWrongSound();
	}
				 } 
	
			 
			 
		if(w3)
		{
			if (string.equalsIgnoreCase("turtle")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
			 objarray[9][0].setForeground(Color.PINK);
			 objarray[9][1].setForeground(Color.PINK);
			 objarray[9][2].setForeground(Color.PINK);
			 objarray[9][3].setForeground(Color.PINK);
			 objarray[9][4].setForeground(Color.PINK);
			 objarray[9][5].setForeground(Color.PINK);
			
		w3=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
									{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("snake")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[5][3].setForeground(Color.CYAN);
			 objarray[5][4].setForeground(Color.CYAN);
			 objarray[5][5].setForeground(Color.CYAN);
			 objarray[5][6].setForeground(Color.CYAN);
			 objarray[5][7].setForeground(Color.CYAN);
			 
		w4=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
									 {
				 t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("mole")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][0].setForeground(Color.GREEN);
			 objarray[0][1].setForeground(Color.GREEN);
			 objarray[0][2].setForeground(Color.GREEN);
			 objarray[0][3].setForeground(Color.GREEN);
				 
		 w5=false;
		 }else if
		 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
							{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("tiger")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][9].setForeground(Color.YELLOW);
			 objarray[1][9].setForeground(Color.YELLOW);
			 objarray[2][9].setForeground(Color.YELLOW);
			 objarray[3][9].setForeground(Color.YELLOW);
			 objarray[4][9].setForeground(Color.YELLOW);
			
			 w6=false;
		 }else if
		 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
										{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
			 
			 
		 if(w7)
		 {
			 
		 
		
		 
		 if (string.equalsIgnoreCase("shark")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][3].setForeground(Color.YELLOW);
			 objarray[2][4].setForeground(Color.YELLOW);
			 objarray[2][5].setForeground(Color.YELLOW);
			 objarray[2][6].setForeground(Color.YELLOW);
			 objarray[2][7].setForeground(Color.YELLOW);
				 w7=false;
		 }else if
		 (!string.equalsIgnoreCase("camel")&&!string.equalsIgnoreCase("parrot")&&!string.equalsIgnoreCase("turtle")&&!string.equalsIgnoreCase("snake")&&!string.equalsIgnoreCase("mole")&&!string.equalsIgnoreCase("tiger")&&!string.equalsIgnoreCase("shark"))
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
		Animal2_3 puzz=new Animal2_3();
		}

	
	
}
