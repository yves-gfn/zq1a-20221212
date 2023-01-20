package _09_Collections._03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class _03_ArrayausgabeMitArrayList extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfQuantity;
	private JTextField tfInput;
	private JLabel lblInput;
	private JLabel lblOutput;
	private JLabel lblOutputReverse;
	private JLabel lblOutputResult;
	private JLabel lblOutputReverseResult;
	private JButton btnInputOK;
	private JButton btnReset;
	private JButton btnQuantityOK;
	
	private int quantityArray = 0;
	private int[] inputArr;
	private int inputArrIndex = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_03_ArrayausgabeMitArrayList frame = new _03_ArrayausgabeMitArrayList();
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
	public _03_ArrayausgabeMitArrayList() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuantity = new JLabel("Wieviele Zahlen sollen eingegeben werden?");
		lblQuantity.setBounds(10, 11, 283, 14);
		contentPane.add(lblQuantity);
		
		tfQuantity = new JTextField();
		tfQuantity.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnQuantityOK.doClick();
				}
			}
		});
		tfQuantity.setBounds(303, 8, 86, 20);
		contentPane.add(tfQuantity);
		tfQuantity.setColumns(10);
		
		btnQuantityOK = new JButton("OK");
		btnQuantityOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfQuantity.getText().isEmpty()) {
					try {
						quantityArray = Integer.parseInt(tfQuantity.getText());
						
						//initialize input array
						inputArr = new int[quantityArray];
						inputArrIndex = 0;
						
						//show next Components
						lblInput.setVisible(true);
						tfInput.setVisible(true);
						btnInputOK.setVisible(true);
						
						tfInput.requestFocus();
						tfInput.setText("");
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(rootPane, "Bitte Zahl in das Textfeld eingeben");
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(rootPane, "Bitte eine Ganzzahl in das Textfeld eintragen.");
				}
				
			}
		});
		btnQuantityOK.setBounds(399, 7, 89, 23);
		contentPane.add(btnQuantityOK);
		
		tfInput = new JTextField();
		tfInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnInputOK.doClick();
				}
			}
		});
		tfInput.setVisible(false);
		tfInput.setBounds(10, 96, 86, 20);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		lblInput = new JLabel("Zahl");
		lblInput.setVisible(false);
		lblInput.setBounds(10, 76, 46, 14);
		contentPane.add(lblInput);
		
		btnInputOK = new JButton("OK");
		btnInputOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// add Value to Array
				if(!tfInput.getText().isEmpty()) {
					if(inputArrIndex < inputArr.length) {
						try {
							inputArr[inputArrIndex] = Integer.parseInt(tfInput.getText());
							inputArrIndex++;
						} catch (NumberFormatException e1) {
							JOptionPane.showMessageDialog(rootPane, "Bitte Zahl in das Textfeld eingeben");
							e1.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(rootPane, "Bitte Zahl in das Textfeld eingeben");
				}
				
				// Creating Output String
				StringBuilder sb = new StringBuilder("");
				for(int i = 0; i < inputArrIndex; i++) {
					sb.append(inputArr[i] + " ");
				}
				
				//Set normal and reverse result
				lblOutputResult.setText(String.valueOf(sb));
				lblOutputReverseResult.setText(String.valueOf(sb.reverse()).trim());
				
				// Set elements visible
				lblOutput.setVisible(true);
				lblOutputReverse.setVisible(true);
				lblOutputResult.setVisible(true);
				lblOutputReverseResult.setVisible(true);
				btnReset.setVisible(true);
				
				//Input textfield requires focus up to array-length equals user quantity
				if(inputArrIndex != quantityArray) {
					tfInput.requestFocus();
					tfInput.selectAll();
				} else {
					btnReset.requestFocus();
				}
			}
		});
		btnInputOK.setVisible(false);
		btnInputOK.setBounds(106, 95, 89, 23);
		contentPane.add(btnInputOK);
		
		lblOutput = new JLabel("Ausgabe vorw\u00E4rts:");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutput.setVisible(false);
		lblOutput.setBounds(10, 165, 130, 14);
		contentPane.add(lblOutput);
		
		lblOutputReverse = new JLabel("Ausgabe r\u00FCckw\u00E4rts:");
		lblOutputReverse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOutputReverse.setVisible(false);
		lblOutputReverse.setBounds(10, 190, 130, 14);
		contentPane.add(lblOutputReverse);
		
		lblOutputResult = new JLabel("lblOutputResultPlaceholder");
		lblOutputResult.setVisible(false);
		lblOutputResult.setBounds(171, 165, 317, 14);
		contentPane.add(lblOutputResult);
		
		lblOutputReverseResult = new JLabel("lblOutputResultReversePlaceholder");
		lblOutputReverseResult.setVisible(false);
		lblOutputReverseResult.setBounds(171, 190, 317, 14);
		contentPane.add(lblOutputReverseResult);
		
		btnReset = new JButton("Neue Eingabe");
		btnReset.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnReset.doClick();
				}
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblInput.setVisible(false);
				tfInput.setVisible(false);
				btnInputOK.setVisible(false);
				
				lblOutput.setVisible(false);
				lblOutputResult.setVisible(false);
				lblOutputReverse.setVisible(false);
				lblOutputReverseResult.setVisible(false);
				btnReset.setVisible(false);
				
				tfQuantity.requestFocus();
				tfQuantity.setText("");
			}
		});
		
		
		btnReset.setVisible(false);
		btnReset.setBounds(303, 95, 185, 23);
		contentPane.add(btnReset);
		setTitle("Arrayausgabe");
		setLocationRelativeTo(null);
	}
}
