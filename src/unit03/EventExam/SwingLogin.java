package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{
	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	
	JButton btnLogin = new JButton("로그인");
	JButton btnLogin1 = new JButton("취소");
	
	JLabel lbResult = new JLabel("결과출력",JLabel.LEFT);
	
	
	SwingLogin() {
		
		setLayout(new BorderLayout());
		
		ImageIcon img = new ImageIcon("img/robot.PNG");
		JLabel lbLoge = new JLabel(img);
		add(lbLoge, BorderLayout.NORTH);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		
		JLabel lbId = new JLabel("아이디", JLabel.CENTER);
		JLabel lbpwd = new JLabel("비밀번호", JLabel.CENTER);
		btnLogin.setBackground(Color.yellow);
		btnLogin1.setBackground(Color.pink);
		
		
		p.add(lbId);
		p.add(tfId);
		p.add(lbpwd);
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnLogin1);
		
		add(p, BorderLayout.CENTER);
		
		add(lbResult, BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnLogin1.addActionListener(this);
		
		setTitle("로그인");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new SwingLogin();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnLogin) {
			String strid = tfId.getText();
			String strpwd = new String(tfPwd.getPassword());
			
			if(strid.length() == 0)
				lbResult.setText("아이디를 입력하세요");
			else if (strpwd.length() == 0)
				lbResult.setText("비밀번호를 입려하세요");
			else
				lbResult.setText(strid+"님의 비밀번호는 "+strpwd+"입니다.");
			
			
		}
		else if(e.getSource() == btnLogin1) {
			lbResult.setText("취소하였습니다");
			tfId.setText("");
			tfPwd.setText("");
		}
		
	}
	
}
