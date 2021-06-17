import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Window extends JFrame implements ActionListener
{
	JPanel plHome,plgame;
	JButton btnplay, btndeveloper, btnabout, btnhow, btncredits, btnlvl1, btnlvl2, btnlvl3, btnlvl4, btnlvl5, btnBack, btnMenu;
	JLabel LVLS, Home_Background;

	Player p;
	Watch w;
	Window d;

	Map m;
	Map2 m2;
	Map3 m3;
	Map4 m4;
	Map5 m5;

	MovingObj MO;
	MovingObj2 MO2;
	MovingObj3 MO3;
	MovingObj4 MO4;
	MovingObj5 MO5;

	static int level;

	public Window(){
		setVisible(true);
		setBounds(5,5,1358,758);
		setLayout(null);
		setResizable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);


		//PANEL IN THE GAME

		plHome = new JPanel();
		plHome.setLayout(null);
		plHome.setOpaque(false);
		plHome.setBackground(Color.black);
		plHome.setBounds(0, 0,1378, 778);
		add(plHome);

		plgame = new JPanel();
		plgame.setLayout(null);
		plgame.setOpaque(false);
		//plgame.setBackground(Color.yellow);
		plgame.setBounds(293, 100, 766, 393);

		Home_Background= new JLabel(new ImageIcon(getClass().getResource("Home_Background.png")));
		Home_Background.setBounds(-10, -10,1378, 778);
		plHome.add(Home_Background);

		// END OF PANEL

		// LABELS IN THE GAME

		LVLS = new JLabel("Pick a Level");
		LVLS.setBounds(287, 0, 192, 40);
		LVLS.setFont(new Font("Times New Roman", Font.ITALIC, 34));
		LVLS.setHorizontalAlignment(SwingConstants.CENTER);
		plgame.add(LVLS);

		// END OF LABELS

		// BUTTONS IN THE GAME


		btnBack = new JButton("BACK TO LEVEL");
		btnBack.setBounds(0, 0, 100,21);


		btnhow = new JButton("HOW");
		btnhow.setBounds(12, 134, 150, 50);
		Home_Background.add(btnhow);

		btnabout = new JButton("ABOUT");
		btnabout.setBounds(12, 268, 150, 50);
		Home_Background.add(btnabout);

		btndeveloper = new JButton("DEVELOPER");
		btndeveloper.setBounds(12, 410, 150, 50);
		Home_Background.add(btndeveloper);

		btncredits = new JButton("CREDITS");
		btncredits.setBounds(12, 554, 150, 50);
		Home_Background.add(btncredits);

		btnplay = new JButton("play");
		btnplay.setBounds(601, 673, 150,50);
		btnplay.addActionListener(this);
		btnplay.setBackground(Color.GREEN);
		Home_Background.add(btnplay);

		btnlvl1 = new JButton("LVL 1");
		btnlvl1.setBounds(29, 111, 120, 40);
		btnlvl1.addActionListener(this);
		btnlvl1.setBackground(Color.GREEN);
		plgame.add(btnlvl1);

		btnlvl2 = new JButton("LVL 2");
		btnlvl2.setBounds(318, 111, 120, 40);
		btnlvl2.addActionListener(this);
		btnlvl2.setBackground(Color.GREEN);
		btnlvl2.setEnabled(false);
		plgame.add(btnlvl2);

		btnlvl3 = new JButton("LVL 3");
		btnlvl3.setBounds(612, 111, 120, 40);
		btnlvl3.addActionListener(this);
		btnlvl3.setBackground(Color.GREEN);
		btnlvl3.setEnabled(false);
		plgame.add(btnlvl3);

		btnlvl4 = new JButton("LVL 4");
		btnlvl4.setBounds(167, 251, 120, 40);
		btnlvl4.addActionListener(this);
		btnlvl4.setBackground(Color.GREEN);
		btnlvl4.setEnabled(false);
		plgame.add(btnlvl4);

		btnlvl5 = new JButton("LVL 5");
		btnlvl5.setBounds(459, 251, 120, 40);
		btnlvl5.addActionListener(this);
		btnlvl5.setBackground(Color.GREEN);
		btnlvl5.setEnabled(false);
		plgame.add(btnlvl5);
		btnBack.addActionListener(this);
		// END OF BUTTONS

		
	}	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnplay ){


			Home_Background.add(plgame);

			repaint();
		}

		if(e.getSource() == btnhow){


		}
		if(e.getSource() == btnabout ){


		}
		if(e.getSource() == btndeveloper){


		}
		if(e.getSource() == btncredits ){


		}

		if(e.getSource() == btnlvl1){
			level=1;

			//btnlvl2.setEnabled(true);

			remove(plHome);
			remove(plgame);

			m = new Map();
			MO = new MovingObj();
			p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5,this,w);
			w = new Watch(MO, MO2, MO3, MO4, MO5, p, m);
