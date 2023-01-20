package _09_Collections._01;

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
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class _01_ArrayausgabeMitStandardArray extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfQuantity;
	private JTextField tfInput;
	private JLabel lblInput;
	private JLabel lblOutput;
	private JLabel lblOutputReverse;
	private JLabel lblOutputResult;
	private JLabel lblOutputResultReverse;
	private JButton btnReset;
	private JLabel lblQuantity;
	private JButton btnQuantityOK;
	private JButton btnInputOK;
	
	private int[] inputArr;
	private int inputArrIndex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01_ArrayausgabeMitStandardArray frame = new _01_ArrayausgabeMitStandardArray();
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
	public _01_ArrayausgabeMitStandardArray() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Arrayausgabe");
		setLocationRelativeTo(null);
		
		lblQuantity = new JLabel("Wieviele Zahlen sollen eingegeben werden?");
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
				try {
					if(!tfQuantity.getText().isEmpty()) {
						//initialize input array
						inputArr = new int[Integer.parseInt(tfQuantity.getText())];
					}					
					//show next components
					lblInput.setVisible(true);
					tfInput.setVisible(true);
					btnInputOK.setVisible(true);
					
					tfInput.requestFocus();
					tfInput.setText("");
					
					tfQuantity.setEnabled(false);
					btnQuantityOK.setEnabled(false);
					
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Zahl in Textfeld eingeben");
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
				try {
					if(!tfInput.getText().isEmpty() && inputArrIndex < inputArr.length) {
						inputArr[inputArrIndex] = Integer.parseInt(tfInput.getText());
						inputArrIndex++;
					} else {
						JOptionPane.showMessageDialog(rootPane, "Bitte Ganzzahl eingeben.");
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Ganzzahl eingeben.");
				}
				
				//Creating output string
				StringBuilder sb = new StringBuilder("");
				StringBuilder sbReverse = new StringBuilder("");
				
				//Creating forward and reversed output string
				for(int i = 0, j = inputArr.length -1; i < inputArr.length; i++, j--) {
					sb.append(inputArr[i] + " ");
					sbReverse.append(inputArr[j] + " ");
				}
				
				//"Update" lblOutput with new Data
				lblOutputResult.setText(sb.toString());
				lblOutputResultReverse.setText(sbReverse.toString().trim());
				
				//Set elements visible
				lblOutput.setVisible(true);
				lblOutputResult.setVisible(true);
				lblOutputResultReverse.setVisible(true);
				
				//Give tfInput focus back
				tfInput.requestFocus();
				tfInput.selectAll();
				
				if(inputArrIndex == inputArr.length) {
					btnReset.setVisible(true);
					btnInputOK.setEnabled(false);
					tfInput.setEnabled(false);
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
		
		lblOutputResultReverse = new JLabel("lblOutputResultReversePlaceholder");
		lblOutputResultReverse.setVisible(false);
		lblOutputResultReverse.setBounds(171, 190, 317, 14);
		contentPane.add(lblOutputResultReverse);
		
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
				inputArrIndex = 0;
				
				lblInput.setVisible(false);
				tfInput.setVisible(false);
				btnInputOK.setVisible(false);
				
				lblOutput.setVisible(false);
				lblOutputResult.setVisible(false);
				lblOutputResultReverse.setVisible(false);
				
				btnInputOK.setEnabled(true);
				tfInput.setEnabled(true);
				tfQuantity.setEnabled(true);
				btnQuantityOK.setEnabled(true);
				
				tfQuantity.requestFocus();
				tfQuantity.setText("");
				
				btnReset.setVisible(false);
				
			}
		});
		btnReset.setBounds(300, 95, 188, 23);
		btnReset.setVisible(false);
		contentPane.add(btnReset);	
	}
}
