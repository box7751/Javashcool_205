package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingJumin extends JFrame implements ActionListener, KeyListener{

	JLabel lb = new JLabel("-");
	JPanel p = new JPanel();
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton btn = new JButton("버튼");
	
	SwingJumin() {
		
		add(p);
		p.add(tf1);
		p.add(lb);
		p.add(tf2);
		p.add(btn);
		
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		btn.addActionListener(this);
		
		setTitle("주민번호 분석");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		

		
		p.setFocusable(true);
		p.requestFocus();
	}
	public static void main(String[] args) {
		new SwingJumin();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource() == tf2 && e.getKeyCode() == KeyEvent.VK_ENTER)
			btn.doClick();
	
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
		if(tf1.getText().trim().length() == 6)
			tf2.requestFocus();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str1 = tf1.getText().trim();
		String str2 = tf2.getText().trim();
		String year = null;
		
		if(str1.substring(0,1).equals("1") || str1.substring(0,1).equals("2"))//1900년도 ,2000년도
		
			year = "19"+str1.substring(0,2)+"년";
		else if(str2.substring(0,1).equals("3") || str2.substring(0,1).equals("4"))
			year = "20"+str1.substring(0,2)+"년";
		
		
		JOptionPane.showMessageDialog(null,  "당신의 생일은 "+year+str1.substring(2,4)+"월"+str1.substring(4,6)+"일 입니다.");
	}

}
