package _08_Exceptions._01;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class _01_FahrenheitCelsius extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_01_FahrenheitCelsius frame = new _01_FahrenheitCelsius();
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
	public _01_FahrenheitCelsius() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 201);
		setTitle("Umrechnung Fahrenheit Celsius");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFahrenheit.setBounds(10, 11, 100, 14);
		contentPane.add(lblFahrenheit);
		
		JTextField tfCelsius = new JTextField();
		tfCelsius.setEditable(false);
		tfCelsius.setBounds(10, 105, 235, 20);
		contentPane.add(tfCelsius);
		
		JButton btnUmrechnen = new JButton("Umrechnen");
		
		JTextField tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnUmrechnen.doClick();
				}
			}
		});

		tfFahrenheit.setBounds(10, 36, 100, 20);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCelsius.setBounds(10, 80, 80, 14);
		contentPane.add(lblCelsius);
		
		
		//JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat f = new DecimalFormat("#0.00");
				
				try {
					
				} catch (Exception e1) {
					
				} 
					finally {
					
				} 
				
				
				double fahrenheit = Double.parseDouble(tfFahrenheit.getText());
				double celsius = (fahrenheit - 32) * 5 / 9;
				tfCelsius.setText(f.format(celsius));
				tfFahrenheit.requestFocus();
				tfFahrenheit.selectAll();
				
			}
		});
		btnUmrechnen.setBounds(255, 35, 100, 23);
		contentPane.add(btnUmrechnen);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(255, 104, 100, 23);
		contentPane.add(btnEnde);
	}
}
