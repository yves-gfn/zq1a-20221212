package _07_GUIs._05;

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

public class Osterdatum extends JFrame {

	private JPanel contentPane;
	private JTextField tfYear;
	private JLabel lblResultValue;
	private JLabel lblYear;
	private JLabel lblResult;
	private JButton btnEnd;
	private JButton btnCalcEaster;
	public static final int MIN_DATE = 1583;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Osterdatum frame = new Osterdatum();
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
	public Osterdatum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblYear = new JLabel("Jahr");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblYear.setBounds(10, 11, 63, 14);
		contentPane.add(lblYear);
		
		tfYear = new JTextField();
		tfYear.setBounds(10, 36, 86, 20);
		contentPane.add(tfYear);
		tfYear.setColumns(10);
		
		btnCalcEaster = new JButton("Datum f\u00FCr Ostersonntag berechnen");
		btnCalcEaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfYear.getText().isBlank()) {
					int y = Integer.valueOf(tfYear.getText());
					if(y > MIN_DATE) {
						int g = y % 19;
						int c = y / 100;
						int h = (c - c / 4 - (8 * c + 13) / 25 + 19 * g + 15) % 30;
						int i = h - (h / 28) * (1 - (29 / (h + 1)) * (21 - g / 11));
						int j = (y + y / 4 + i + 2 - c + c / 4) % 7;
						int l = i - j;
						int m = 3 + (l + 40) / 44;
						int d = l + 28 - 31 * (m / 4);
						lblResultValue.setText(d + "." + m + "." + y);
					} else {
						lblResultValue.setText("Geben Sie ein Jahr groesser 1583 ein");
					} 
				} else {
					lblResultValue.setText("Geben Sie bitte ein Jahr ein.");
				}
			}
		});
		btnCalcEaster.setBounds(125, 35, 299, 23);
		contentPane.add(btnCalcEaster);
		
		lblResult = new JLabel("Datum f\u00FCr Ostersonntag:");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResult.setBounds(10, 97, 155, 14);
		contentPane.add(lblResult);
		
		lblResultValue = new JLabel("");
		lblResultValue.setBounds(186, 97, 227, 14);
		contentPane.add(lblResultValue);
		
		btnEnd = new JButton("Ende");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(238, 164, 89, 23);
		contentPane.add(btnEnd);
	}

}
