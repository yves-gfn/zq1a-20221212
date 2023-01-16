package _07_GUIs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class UmrechnungFahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	private JLabel lblFahrenheit;
	private JTextField tfFahrenheit;
	private JLabel lblCelsius;
	private JTextField tfCelsius;
	private JButton btnEnde;
	private JButton btnUmrechnen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UmrechnungFahrenheitCelsius frame = new UmrechnungFahrenheitCelsius();
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
	public UmrechnungFahrenheitCelsius() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 269, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Fahrenheit Celsius Rechner");
		
		lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(10, 11, 90, 15);
		contentPane.add(lblFahrenheit);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUmrechnen.doClick();
				}
			}
		});
		tfFahrenheit.setBounds(10, 29, 90, 20);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		
		lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setBounds(10, 68, 90, 20);
		contentPane.add(lblCelsius);
		
		tfCelsius = new JTextField();
		tfCelsius.setBounds(10, 88, 90, 20);
		contentPane.add(tfCelsius);
		tfCelsius.setColumns(10);
		
		btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//E(eingabe) = holen Wert aus Textfeld
				double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
				//V(erarbeitung) = verarbeite Wert
				double celsius = (fahrenheit - 32) * 5 / 9;
				//A(usgabe) = zeige User Wert
				tfCelsius.setText(String.format("%.2f", celsius));
				
				//Komforfunktion / Usability
				tfFahrenheit.requestFocus();
				tfFahrenheit.selectAll();				
			}
		});
		btnUmrechnen.setBounds(134, 28, 106, 21);
		contentPane.add(btnUmrechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnEnde.setBounds(134, 87, 106, 20);
		contentPane.add(btnEnde);
	}
}
