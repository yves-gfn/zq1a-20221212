package _09_Collections._02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class _02_MessreiheMitArray extends JFrame {

	private JPanel contentPane;
	private JTextField tfAnzahl;
	private JTextField tfMesswertBearbeiten;
	private JTextField tfNeuerWert;
	private JButton btnBestaetigeAnzahl;
	private JTextField tfMesswertEingabe;
	private JButton btnNeuerMesswert;
	private JLabel lblMesswerteAusgabe;
	private JLabel lblNterMesswert;
	private JButton btnBearbeiten;
	private JLabel lblNeuerWert;
	private JButton btnNeuenWertSpeichern;
	private JButton btnMessreiheAuswerten;
	private JLabel lblMaximalWert;
	private JLabel lblMinimalWert;
	private JLabel lblMittelwert;
	private JLabel lblMesswert;
	private JLabel lblAnzahl;
	
	//array welches Messwerte hält
	private double[] inputMesswerte;
	//index der mitläuft, damit bekannt ist, wo man die Werte im Array einträgt
	private int indexMessw = 0;
	//aktuell ausgewählte Messwertnummer
	private int messwNummer = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_02_MessreiheMitArray frame = new _02_MessreiheMitArray();
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
	public _02_MessreiheMitArray() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Messreihe");
		
		lblAnzahl = new JLabel("Wieviele Messewerte sollen eingegeben werden?");
		lblAnzahl.setBounds(10, 11, 317, 14);
		contentPane.add(lblAnzahl);
		
		tfAnzahl = new JTextField();
		tfAnzahl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnBestaetigeAnzahl.doClick();
				}
			}
		});
		tfAnzahl.setBounds(334, 8, 86, 20);
		contentPane.add(tfAnzahl);
		tfAnzahl.setColumns(10);
		
		btnBestaetigeAnzahl = new JButton("OK");
		btnBestaetigeAnzahl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!tfAnzahl.getText().isEmpty()) {
						inputMesswerte = new double[Integer.parseInt(tfAnzahl.getText())];
					}
					
					tfMesswertEingabe.requestFocus();
					tfAnzahl.setEnabled(false);
					btnBestaetigeAnzahl.setEnabled(false);
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Gleitkommazahl eingeben");
				}
			}
		});
		btnBestaetigeAnzahl.setBounds(430, 7, 89, 23);
		contentPane.add(btnBestaetigeAnzahl);
		
		tfMesswertEingabe = new JTextField();
		tfMesswertEingabe.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnNeuerMesswert.doClick();
				}
			}
		});
		tfMesswertEingabe.setBounds(10, 57, 86, 20);
		contentPane.add(tfMesswertEingabe);
		tfMesswertEingabe.setColumns(10);
		
		lblMesswert = new JLabel("Messwerteingabe:");
		lblMesswert.setBounds(10, 36, 116, 14);
		contentPane.add(lblMesswert);
		
		btnNeuerMesswert = new JButton("OK");		
		btnNeuerMesswert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(indexMessw < inputMesswerte.length && !tfMesswertEingabe.getText().isEmpty()) {
						inputMesswerte[indexMessw] = Double.parseDouble(tfMesswertEingabe.getText());
						indexMessw++;
					}
					
					lblMesswerteAusgabe.setText("Messwerte: " + getMesswerteAsString());
					
					tfMesswertEingabe.requestFocus();
					tfMesswertEingabe.selectAll();
					
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Messwert als Gleitkommazahl eingeben");
				}
 			}
		});
		btnNeuerMesswert.setBounds(180, 56, 101, 23);
		contentPane.add(btnNeuerMesswert);
		
		lblMesswerteAusgabe = new JLabel("Messwerte:");
		lblMesswerteAusgabe.setBounds(10, 116, 509, 14);
		contentPane.add(lblMesswerteAusgabe);
		
		tfMesswertBearbeiten = new JTextField();
		tfMesswertBearbeiten.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnBearbeiten.doClick();
				}
			}
		});
		tfMesswertBearbeiten.setBounds(10, 141, 86, 20);
		contentPane.add(tfMesswertBearbeiten);
		tfMesswertBearbeiten.setColumns(10);
		
		lblNterMesswert = new JLabel(". Messwert");
		lblNterMesswert.setBounds(106, 144, 64, 14);
		contentPane.add(lblNterMesswert);
		
		btnBearbeiten = new JButton("Bearbeiten");
		btnBearbeiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!tfMesswertBearbeiten.getText().isEmpty()) {
						messwNummer = Integer.parseInt(tfMesswertBearbeiten.getText());
					}
					
					if(messwNummer >= 1 && messwNummer <= inputMesswerte.length) {
						tfNeuerWert.setText(String.valueOf(inputMesswerte[messwNummer - 1]));
						tfNeuerWert.requestFocus();
						tfNeuerWert.selectAll();
					}
					
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Messwert als Ganzzahl eingeben");
				}
			}
		});
		btnBearbeiten.setBounds(180, 140, 101, 23);
		contentPane.add(btnBearbeiten);
		
		lblNeuerWert = new JLabel("Wert:");
		lblNeuerWert.setBounds(10, 215, 46, 14);
		contentPane.add(lblNeuerWert);
		
		tfNeuerWert = new JTextField();
		tfNeuerWert.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnNeuenWertSpeichern.doClick();
				}
			}
		});
		tfNeuerWert.setBounds(10, 235, 86, 20);
		contentPane.add(tfNeuerWert);
		tfNeuerWert.setColumns(10);
		
		btnNeuenWertSpeichern = new JButton("Speichern");
		btnNeuenWertSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!tfNeuerWert.getText().isEmpty()) {
						inputMesswerte[messwNummer - 1] = Double.parseDouble(tfNeuerWert.getText());
						lblMesswerteAusgabe.setText("Messwerte: " + getMesswerteAsString());
					}
					
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(rootPane, "Bitte Messwert als Gleitkommazahl eingeben");
				}
			}
		});
		btnNeuenWertSpeichern.setBounds(180, 234, 101, 23);
		contentPane.add(btnNeuenWertSpeichern);
		
		btnMessreiheAuswerten = new JButton("Messreihe auswerten");
		btnMessreiheAuswerten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMaximalWert.setText("Maximalwert: " + String.format("%.2f", getMax()));
				lblMinimalWert.setText("Minimalwert: " + String.format("%.2f", getMin()));
				lblMittelwert.setText("Mittelwert: " + String.format("%.2f", getMittelwert()));
			}
		});
		btnMessreiheAuswerten.setBounds(10, 272, 271, 23);
		contentPane.add(btnMessreiheAuswerten);
		
		lblMaximalWert = new JLabel("Maximalwert:");
		lblMaximalWert.setBounds(10, 306, 271, 14);
		contentPane.add(lblMaximalWert);
		
		lblMinimalWert = new JLabel("Minimalwert:");
		lblMinimalWert.setBounds(10, 331, 271, 14);
		contentPane.add(lblMinimalWert);
		
		lblMittelwert = new JLabel("Mittelwert:");
		lblMittelwert.setBounds(10, 356, 271, 14);
		contentPane.add(lblMittelwert);
		
	}
	
	public String getMesswerteAsString() {
		StringBuilder sb = new StringBuilder();
		for(Double number : inputMesswerte) {
			sb.append(number + " ");
		}
		
		return sb.toString();
	}
	
	public double getMax() {
		double max = inputMesswerte[0];
		
		for(int i = 0; i < inputMesswerte.length; i++) {
			if(inputMesswerte[i] > max) max = inputMesswerte[i];
		}
		
		return max;
	}
	
	public double getMin() {
		double min = inputMesswerte[0];
		
		for(int i = 0; i < inputMesswerte.length; i++) {
			if(inputMesswerte[i] < min) min = inputMesswerte[i];
		}
		
		return min;
	}
	
	public double getMittelwert() {
		double sum = 0;
		for(int i = 0; i < inputMesswerte.length; i++) {
			sum += inputMesswerte[i];
		}
		
		return sum / inputMesswerte.length;
	}
	
}
