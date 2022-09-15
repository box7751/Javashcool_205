package nuit03.LayoutExam;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloAbsluteLayout extends JFrame{

	HelloAbsluteLayout() {
		setLayout(null);
		
		JButton b1 = new JButton("버튼1");
		b1.setSize(70,40);
		b1.setLocation(10,30);
		
		JButton b2 = new JButton("버튼2");
		b2.setBounds(150,30,90,20);
		
		add(b1);
		add(b2);
		
		setTitle("배치관리자가 없는 절대값 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloAbsluteLayout();

	}

}

