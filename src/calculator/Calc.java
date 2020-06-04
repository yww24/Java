package calculator;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calc extends JFrame{
	
	JTextField jt1 = new JTextField(5);
	JTextField jt2 = new JTextField(5);
	JTextField res = new JTextField(10);
	JOptionPane jo = new JOptionPane();
	
	JButton add = new JButton("+");
	JButton substract = new JButton("-");
	JButton multiple = new JButton("*");
	JButton divide = new JButton("/");
	
	Calc(){
		setTitle("사칙연산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		add.addActionListener(new MyActionListener());
		substract.addActionListener(new MyActionListener());
		multiple.addActionListener(new MyActionListener());
		divide.addActionListener(new MyActionListener());
		
		c.add(jt1);
		c.add(jt2);
		c.add(res);
		c.add(add);
		c.add(substract);
		c.add(multiple);
		c.add(divide);
		
		setSize(300,200);
		setVisible(true);
	}
	
	int Add(int a, int b){
		return a+b;
	}
	int Substract(int a, int b) {
		return a-b;
	}
	int Multiple(int a, int b) {
		return a*b;
	}
	int Divide(int a, int b) {
		return a/b;
	}
	
	
	
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton button = (JButton)e.getSource();
			int a = Integer.parseInt(jt1.getText());
			int b = Integer.parseInt(jt2.getText());
			
			switch(button.getText()) {
			case "+":
				res.setText(Integer.toString(Add(a,b)));
				break;
			case "-":
				res.setText(Integer.toString(Substract(a,b)));
				break;
			case "*":
				res.setText(Integer.toString(Multiple(a,b)));
				break;
			case "/":
				try {
					res.setText(Integer.toString(Divide(a,b)));
					break;
				}catch (ArithmeticException ae) {
					JOptionPane.showMessageDialog(null, "0으로 나눌 수 없습니다.");
				}
			}
		}
		
	}
}

