package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.*;

public class MenuActionEventEx extends JFrame implements ActionListener{
	
	JMenuBar mb = new JMenuBar();
	JMenu m_Screen = new JMenu("Screen");
	JMenuItem [] screenItem = new JMenuItem[4];
	String [] screenNames = {"불러오기", "숨기기", "다시보여주기", "끝내기"};
	JLabel imgLabel = new JLabel();
	JPanel p = new JPanel();
	
	MenuActionEventEx() {
		
		add(imgLabel, BorderLayout.CENTER);
		
		setJMenuBar(mb);
		mb.add(m_Screen);
		
		for(int i=0 ; i<screenItem.length ; i++) {
			
			screenItem[i] = new JMenuItem(screenNames[i]);
			m_Screen.add(screenItem[i]);
			screenItem[i].addActionListener(this);
			
		}
		
		setTitle("메뉴 만들기 예제");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuActionEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		
		case "불러오기" :
			imgLabel.setIcon(new ImageIcon("img/img.jpg"));;
			break;
		case "숨기기" :
			imgLabel.setVisible(false);
			break;
		case "다시보여주기" :
			imgLabel.setVisible(true);
			break;
		case "끝내기" :
			System.exit(0);
			break;
		}
		
	}

}
