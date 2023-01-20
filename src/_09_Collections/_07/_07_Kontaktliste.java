package _09_Collections._07;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class _07_Kontaktliste extends JFrame {

	private JPanel contentPane;
	private JTextField tfNachname;
	private JTextField tfVorname;
	private JTextField tfTelefon;
	private JTextField tfEmail;
	private JButton btnUebernehmen;
	private JButton btnEnde;	
	private JButton btnLoschen;
	private JScrollPane scrollPane;
	private JList<String> list;
	private DefaultListModel<String> myList;
	private JLabel lblKontaktliste;
	private JLabel lblEmail;
	private JLabel lblNachname;
	private JLabel lblVorname;
	private JLabel lblTelefon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_07_Kontaktliste frame = new _07_Kontaktliste();
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
	public _07_Kontaktliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNachname = new JLabel("Nachname");
		lblNachname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNachname.setBounds(10, 22, 91, 14);
		contentPane.add(lblNachname);
		
		lblVorname = new JLabel("Vorname");
		lblVorname.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblVorname.setBounds(139, 22, 56, 14);
		contentPane.add(lblVorname);
		
		lblTelefon = new JLabel("Telefon");
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
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 89, 46, 14);
		contentPane.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(10, 104, 283, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		btnUebernehmen = new JButton("\u00DCbernehmen>>");
		btnUebernehmen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if(!tfNachname.getText().isEmpty() && !tfVorname.getText().isEmpty()
						&& !tfTelefon.getText().isEmpty() && !tfEmail.getText().isEmpty()) {
					
					sb.append(tfNachname.getText() + ";");
					sb.append(tfVorname.getText() + ";");
					sb.append(tfTelefon.getText() + ";");
					sb.append(tfEmail.getText() + ";");
					
					myList.addElement(sb.toString());
					
				} else JOptionPane.showMessageDialog(rootPane, "Bitte alle Textfelder ausf�llen!");
					
			}
		});
		btnUebernehmen.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUebernehmen.setBounds(303, 103, 310, 23);
		contentPane.add(btnUebernehmen);
		
		myList = new DefaultListModel<>();
		
		lblKontaktliste = new JLabel("Kontaktliste");
		lblKontaktliste.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKontaktliste.setBounds(10, 148, 119, 14);
		contentPane.add(lblKontaktliste);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEnde.setBounds(524, 325, 89, 23);
		contentPane.add(btnEnde);
		
		btnLoschen = new JButton("markierten Eintrag l\u00F6schen");
		btnLoschen.setBounds(12, 325, 191, 23);
		contentPane.add(btnLoschen);
		btnLoschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myList.remove(list.getSelectedIndex());
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 166, 603, 148);
		contentPane.add(scrollPane);
		
		list = new JList<>();
		scrollPane.setViewportView(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(myList);
		
	}
}
