import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Map extends JPanel {

	Random rn = new Random();

	JLabel lvl1[] = new JLabel[25];
	//	JLabel lvl2[] = new JLabel[36];
	JLabel Winner [] = new JLabel[1];
	JLabel BackgroundPlay ;

	JButton EXIT;
	JLabel lblleft, lblright, lblup, lbldown ;




	public Map()
	{

		setBounds(0,0,1358,758);

		//		EXIT = new JButton("EXIT");
		//		EXIT.setBounds(0, 0, 100,21);
		//		add(EXIT);


		// FOUR LABEL WALL

		lblleft = new JLabel();
		lblleft.setOpaque(true);
		lblleft.setBounds(0, 0, 20, 723);
		lblleft.setBackground(Color.BLACK);
		add(lblleft);

		lblright = new JLabel();
		lblright.setOpaque(true);
		lblright.setBounds(1332, 0, 20, 723);
		lblright.setBackground(Color.BLACK);
		add(lblright);

		lblup = new JLabel();
		lblup.setOpaque(true);
		lblup.setBackground(Color.BLACK);
		lblup.setBounds(0, 0, 1352, 20);
		add(lblup);

		lbldown = new JLabel();
		lbldown.setOpaque(true);
		lbldown.setBackground(Color.BLACK);
		lbldown.setBounds(0, 703, 1352, 20);
		add(lbldown);

		// END FOUR LABEL WALL

		Winner[0] = new JLabel(new ImageIcon(getClass().getResource("Banana.png")));
		Winner[0].setBounds(1260,310,68,80);
		add(Winner[0]);

		addlvl1(151,0,4,0);
		addlvl1(383,5,9,5);
		addlvl1(619,10,14,10);
		addlvl1(866,15,19,15);
		addlvl1(1093,20,24,20);


		BackgroundPlay = new JLabel(new ImageIcon(getClass().getResource("lvl1_BG.png")));
		BackgroundPlay.setBounds(0,0,1358,720);
		add(BackgroundPlay);

	}
	void addlvl1(int x, int start, int end, int r){


		int y = 13;
		int n = rn.nextInt(3)+r;
		for (int i = start; i<=end;i++){
			lvl1[i] = new JLabel();
			lvl1[i].setOpaque(true);
			lvl1[i].setBackground(Color.red);
		//	lvl1[i].setIcon(new ImageIcon (getClass().getResource("Wall-1.png")));
			lvl1[i].setBounds(x, y, 107, 134);
			add(lvl1[i]);
			y+=141;
		}
		removeBlock1(n);
		if(start != 0){
			removeBlock1(n+2);
		}
	}

	void removeBlock1(int n){
		lvl1[n].setLocation(-100,-100);
		remove(lvl1[n]);
	}
}




class Map2 extends JPanel {

	Random rn = new Random();


	JLabel lvl2[] = new JLabel[36];
	JLabel BackgroundPlay ;
	JLabel Winner [] = new JLabel[1];

	JButton EXIT;
	JLabel lblleft, lblright, lblup, lbldown ;




	public Map2()
	{

		setBounds(0,0,1358,758);

		//		EXIT = new JButton("EXIT");
		//		EXIT.setBounds(0, 0, 100,21);
		//		add(EXIT);


		// FOUR LABEL WALL

		lblleft = new JLabel();
		lblleft.setOpaque(true);
		lblleft.setBounds(0, 0, 20, 723);
		lblleft.setBackground(Color.BLACK);
		add(lblleft);

		lblright = new JLabel();
		lblright.setOpaque(true);
		lblright.setBounds(1332, 0, 20, 723);
		lblright.setBackground(Color.BLACK);
		add(lblright);

		lblup = new JLabel();
		lblup.setOpaque(true);
		lblup.setBackground(Color.BLACK);
		lblup.setBounds(0, 0, 1352, 20);
		add(lblup);

		lbldown = new JLabel();
		lbldown.setOpaque(true);
		lbldown.setBackground(Color.BLACK);
		lbldown.setBounds(0, 703, 1352, 20);
		add(lbldown);
		
		Winner[0] = new JLabel(new ImageIcon(getClass().getResource("Banana.png")));
		Winner[0].setBounds(1260,310,68,80);
		add(Winner[0]);

		addlvl2(151,0,5,0);
		addlvl2(343,6,11,6);
		addlvl2(533,12,17,12);
		addlvl2(727,18,23,18);
		addlvl2(916,24,29,24);
		addlvl2(1104,30,35,30);

		BackgroundPlay = new JLabel(new ImageIcon(getClass().getResource("lvl2_BG.png")));
		BackgroundPlay.setBounds(0, 0,1358,758);
		add(BackgroundPlay);


	}
	void addlvl2(int x, int start, int end, int r){

		int y = 13;
		int n = rn.nextInt(3)+r;
		for (int i = start; i<=end;i++){
			lvl2[i] = new JLabel();
			lvl2[i].setOpaque(true);
			lvl2[i].setIcon(new ImageIcon (getClass().getResource("Wall-2.png")));
			lvl2[i].setBounds(x, y, 80, 109);
			add(lvl2[i]);
			y+=115;
		}
		removeBlock2(n);
		if(start != 0){
			removeBlock2(n+3);
		}
	}

