import javax.swing.*; // The package where the components are
import javax.sound.sampled.*;
import java.awt.Color;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class game {
	private static int cry=1, level=0, WantedCharacter=1, pos, soughtcharacters;
	private static JFrame gamer;
	private static JLabel Character, TopScreen, BottomScreen, grid;
	private static ImageIcon img, car, black, MC;
	private static JPanel screen;
	private static ArrayList<JLabel> ok;
	private static JButton mainc;
	static boolean xx=true;
	int v;
	Clip clip, clip2;
    AudioInputStream sound, sound2;
    File file2;
    String b,q;
    public void setFile(String soundFileName) {
        try {

            File file = new File(soundFileName);
            sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
        }
    }
    public void play() {
        clip.start();
    }
    public void stop() throws IOException {
        sound.close();
        clip.close();
        clip.stop();
    }

	public game () {
		JLabel lev= new JLabel("Level: "+level);
		lev.setForeground(Color.blue);
		lev.setBounds(100,0,100,12);
		gamer= new JFrame();
		gamer.setLayout(null);
		TopScreen= new JLabel();
		ImageIcon Top= new ImageIcon("GUI/WantedTopScreen.png");
		TopScreen.setIcon(Top);
		TopScreen.setBounds(0,0,256,192);
		black=new ImageIcon("GUI/Black.png");
		BottomScreen= new JLabel(black);
		BottomScreen.setBounds(0,192,256,192);
		BottomScreen.setLayout(null);
		screen= new JPanel();
		screen.setLayout(null);
		screen.add(lev);
		gamer.setSize(256,406);
		screen.setSize(256,384);
		screen.add(BottomScreen);
		screen.add(TopScreen);
		gamer.add(screen);
		gamer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
public void DisplayGame() {
	gamer.setLocationRelativeTo(null);
	gamer.setVisible(true);
}
public void RandomCharacter() {
	Character=new JLabel();
	WantedCharacter=(int)(Math.random()*4)+1;
	cry=(int)(Math.random()*3)+1;
if(WantedCharacter==1) {
img= new ImageIcon("GUI/MarioBig.png");
MC= new ImageIcon("GUI/MarioSmall.png");
if(cry==1) 
b=new String("GUI/MarioCry.wav");
if(cry==2)
b=new String("GUI/MarioCry2.wav");
if(cry==3)
b=new String("GUI/MarioCry3.wav");}
if(WantedCharacter==2) {
img= new ImageIcon("GUI/LuigiBig.png");
MC= new ImageIcon("GUI/LuigiSmall.png");
if(cry==1) 
b=new String("GUI/LuigiCry.wav");
if(cry==2)
b=new String("GUI/LuigiCry2.wav");
if(cry==3)
b=new String("GUI/LuigiCry3.wav");}
if(WantedCharacter==3) {
img= new ImageIcon("GUI/YoshiBig.png");
MC= new ImageIcon("GUI/YoshiSmall.png");
if(cry==1) 
b=new String("GUI/YoshiCry.wav");
if(cry==2)
b=new String("GUI/YoshiCry2.wav");
if(cry==3)
b=new String("GUI/YoshiCry3.wav");}
if(WantedCharacter==4) {
img= new ImageIcon("GUI/WarioBig.png");
MC= new ImageIcon("GUI/WarioSmall.png");
if(cry==1) 
b=new String("GUI/WarioCry.wav");
if(cry==2)
b=new String("GUI/WarioCry2.wav");
if(cry==3)
b=new String("GUI/WarioCry3.wav");}
Character.setIcon(img);
Character.setBounds(100,55,55,61);
mainc= new JButton(MC);
mainc.setBorder(null);
TopScreen.add(Character);
}

public void PlayGame() {
	int x=(int)(Math.random()*10)+1;
	int y=(int)(Math.random()*10)+1;
	v= ((int)(Math.random()*55)+1);
	mainc.setBounds(x*22,y*17,30,32);
	BottomScreen.add(mainc);
	mainc.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			

			if(v>0&&v<=10) {
				q="GUI/ClickEffect1.wav";
			}
			if(v>10&&v<=20) {
				q="GUI/SoundEffect2.wav";
			}
			if(v>20&&v<=30) {
				q="GUI/SE3.wav";
			}
			if(v>30&&v<=40) {
				q="GUI/SE4.wav";
			}
			if(v>40&&v<=50) {
				q="GUI/SE5.wav";
			}
			if(v==51) {
				q="GUI/SERare1.wav";
			}
			if(v==52) {
				q="GUI/SERare2.wav";
			}
			if(v==53) {
				q="GUI/SERar3.wav";
			}
			if(v==54) {
				q="GUI/SERare4.wav";
			}
			if(v==55) {
				q="GUI/SERare5.wav";
			}
			gamer.dispose();
			game g= new game();
	        g.setFile(b);
	        g.play();
	        g.setFile(q);
	        g.play();
		this.runAgain();}

	

		private void runAgain() {
			JFrame win= new JFrame();
			ImageIcon Redx=new ImageIcon("GUI/RXd.png");
			JLabel ooga= new JLabel();
			ooga.setIcon(Redx);
			win.setLayout(null);
			win.setSize(256,406);
			JLabel caught= new JLabel("CAUGHT!");
			JLabel BotScre= new JLabel();
			ImageIcon stop= new ImageIcon("GUI/Quit.png");
			JButton storp= new JButton(stop);
			ImageIcon play= new ImageIcon("GUI/StartButton.png");
			win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton again= new JButton(play);
			BotScre.setIcon(black);
			ooga.setBounds(100,55,55,61);
			BotScre.setBounds(0,192,256,192);
			caught.setBounds(100,0,1000,36);
			again.setBounds(64,221,128,38);
			storp.setBounds(64,317,128,38);
			win.add(TopScreen);
			TopScreen.add(ooga);
			TopScreen.add(Character);
			TopScreen.add(caught);
			win.add(storp);
			win.add(again);
			win.add(BotScre);
			gamer.dispose();
			gamer.setVisible(false);
			win.setVisible(true);	
			win.setLocationRelativeTo(null);
			again.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent b) {
					level++;
					win.setVisible(false);
					game g= new game();
					g.RandomCharacter();
					 g.GridCreator();
					 g.DisplayGame();
					 g.PlayGame();
					
				}
			});
			storp.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					System.exit(1);
				}
			});
		}



	});	
}
public void GridCreator() {
	ok=new ArrayList<JLabel>();
	pos=0;
	JLabel Blank= new JLabel();
	ImageIcon blank= new ImageIcon("GUI/BlankCharacter.png");
	Blank.setIcon(blank);
		for(int i=0; i<=10;i++) {
			for(int j=0; j<=10; j++) {
				double x=Math.random();
				
				if(x>(2/(3*(Math.sqrt(level))))) {
				soughtcharacters=(int)(Math.random()*4)+1;
				while(soughtcharacters==WantedCharacter) {
					soughtcharacters=(int)(Math.random()*4)+1;
				}
					this.characterFinder(soughtcharacters);
					grid=new JLabel();
					grid.setIcon(car);
			
					ok.add(grid);}
				else{
					grid= new JLabel();
					grid.setIcon(blank);
					ok.add(grid);}}
				}
	
	
	
	
	
	this.addGrid(ok, pos);
	}
public void characterFinder(int x) {
	if(x==1)
		car= new ImageIcon("GUI/MarioSmall.png");
	if(x==2)
		car= new ImageIcon("GUI/LuigiSmall.png");
	if(x==3)
		car= new ImageIcon("GUI/YoshiSmall.png");
	if(x==4)
		car= new ImageIcon("GUI/WarioSmall.png");
	
}
private  void runAgain() {
	JFrame win= new JFrame();
	win.setLayout(null);
	win.setSize(256,406);
	win.setBackground(Color.black);
	gamer.setVisible(false);
	win.setVisible(true);
}
public void addGrid(ArrayList<JLabel> a, int x){
	for(int i=0; i < 10; i++) {
		for(int j=0; j<10; j++) {
		a.get(x).setBounds(25*i,19*j,30,32);
		BottomScreen.add(a.get(x));
		x++;}
}
	}
public boolean stoop() {
	return xx;
}
}

