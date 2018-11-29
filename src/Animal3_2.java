
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

public class Animal3_2 extends Sound implements ActionListener 
{
	char a[][]=
		{
			{'D','O','L','P','H','I','N','G','Y','H'},
			{'G','G','W','L','E','C','E','L','Y','E'},
			{'B','L','Z','B','R','H','B','V','B','D'},
			{'E','J','E','E','A','E','R','D','A','G'},
			{'E','R','G','A','E','Y','L','G','T','E'},
			{'L','A','R','R','M','T','A','N','Y','H'},
			{'S','H','A','L','E','A','A','T','Y','O'},
			{'C','R','O','W','E','H','A','T','C','G'},
			{'C','Y','I','F','K','E','P','P','Y','O'},
			{'Z','E','B','R','A','U','C','R','Y','W'},
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
	
	public Animal3_2(){
		
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
			
		 if (string.equals("hedgehog")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][9].setForeground(Color.GREEN);
			 objarray[1][9].setForeground(Color.GREEN);
			 objarray[2][9].setForeground(Color.GREEN);
			 objarray[3][9].setForeground(Color.GREEN);
			 objarray[4][9].setForeground(Color.GREEN);
			 objarray[5][9].setForeground(Color.GREEN);
			 objarray[7][9].setForeground(Color.GREEN);
			 objarray[7][9].setForeground(Color.GREEN);
		 
			 		 
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
				{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("zebra"))

		 {
			 t.setText("");
            i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[9][0].setForeground(Color.RED);
			 objarray[9][1].setForeground(Color.RED);
			 objarray[9][2].setForeground(Color.RED);
			 objarray[9][3].setForeground(Color.RED);
			 objarray[9][4].setForeground(Color.RED);
			 
				 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
						{
	t.setText("");
	PlayWrongSound();
	}
				 } 
	
			 
			 
		if(w3)
		{
			if (string.equalsIgnoreCase("bat")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
			 objarray[2][8].setForeground(Color.orange);
			 objarray[3][8].setForeground(Color.orange);
			 objarray[4][8].setForeground(Color.orange);
			 
		 
		w3=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
							{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("bear")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[2][3].setForeground(Color.PINK);
			 objarray[3][3].setForeground(Color.PINK);
			 objarray[4][3].setForeground(Color.PINK);
			 objarray[5][3].setForeground(Color.PINK);
			 	 
		w4=false;
			 
			 }else if
			 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
							 {
				 t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("eel")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[3][0].setForeground(Color.CYAN);
			 objarray[4][0].setForeground(Color.CYAN);
			 objarray[5][0].setForeground(Color.CYAN);
			 
		 w5=false;
		 }else if
		 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
					{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("crow")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[7][0].setForeground(Color.GREEN);
			 objarray[7][1].setForeground(Color.GREEN);
			 objarray[7][2].setForeground(Color.GREEN);
			 objarray[7][3].setForeground(Color.GREEN);
			
			
			 w6=false;
		 }else if
		 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
							{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
			 
			 
		 if(w7)
		 {
			 
		 
		
		 
		 if (string.equalsIgnoreCase("dolphin")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][0].setForeground(Color.blue);
			 objarray[0][1].setForeground(Color.blue);
			 objarray[0][2].setForeground(Color.blue);
			 objarray[0][3].setForeground(Color.blue);
			 objarray[0][4].setForeground(Color.blue);
			 objarray[0][5].setForeground(Color.GRAY);
			 objarray[0][6].setForeground(Color.GRAY);
				 
		w7=false;
		 }else if
		 (!string.equalsIgnoreCase("hedgehog")&&!string.equalsIgnoreCase("zebra")&&!string.equalsIgnoreCase("bat")&&!string.equalsIgnoreCase("bear")&&!string.equalsIgnoreCase("eel")&&!string.equalsIgnoreCase("crow")&&!string.equalsIgnoreCase("dolphin"))
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
		Animal3_2 puzz=new Animal3_2();
		}

	
}
