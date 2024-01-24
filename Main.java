
import javax.swing.*; // The package where the components are
import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Main{

		public static void main(String[] args){
			game r=new game();
			JFrame frame = new JFrame();
			JFrame helpscreen = new JFrame(); 

			frame.setSize(252,273);
	        frame.setLayout(null);
	JLabel image= new JLabel();
	    ImageIcon img= new ImageIcon("GUI/MainMenuWanted.png");
	    image.setIcon(img);
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ImageIcon start= new ImageIcon("GUI/StartButton.png");
	    ImageIcon help= new ImageIcon("GUI/Quit.png");
			JButton button = new JButton(start);
			button.setBounds(62,138,128,38);
			JButton quit=new JButton(help);
			quit.setBounds(62,178,128,38);
			ImageIcon score= new ImageIcon("GUI/HighScore.png");
			JLabel high= new JLabel();
			high.setIcon(score);
			high.setBounds(30,222,133,15);
			JLabel highscore=new JLabel("0");
			highscore.setForeground(Color.red);
			highscore.setBounds(190,222,133,15);
	    JPanel Menu= new JPanel();
	    
	    
	    Menu.add(image);
	    
	   Menu.setSize(252,273);
	    frame.add(Menu);
	    image.add(button);
	    image.add(quit);
	    image.add(high);
	    image.add(highscore);
	    
	    ImageIcon helpscr= new ImageIcon("GUI/HelpScreen.png");
	    JButton back= new JButton(help);
	    helpscreen.setSize(252,273);
	    	helpscreen.setLayout(null);
	    	helpscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	JLabel hellp= new JLabel();
	    	hellp.setIcon(helpscr);
	    	back.setBounds(62,178,128,38);
	    	
	    	JPanel screen= new JPanel();
	    	hellp.add(back);
	    	screen.add(hellp);
	    	
	    	screen.setSize(252,273);
	    	helpscreen.add(screen);
	    	game h= new game();
	    	h.setFile("GUI/MenuScreen.wav");
	    	h.play();
	    	
	   
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try {
						h.stop();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					frame.setVisible(false);
					 game g= new game();
					 g.setFile("GUI/BGM.wav");
					 g.play();
					 g.RandomCharacter();
					 g.GridCreator();
					 g.DisplayGame();
					 g.PlayGame();
					 if(g.stoop()==false) {
						 frame.setVisible(true);
					 }
				}		

			});	
			quit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent a) {
					frame.setVisible(false);
					helpscreen.setLocationRelativeTo(null);
					helpscreen.setVisible(true);
				}
			});
			back.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent b) {
					helpscreen.setVisible(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				}
			});
		
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			// IMPORTANT. This is to make it visible on the screen.
		
		}	

	}


