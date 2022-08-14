package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalculatorTest2 extends JFrame {

	private JPanel contentPane;
	private JTextField textDisplay;

	
	double num, ans;
	int calculation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest2 frame = new CalculatorTest2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	//------------------OPERATIONS------------------
	public void aritmetic_operation() {
		
		switch (calculation) {
		
		case 1: //Addition
			ans = num + Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 2: //Subtraction
			ans = num - Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 3: //Multiplication
			ans = num * Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		case 4: //Division
			ans = num / Double.parseDouble(textDisplay.getText());
			textDisplay.setText(Double.toString(ans));
			break;
		}
	}
	/**
	 * Create the frame.
	 */
	public CalculatorTest2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//----------------------- ROW 1-----------------------
		
		//------------------ Button 0------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 330, 50, 50);
		contentPane.add(btn0);
		
		//------------------ Button .------------------
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+".");
			}
		});
		btnPoint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoint.setBounds(70, 330, 50, 50);
		contentPane.add(btnPoint);
		
		//------------------ Button "←"------------------
		JButton btnBackSpace = new JButton("←");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length = textDisplay.getText().length();
				int number = textDisplay.getText().length() -1;
				String backSpace;
				if (length > 0) {
					StringBuilder back = new StringBuilder(textDisplay.getText());
					back.deleteCharAt(number);
					backSpace = back.toString();
					textDisplay.setText(backSpace);
					
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBackSpace.setBounds(70, 85, 50, 50);
		contentPane.add(btnBackSpace);
		
		//------------------ Button =------------------
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aritmetic_operation();
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(190, 330, 50, 50);
		contentPane.add(btnEquals);
		
		//----------------------- ROW 1-----------------------
		//------------------ Button 1 ------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 268, 50, 50);
		contentPane.add(btn1);
		
		//------------------ Button "2" ------------------
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 268, 50, 50);
		contentPane.add(btn2);
		
		//------------------ Button "3" ------------------
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(130, 268, 50, 50);
		contentPane.add(btn3);
		
		//------------------ Button "+" ------------------
		JButton btnAddition = new JButton("+");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 1;
				textDisplay.setText("");
			}
		});
		btnAddition.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddition.setBounds(190, 268, 50, 50);
		contentPane.add(btnAddition);
		
		//------------------ Button "4" ------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 207, 50, 50);
		contentPane.add(btn4);
		
		//------------------ Button "5" ------------------
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 207, 50, 50);
		contentPane.add(btn5);
		
		
		//------------------ Button "6" ------------------
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(130, 207, 50, 50);
		contentPane.add(btn6);
		
		
		//------------------ Button "-" ------------------
		JButton btnSubtraction = new JButton("-");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 2;
				textDisplay.setText("");
			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtraction.setBounds(190, 207, 50, 50);
		contentPane.add(btnSubtraction);
		
		
		//------------------ Button "7" ------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 146, 50, 50);
		contentPane.add(btn7);
		
		//------------------ Button "C" ------------------
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(10, 85, 50, 50);
		contentPane.add(btnClear);
		
		
		//------------------ Button "±" ------------------
		JButton btnPlusMinus = new JButton("±");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops = Double.parseDouble(textDisplay.getText());
				ops = ops * (-1);
				textDisplay.setText(Double.toString(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlusMinus.setBounds(130, 330, 50, 50);
		contentPane.add(btnPlusMinus);
		
		
		//------------------ Button "8" ------------------
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 146, 50, 50);
		contentPane.add(btn8);
		
		
		//------------------ Button "9" ------------------
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(textDisplay.getText()+"9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 146, 50, 50);
		contentPane.add(btn9);
		
		
		//------------------ Button "%" ------------------
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText())/100;
				textDisplay.setText(Double.toString(num));
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnPercent.setBounds(130, 85, 50, 50);
		contentPane.add(btnPercent);
		
		
		//------------------ Button "/" ------------------
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 4;
				textDisplay.setText("");
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivision.setBounds(190, 85, 50, 50);
		contentPane.add(btnDivision);
		
		
		//------------------ Button "*" ------------------
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textDisplay.getText());
				calculation = 3;
				textDisplay.setText("");
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiplication.setBounds(190, 146, 50, 50);
		contentPane.add(btnMultiplication);
		
		//------------------ text Display ------------------
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 230, 40);
		contentPane.add(textDisplay);
		textDisplay.setColumns(10);
	}
}
