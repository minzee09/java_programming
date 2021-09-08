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
		setTitle("���� ����");
		label1 = new JLabel("������ �Է��Ͻÿ�");
		textField1 = new JTextField(5);
		
		label2 = new JLabel("������ �Է��Ͻÿ�");
		textField2 = new JTextField(5);
		
		button = new JButton("��ȯ");
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
			textField3.setText("���ڴ� �� " + (int)(Integer.valueOf(textField1.getText()) * Float.valueOf(textField2.getText())/100) + "���� �Դϴ�.");
		}
	}
}
public class InterestCalculator {
	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
	}
}
