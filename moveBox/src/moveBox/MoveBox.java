package moveBox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	
	private JPanel panel,panelButton,panelBox;
	private JButton button1,button2;
	int x = 260;
	
	MyFrame()
	{
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("박스 움직이기");
		
		panel = new JPanel();
		panelButton = new JPanel();
		panelBox = new JPanel();
		
		panel.setBackground(Color.YELLOW);
		
		panelBox.setBackground(Color.RED);
		panelBox.setBounds(x,20,50,300);
		
		button1 = new JButton("왼쪽으로 이동");
		button1.addActionListener(this);
		
		button2 = new JButton("오른쪽으로 이동");
		button2.addActionListener(this);
		
		panelButton.add(button1);
		panelButton.add(button2);

		panel.add(panelBox);
		panel.setLayout(new BorderLayout());
		panel.add(panelButton,BorderLayout.SOUTH);
			
		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1)
		{
			x -= 20;
			panelBox.setBounds(x,20,50,300);
		}
		if(e.getSource() == button2)
		{
			x += 20;
			panelBox.setBounds(x,20,50,300);
		}
		
	}
}

public class MoveBox {

	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
	}
}