	void removeBlock2(int n){
		lvl2[n].setLocation(0,0);
		remove(lvl2[n]);
	}

}




class Map3 extends JPanel{
	JLabel lvl3[] = new JLabel[49];
	JLabel lblleft, lblright, lblup, lbldown ;
	JButton EXIT;
	JLabel Winner [] = new JLabel[1];
	JLabel  BackgroundPlay3 ;
	Random rn = new Random();

	public Map3(){
		setBounds(0,0,1358,758);

		//		EXIT = new JButton("EXIT");
		//		EXIT.setBounds(0, 0, 100,21);
		//		add(EXIT);

		// FOUR LABEL WALL

		lblleft = new JLabel();
		lblleft.setOpaque(true);
		lblleft.setBounds(0, 0, 20, 723);
		lblleft.setBackground(Color.BLACK);
		add(lblleft);

		lblright = new JLabel();
		lblright.setOpaque(true);
		lblright.setBounds(1332, 0, 20, 723);
		lblright.setBackground(Color.BLACK);
		add(lblright);

		lblup = new JLabel();
		lblup.setOpaque(true);
		lblup.setBackground(Color.BLACK);
		lblup.setBounds(0, 0, 1352, 20);
		add(lblup);

		lbldown = new JLabel();
		lbldown.setOpaque(true);
		lbldown.setBackground(Color.BLACK);
		lbldown.setBounds(0, 703, 1352, 20);
		add(lbldown);
		
		Winner[0] = new JLabel(new ImageIcon(getClass().getResource("Banana.png")));
		Winner[0].setBounds(1260,310,68,80);
		add(Winner[0]);

		addlvl3(139,0,6,0);
		addlvl3(303,7,13,7);
		addlvl3(474,14,20,14);
		addlvl3(647,21,27,21);
		addlvl3(825,28,34,28);
		addlvl3(999,35,41,35);
		addlvl3(1160,42,48,42);

		BackgroundPlay3 = new JLabel(new ImageIcon(getClass().getResource("lvl3_BG.png")));
		BackgroundPlay3.setBounds(0, 0,1358,758);
		add(BackgroundPlay3);

	}
	void addlvl3(int x, int start, int end, int r ){
		int y = 13;
		int n = rn.nextInt(3)+r;
		for (int i = start; i<=end;i++){
			lvl3[i] = new JLabel();
			lvl3[i].setOpaque(true);
			lvl3[i].setIcon(new ImageIcon (getClass().getResource("Wall-3.png")));
			lvl3[i].setBounds(x, y, 50, 96);
			add(lvl3[i]);
			y+=100;
		}
		removeBlock3(n);
		removeBlock3(n+2);
		if(start != 0){
			removeBlock3(n+4);
			
		}
	}

	void removeBlock3(int n){
		lvl3[n].setLocation(0,0);
		remove(lvl3[n]);
	}

}





class Map4 extends JPanel{

	Random rn = new Random();

	JLabel lvl4[] = new JLabel[64];
	JLabel BackgroundPlay ;
	JLabel Winner [] = new JLabel[1];
	JButton EXIT;
	JLabel lblleft, lblright, lblup, lbldown ;




