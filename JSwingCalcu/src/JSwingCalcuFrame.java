import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JSwingCalcuFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	static JLabel lblDisplay;
	private JButton btnSubtraction, btnAddition, btnMultiply, btnDivide, btn7, btn8, btn9, btnClear, btn4, btn5, btn6,
			btnDecimal, btn1, btn2, btn3, btnEquals, btn0, btnPositiveAndNegative, btnBackspace;

	ArrayList<String> operationList = new ArrayList<String>();
	static ArrayList<String> input = new ArrayList<String>();

	static String temp = "";
	char check = ' ';

	public static void operatorCheck(String operator) {

		if (input.size() == 0) {
			return;
		} //end if

		String stringInput = input.get(input.size() - 1);

//		@formatter:off
		if (!stringInput.equals("+") && !stringInput.equals("-") 
				&& !stringInput.equals("/") && !stringInput.equals("*")) {
//		@formatter:on

			temp = lblDisplay.getText();
			lblDisplay.setText(temp + operator);
			input.add(operator);

		} else if (stringInput.equals("+") && stringInput.equals("-")
				|| stringInput.equals("/") && stringInput.equals("*")) {
			//stops adding operator
		} // end if else 
	}// end of operatorCheck method

	public static void numbersToLabel(String num) {
		temp = lblDisplay.getText();
		lblDisplay.setText(temp + num);
		input.add(num);
	}// end of numbers method

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn0) {
			numbersToLabel("0");
		} // end if

		if (e.getSource() == btn1) {
			numbersToLabel("1");
		} // end if

		if (e.getSource() == btn2) {
			numbersToLabel("2");
		} // end if

		if (e.getSource() == btn3) {
			numbersToLabel("3");
		} // end if

		if (e.getSource() == btn4) {
			numbersToLabel("4");
		} // end if

		if (e.getSource() == btn5) {
			numbersToLabel("5");
		} // end if

		if (e.getSource() == btn6) {
			numbersToLabel("6");
		} // end if

		if (e.getSource() == btn7) {
			numbersToLabel("7");
		} // end if

		if (e.getSource() == btn8) {
			numbersToLabel("8");
		} // end if

		if (e.getSource() == btn9) {
			numbersToLabel("9");
		} // end if

		if (e.getSource() == btnAddition) {
			operatorCheck("+");
		} // end if

		if (e.getSource() == btnSubtraction) {
			operatorCheck("-");
		} // end if

		if (e.getSource() == btnDivide) {
			operatorCheck("/");
		} // end if

		if (e.getSource() == btnMultiply) {
			operatorCheck("*");
		} // end if

	}// end actionPerformed method

	/**
	 * Create the frame.
	 */
	public JSwingCalcuFrame() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new BorderLayout(0, 0));
		lblDisplay = new JLabel("");
		lblDisplay.setPreferredSize(new Dimension(10, 100));
		contentPane.add(lblDisplay, BorderLayout.NORTH);

		//-------BUTTONS

		JPanel pnlKeys = new JPanel();
		contentPane.add(pnlKeys);
		pnlKeys.setLayout(new GridLayout(0, 4, 0, 0));

		btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(this);
		pnlKeys.add(btnSubtraction);

		btnAddition = new JButton("+");
		btnAddition.addActionListener(this);
		pnlKeys.add(btnAddition);

		btnMultiply = new JButton("*");
		btnMultiply.addActionListener(this);
		pnlKeys.add(btnMultiply);

		btnDivide = new JButton("/");
		btnDivide.addActionListener(this);
		pnlKeys.add(btnDivide);

		btn7 = new JButton("7");
		btn7.addActionListener(this);
		pnlKeys.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(this);
		pnlKeys.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(this);
		pnlKeys.add(btn9);

		btnClear = new JButton("C");
		btnClear.addActionListener(this);
		pnlKeys.add(btnClear);

		btn4 = new JButton("4");
		btn4.addActionListener(this);
		pnlKeys.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(this);
		pnlKeys.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(this);
		pnlKeys.add(btn6);

		btnDecimal = new JButton(".");
		btnDecimal.addActionListener(this);
		pnlKeys.add(btnDecimal);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		pnlKeys.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		pnlKeys.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		pnlKeys.add(btn3);

		btnEquals = new JButton("=");
		btnEquals.addActionListener(this);
		pnlKeys.add(btnEquals);

		btn0 = new JButton("0");
		btn0.addActionListener(this);
		pnlKeys.add(btn0);

		btnPositiveAndNegative = new JButton("+ / -");
		btnPositiveAndNegative.addActionListener(this);
		pnlKeys.add(btnPositiveAndNegative);

		btnBackspace = new JButton("<-- Backspace");
		btnBackspace.addActionListener(this);
		pnlKeys.add(btnBackspace);

		setContentPane(contentPane);
	}// end constructor

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSwingCalcuFrame frame = new JSwingCalcuFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 500, 600);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}//end class
