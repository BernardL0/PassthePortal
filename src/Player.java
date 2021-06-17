
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends JPanel implements ActionListener, KeyListener{
	
	Timer t = new Timer(1, this);
	int x = 30, y = 200;
	int lastX, lastY;

	String Message = "";
	boolean win = false;
	JLabel lblwin = new JLabel();
	
	Font font = new Font("ALGERIAN" , Font.BOLD,48);

	BufferedImage ImagePlayer;
	
	Window d;
	Watch w;
	
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


	Graphics g1,g2;

	public Player(Map m, Map2 m2, Map3 m3, Map4 m4, Map5 m5, MovingObj MO, MovingObj2 MO2, MovingObj3 MO3, MovingObj4 MO4, MovingObj5 MO5, Window d, Watch w){
		this.m = m;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.MO=MO;
		this.MO2=MO2;
		this.MO3=MO3;
		this.MO4=MO4;
		this.MO5=MO5;
		this.d=d;
		this.w=w;
		
		

		t.start();

		setBounds(0, 0,1370, 770);

		setLayout(null);
		addKeyListener(this);
		setOpaque(false);
	}


	public void paintComponent(Graphics g){

		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		requestFocusInWindow();
		super.paintComponent(g);
		//g2 = (Graphics) g;
		g1 = (Graphics) g;


		g1.drawImage(ImagePlayer, x, y, 30, 30, null);;
		//g1.fillRect(x , y , 30, 30);
		
		try{
			ImagePlayer = ImageIO.read(getClass().getResource("PLAYER.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}
		if(win)
		{
			
			g.setColor(Color.ORANGE);

			g.setFont(font);

			g.drawString(Message, 100, 300);
			
		}


	}	

	public void actionPerformed(ActionEvent e){
		repaint();

		if(x<25){
			lastX=0;
			x=25;
		}
		if(x>1300 ){
			lastX=0;
			x=1300;
		}
		if(y<25){
			lastY=0;
			y=25;
		}
		if(y>670 ){
			lastY=0;
			y=670;
		}
		switch(Window.level){
		case 1:
			ObjMove(MO);
			win(m);
	         //t.stop();
			//Win(MO);
			break;
		case 2:
			ObjMove2(MO2);
			win2(m2);
			//t.stop();
			break;
		case 3:
		
			ObjMove3(MO3);
			win3(m3);
			//t.stop();
			break;
		case 4:
			
			ObjMove4(MO4);
			win4(m4);
			//t.stop();
			break;
		case 5:
		
			ObjMove5(MO5);
			win5(m5);
		//	t.stop();
			break;
		}

	}

	public void keyPressed(KeyEvent e){
		int code = e.getKeyCode();

		lastX = x;
		lastY = y;


		if (code == KeyEvent.VK_UP){
			y -= 15;
		}
		if (code == KeyEvent.VK_DOWN){
			y +=15;
		}
		if (code == KeyEvent.VK_LEFT){
			x -= 15;
		}
		if (code == KeyEvent.VK_RIGHT){
			x += 15;
		}
		if (code == KeyEvent.VK_W){
			y -= 15;
		}
		if (code == KeyEvent.VK_S){
			y +=15;
		}
		if (code == KeyEvent.VK_A){
			x -= 15;
		}
		if (code == KeyEvent.VK_D){
			x += 15;
		}
		switch(Window.level){
		case 1:
			collision(m);
			break;
			//Win(MO);
		case 2:
			collision2(m2);
			
			break;
		case 3:
			collision3 (m3);
			
			break;
		case 4:
			collision4(m4);
			
			break;
		case 5:
			collision5(m5);
			
			break;
		}

			
		}
	
	void collision(Map m)
	{
		for(int i = 0; i < 25 ;i++)
		{
			if( m.lvl1[i].getX()-30  <= x  && m.lvl1[i].getX()+ m.lvl1[i].getWidth() >= x-2 )
			{	

				if( m.lvl1[i].getY()-30  <= y  &&  m.lvl1[i].getY() + m.lvl1[i].getHeight() >= y-1 )
				{
					x=lastX;
					y=lastY;

				}
			}
		}

	}
	void win(Map m){
		
		for(int i = 0; i < 1 ;i++)
		{
			if( m.Winner[i].getX()-20  <= x  && m.Winner[i].getX()+ m.Winner[i].getWidth() >= x-2 )
			{	

				
				if( m.Winner[i].getY()-20  <= y  &&  m.Winner[i].getY() + m.Winner[i].getHeight() >= y-1 )
				{
					win = true;	
					JOptionPane.showMessageDialog(null, "Winner!! ");
					
					Watch.timer.stop();
					t.stop();
					
					d.btnlvl2.setEnabled(true);
					
					}
			
				}}
	}


	void collision2(Map2 m2)
	{
		for(int i = 0; i < 36 ;i++)
		{
			if( m2.lvl2[i].getX()-30 <= x  && m2.lvl2[i].getX()+ m2.lvl2[i].getWidth() >= x-2 )
			{	

				if( m2.lvl2[i].getY()-30  <= y  &&  m2.lvl2[i].getY() + m2.lvl2[i].getHeight() >= y-1 )
				{
					x=lastX;
					y=lastY;

				}
			}
		}
	}
	void win2(Map2 m2){
	for(int i = 0; i < 1 ;i++)
	{
		if( m2.Winner[i].getX()-30  <= x  && m2.Winner[i].getX()+ m2.Winner[i].getWidth() >= x-2 )
		{	

			if( m2.Winner[i].getY()-30  <= y  &&  m2.Winner[i].getY() + m2.Winner[i].getHeight() >= y-1 )
			{
				win = true;
				w.timer.stop();
				t.stop();
				Message="You're a Winner";
				d.btnlvl3.setEnabled(true);
				}}}
	
	
	}
	void collision3(Map3 m3)
	{
		for(int i = 0; i < 49 ;i++)
		{
			if( m3.lvl3[i].getX()-30 <= x  && m3.lvl3[i].getX()+ m3.lvl3[i].getWidth() >= x-2 )
			{	

				if( m3.lvl3[i].getY()-30  <= y  &&  m3.lvl3[i].getY() + m3.lvl3[i].getHeight() >= y-1 )
				{
					x=lastX;
					y=lastY;

				}
			}
		}
	}
	void win3(Map3 m3){
	for(int i = 0; i < 1 ;i++)
	{
		if( m3.Winner[i].getX()-30  <= x  && m3.Winner[i].getX()+ m3.Winner[i].getWidth() >= x-2 )
		{	

			if( m3.Winner[i].getY()-30  <= y  &&  m3.Winner[i].getY() + m3.Winner[i].getHeight() >= y-1 )
			{
				win = true;
				w.timer.stop();
				t.stop();
				Message="You're a Winner";
				d.btnlvl4.setEnabled(true);	
			}}}
	}
	
	
	void collision4(Map4 m4)
	{
		for(int i = 0; i < 64 ;i++)
		{
			if( m4.lvl4[i].getX()-30 <= x  && m4.lvl4[i].getX()+ m4.lvl4[i].getWidth() >= x-2 )
			{	

				if( m4.lvl4[i].getY()-30  <= y  &&  m4.lvl4[i].getY() + m4.lvl4[i].getHeight() >= y-1 )
				{
					x=lastX;
					y=lastY;

				}
			}
		}
	}
	
	
	void win4(Map4 m4){
	for(int i = 0; i < 1 ;i++)
	{
		if( m4.Winner[i].getX()-30  <= x  && m4.Winner[i].getX()+ m4.Winner[i].getWidth() >= x-2 )
		{	

			if( m4.Winner[i].getY()-30  <= y  &&  m4.Winner[i].getY() + m4.Winner[i].getHeight() >= y-1 )
			{
				win = true;
				w.timer.stop();
				t.stop();
				Message="You're a Winner";
				d.btnlvl5.setEnabled(true);	
			}}}}
	
	
	void collision5(Map5 m5)
	{
		for(int i = 0; i < 81 ;i++)
		{
			if( m5.lvl5[i].getX()-30 <= x  &&  m5.lvl5[i].getX()+  m5.lvl5[i].getWidth() >= x-2 )
			{	

				if( m5.lvl5[i].getY()-30  <= y  &&   m5.lvl5[i].getY() + m5.lvl5[i].getHeight() >= y-1 )
				{
					x=lastX;
					y=lastY;

				}
			}
		}
	}
	void win5 (Map5 m5){
		for(int i = 0; i < 1 ;i++)
		{
			if( m5.Winner[i].getX()-30  <= x  && m5.Winner[i].getX()+ m5.Winner[i].getWidth() >= x-2 )
			{	

				if( m5.Winner[i].getY()-30  <= y  &&  m5.Winner[i].getY() + m5.Winner[i].getHeight() >= y-1 )
				{
					win=true;
					w.timer.stop();
					t.stop();
					Message="You're a Winner";
					d.btnlvl5.setEnabled(true);
	}}}}
	
	
	
	
	void ObjMove(MovingObj MO)
	{
		for(int i = 0; i < 4;i++)
		{
			if( MO.enemy[i].x-30.5 <= x  && MO.enemy[i].x+ 97 >= x+5 )
			{	

				if( MO.enemy[i].y-30.5  <= y  &&  MO.enemy[i].y + 120 >= y+5 )
				{
					x=50;
					y=200;
				}
			}
		}
		for(int v = 0; v < 1;v++){
			if( MO.enemy2[v].x-30.5 <= x  && MO.enemy2[v].x+ 40 >= x+5 )
			{	

				if( MO.enemy2[v].y-30.5  <= y  &&  MO.enemy2[v].y + 40 >= y+5 )
				{
					x=50;
					y=200;
				}
			}
		}
	}
	
	void ObjMove2(MovingObj2 MO2)
	{
		for(int i = 0; i < 5;i++)
		{
			if( MO2.enemy[i].x-30.5 <= x  && MO2.enemy[i].x+ 70 >= x+5 )
			{	

				if( MO2.enemy[i].y-30.5  <= y  &&  MO2.enemy[i].y + 100 >= y+5 )
				{
					x=50;
					y=300;
				}
			}
		}
	}
	
	void ObjMove3(MovingObj3 MO3)
	{
		for(int i = 0; i < 8;i++)
		{
			if( MO3.enemy[i].x-30.5 <= x  && MO3.enemy[i].x+ 85 >= x+5 )
			{	

				if( MO3.enemy[i].y-30.5  <= y  &&  MO3.enemy[i].y + 120 >= y+5 )
				{
					x=50;
					y=400;
				}
			}
		}
	}
	
	void ObjMove4(MovingObj4 MO4)
	{
		for(int i = 0; i < 9;i++)
		{
			if( MO4.enemy[i].x-30.5 <= x  && MO4.enemy[i].x+ 50 >= x+5 )
			{	

				if( MO4.enemy[i].y-30.5  <= y  &&  MO4.enemy[i].y + 100 >= y+5 )
				{
					x=50;
					y=500;
				}
			}
		}
	}
	
	void ObjMove5(MovingObj5 MO5)
	{
		for(int i = 0; i < 12;i++)
		{
			if( MO5.enemy[i].x-30.5 <= x  && MO5.enemy[i].x+ 41 >= x+5 )
			{	

				if( MO5.enemy[i].y-30.5  <= y  &&  MO5.enemy[i].y + 70 >= y+5 )
				{
					x=50;
					y=600;
				}
			}
			
		}
		
	}
	
//	void Win(MovingObj MO)
//	{
//		for(int i = 0; i < 1;i++)
//		{
//			if( MO.win[i].x-30.5 <= x  && MO.win[i].x+ 68 >= x+5 )
//			{	
//
//				if( MO.win[i].y-30.5  <= y  &&  MO.win[i].y + 80 >= y+5 )
//				{
//
//					Message = "Congrattulation You Unlock \n\t Another Lvl";
//					win= true;
//				}
//			}
//		}
//	}



	public void keyTyped(KeyEvent e){}
	public void keyReleased(KeyEvent e){}}
