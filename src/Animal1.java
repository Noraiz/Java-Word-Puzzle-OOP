
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animal1 extends Sound implements ActionListener 
{
	char a[][]={

{'A','O','W','M','O','N','K','E','Y','R'},
			{'E','G','W','L','E','R','E','L','E','U'},
			{'A','L','W','W','E','R','B','V','Y','P'},
			{'G','J','I','O','A','F','O','D','I','E'},
			{'L','R','C','R','E','R','W','G','H','N'},
			{'E','A','T','M','M','A','L','N','Y','G'},
			{'N','H','E','L','F','R','O','G','Y','U'},
			{'X','R','T','L','E','C','A','T','C','I'},
			{'R','A','C','C','O','O','N','P','K','N'},
			{'Y','K','W','L','O','U','T','S','Y','O'},

			
			};
	Integer i=0;
	JComboBox box;
	boolean w1=true, w2=true, w3=true, w4=true, w5=true, w6=true;
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

	
	public Animal1(){
		
		font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE-Animals");
		p=new JPanel();
		p1=new JPanel();
		l=new JLabel();
		t=new JTextField(20);
		check=new JLabel("SCORE:");
		p.setLayout(new GridLayout(10,10));
		bt1=new JButton("Enter");
		f.add(p);
		p1.add(b2);
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
			
		 if (string.equals("eagle")){
			
			 t.setText("");
			 i+=10;
			 check.setText("Score:"+i.toString());
			
			 objarray[1][0].setForeground(Color.GREEN);
			 objarray[2][0].setForeground(Color.GREEN);
			 objarray[3][0].setForeground(Color.GREEN);
			 objarray[4][0].setForeground(Color.GREEN);
			 objarray[5][0].setForeground(Color.GREEN);
			  
			 		 
			 w1=false;
			 
		 }
		 else if
		 (!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
						{
			 t.setText("");
				PlayWrongSound();
			
	}}
		 if(w2)
		 {
			 
			 if(string.equalsIgnoreCase("monkey"))

		 {
			 t.setText("");
            i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[0][3].setForeground(Color.RED);
			 objarray[0][4].setForeground(Color.RED);
			 objarray[0][5].setForeground(Color.RED);
			 objarray[0][6].setForeground(Color.RED);
			 objarray[0][7].setForeground(Color.RED);
			 objarray[0][8].setForeground(Color.RED);
		 
				 w2=false;
		  }else if
		 (!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
										{
	t.setText("");
	PlayWrongSound();
	}
		} 
	
			 
			 
		
		  if(w3)
		{
			if (string.equalsIgnoreCase("frog")){
				 t.setText("");
				 i=i+10;
				
		 
		 	 check.setText("Score:"+i.toString());
		 	 objarray[6][4].setForeground(Color.orange);
			 objarray[6][5].setForeground(Color.orange);
			 objarray[6][6].setForeground(Color.orange);
			 objarray[6][7].setForeground(Color.orange);
				 
		w3=false;
			 
			 }else if
			(!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
										{
		t.setText("");
		PlayWrongSound();
		}
					}
	
		
		
		if(w4)
		{
			if (string.equalsIgnoreCase("owl")){
				 t.setText("");
				 i=i+10;
			
				 
		
			 check.setText("Score:"+i.toString());
			 objarray[3][6].setForeground(Color.PINK);
			 objarray[4][6].setForeground(Color.PINK);
			 objarray[5][6].setForeground(Color.PINK);
			
		w4=false;
			 
			 }else if
			(!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
										 {
				 t.setText("");
		PlayWrongSound();
		}
					}
	
			 
			 
		 
		  if(w5)
		  {
			  
		  
		 if (string.equalsIgnoreCase("worm")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][3].setForeground(Color.CYAN);
			 objarray[3][3].setForeground(Color.CYAN);
			 objarray[4][3].setForeground(Color.CYAN);
			 objarray[5][3].setForeground(Color.CYAN);
		
		 w5=false;
		 }else if
		 (!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
						{
	t.setText("");
	PlayWrongSound();
	}
				}

			 
		 if(w6)
		 {
		 
		 if (string.equalsIgnoreCase("penguin")){
				
			 t.setText("");
			  i+=10;
			 check.setText("Score:"+i.toString());
			 objarray[2][9].setForeground(Color.GREEN);
			 objarray[3][9].setForeground(Color.GREEN);
			 objarray[4][9].setForeground(Color.GREEN);
			 objarray[5][9].setForeground(Color.GREEN);
			 objarray[6][9].setForeground(Color.GREEN);
			 objarray[7][9].setForeground(Color.GREEN);
			 objarray[8][9].setForeground(Color.GREEN);
			 
			 w6=false;
		 }else if
		 (!string.equalsIgnoreCase("eagle")&&!string.equalsIgnoreCase("monkey")&&!string.equalsIgnoreCase("frog")&&!string.equalsIgnoreCase("owl")&&!string.equalsIgnoreCase("worm")&&!string.equalsIgnoreCase("penguin"))
											{
	t.setText("");
	PlayWrongSound();
	}
				}
	
		
		
		
	 if (i==60)
	 {
		
		 PlayWinSound();
	 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
	 stop();
	 }
	 
}
	
}
