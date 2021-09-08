package lab06;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JPanel panelLeft, panelRight,panelCenter;
	private JTextField textField;
	private JButton[] buttonsLeft,buttonsRight;
	private String[] labelsLeft = {
			"","Inv","In","(",")",
			"Int","sinh","sin","x^2","n!",
			"dms","cosh","cos","x^y","y¡îx",
			"¥ð","tanh","tan","x^3","3¡îx",
			"F-E","Exp","Mod","log","10^x"
	};
	private String[] labelsRight = {
			"MC","MR","MS","M+","M-",
			"¡ç","CE","C","¡¾","¡î",
			"7","8","9","/","%",
			"4","5","6","*","1/x",
			"1","2","3","-","=",
			"0",".","+"
	};
	
	Calculator()
	{
		setTitle("°è»ê±â");
		textField = new JTextField(35);
		textField.setText("0");
		textField.setEnabled(false);
		
		panelLeft = new JPanel();
		panelRight = new JPanel();
		panelCenter = new JPanel();
		
		panelLeft.setLayout(new GridLayout(6, 5, 3, 3));
		buttonsLeft = new JButton[25];
		panelRight.setLayout(new GridLayout(6, 5, 3, 3));
		buttonsRight = new JButton[28];
		
		int i;
		for(i = 0;i<labelsLeft.length;i++)
		{
			buttonsLeft[i] = new JButton(labelsLeft[i]);
			panelLeft.add(buttonsLeft[i]);
		}
		
		for(i = 0;i<labelsRight.length;i++)
		{
			buttonsRight[i] = new JButton(labelsRight[i]);
			panelRight.add(buttonsRight[i]);
		}	
		setLayout(new BorderLayout(3,3));
		add(textField, BorderLayout.NORTH);
		add(panelLeft, BorderLayout.WEST);
		add(panelRight,BorderLayout.EAST);
		setVisible(true);
		pack();
		
	}

	public static void main(String[] args) {
		Calculator c1 = new Calculator();

	}

}
