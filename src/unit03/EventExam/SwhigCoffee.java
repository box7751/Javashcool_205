package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwhigCoffee extends JFrame implements ItemListener{
	
	ButtonGroup rg = new ButtonGroup();
	
	JRadioButton rb_ame = new JRadioButton("아메리카노");
	JRadioButton rb_latte = new JRadioButton("라떼");
	JRadioButton rb_cappu = new JRadioButton("카푸치노");
	
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	SwhigCoffee() {
		
		JPanel p = new JPanel();
		add(p, BorderLayout.NORTH);
		
		rg.add(rb_ame);
		rg.add(rb_latte); 
		rg.add(rb_cappu);
	
		p.add(rb_ame);
		p.add(rb_latte); 
		p.add(rb_cappu);
		
		
		add(sp, BorderLayout.CENTER);
		
		//이벤트 달기.
		rb_ame.addItemListener(this);
		rb_latte.addItemListener(this);
		rb_cappu.addItemListener(this);
		
		
		
		setTitle("커피주문");
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwhigCoffee();
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(((JRadioButton)e.getItem()).getText() + "가 선택되었습니다.\n");
		}
		else if (e.getStateChange()==ItemEvent.DESELECTED) {
			ta.append(((JRadioButton)e.getItem()).getText() + "가 해제되었습니다.\n");
		}
	}
	
}
