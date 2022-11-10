package unit03.EventExam;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ClickRandomLcation extends JFrame implements MouseListener{
	
	JLabel lb = new JLabel("나잡아봐라");
	JPanel p = new JPanel();
	
	ClickRandomLcation() {
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(50, 50, 100, 40);
		p.addMouseListener(this);
		
		
		setTitle("클릭 연습");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ClickRandomLcation();

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		int xBound = p.getWidth() - lb.getWidth();
		int yBound = p.getHeight() - lb.getHeight();
		
		int x = (int)(Math.random() * xBound ); 
		int y = (int)(Math.random() * yBound );
		
		lb.setLocation(x, y);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}

}
