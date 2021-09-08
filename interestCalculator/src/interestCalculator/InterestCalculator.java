package interestCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

	private JPanel panel;
	private JLabel label1, label2;
	private JTextField textField1, textField2, textField3;
	private JButton button;
	
	MyFrame()
	{
		setSize(220,160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자 계산기");
		label1 = new JLabel("원금을 입력하시오");
		textField1 = new JTextField(5);
		
		label2 = new JLabel("이율을 입력하시오");
		textField2 = new JTextField(5);
		
		button = new JButton("변환");
		button.addActionListener(this);
		textField3 = new JTextField(15);
		textField3.setEditable(false);
		
		panel = new JPanel();
		
		panel.add(label1);
		panel.add(textField1);
		panel.add(label2);
		panel.add(textField2);
		panel.add(button);
		panel.add(textField3);
		add(panel);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button)
		{
			textField3.setText("이자는 연 " + (int)(Integer.valueOf(textField1.getText()) * Float.valueOf(textField2.getText())/100) + "만원 입니다.");
		}
	}
}
public class InterestCalculator {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
	}
}