	public Map4()
	{

		setBounds(0,0,1358,758);
		//
		//		EXIT = new JButton("EXIT");
		//		EXIT.setBounds(0, 0, 100,21);
		//		add(EXIT);


		// FOUR LABEL WALL

		lblleft = new JLabel();
		lblleft.setOpaque(true);
		lblleft.setBounds(0, 0, 20, 723);
		lblleft.setBackground(Color.BLACK);
		add(lblleft);

		lblright = new JLabel();
		lblright.setOpaque(true);
		lblright.setBounds(1332, 0, 20, 723);
		lblright.setBackground(Color.BLACK);
		add(lblright);

		lblup = new JLabel();
		lblup.setOpaque(true);
		lblup.setBackground(Color.BLACK);
		lblup.setBounds(0, 0, 1352, 20);
		add(lblup);

		lbldown = new JLabel();
		lbldown.setOpaque(true);
		lbldown.setBackground(Color.BLACK);
		lbldown.setBounds(0, 703, 1352, 20);
		add(lbldown);

		// END FOUR LABEL WALL

				Winner[0] = new JLabel(new ImageIcon(getClass().getResource("Banana.png")));
				Winner[0].setBounds(1260,310,68,80);
				add(Winner[0]);

		addlvl4(147,0,7,0);
		addlvl4(283,8,15,8);
		addlvl4(422,16,23,16);
		addlvl4(560,24,31,24);
		addlvl4(704,32,39,32);
		addlvl4(850,40,47,40);
		addlvl4(997,48,55,48);
		addlvl4(1139,56,63,56);



		BackgroundPlay = new JLabel(new ImageIcon(getClass().getResource("lvl4_BG.png")));
		BackgroundPlay.setBounds(0,0,1358,720);
		add(BackgroundPlay);

	}
	void addlvl4(int x, int start, int end, int r){


		int y = 13;
		int n = rn.nextInt(3)+r;
		for (int i = start; i<=end;i++){
			lvl4[i] = new JLabel();
			lvl4[i].setOpaque(true);
			lvl4[i].setIcon(new ImageIcon (getClass().getResource("Wall-4.png")));
			lvl4[i].setBounds(x, y, 60, 87);
			add(lvl4[i]);
			y+=88;
		}
		removeBlock4(n);
		removeBlock4(n+2);
		if(start != 0){
			removeBlock4(n+4);
			
		}
	}

	void removeBlock4(int n){
		lvl4[n].setLocation(0,0);
		remove(lvl4[n]);
	}
}



class Map5 extends JPanel{

	Random rn = new Random();

	JLabel lvl5[] = new JLabel[81];
	JLabel BackgroundPlay ;
	JLabel Winner [] = new JLabel[1];

	JButton EXIT;
	JLabel lblleft, lblright, lblup, lbldown ;




	public Map5()
	{

		setBounds(0,0,1358,758);
		//
		//		EXIT = new JButton("EXIT");
		//		EXIT.setBounds(0, 0, 100,21);
		//		add(EXIT);


		// FOUR LABEL WALL

		lblleft = new JLabel();
		lblleft.setOpaque(true);
		lblleft.setBounds(0, 0, 20, 723);
		lblleft.setBackground(Color.BLACK);
		add(lblleft);

		lblright = new JLabel();
		lblright.setOpaque(true);
		lblright.setBounds(1332, 0, 20, 723);
		lblright.setBackground(Color.BLACK);
		add(lblright);

		lblup = new JLabel();
		lblup.setOpaque(true);
		lblup.setBackground(Color.BLACK);
		lblup.setBounds(0, 0, 1352, 20);
		add(lblup);

		lbldown = new JLabel();
		lbldown.setOpaque(true);
		lbldown.setBackground(Color.BLACK);
		lbldown.setBounds(0, 703, 1352, 20);
		add(lbldown);

		// END FOUR LABEL WALL

				Winner[0] = new JLabel(new ImageIcon(getClass().getResource("Banana.png")));
				Winner[0].setBounds(1260,310,68,80);
				add(Winner[0]);

		addlvl5(147,0,8,0);
		addlvl5(269,9,17,9);
		addlvl5(389,18,26,18);
		addlvl5(513,27,35,27);
		addlvl5(636,36,44,36);
		addlvl5(757,45,53,45);
		addlvl5(882,54,62,54);
		addlvl5(1006,63,71,63);
		addlvl5(1130,72,80,72);



		BackgroundPlay = new JLabel(new ImageIcon(getClass().getResource("lvl5_BG.png")));
		BackgroundPlay.setBounds(0,0,1358,720);
		add(BackgroundPlay);

	}
	void addlvl5(int x, int start, int end, int r){


		int y = 13;
		int n = rn.nextInt(3)+r;
		for (int i = start; i<=end;i++){
			lvl5[i] = new JLabel();
			lvl5[i].setOpaque(true);
			lvl5[i].setBackground(Color.BLUE);
			lvl5[i].setBounds(x, y, 41, 75);
			add(lvl5[i]);
			y+=78;
		}
		removeBlock5(n);
		removeBlock5(n+2);
		removeBlock5(n+4);
		if(start != 0){
			
			removeBlock5(n+6);
		}
	}

	void removeBlock5(int n){
		lvl5[n].setLocation(0,0);
		remove(lvl5[n]);
	}
}
