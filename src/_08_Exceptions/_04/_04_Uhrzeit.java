package _08_Exceptions._04;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class _04_Uhrzeit extends JFrame {

	private JPanel contentPane;
	private JTextField tfHours;
	private JTextField tfMinutes;
	private JButton btnApply;
	private JButton btnEnd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_04_Uhrzeit frame = new _04_Uhrzeit();
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
	public _04_Uhrzeit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Uhrzeit");
		setLocationRelativeTo(null);
		
		JLabel lblHours = new JLabel("Stunden");
		lblHours.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHours.setBounds(10, 11, 61, 14);
		contentPane.add(lblHours);
		
		JLabel lblMinutes = new JLabel("Minuten");
		lblMinutes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMinutes.setBounds(81, 11, 70, 14);
		contentPane.add(lblMinutes);
		
		tfHours = new JTextField();
		tfHours.setBounds(10, 36, 48, 20);
		contentPane.add(tfHours);
		tfHours.setColumns(10);
		
		tfMinutes = new JTextField();
		tfMinutes.setBounds(81, 36, 48, 20);
		contentPane.add(tfMinutes);
		tfMinutes.setColumns(10);
		
		JLabel lblResultTime = new JLabel("");
		lblResultTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblResultTime.setBounds(10, 101, 190, 14);
		contentPane.add(lblResultTime);
		
		btnApply = new JButton("\u00DCbernehmen");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lblResultTime.setForeground(Color.BLACK);
					
					int hrs = Integer.parseInt(tfHours.getText());
					int min = 0;
					if (hrs < 0 || hrs > 23) throw new NumberFormatException();
					else {
                        min = Integer.parseInt(tfMinutes.getText());
						if(min < 0 || min > 59) throw new NumberFormatException();
					}
					
					lblResultTime.setText("Ihre Uhrzeit ist " + String.format("%02d:%02d", hrs, min) + " Uhr.");				
					
				} catch (NumberFormatException nfe) {
					lblResultTime.setText("Ungueltige Uhrzeit!");
					lblResultTime.setForeground(Color.RED);
					System.out.println("User hat Text oder ungueltige Uhrzeit (zu gross, klein) eingegeben. \n");
					nfe.printStackTrace();
				}
			}
		});
		btnApply.setBounds(233, 35, 179, 23);
		contentPane.add(btnApply);
		
		btnEnd = new JButton("Ende");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(285, 101, 127, 23);
		contentPane.add(btnEnd);
	}
}
