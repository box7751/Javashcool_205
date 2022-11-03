package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamblingGame extends JFrame implements KeyListener{

	JPanel p = new JPanel();
	JLabel lb_result = new JLabel("시작합니다.", JLabel.CENTER);
	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	
	GamblingGame() {
		add(p, BorderLayout.CENTER);
		p.setLayout(null);
		
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
		
		lb1.setBounds(30, 50, 60, 30);
		lb2.setBounds(110, 50, 60, 30);
		lb3.setBounds(180, 50, 60, 30);
		
		lb1.setOpaque(true);
		lb1.setBackground(Color.pink);
		
		lb2.setOpaque(true);
		lb2.setBackground(Color.pink);
		
		lb3.setOpaque(true);
		lb3.setBackground(Color.pink);
		
		add(lb_result, BorderLayout.SOUTH);
		
		p.addKeyListener(this);
		
		setTitle("겜블링게임");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new GamblingGame();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		//if(e.getKeycode() == KeyEvent.Vk_Enter)
		if(e.getKeyChar() == '\n') {
			
			int num1 = (int)(Math.random() * 5);
			int num2 = (int)(Math.random() * 5);
			int num3 = (int)(Math.random() * 5);
			
			lb1.setText(num1+"");
			lb2.setText(num2+"");
			lb3.setText(num3+"");
			
			if(num1 == num2 && num2 == num3) {
				lb_result.setText("축하합니다.");
			}
			else
				lb_result.setText("아쉽습니다.");
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

}
