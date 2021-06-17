import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MovingObj extends JPanel implements ActionListener 
{

	Enemy enemy[]=new Enemy[4]; 
	Enemy enemy2[]= new Enemy[1];
	//Enemy win[]=new Enemy[1]; 

	Timer time;
	Graphics2D g1[]= new Graphics2D[4];
	Graphics2D g2[]= new Graphics2D[1];
	//	Graphics2D g2[] =new Graphics2D[1] ;
	BufferedImage Image,Image1;


	public MovingObj(){
		setBounds(0, 0,1358,758);

		try{
			Image = ImageIO.read(getClass().getResource("Portal.png"));
			Image1 = ImageIO.read(getClass().getResource("Banana.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}




//		enemy[0] = new Enemy(270 , 674);
//		enemy[1] = new Enemy(510, 25);
//		enemy[2] = new Enemy(738, 674);
//		enemy[3] = new Enemy(984,25);
		enemy[0] = new Enemy(1253 , 33);
		enemy[1] = new Enemy(205, 151);
		enemy[2] = new Enemy(205, 435);
		enemy[3] = new Enemy(1253,586);
		
		enemy2[0] = new Enemy(1253,350);
		//		win[0] = new Enemy(1260,310);

		time = new Timer(1,this);
		time.start();

	}

	public void actionPerformed(ActionEvent e){
		enemy[0].Left_Right();
		enemy[1].Left_Right();
		enemy[2].Left_Right();
		enemy[3].Left_Right();
		enemy2[0].cLeft_Right();

	}



	public void paintComponent(Graphics g)	{

		g1 [0] = (Graphics2D) g;
		g1 [1] = (Graphics2D) g;
		g1 [2] = (Graphics2D) g;
		g1 [3] = (Graphics2D) g;
		g2 [0] = (Graphics2D) g;

		//		g2[0] = (Graphics2D) g;
		//		g2[0].drawImage(Image1,win[0].x,win[0].y,68,80,null);

		g1[0].drawImage(Image,enemy[0].x, enemy[0].y, 85, 100, null);
		g1[1].drawImage(Image,enemy[1].x, enemy[1].y, 85, 100, null);
		g1[2].drawImage(Image,enemy[2].x, enemy[2].y, 85, 100, null);
		g1[3].drawImage(Image,enemy[3].x, enemy[3].y, 85, 100, null);
		g2[0].drawImage(Image,enemy2[0].x, enemy2[0].y, 40, 40, null);

	}



}




class MovingObj2 extends JPanel implements ActionListener 
{


	Enemy enemy[]=new Enemy[5]; 
	Timer time;
	Graphics2D g1[]= new Graphics2D[5];
	BufferedImage Image;


	public MovingObj2(){
		setBounds(0, 0,1358,758);

		try{
			Image = ImageIO.read(getClass().getResource("Portal2.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}



		enemy[0] = new Enemy(247 , 25);
		enemy[1] = new Enemy(438, 684);
		enemy[2] = new Enemy(630, 25);
		enemy[3] = new Enemy(821,684);
		enemy[4] = new Enemy(1010,25);

		time = new Timer(1,this);
		time.start();

	}

	public void actionPerformed(ActionEvent e){
		enemy[0].move();
		enemy[1].move();
		enemy[2].move();
		enemy[3].move();
		enemy[4].move();

	}

	public void paintComponent(Graphics g)	{

		g1 [0] = (Graphics2D) g;
		g1 [1] = (Graphics2D) g;
		g1 [2] = (Graphics2D) g;
		g1 [3] = (Graphics2D) g;
		g1 [4] = (Graphics2D) g;



		g1[0].drawImage(Image,enemy[0].x, enemy[0].y, 70, 100, null);
		g1[1].drawImage(Image,enemy[1].x, enemy[1].y, 70, 100, null);
		g1[2].drawImage(Image,enemy[2].x, enemy[2].y, 70, 100, null);
		g1[3].drawImage(Image,enemy[3].x, enemy[3].y, 70, 100, null);
		g1[4].drawImage(Image,enemy[4].x, enemy[4].y, 70, 100, null);
	}
}


class MovingObj3 extends JPanel implements ActionListener 
{


	Enemy enemy[]=new Enemy[8]; 
	Timer time;
	Graphics2D g1[]= new Graphics2D[8];
	BufferedImage Image;


	public MovingObj3(){
		setBounds(0, 0,1358,758);

		try{
			Image = ImageIO.read(getClass().getResource("Portal03.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}



		enemy[0] = new Enemy(200 , 25);
		enemy[1] = new Enemy(364, 590);
		enemy[2] = new Enemy(539, 25);
		enemy[3] = new Enemy(735,590);
		enemy[4] = new Enemy(890,25);
		enemy[5] = new Enemy(1055,590);
		
		enemy[6] = new Enemy(1253,25);
		enemy[7] = new Enemy(1253,580);
		
	

		time = new Timer(1,this);
		time.start();

	}

	public void actionPerformed(ActionEvent e){
		enemy[0].move3();
		enemy[1].move3();
		enemy[2].move3();
		enemy[3].move3();
		enemy[4].move3();
		enemy[5].move3();
		
		enemy[6].Left_Right();
		enemy[7].Left_Right();


	}

	public void paintComponent(Graphics g)	{

		g1 [0] = (Graphics2D) g;
		g1 [1] = (Graphics2D) g;
		g1 [2] = (Graphics2D) g;
		g1 [3] = (Graphics2D) g;
		g1 [4] = (Graphics2D) g;
		g1 [5] = (Graphics2D) g;
		
		g1 [6] = (Graphics2D) g;
		g1 [7] = (Graphics2D) g;

		g1[0].drawImage(Image,enemy[0].x, enemy[0].y, 85, 120, null);
		g1[1].drawImage(Image,enemy[1].x, enemy[1].y, 85, 120, null);
		g1[2].drawImage(Image,enemy[2].x, enemy[2].y, 85, 120, null);
		g1[3].drawImage(Image,enemy[3].x, enemy[3].y, 85, 120, null);
		g1[4].drawImage(Image,enemy[4].x, enemy[4].y, 85, 120, null);
		g1[5].drawImage(Image,enemy[5].x, enemy[5].y, 85, 120, null);
		
		g1[6].drawImage(Image,enemy[6].x, enemy[6].y, 85, 120, null);
		g1[7].drawImage(Image,enemy[7].x, enemy[7].y, 85, 120, null);
	}
}

class MovingObj4 extends JPanel implements ActionListener
{

	Enemy enemy[]=new Enemy[9]; 
	Timer time;
	Graphics2D g1[]= new Graphics2D[9];
	BufferedImage Image;

	public MovingObj4(){

		setBounds(0, 0,1358,758);

		try{
			Image = ImageIO.read(getClass().getResource("Portal4.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}



		enemy[0] = new Enemy(220 , 25);
		enemy[1] = new Enemy(350, 620);
		enemy[2] = new Enemy(487, 25);
		enemy[3] = new Enemy(622,620);
		enemy[4] = new Enemy(768,25);
		enemy[5] = new Enemy(912,620);
		enemy[6] = new Enemy(1051,25);
		
		enemy[7] = new Enemy(205, 151);
		enemy[8] = new Enemy(205, 435);

		time = new Timer(1,this);
		time.start();

	}

	public void actionPerformed(ActionEvent e){
		enemy[0].move4();
		enemy[1].move4();
		enemy[2].move4();
		enemy[3].move4();
		enemy[4].move4();
		enemy[5].move4();
		enemy[6].move4();
		
		enemy[7].Left_Right();
		enemy[8].Left_Right();

	}

	public void paintComponent(Graphics g)	{

		g1 [0] = (Graphics2D) g;
		g1 [1] = (Graphics2D) g;
		g1 [2] = (Graphics2D) g;
		g1 [3] = (Graphics2D) g;
		g1 [4] = (Graphics2D) g;
		g1 [5] = (Graphics2D) g;
		g1 [6] = (Graphics2D) g;
		
		g1 [7] = (Graphics2D) g;
		g1 [8] = (Graphics2D) g;

		g1[0].drawImage(Image,enemy[0].x, enemy[0].y, 50, 100, null);
		g1[1].drawImage(Image,enemy[1].x, enemy[1].y, 50, 100, null);
		g1[2].drawImage(Image,enemy[2].x, enemy[2].y, 50, 100, null);
		g1[3].drawImage(Image,enemy[3].x, enemy[3].y, 50, 100, null);
		g1[4].drawImage(Image,enemy[4].x, enemy[4].y, 50, 100, null);
		g1[5].drawImage(Image,enemy[5].x, enemy[5].y, 50, 100, null);
		g1[6].drawImage(Image,enemy[6].x, enemy[6].y, 50, 100, null);
		
		g1[7].drawImage(Image,enemy[7].x, enemy[7].y, 50, 100, null);
		g1[8].drawImage(Image,enemy[8].x, enemy[8].y, 50, 100, null);
	}
}



class MovingObj5 extends JPanel implements ActionListener
{

	Enemy enemy[]=new Enemy[12]; 
	Timer time;
	Graphics2D g1[]= new Graphics2D[12];
	BufferedImage Image;

	public MovingObj5(){

		setBounds(0, 0,1358,758);

		try{
			Image = ImageIO.read(getClass().getResource("Portal5.png"));
		}catch (IOException e){
			e.printStackTrace();	
		}



		enemy[0] = new Enemy(210, 25);
		enemy[1] = new Enemy(333, 625);
		enemy[2] = new Enemy(454, 25);
		enemy[3] = new Enemy(572, 625);
		enemy[4] = new Enemy(699,25);
		enemy[5] = new Enemy(821,625);
		enemy[6] = new Enemy(946,25);
		enemy[7] = new Enemy(1070, 625);
		
		enemy[8] = new Enemy(1279, 25);
		enemy[9] = new Enemy(205, 435);
		enemy[10] = new Enemy(205, 217);
		enemy[11] = new Enemy(1279, 625);

		time = new Timer(1,this);
		time.start();

	}

	public void actionPerformed(ActionEvent e){
		enemy[0].move5();
		enemy[1].move5();
		enemy[2].move5();
		enemy[3].move5();
		enemy[4].move5();
		enemy[5].move5();
		enemy[6].move5();
		enemy[7].move5();
		
		enemy[8].Left_Right();
		enemy[9].Left_Right();
		enemy[10].Left_Right();
		enemy[11].Left_Right();

		
	}

	public void paintComponent(Graphics g)	{

		g1 [0] = (Graphics2D) g;
		g1 [1] = (Graphics2D) g;
		g1 [2] = (Graphics2D) g;
		g1 [3] = (Graphics2D) g;
		g1 [4] = (Graphics2D) g;
		g1 [5] = (Graphics2D) g;
		g1 [6] = (Graphics2D) g;
		g1 [7] = (Graphics2D) g;
		
		g1 [8] = (Graphics2D) g;
		g1 [9] = (Graphics2D) g;
		g1 [10] = (Graphics2D) g;
		g1 [11] = (Graphics2D) g;

		g1[0].drawImage(Image,enemy[0].x, enemy[0].y, 41, 80, null);
		g1[1].drawImage(Image,enemy[1].x, enemy[1].y, 41, 80, null);
		g1[2].drawImage(Image,enemy[2].x, enemy[2].y, 41, 80, null);
		g1[3].drawImage(Image,enemy[3].x, enemy[3].y, 41, 80, null);
		g1[4].drawImage(Image,enemy[4].x, enemy[4].y, 41, 80, null);
		g1[5].drawImage(Image,enemy[5].x, enemy[5].y, 41, 80, null);
		g1[6].drawImage(Image,enemy[6].x, enemy[6].y, 41, 80, null);
		g1[7].drawImage(Image,enemy[7].x, enemy[7].y, 41, 80, null);
		
		g1[8].drawImage(Image,enemy[8].x, enemy[8].y, 41, 80, null);
		g1[9].drawImage(Image,enemy[9].x, enemy[9].y, 41, 80, null);
		g1[10].drawImage(Image,enemy[10].x, enemy[10].y, 41, 80, null);
		g1[11].drawImage(Image,enemy[11].x, enemy[11].y, 41, 80, null);
	}
}





class Enemy
{
	int x , y ;
	boolean UP_DOWN=false;


	public Enemy(int X,int Y)
	{
		x=X;
		y=Y;
	}

	 void move(){

		if (y>=684){
			UP_DOWN=true;
		}
		if (y<=25){
			UP_DOWN =false;
		}
		if(UP_DOWN){
			y-=6;
		}
		else{
			y+=6;
		}
	}
	 void move2(){

		if (y>=684){
			UP_DOWN=true;
		}
		if (y<=25){
			UP_DOWN =false;
		}
		if(UP_DOWN){
			y-=5;
		}
		else{
			y+=5;
		}
	}
	 void move3(){

		if (y>=590){
			UP_DOWN=true;
		}
		if (y<=25){
			UP_DOWN =false;
		}
		if(UP_DOWN){
			y-=5;
		}
		else{
			y+=5;
		}
	}
	 void move4(){

		if (y>=620){
			UP_DOWN=true;
		}
		if (y<=25){
			UP_DOWN =false;
		}
		if(UP_DOWN){
			y-=4;
		}
		else{
			y+=4;
		}
	}
	 void move5(){

		if (y>=625){
			UP_DOWN=true;
		}
		if (y<=25){
			UP_DOWN =false;
		}
		if(UP_DOWN){
			y-=4;
		}
		else{
			y+=4;
		}
	}
	 void Left_Right(){
			if (x>=1220){
				UP_DOWN=true;
			}
			if (x<=195){
				UP_DOWN =false;
			}
			if(UP_DOWN){
				x-=4;
			}
			else{
				x+=4;
			}
		}
	 void cLeft_Right(){
			if (x>=1220){
				UP_DOWN=true;
			}
			if (x<=195){
				UP_DOWN =false;
			}
			if(UP_DOWN){
				x-=2;
			}
			else{
				x+=10;
			}
		}

}
