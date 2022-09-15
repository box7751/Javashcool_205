package nuit03.LayoutExam;

import javax.swing.JFrame;

public class HelloSwing extends JFrame{
	
	HelloSwing(){
		
		setTitle("¾È³ç ½ºÀ®!");
		setSize(300,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new HelloSwing();

	}
	
}
