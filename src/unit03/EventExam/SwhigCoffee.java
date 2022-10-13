package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwhigCoffee extends JFrame implements ItemListener{
	
	ButtonGroup rg = new ButtonGroup();
	
	JRadioButton rb_ame = new JRadioButton("�Ƹ޸�ī��");
	JRadioButton rb_latte = new JRadioButton("��");
	JRadioButton rb_cappu = new JRadioButton("īǪġ��");
	
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
		
		//�̺�Ʈ �ޱ�.
		rb_ame.addItemListener(this);
		rb_latte.addItemListener(this);
		rb_cappu.addItemListener(this);
		
		
		
		setTitle("Ŀ���ֹ�");
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
			ta.append(((JRadioButton)e.getItem()).getText() + "�� ���õǾ����ϴ�.\n");
		}
		else if (e.getStateChange()==ItemEvent.DESELECTED) {
			ta.append(((JRadioButton)e.getItem()).getText() + "�� �����Ǿ����ϴ�.\n");
		}
	}
	
}
