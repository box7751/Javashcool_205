package nuit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPeanel extends JFrame{
	HelloPeanel()
	{
		JPanel p = new JPanel();
		add(p);
		p.setBackground(Color.orange);
		
		JButton but1 = new JButton("버튼1");
		p.add(but1);
		but1.setBackground(Color.yellow);
		
		JButton but2 = new JButton("버튼2");
		p.add(but2);
		but2.setBackground(Color.pink);
		
		
		setTitle("안녕 패널");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}	
	public static void main(String[] args) {
		new HelloPeanel(); 

	}

}
