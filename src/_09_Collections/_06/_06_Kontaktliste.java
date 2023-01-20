package _09_Collections._06;

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

public class _06_Kontaktliste extends JFrame {

	private JPanel contentPane;
	private JTextField tfNachname;
	private JTextField tfVorname;
	private JTextField tfTelefon;
	private JTextField tfEmail;
	private JButton btnUebernehmen;
	private JButton btnEnde;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
    private JList<String> list;
	private DefaultListModel<String> myList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_06_Kontaktliste frame = new _06_Kontaktliste();
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
	public _06_Kontaktliste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		setTitle("Kontaktliste");
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
		
		
		
		JLabel lblKontaktliste = new JLabel("Kontaktliste");
		lblKontaktliste.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKontaktliste.setBounds(10, 154, 119, 14);
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
		
		btnNewButton = new JButton("markierten Eintrag l\u00F6schen");
		btnNewButton.setBounds(12, 325, 191, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 179, 603, 121);
		contentPane.add(scrollPane);
		
		list = new JList<>();
		scrollPane.setViewportView(list);
        myList = new DefaultListModel<>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setModel(myList);
	}
}
