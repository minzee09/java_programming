package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {

	private ArrayList<String> equation = new ArrayList<String>();
	private String num = "";
	
	private JPanel panel,buttonPanel1,buttonPanel2,p1,p2,p3;
	private JTextField textField;
	private JButton[] buttons1,buttons2;
	private String[] btnName1 = {
			"Backspace","CE","C"
	};
	private String[] btnName2 = {
		"7","8","9","/","sqrt",
		"4","5","6","*","%",
		"1","2","3","-","1/x",
		"0","+/-",".","+","="
	};
	
	MyCalculator()
	{
		setTitle("MyCaluclator");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField(30);
		textField.setText("");
		textField.setEditable(false);
		textField.setHorizontalAlignment(JTextField.RIGHT);;
		
		buttonPanel1 = new JPanel();
		buttonPanel1.setLayout(new GridLayout(1,3,5,5));
		buttons1 = new JButton[btnName1.length];
		for(int i = 0;i<btnName1.length;i++) {
			buttons1[i] = new JButton(btnName1[i]);
			buttons1[i].setForeground(Color.RED);
			buttons1[i].addActionListener(new MyActionListener());
			buttonPanel1.add(buttons1[i]);
		}
		
		buttonPanel2 = new JPanel();
		buttonPanel2.setLayout(new GridLayout(4,5,5,5));
		buttons2 = new JButton[btnName2.length];
		for(int i = 0;i<btnName2.length;i++) {
			buttons2[i] = new JButton(btnName2[i]);
			if(i == 3 || i == 8 || i == 13 || i == 18 || i == 19)
				buttons2[i].setForeground(Color.RED);
			buttons2[i].addActionListener(new MyActionListener());
			buttonPanel2.add(buttons2[i]);
		}
		
		panel = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		p1.add(textField);
		p2.add(buttonPanel1);
		p3.add(buttonPanel2);
		
		panel.setLayout(new BorderLayout());
		panel.add(p1,BorderLayout.NORTH);
		panel.add(p2,BorderLayout.CENTER);
		panel.add(p3,BorderLayout.SOUTH);
		add(panel);
		pack();
		
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			if (operation.equals("C")) {
				textField.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(textField.getText()));
				textField.setText("" + result);
				num = "";
			} else if(operation.equals("Backspace")){ 
				String temp = textField.getText();
				temp = temp.substring(0,temp.length()-1);
				textField.setText(temp);
			} else if(operation.equals("CE")){ 
				//
			} else if(operation.equals("1/x")){ 
				Double result = 1/(Double.parseDouble(textField.getText()));
				textField.setText("" + result);
			} else if(operation.equals("sqrt")){ 
				Double result = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("" + result);
			} else if(operation.equals("+/-")){ 
				Double result = -1 * (Double.parseDouble(textField.getText()));
				textField.setText("" + result);
			} else {
				textField.setText(textField.getText() + e.getActionCommand());
			}
			
		}
	}
	private void fullTextParsing(String inputText) {
		equation.clear();
		for(int i = 0;i < inputText.length(); i++) {
			char ch = inputText.charAt(i);
			if(ch == '-' || ch == '+' || ch == '*' || ch == '/' || ch == '%') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
	}
	public double calculate(String inputText) {
		fullTextParsing(inputText);
		
		double prev = 0;
		double current = 0;
		String mode = "";
		
		for(int i = 0; i < equation.size();i++) {
			String s = equation.get(i);
			if(s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("*")) {
				mode = "mul";
			} else if (s.equals("/")) {
				mode = "div";
			} else if (s.equals("%")) {
				mode = "rem";
			} else {
				if ((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
					Double one = Double.parseDouble(equation.get(i - 2));
					Double two = Double.parseDouble(equation.get(i));
					Double result = 0.0;
					
					if(mode.equals("mul")) {
						result = one * two;
					} else if (mode.equals("div")) {
						result = one / two;
					}
					equation.add(i + 1,Double.toString(result));
					
					for(int j = 0; j<3;j++) {
						equation.remove(i-2);
					}
					i -= 2;
					
				}
			}
		}
		
		for (String s : equation) {
			if(s.equals("+")) {
				mode = "add";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("%")) {
				mode = "rem";
			} else {
				current = Double.parseDouble(s);
				if(mode.equals("add")) {
					prev += current;
				} else if (mode.equals("sub")) {
					prev -= current;
				}else if (mode.equals("rem")) {
					prev %= current;
				} else {
					prev = current;
				}
			}
		}
		return prev;
	}
	
	public static void main(String[] args) {
		MyCalculator c1 = new MyCalculator();

	}

}
