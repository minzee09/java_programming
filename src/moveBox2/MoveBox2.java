package moveBox2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	
	private JPanel panel,panelButton;
	private JButton button1,button2;
	int x = 260;
	int x1,x2,drag;
	
	class MyPanel extends JPanel{
		public MyPanel()
		{
			addKeyListener(new KeyListener() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					int keycode = e.getKeyCode();
					switch(keycode) {
					case KeyEvent.VK_LEFT:
						x -= 20;
						break;
					case KeyEvent.VK_RIGHT:
						x += 20;
						break;
					}
					repaint();
				}

				public void keyReleased(KeyEvent e) {}
				public void keyTyped(KeyEvent e) {}
				
			});
			
			this.requestFocus();
			setFocusable(true);
		
			addMouseListener(new MouseListener() {

				@Override
				public void mousePressed(MouseEvent e) {
					x1 = e.getX();		
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					x2 = e.getX();
					drag = x2- x1;
					x += drag;
					repaint();
				}

				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
				public void mouseClicked(MouseEvent e) {}
			});
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(x, 20, 50, 300);
		}
	}
	
	MyFrame()
	{
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("박스 움직이기");
		
		panel = new MyPanel();
		panelButton = new JPanel();
		
		panel.setBackground(Color.YELLOW);
		
		button1 = new JButton("왼쪽으로 이동");
		button1.addActionListener(this);
		button1.setFocusable(false);
		
		button2 = new JButton("오른쪽으로 이동");
		button2.addActionListener(this);
		button2.setFocusable(false);
		
		panelButton.add(button1);
		panelButton.add(button2);

		panel.setLayout(new BorderLayout());
		panel.add(panelButton,BorderLayout.SOUTH);
			
		add(panel);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1)
			x -= 20;
		
		if(e.getSource() == button2)
			x += 20;
		
		repaint();
	}
}

public class MoveBox2 {

	public static void main(String[] args) {
		MyFrame f1 = new MyFrame();
	}
}