add(btnBack);
			add(p);
			
			add(MO);
			
			add(w);;
			add(m);

			repaint();	
		}

		if(e.getSource() == btnlvl2){
			level=2;

			remove(plHome);
			remove(plgame);

			m2= new Map2();
			MO2 = new MovingObj2();
			p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5,this,w);
			w = new Watch(MO, MO2, MO3, MO4, MO5, p, m);


			add(p);
			add(w);
			add(MO2);
			add(btnBack);
			add(m2);

			repaint();	
		}
		if(e.getSource() == btnlvl3){
			level=3;

			remove(plHome);
			remove(plgame);

			m3 = new Map3();
			MO3 = new MovingObj3();
			p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5,this,w);
			w = new Watch(MO, MO2, MO3, MO4, MO5, p, m);

			add(p);
			add(w);
			add(MO3);
			add(btnBack);
			add(m3);

			repaint();	
		}
		//		if(e.getSource() == m3.EXIT){
		//
		//			remove(MO3);
		//			remove(w);
		//			remove(p);
		//			remove(m3);
		//
		//			add(plHome);
		//			Home_Background.add(plgame);
		//
		//			repaint();	
		//		}
		if(e.getSource() == btnlvl4){
			level = 4;
			remove(plHome);
			remove(plgame);

			m4 = new Map4();
			MO4 = new MovingObj4();
			p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5,this,w);
			w = new Watch(MO, MO2, MO3, MO4, MO5, p, m);

			add(p);
			add(w);
			add(MO4);
			add(btnBack);
			add(m4);

			repaint();	
		}
		//		if(e.getSource() == m4.EXIT){
		//
		//			remove(MO4);
		//			remove(w);
		//			remove(p);
		//			remove(m4);
		//
		//			add(plHome);
		//			Home_Background.add(plgame);
		//
		//			repaint();	
		//		}
		if(e.getSource() == btnlvl5){
			level = 5;

			remove(plHome);
			remove(plgame);

			m5 = new Map5();
			MO5 = new MovingObj5();
			p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5,this,w);
			w = new Watch(MO, MO2, MO3, MO4, MO5, p, m);

			add(p);
			add(w);
			add(MO5);
			add(btnBack);
			add(m5);

			repaint();	
		}
		if (e.getSource() == btnBack){
			switch (level){
			case 1:

				//				m = new Map();
				//				MO = new MovingObj();
				//				p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5);
				//				w = new Watch(MO, MO2, MO3, MO4, MO5, p);
				w.val= 100;
				w.timer.stop();
				
				remove(btnBack);
				remove(MO);
				remove(w);
				remove(p);
				remove(m);

				add(plHome);
				Home_Background.add(plgame);
				repaint();
				break;
			case 2:
				//				m2 = new Map2();
				//				MO2 = new MovingObj2();
				//				p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5);
				
				//				w = new Watch(MO, MO2, MO3, MO4, MO5, p);
				w.val= 100;
				w.timer.stop();
				
				remove(btnBack);
				remove(MO2);
				remove(w);
				remove(p);
				remove(m2);

				add(plHome);
				Home_Background.add(plgame);
				repaint();
				break;
			case 3:
				//				m3 = new Map3();
				//				MO3 = new MovingObj3();
				//				p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5);
				//				w = new Watch(MO, MO2, MO3, MO4, MO5, p);
				w.val= 100;
				w.timer.stop();
				
				remove(btnBack);
				remove(MO3);
				remove(w);
				remove(p);
				remove(m3);

				add(plHome);
				Home_Background.add(plgame);
				
				repaint();
				break;
			case 4:

				//				m4 = new Map4();
				//				MO4 = new MovingObj4();
				//				p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5);
				//				w = new Watch(MO, MO2, MO3, MO4, MO5, p);
				w.val= 100;
				w.timer.stop();
				
				remove(btnBack);
				remove(MO4);
				remove(w);
				remove(p);
				remove(m4);

				add(plHome);
				Home_Background.add(plgame);
				
				repaint();
				break;
			case 5:

				//				m5 = new Map5();
				//				MO5 = new MovingObj5();
				//				p = new Player(m, m2, m3, m4, m5, MO, MO2,  MO3, MO4, MO5);
				//				w = new Watch(MO, MO2, MO3, MO4, MO5, p);
				w.val= 100;
				w.timer.stop();
				
				remove(btnBack);
				remove(MO5);
				remove(w);
				remove(p);
				remove(m5);

				add(plHome);
				Home_Background.add(plgame);
				
				repaint();
				break;
			}
		}

	}

	public static void main(String[]args){
		Window game = new Window();
		game.validate();
		game.repaint();
	}

}
