package TextFieldEvent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
	JButton enter = new JButton("Ȯ��");
	JButton reset = new JButton("�ʱ�ȭ");
	
	JLabel result = new JLabel("\n");
	JTextField name = new JTextField(20);
	JTextField depart = new JTextField(20);
	JTextField addr = new JTextField(20);
	
	JPanel button = new JPanel();
	
	Frame(){
		setTitle("�ؽ�Ʈ�ʵ� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�̸�"));
		c.add(name);
		c.add(new JLabel("�а�"));
		c.add(depart);
		c.add(new JLabel("�ּ�"));
		c.add(addr);
		c.add(result);
		
		button.add(enter);
		button.add(reset);
		
		c.add(button);
	
		enter.addActionListener(new enterAction());
		reset.addActionListener(new resetAction());
		
		setSize(300,200);
		setVisible(true);
	}
	
	private class enterAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			result.setText(name.getText() + " " + depart.getText() + " " + addr.getText() + "\n");
		}
	}
	
	private class resetAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			name.setText("");
			depart.setText("");
			addr.setText("");
			result.setText("");
		}
		
	}
	
}
