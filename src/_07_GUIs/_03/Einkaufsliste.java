package _07_GUIs._03;

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

public class Einkaufsliste extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JTextField tfStueckzahl;
	private JLabel lblStueckpreis;
	private JTextField tfStueckpreis;
	private JLabel lblRabatt;
	private JTextField tfRabatt;
	private JButton btnBerechnen;
	private JButton btnEnde;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Einkaufsliste frame = new Einkaufsliste();
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
	public Einkaufsliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		lblStueckzahl = new JLabel("Stückzahl");
		lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStueckzahl.setBounds(10, 11, 69, 14);
		contentPane.add(lblStueckzahl);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.setBounds(10, 32, 90, 20);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		lblStueckpreis = new JLabel("Stückpreis");
		lblStueckpreis.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStueckpreis.setBounds(139, 11, 69, 14);
		contentPane.add(lblStueckpreis);
		
		tfStueckpreis = new JTextField();
		tfStueckpreis.setColumns(10);
		tfStueckpreis.setBounds(138, 32, 90, 20);
		contentPane.add(tfStueckpreis);
		
		lblRabatt = new JLabel("Rabatt");
		lblRabatt.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRabatt.setBounds(267, 11, 69, 14);
		contentPane.add(lblRabatt);
		
		tfRabatt = new JTextField();
		tfRabatt.setBounds(267, 32, 90, 20);
		contentPane.add(tfRabatt);
		tfRabatt.setColumns(10);
		
		btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tfStueckzahl.getText().isBlank()
						|| !tfStueckpreis.getText().isBlank() || !tfRabatt.getText().isBlank()) {
					//Eingabe
					double stueckzahl = Double.parseDouble(tfStueckzahl.getText());
					double stueckpreis = Double.parseDouble(tfStueckpreis.getText());
					double rabatt = Double.parseDouble(tfRabatt.getText());
					
					//Verarbeitung
					double ergebnis = stueckzahl * stueckpreis * ((100 - rabatt) / 100);
					
					//Ausgabe
					lblResult.setText("Ergebnis: " + String.format("%.2f", ergebnis));
					
				} else {
					lblResult.setText("Die Eingaben muessen vollstaendig ausgefuellt sein!");
				}
			}
		});
		btnBerechnen.setBounds(380, 24, 194, 36);
		contentPane.add(btnBerechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(485, 97, 89, 23);
		contentPane.add(btnEnde);
		
		lblResult = new JLabel("");
		lblResult.setBounds(10, 101, 465, 14);
		contentPane.add(lblResult);
	}
}
