package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorTest1 {

	private JFrame frame;
	private JTextField textDisplay;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest1 window = new CalculatorTest1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorTest1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 214, 35);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		///-------------------------Row 1-----------------------------------
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnC.setBounds(10, 60, 50, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops = ops * (-1);
				textDisplay.setText(String.valueOf(ops));
				
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlusMinus.setBounds(65, 60, 50, 50);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "%";
				
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPercentage.setBounds(120, 60, 50, 50);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "/";
				
				
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(175, 60, 50, 50);
		frame.getContentPane().add(btnDivision);
		
		///-------------------------Row 2-----------------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 115, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(65, 115, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(120, 115, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "*";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMultiplication.setBounds(175, 115, 50, 50);
		frame.getContentPane().add(btnMultiplication);
		
		///-------------------------Row 3-----------------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(10, 170, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(65, 170, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(120, 170, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "-";
			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSubtraction.setBounds(175, 170, 50, 50);
		frame.getContentPane().add(btnSubtraction);
		
		///-------------------------Row 4-----------------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(10, 225, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(65, 225, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(120, 225, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operations = "+";
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddition.setBounds(175, 225, 50, 50);
		frame.getContentPane().add(btnAddition);
		
		///-------------------------Row 5-----------------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(10, 280, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnBackSpace = new JButton("←");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				
				if(textDisplay.getText().length() > 0) {
					
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					backSpace = strB.toString();
					textDisplay.setText(backSpace);
					
					
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBackSpace.setBounds(65, 280, 50, 50);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! textDisplay.getText().contains("."))
		          {
		          textDisplay.setText(textDisplay.getText() + btnPoint.getText());
		          }
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPoint.setBounds(120, 280, 50, 50);
		frame.getContentPane().add(btnPoint);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				secondNum = Double.parseDouble(textDisplay.getText());
				
				if (operations == "+");
				{
					result = firstNum + secondNum;
					answer = Double.toString(result);
					textDisplay.setText(answer);
					
				}
				if (operations == "-");
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				if (operations == "*");
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				if (operations == "/");
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				if (operations == "%");
				{
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(175, 280, 50, 50);
		frame.getContentPane().add(btnEquals);
		
		
	}
}
