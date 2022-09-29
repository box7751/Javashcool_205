package nuit03.LayoutExam;

import java.awt.*;

import javax.swing.*;

public class LayoutTest2 extends JFrame{
		
		LayoutTest2() {
			
			setLayout(new BorderLayout());			
			
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
			JButton btn4 = new JButton("버튼4");
			JButton btn5 = new JButton("버튼5");
			JButton btn6 = new JButton("버튼6");
			
			JPanel p1 = new JPanel();
			p1.setLayout(new FlowLayout());			
			p1.add(btn1);
			p1.add(btn2);
			add(p1, BorderLayout.NORTH);
			
			JPanel p2 = new JPanel();
			p2.setLayout(new GridLayout(0,2));
			p2.add(btn3);
			p2.add(btn4);
			add(p2, BorderLayout.CENTER);
			
			JPanel p3 = new JPanel();
			p3.setLayout(new FlowLayout());
			p3.add(btn5);
			p3.add(btn6);
			add(p3, BorderLayout.SOUTH);
			
			
			
			//프레임기본세팅
			setTitle("레이아윳 섞기");
			setSize(400, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			setVisible(true);
			
			
		}
		
		
	public static void main(String[] args) {
		new LayoutTest2();

	}

}
