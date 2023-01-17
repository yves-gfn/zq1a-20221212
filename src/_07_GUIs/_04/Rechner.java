package _07_GUIs._04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rechner extends JFrame {

	private JPanel contentPane;
	private JLabel lblOperand1;
	private JTextField tfOperand1;
	private JButton btnAddieren;
	private JButton btnMultiplizieren;
	private JButton btnSubtrahieren;
	private JButton btnDividieren;
	private JLabel lblOperand2;
	private JTextField tfOperand2;
	private JLabel lblResult;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rechner frame = new Rechner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblOperand1 = new JLabel("Operand 1");
		lblOperand1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperand1.setBounds(10, 11, 72, 14);
		contentPane.add(lblOperand1);
		
		tfOperand1 = new JTextField();
		tfOperand1.setBounds(10, 36, 86, 20);
		contentPane.add(tfOperand1);
		tfOperand1.setColumns(10);
		
		btnAddieren = new JButton("+");
		btnAddieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(Rechner.calc(tfOperand1.getText(), tfOperand2.getText(), "+"));
			}
		});
		btnAddieren.setBounds(126, 7, 89, 33);
		contentPane.add(btnAddieren);
		
		btnMultiplizieren = new JButton("*");
		btnMultiplizieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(Rechner.calc(tfOperand1.getText(), tfOperand2.getText(), "*"));
			}
		});
		btnMultiplizieren.setBounds(126, 51, 89, 33);
		contentPane.add(btnMultiplizieren);
		
		btnSubtrahieren = new JButton("-");
		btnSubtrahieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(Rechner.calc(tfOperand1.getText(), tfOperand2.getText(), "-"));
			}
		});
		btnSubtrahieren.setBounds(225, 7, 89, 33);
		contentPane.add(btnSubtrahieren);
		
		btnDividieren = new JButton("/");
		btnDividieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfResult.setText(Rechner.calc(tfOperand1.getText(), tfOperand2.getText(), "/"));
			}
		});
		btnDividieren.setBounds(225, 51, 89, 33);
		contentPane.add(btnDividieren);
		
		lblOperand2 = new JLabel("Operand 2");
		lblOperand2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOperand2.setBounds(338, 11, 72, 14);
		contentPane.add(lblOperand2);
		
		tfOperand2 = new JTextField();
		tfOperand2.setColumns(10);
		tfOperand2.setBounds(338, 36, 86, 20);
		contentPane.add(tfOperand2);
		
		lblResult = new JLabel("Ergebnis");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResult.setBounds(10, 132, 72, 14);
		contentPane.add(lblResult);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBounds(10, 157, 400, 20);
		contentPane.add(tfResult);
		tfResult.setColumns(10);
	}
	
	public static String calc(String operand1, String operand2, String operator) {
		String textResult = "";
		
		if(!operand1.isBlank() && !operand2.isBlank()) {
			double result = 0;
			double op1 = Double.parseDouble(operand1);
			double op2 = Double.parseDouble(operand2);

			switch(operator) {
			case "+": 
				result = op1 + op2;
				textResult = op1 + " + " + op2 + " = " + result;
				break;
			
			case "-": 
				result = op1 - op2;
				textResult = op1 + " - " + op2 + " = " + result;
				break;
			
			case "*":
				result = op1 * op2;
				textResult = op1 + " * " + op2 + " = " + result;
				break;
				
			case "/":
				result = op1 / op2;
				textResult = op1 + " / " + op2 + " = " + result;
				break;
			}	
		} else {
			textResult = "Eingaben unvollständig";
		}
		return textResult;
	}
}
