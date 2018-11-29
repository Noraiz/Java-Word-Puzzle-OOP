import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;

public class MenuClass extends JFrame {
	String text;
JFrame F;//Frame of about()
JFrame F2;//Frame of HowToPlay()
JScrollPane pane;
JLabel L;
JLabel L2;
JPanel P;
JButton b1;
JButton b3;
JButton b4;//used in about method
JButton b5;//used for How To Play
JPanel P2;
JPanel P3;
JTextArea T;
ImageIcon img;
	public MenuClass()
	{
		
		b1=new JButton("New Game");
		b3=new JButton("Quit");
		b5=new JButton("How to Play!");
		P=new JPanel();
		P.add(b1);
		P.add(b3);
		P.add(b5);
		setSize(333,282);
		setResizable(false);
		P.setLayout(new FlowLayout());
		L=new JLabel(new ImageIcon("1.jpg"));
		L.setLayout(new GridLayout());
		setTitle("Word Search Puzzle");
		P.setBackground(Color.BLUE);
		P.setBounds(10,10,350,35);
		getContentPane().add(P);
		getContentPane().add(L);
		setLocationRelativeTo(null);
		pack();
		getContentPane().setLayout(new BorderLayout());
		setVisible(true);
		
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				category c=new category();
			}
		});
		
		
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			
			}
		});
		
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				try {
					HowToPlay();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		});

		
	}
	 

	 public void HowToPlay() throws IOException{
		 F=new JFrame();
		 
		 FileReader reader=new FileReader("help.txt");
		 BufferedReader read=new BufferedReader(reader);
		    
			text=read.readLine();
			text=text.replace("-", "\n");	 
		 F=new JFrame();
		 F.setTitle("Word Search Puzzle-How To Play");
		 T=new JTextArea(10,28);
		 T.setText(text);
		 T.setEditable(false);
		 T.setLineWrap(false);
		 pane=new JScrollPane(T);
		 b4=new JButton("Back");
		 P2=new JPanel();
		 P2.add(b4);
	     P3=new JPanel();
	     F.getContentPane().add(pane,BorderLayout.CENTER);
	     F.getContentPane().add(P2,BorderLayout.SOUTH);
	     F.setLocationRelativeTo(null);
	     b4.addActionListener(new ActionListener()
		 {
			 public void actionPerformed(ActionEvent e){
				 F.dispose();
				 new  MenuClass();
				 
			 }
		 });
		//L=new JLabel("The matrix of letters is set in such a way tha it with combinition of letters words are formed. This arrangement can be horizontal vertical or diagonal. Type the word you find in the text field given below the matrix. The right answer will win you 10 points. There is no deduction for wrong answer. Good Luck! ");
		 F.pack();
	 F.setVisible(true);
	 F.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }


}
