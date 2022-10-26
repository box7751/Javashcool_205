package nuit03.LayoutExam;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalcuator extends JFrame implements ActionListener{
	
	JLabel lb_Src = new JLabel("수식");
	JLabel lb_des = new JLabel("결과");
	JTextField src = new JTextField(10);
	JTextField des = new JTextField(10);
	
	JButton [] btn = new JButton[16];
	String [] btnNamaes= {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "CE", "계산", "+","-","X","/"
	};
	
	int operand1 = 0;
	int operand2 = 0;
	char operator = ' ';
	int index = 0;
	
	SimpleCalcuator() {
		
		JPanel p1 = new JPanel();
		add(p1, BorderLayout.NORTH);
		
		p1.add(lb_Src);
		p1.add(src);
		p1.add(lb_des);
		p1.add(des);
		
		JPanel p2 = new JPanel();
		add(p2, BorderLayout.CENTER);
		p2.setLayout(new GridLayout(0,4,5,5));
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(btnNamaes[i]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		
		setTitle("간단한 계산기");
		setSize(350,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SimpleCalcuator();

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "CE"){
			src.setText("");
			des.setText("");
			operand1 = 0;
			operand2 = 0;
			index = 0;
			operator = ' ';
		 }
		 else if(e.getActionCommand() == "계산"){
			 String strNum = src.getText();
			 char ch;
			 for(int i=0; i<strNum.length(); i++) {
				 ch = strNum.charAt(i);
				 
				 if(ch == '+' || ch == '-' || ch == 'X' || ch == '/') {
					 index = i;
					 operator = ch;
				 }
			 }
			 
			 operand1 = Integer.parseInt(strNum.substring(0, index));
			 operand2 = Integer.parseInt(strNum.substring(index+1));
			 
			 switch(operator) {
			 
			 case '+':
				 des.setText((operand1 + operand2)+"");
				 break;
			 case '-':
				 des.setText((operand1 - operand2)+"");
				 break;
			 case 'X':
				 des.setText((operand1 * operand2)+"");
				 break;
			 case '/':
				 des.setText((operand1 / operand2)+"");
				 break;
			 }
		 }
		 else{
			 String desStr = src.getText()+e.getActionCommand();
			 src.setText(desStr);
		 }
		
	}
}
