import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Watch extends JPanel implements ActionListener{

	static Timer timer;
	int val;
	JLabel lblnumber = new JLabel("100");
	JLabel GameOver = new JLabel();
	
	Watch w;
	Window d;

	Map m;

	MovingObj   MO;
	MovingObj2 MO2;
	MovingObj3 MO3;
	MovingObj4 MO4;
	MovingObj5 MO5;

	Player p;

	public Watch(MovingObj MO, MovingObj2 MO2, MovingObj3 MO3 ,MovingObj4 MO4,MovingObj5 MO5, Player p, Map m) {
		this.MO=MO;
		this.MO2=MO2;
		this.MO3=MO3;
		this.MO4=MO4;
		this.MO5=MO5;
		this.p=p;

		JProgressBar progressBar = new JProgressBar();
		
		switch(Window.level)
		{
		case 1:
			val = 10;
			break;
		case 2:
			val = 9;
			break;
			
		case 3:
			val = 8;
			break;
			
		case 4:
			val = 7;
			break;
			
		case 5:
			val = 6;
			break;
		}
		

		setVisible(true);
		setLayout(null);
		setBounds(200, 0, 350, 19);
		setBorder(new EmptyBorder(5, 5, 5, 5));

		setLayout(null);
		progressBar.setForeground(Color.GREEN);
		progressBar.setMaximum(val);
		progressBar.setValue(val);
		progressBar.setBounds(0, 0, 277, 19);
		add(progressBar);
		
		lblnumber.setBounds(287, 0, 40, 18);
		lblnumber.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblnumber.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblnumber);
		
		GameOver.setIcon(new ImageIcon(getClass().getResource("GAMEOVER.png")));
		GameOver.setBounds(-10, -10,1378, 778);

		timer = new Timer  (1000, new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				if(val > 0)
				{
					//lbltimer.setText(TimeFormat(val));
					
					progressBar.setValue(--val);
					//lblnumber.setText(val+"");
					repaint();
				}
				else if (val == 0)
				{
					
					timer.stop();
					JOptionPane.showMessageDialog(null, "Game Over Pls click Back!! ");
                    p.add(GameOver);
					switch(Window.level)
					{
					case 1:
						MO.time.stop();
						p.t.stop();
						;
//						remove(p);
//						remove(m);
//						remove(w);
//						remove(MO);
						
						break;
					case 2:
						MO2.time.stop();
						p.t.stop();
						break;
						
					case 3:
						MO3.time.stop();
						p.t.stop();
						break;
						
					case 4:
						MO4.time.stop();
						p.t.stop();					
						break;
						
					case 5:
						MO5.time.stop();
						p.t.stop();
						break;
					}


				}
			


			}
		});
		timer.start();
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
