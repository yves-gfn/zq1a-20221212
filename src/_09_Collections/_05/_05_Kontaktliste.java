package _09_Collections._05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class _05_Kontaktliste extends JFrame {

	private JPanel contentPane;
	private JTextField tfNachname;
	private JTextField tfVorname;
	private JTextField tfTelefon;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_05_Kontaktliste frame = new _05_Kontaktliste();
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
	public _05_Kontaktliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNachname.setBounds(10, 22, 91, 14);
		contentPane.add(lblNachname);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVorname.setBounds(139, 22, 56, 14);
		contentPane.add(lblVorname);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefon.setBounds(303, 22, 61, 14);
		contentPane.add(lblTelefon);
		
		tfNachname = new JTextField();
		tfNachname.setBounds(10, 36, 119, 20);
		contentPane.add(tfNachname);
		tfNachname.setColumns(10);
		
		tfVorname = new JTextField();
		tfVorname.setBounds(139, 36, 154, 20);
		contentPane.add(tfVorname);
		tfVorname.setColumns(10);
		
		tfTelefon = new JTextField();
		tfTelefon.setBounds(303, 36, 310, 20);
		contentPane.add(tfTelefon);
		tfTelefon.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 89, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(10, 104, 283, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnUebernehmen = new JButton("Uebernehmen>>");
		btnUebernehmen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUebernehmen.setBounds(303, 103, 310, 23);
		contentPane.add(btnUebernehmen);
		
		JList list = new JList<>();
		list.setBounds(10, 179, 603, 126);
		contentPane.add(list);
		
		JLabel lblKontaktliste = new JLabel("Kontaktliste");
		lblKontaktliste.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKontaktliste.setBounds(10, 154, 119, 14);
		contentPane.add(lblKontaktliste);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnde.setBounds(524, 325, 89, 23);
		contentPane.add(btnEnde);
	}
}
