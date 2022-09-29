package unit03.EventExam;

import javax.swing.*;

public class LabelButtonExam extends JFrame{
	
	LabelButtonExam() {
	
		JPanel p = new JPanel();
		add(p);
		
		JLabel lb = new JLabel("���ӽ� �����Դϴ�~~");
		p.add(lb);
		
		ImageIcon img = new ImageIcon("img/gosling.jpg");
		JLabel lbImage = new JLabel(img);
		p.add(lbImage);
		
		ImageIcon normalIcon = new ImageIcon("img/normalicon.gif");
		ImageIcon pressedIcon = new ImageIcon("img/pressedIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("img/rolloverIcon.gif");
		
		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		p.add(btn);
		
		
		setTitle("���� �ٲٱ�");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelButtonExam();

	}

}
