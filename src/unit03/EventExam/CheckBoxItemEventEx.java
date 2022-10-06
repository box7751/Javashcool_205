package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	int sum=0;
	JLabel lb = new JLabel("사과100원,배500원,체리2000원");
	JCheckBox fruit1 = new JCheckBox("사과");
	JCheckBox fruit2 = new JCheckBox("배");
	JCheckBox fruit3 = new JCheckBox("체리");
	JLabel lb_reult = new JLabel("현재 "+sum +"원 입니다.");

	CheckBoxItemEventEx(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		
		p.add(lb);
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb_reult);
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		setTitle("체크박스 이벤트 예제");
		setSize(250,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			if(e.getItem() == fruit1) { 
				sum+=100;
			}
			else if (e.getItem() == fruit2) {
				sum+=500;
			}
			else if (e.getItem() == fruit3) {
				sum+=2000;
			}
		}else if(e.getStateChange()==ItemEvent.DESELECTED) {
			if(e.getItem() == fruit1) {
				sum-=100;
			}
			else if (e.getItem() == fruit2) {
				sum-=500;
			}
			else if (e.getItem() == fruit3) {
				sum-=2000;
			}
		}
		String P = "현재 "+sum +"원 입니다.";
		lb_reult.setText(P);
	}

}
