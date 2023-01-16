package _07_GUIs._02;

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
import java.awt.Color;

public class AlteZaehlweise extends JFrame {

	private JPanel contentPane;
	private JLabel lblStueckzahl;
	private JTextField tfStueckzahl;
	private JButton btnUmrechnen;
	private JLabel lblResultGros;
	private JLabel lblResultSchock;
	private JLabel lblResultDutzend;
	private JLabel lblResultStueck;
	private JButton btnEnde;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlteZaehlweise frame = new AlteZaehlweise();
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
	public AlteZaehlweise() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblStueckzahl = new JLabel("Geben Sie eine Stueckzahl ein:");
		lblStueckzahl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStueckzahl.setBounds(10, 11, 201, 14);
		contentPane.add(lblStueckzahl);
		
		tfStueckzahl = new JTextField();
		tfStueckzahl.setBounds(10, 36, 173, 20);
		contentPane.add(tfStueckzahl);
		tfStueckzahl.setColumns(10);
		
		btnUmrechnen = new JButton("In alte Zaehlweise umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(tfStueckzahl.getText()) > 0) {
					lblError.setText("");
										
					int stueck = Integer.parseInt(tfStueckzahl.getText());
					lblResultGros.setText(String.valueOf(stueck / 144) + " Gros");
					int rest = stueck % 144;
					lblResultSchock.setText(String.valueOf(rest / 60) + " Schock");
					rest = rest % 60;
					lblResultDutzend.setText(String.valueOf(rest / 12) + " Dutzend");
					rest = rest % 12;
					lblResultStueck.setText(String.valueOf(rest) + " Stueck");
				} else {
					lblError.setText("Keine negative Zahl eingeben!");
					tfStueckzahl.requestFocus();
					tfStueckzahl.selectAll();
				}
			}
		});
		btnUmrechnen.setBounds(211, 35, 213, 23);
		contentPane.add(btnUmrechnen);
		
		lblResultGros = new JLabel("Gros");
		lblResultGros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultGros.setBounds(10, 89, 173, 14);
		contentPane.add(lblResultGros);
		
		lblResultSchock = new JLabel("Schock");
		lblResultSchock.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultSchock.setBounds(10, 114, 173, 14);
		contentPane.add(lblResultSchock);
		
		lblResultDutzend = new JLabel("Dutzend");
		lblResultDutzend.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultDutzend.setBounds(10, 139, 173, 14);
		contentPane.add(lblResultDutzend);
		
		lblResultStueck = new JLabel("Stueck");
		lblResultStueck.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultStueck.setBounds(10, 164, 173, 14);
		contentPane.add(lblResultStueck);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(335, 160, 89, 23);
		contentPane.add(btnEnde);
		
		lblError = new JLabel("");
		lblError.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblError.setForeground(Color.RED);
		lblError.setBounds(10, 64, 414, 14);
		contentPane.add(lblError);
	}

}
