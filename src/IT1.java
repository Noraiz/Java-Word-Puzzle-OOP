import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
	public class IT1 extends Sound implements ActionListener 
	{
		
				char a[][]={
						{'A','A','J','R','U','D','E','A','U','P'},
						{'N','Z','U','K','E','R','B','E','R','G'},
						{'D','R','A','P','P','L','E','Y','F','O'},
						{'R','J','I','I','O','U','D','A','O','O'},
						{'O','O','N','A','N','N','I','H','A','G'},
						{'I','B','P','B','N','N','O','O','D','L'},
						{'D','S','I','T','W','L','R','O','I','E'},
						{'N','U','N','A','N','D','R','O','I','D'},
						{'T','I','M','C','O','O','K','O','M','E'},
						{'O','G','A','T','E','S','G','J','A','N'}};
				
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
	    boolean w1=true,w2=true,w3=true,w4=true,w5=true,w6=true,w7=true,w8=true;
	    JButton b2=new JButton("Back");
		public IT1(){
			
			font=new Font("SansSerif", Font.BOLD, 28);
		f=new JFrame("WORD PUZZLE - CEO's and IT COMPANIES");
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
			 if (string.equalsIgnoreCase("ANDROID")){
				
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 
				 objarray[0][0].setForeground(Color.GREEN);
				 objarray[1][0].setForeground(Color.GREEN);
				 objarray[2][0].setForeground(Color.GREEN);
				 objarray[3][0].setForeground(Color.GREEN);
				 objarray[4][0].setForeground(Color.GREEN);
				 objarray[5][0].setForeground(Color.GREEN);
				 objarray[6][0].setForeground(Color.GREEN);
				 
				w1=false; 
				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 
				}
				if(w2){
			 if(string.equalsIgnoreCase("GATES")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[9][1].setForeground(Color.RED);
				 objarray[9][2].setForeground(Color.RED);
				 objarray[9][3].setForeground(Color.RED);
				 objarray[9][4].setForeground(Color.RED);
				 objarray[9][5].setForeground(Color.RED);
				 
				w2=false;	 
			 }
			 
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
	
			 
			 
			 
				}
				if(w3){
			 if (string.equalsIgnoreCase("GOOGLE")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][9].setForeground(Color.orange);
				 objarray[2][9].setForeground(Color.orange);
				 objarray[3][9].setForeground(Color.orange);
				 objarray[4][9].setForeground(Color.orange);
				 objarray[5][9].setForeground(Color.orange);
				 objarray[6][9].setForeground(Color.orange);
				 
				 w3=false;
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 
				}
				if(w4){
			 if (string.equalsIgnoreCase("ZUKERBERG")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[1][1].setForeground(Color.cyan);
				 objarray[1][2].setForeground(Color.cyan);
				 objarray[1][3].setForeground(Color.cyan);
				 objarray[1][4].setForeground(Color.cyan);
				 objarray[1][5].setForeground(Color.cyan);
				 objarray[1][6].setForeground(Color.cyan);
				 objarray[1][7].setForeground(Color.cyan);
				 objarray[1][8].setForeground(Color.cyan);
				 objarray[1][9].setForeground(Color.cyan);
				w4=false; 
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 
			 }
				if(w5){
			 if (string.equalsIgnoreCase("YAHOO")){
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][7].setForeground(Color.orange);
				 objarray[3][7].setForeground(Color.orange);
				 objarray[4][7].setForeground(Color.orange);
				 objarray[5][7].setForeground(Color.orange);
				 objarray[6][7].setForeground(Color.orange);
				
				 w5=false;
				 
			 }
		
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
				
				}
			if(w6){
			 if (string.equalsIgnoreCase("JOBS")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[3][1].setForeground(Color.GREEN);
				 objarray[4][1].setForeground(Color.GREEN);
				 objarray[5][1].setForeground(Color.GREEN);
				 objarray[6][1].setForeground(Color.GREEN);
				 
				 
				 
				 w6=false;
				 
			 }
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			
			}
			
			 if(w7){
			 if (string.equalsIgnoreCase("APPLE")){
					
				 t.setText("");
				 i=i+10;
				 check.setText("Score:"+i.toString());
				 objarray[2][2].setForeground(Color.YELLOW);
				 objarray[2][3].setForeground(Color.YELLOW);
				 objarray[2][4].setForeground(Color.YELLOW);
				 objarray[2][5].setForeground(Color.YELLOW);
				 objarray[2][6].setForeground(Color.YELLOW);
		
				w7=false;				 
			 }
			
			 else 
				 if
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			 
			 }
			if(w8){
			 if (string.equalsIgnoreCase("TIMCOOK")){
					
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
					 (!string.equalsIgnoreCase("ANDROID")&&!string.equalsIgnoreCase("GATES")&&!string.equalsIgnoreCase("GOOGLE")&&!string.equalsIgnoreCase("ZUKERBERG")&&!string.equalsIgnoreCase("YAHOO")&&!string.equalsIgnoreCase("JOBS")&&!string.equalsIgnoreCase("APPLE")&&!string.equalsIgnoreCase("TIMCOOK"))
				 {
				t.setText("");
				PlayWrongSound();
				}
			}
			 
			 	
			
			
			
			 else
			t.setText("");
			 
			 if (i==80)
			 {
			PlayWinSound();
			 JOptionPane.showMessageDialog(null, "You Won", "Congragulation", 1);
			 stop();
			 }
			 			
		}
		public static void main(String [] args){
		IT1 puzz=new IT1();
		
		
	}
		
	}

