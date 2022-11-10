package unit03.EventExam;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener{
	
	JLabel lb = new JLabel("움직여봐");
	JPanel p = new JPanel();
	
	MouseEventAllEx() {
		
		add(p);
		p.add(lb);
		p.setLayout(null);
		
		lb.setBounds(100, 50, 80, 20);
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MouseEventAllEx();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getClickCount() == 2) {
			lb.setLocation(e.getX(), e.getY());
			setTitle("마우스가 더블클릭된 위치("+e.getX() + " , "+e.getY() + " ) ");
		}
		else {
			lb.setLocation(e.getX(), e.getY());
			setTitle("마우스가 클릭된 위치("+e.getX() + " , "+e.getY() + " ) ");
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 눌려진 위치("+e.getX() + " , "+e.getY() + " ) ");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 놓여진 위치("+e.getX() + " , "+e.getY() + " ) ");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.pink);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.yellow );
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 드래그 되고 있는 위치("+e.getX() + " , "+e.getY() + " ) ");
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("마우스가 움직이고 있는 위치("+e.getX() + " , "+e.getY() + " ) ");
		
	}

}
