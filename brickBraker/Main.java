package brickBraker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
		JFrame obj = new JFrame();
		GamePlay obj1 = new GamePlay();
		obj.setBounds(10, 10, 710, 600);
		obj.setTitle("Break Out Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(obj1);
		
		

	}

}
