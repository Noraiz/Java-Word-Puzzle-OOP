
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class category extends JFrame {
	String boxValue;
	
	JComboBox box;
	JLabel L;
	
	JPanel P;
	JButton b1;
	JButton b2;
	JButton b3;
    JPanel P2;

	MenuClass m;
	int shuffle;
	String categories []={"Sports","Vehicles", "Films", "Celebrites","Animals","Eatables","Technology"};
	public category()
	{
		
		box=new JComboBox(categories);
		box.setSelectedIndex(2);
		P=new JPanel();
		P2=new JPanel();
		setSize(800,450);
		b3=new JButton("Quit");
		b1=new JButton("Back");
		L=new JLabel(new ImageIcon("search.jpg"));
		P.add(b1);
		P.add(b3);
		P.add(box);
		P2.add(L);
		P.setBounds(9,10,250,35);
		P.setBackground(new Color(20,30,65));
		P.setLayout(new FlowLayout());
		add(P);
		add(P2);
		setTitle("Categories");
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		
		box.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
             box=(JComboBox) e.getSource();
             boxValue=(String) box.getSelectedItem();
				
             
             if(boxValue.equalsIgnoreCase("Sports")){
					shuffle=(int) (Math.random()*6);
					switch(shuffle){
					case 1:
						Boxing a=new Boxing();
						break;
					
					case 3:
						Boxing2 b=new Boxing2();
						break;
					case 4:
						Boxing1 c=new Boxing1();
						break;
					case 5:
						Tennis1 d=new Tennis1();
						break;
						case 6:
							Tennis1_2 f=new Tennis1_2();
							break;
					
					case 2:
						Tennis1_3 g=new Tennis1_3();
						break;
					
					
						
						
					}
				}
				
             if(boxValue.equalsIgnoreCase("Vehicles")){
					shuffle=(int) (Math.random()*3);
					switch(shuffle){
					case 1:
						Vehicles a=new Vehicles();
						break;
					case 2:
						Vehicles1 b=new Vehicles1();
						break;
						
					case 3:
						Vehicles2 c=new Vehicles2();
						break;
					
					
					
						
						
					}
				}
				if(boxValue.equalsIgnoreCase("Technology")){
					shuffle=(int) (Math.random()*3);
					switch(shuffle){
					case 1:
						IT a=new IT();
						break;
					case 2:
						IT2 b=new IT2();
						break;
					
					case 3:
						IT1 c=new IT1();
						break;		
						}
				}
				if(boxValue.equalsIgnoreCase("Films")){
					shuffle=(int) (Math.random()*3);
					switch(shuffle){
					case 1:
						MoviesNames a=new MoviesNames();
						break;
					case 2:
						MoviesNames2 b=new MoviesNames2();
						break;
					
					case 3:
						MoviesNames1 c=new MoviesNames1();
						break;		
						}
				}
				
				if(boxValue.equalsIgnoreCase("Celebrites")){
					shuffle=(int) (Math.random()*6);
					switch(shuffle){
					case 1:
						WorldLeaders a= new WorldLeaders(); 
						break;
					case 2:
						WorldLeaders1 b= new WorldLeaders1(); 
						break;
					
					case 3:
						WorldLeaders2 c= new WorldLeaders2(); 
						break;
					case 4:
						Celebraties1 d=new Celebraties1();
						break;
					case 5:
						Celebraties2 g=new Celebraties2();
						break;
						case 6:
							Celebraties f=new Celebraties();
							break;	
							}
				}
				
				if(boxValue.equalsIgnoreCase("Eatables")){
					shuffle=(int) (Math.random()*9);
					switch(shuffle){
					case 1:
						Fruit1 b=new Fruit1();
						break;
					case 2:
						Fruit1_2 d=new Fruit1_2();
						break;
					
					case 3:
						Fruit1_3 i=new Fruit1_3();
						break;
					case 4:
						Fruit3_3 h=new Fruit3_3();
						break;
					case 5:
						Fruit3_2 g=new Fruit3_2();
						break;
						case 6:
							Fruit3 f=new Fruit3();
							break;
					
					case 7:
						Fruit2_3 j=new Fruit2_3();
						break;
					case 8:
						Fruit2_2 c=new Fruit2_2();
						break;
					case 9:
						Fruit2 k=new Fruit2();
						break;
					
						
						
					}
				}
				if(boxValue.equalsIgnoreCase("Animals")){
				shuffle=(int) (Math.random()*8);
				switch(shuffle){
				
				case 2:
					Animal1_2 b=new Animal1_2();
					break;
				
				case 3:
					Animal1 i=new Animal1();
					break;
				case 4:
					Animal3_3 h=new Animal3_3();
					break;
				case 5:
					Animal3_2 g=new Animal3_2();
					break;
					case 6:
						Animal3 f=new Animal3();
						break;
				
				case 7:
					Animal2_3 j=new Animal2_3();
					break;
				case 8:
					Animal2_2 c=new Animal2_2();
					break;
				case 1:
					Animal2 k=new Animal2();
					break;
				
					
					
				}
				
				}
			}
		});
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			dispose();
			new MenuClass();
		}
	});	
	b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
				dispose();
		}
	});	
	}
}