package unit03.EventExam;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{
	int sum=0;
	JLabel lb = new JLabel("사과100원,배500원,체리2000원");
	JLabel lb_reult = new JLabel("현재 "+sum +"원 입니다.");
	
	JCheckBox [] fruit = new JCheckBox[3];
	String[] names = {"사과", "배", "체리"};


	CheckBoxItemEventEx(){
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		add(p);
		//변경
		
		p.add(lb);
		
		for(int i=0; i<fruit.length; i++) {
			fruit[i] = new JCheckBox(names[i]);
			p.add(fruit[i]);
			fruit[i].addItemListener(null);
		}
		
		p.add(lb_reult);
		
		
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
			if(e.getItem() == fruit[0]) { 
				sum+=100;
			}
			else if (e.getItem() == fruit[1]) {
				sum+=500;
			}
			else if (e.getItem() == fruit[2]) {
				sum+=2000;
			}
		}else if(e.getStateChange()==ItemEvent.DESELECTED) {
			if(e.getItem() == fruit[0]) {
				sum-=100;
			}
			else if (e.getItem() == fruit[1]) {
				sum-=500;
			}
			else if (e.getItem() == fruit[2]) {
				sum-=2000;
			}
		}
		String P = "현재 "+sum +"원 입니다.";
		lb_reult.setText(P);
	}

}
