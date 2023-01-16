package _07_GUIs._01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ZollZentimeter extends JFrame {

	private JPanel contentPane;
	private JLabel lblZoll;
	private JTextField tfZoll;
	private JButton btnBerechnen;
	private JButton btnEnde;
	private JLabel lblResultZentimeter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZollZentimeter frame = new ZollZentimeter();
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
	public ZollZentimeter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblZoll = new JLabel("Zoll");
		lblZoll.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblZoll.setBounds(10, 11, 39, 14);
		contentPane.add(lblZoll);
		
		tfZoll = new JTextField();
		tfZoll.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnBerechnen.doClick();
				}
			}
		});
		tfZoll.setBounds(10, 29, 103, 20);
		contentPane.add(tfZoll);
		tfZoll.setColumns(10);
		
		btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat formatter = new DecimalFormat("#0.00");
				double zoll = Double.parseDouble(tfZoll.getText());
				lblResultZentimeter.setText(formatter.format(zoll * 2.54) + "cm");
				
				tfZoll.requestFocus();
				tfZoll.selectAll();
			}
		});
		btnBerechnen.setBounds(10, 65, 103, 23);
		contentPane.add(btnBerechnen);
		
		btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnde.setBounds(138, 65, 103, 23);
		contentPane.add(btnEnde);
		
		lblResultZentimeter = new JLabel("");
		lblResultZentimeter.setBounds(139, 32, 102, 14);
		contentPane.add(lblResultZentimeter);
		setTitle("ZollZentimeter");
		setLocationRelativeTo(null);
	}
}
