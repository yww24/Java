import java.awt.Container;
import java.awt.FlowLayout;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class Practice6 extends JFrame{
	public Practice6() {
		setTitle("Practice6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		ImageIcon icon = new ImageIcon("다운로드.jpg");
		
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();
		JPanel pan5 = new JPanel(new FlowLayout());
		
		
		c.setLayout(new FlowLayout());
		pan1.add(new JButton("버튼"));
		c.add(pan1);
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",icon);
		cherry.setBorderPainted(true);
		
		pan2.add(apple);
		pan2.add(pear);
		pan2.add(cherry);
		c.add(pan2);
		
		JRadioButton radio[] = new JRadioButton[3];
		radio[0] = new JRadioButton("사과");
		radio[1] = new JRadioButton("배",true);
		radio[2] = new JRadioButton("체리",icon);
		radio[2].setBorderPainted(true);
		
		pan3.add(radio[0]);
		pan3.add(radio[1]);
		pan3.add(radio[2]);
		
		c.add(pan3);
		
		JSlider sl = new JSlider(0,200,100);
		sl.setMinorTickSpacing(10);
		sl.setMajorTickSpacing(50);
		sl.setPaintTicks(true);
		sl.setPaintLabels(true);
		
		pan4.add(sl);
		c.add(pan4);
		
		
		pan5.add(new JLabel("이름:"));
		pan5.add(new JTextField(15));
		pan5.add(new JLabel("학과:"));
		pan5.add(new JTextField("컴퓨터공학과(수정)",15));
		pan5.add(new JLabel("주소:"));
		pan5.add(new JTextField("성남시 ...",15));
		c.add(pan5);
		
		c.add(new JLabel("Enter the password:"));
		c.add(new JPasswordField(8));
		
		
		String[] month = {"January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		SpinnerListModel listModel = new SpinnerListModel(month);
		
		JSpinner js = new JSpinner(listModel);
		
		c.add(new JLabel("Month:"));
		c.add(js);
		
		JTextArea ja = new JTextArea("hello",7,20);
		ja.getAccessibleContext();
		c.add(ja);
		
		String[] fruit = {"apple","banana","kiwi","mango","pear"
				,"peach","berry","strawberry","blackberry"};
		JComboBox jc = new JComboBox(fruit);
		c.add(jc);
		
		ImageIcon[] ic = new ImageIcon[5];
		ic[0] = new ImageIcon("1.png");
		ic[1] = new ImageIcon("2.png");
		ic[2] = new ImageIcon("3.png");
		ic[3] = new ImageIcon("4.png");
		ic[4] = new ImageIcon("5.png");
		
		JList jl = new JList(fruit);
		JList jls = new JList(fruit);
		JScrollPane jp = new JScrollPane(jls);
		JList jli = new JList(ic);
		
		c.add(jl);
		c.add(jli);
		c.add(jp);
		
		
		setSize(700,1000);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Practice6();
	}
}
