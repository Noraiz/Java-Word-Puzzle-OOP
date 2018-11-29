
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

public class Animal3 extends Sound implements ActionListener 
{
	char a[][]={
			{'H','E','D','G','E','H','O','G','Y','D'},
			{'G','G','W','L','E','C','E','L','Y','O'},
			{'B','L','Z','L','R','H','B','V','Y','L'},
			{'A','J','E','L','A','E','R','D','I','P'},
			{'T','R','B','L','E','E','L','G','Y','H'},
			{'B','A','R','S','M','T','A','N','Y','I'},
			{'S','H','A','L','E','A','A','T','Y','N'},
			{'G','R','T','L','E','H','A','T','C','H'},
			{'C','Y','I','F','K','E','P','P','Y','O'},
			{'B','E','A','R','O','U','C','R','O','W'},
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

	
	public Animal3(){
		
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
			 objarray[0][0].setForeground(Color.GREEN);
			 objarray[0][1].setForeground(Color.GREEN);
			 objarray[0][2].setForeground(Color.GREEN);
			 objarray[0][3].setForeground(Color.GREEN);
			 objarray[0][4].setForeground(Color.GREEN);
			 objarray[0][5].setForeground(Color.GREEN);
			 objarray[0][6].setForeground(Color.GREEN);
			 objarray[0][7].setForeground(Color.GREEN);
			 
			 		 
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
			 objarray[2][2].setForeground(Color.RED);
			 objarray[3][2].setForeground(Color.RED);
			 objarray[4][2].setForeground(Color.RED);
			 objarray[5][2].setForeground(Color.RED);
			 objarray[6][2].setForeground(Color.RED);
		 
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
			 objarray[2][0].setForeground(Color.orange);
			 objarray[3][0].setForeground(Color.orange);
			 objarray[4][0].setForeground(Color.orange);
		 
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
			 objarray[9][0].setForeground(Color.PINK);
			 objarray[9][1].setForeground(Color.PINK);
			 objarray[9][2].setForeground(Color.PINK);
			 objarray[9][3].setForeground(Color.PINK);
			 	 
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
			 objarray[4][4].setForeground(Color.CYAN);
			 objarray[4][5].setForeground(Color.CYAN);
			 objarray[4][6].setForeground(Color.CYAN);
			 
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
			 objarray[9][6].setForeground(Color.GREEN);
			 objarray[9][7].setForeground(Color.GREEN);
			 objarray[9][8].setForeground(Color.GREEN);
			 objarray[9][9].setForeground(Color.GREEN);
			
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
			 objarray[0][9].setForeground(Color.ORANGE);
			 objarray[1][9].setForeground(Color.ORANGE);
			 objarray[2][9].setForeground(Color.ORANGE);
			 objarray[3][9].setForeground(Color.ORANGE);
			 objarray[4][9].setForeground(Color.ORANGE);
			 objarray[5][9].setForeground(Color.ORANGE);
			 objarray[6][9].setForeground(Color.ORANGE);
				 
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
		Animal3 puzz=new Animal3();
		}

	
}
