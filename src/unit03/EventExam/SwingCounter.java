package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{

	JLabel lb = new JLabel("ī���Ͱ�");
	JTextField tf = new JTextField("0",5);
	//����
	JButton btnInc = new JButton("����");
	JButton btnDec = new JButton("����");
	JButton btnCls = new JButton("�ʱ�ȭ");
	
	
	SwingCounter() {
		
		
		JPanel p = new JPanel();
		add(p);
		
		p.add(lb);
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
		
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		
		setTitle("����ī����");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingCounter();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInc) {
			String str = tf.getText();
			int cnt =Integer.parseInt(str);
			cnt+=1;
			tf.setText(cnt+"");
		}
		
		else if(e.getSource() == btnDec) {
			String str = tf.getText();
			int cnt =Integer.parseInt(str);
			cnt-=1;
			tf.setText(cnt+"");
		}
		else if(e.getSource() == btnCls) {
			String str = tf.getText();
			int cnt = Integer.parseInt(str);
			cnt=0;
			tf.setText(cnt+"");
		}
	}
	
}
