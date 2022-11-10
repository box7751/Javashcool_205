package unit03.EventExam;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;

public class MouseWheelEventEx extends JFrame implements MouseWheelListener{

	JLabel lb = new JLabel("Love JAVA");
	int fontSize = 30;
	MouseWheelEventEx() {
		
		add(lb);
		lb.setFont(new Font("±º∏≤√º", Font.BOLD, fontSize));
		
		lb.addMouseWheelListener(this);
		
		setTitle("∏∂øÏΩ∫»Ÿ¿Ã∫•∆Æ");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MouseWheelEventEx();

	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if(e.getWheelRotation() < 0) {
			fontSize += 5;
			lb.setFont(new Font("±º∏≤√º", Font.BOLD, fontSize));
		}
		else {
			fontSize -= 5;
			lb.setFont(new Font("±º∏≤√º", Font.BOLD, fontSize));	
		}
		
	}

}
