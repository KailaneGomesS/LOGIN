package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Calculadora convencional");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCalculadora calculador= new TelaCalculadora();
		          calculador.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton.setBounds(65, 90, 287, 36);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Escolha uma Calculadora ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(76, 28, 287, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnCalculadoraImc = new JButton("Calculadora IMC");
		btnCalculadoraImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imc calcIMC= new imc ();
		          calcIMC.setVisible(true);
			}
		});
		btnCalculadoraImc.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnCalculadoraImc.setBounds(65, 138, 287, 36);
		contentPane.add(btnCalculadoraImc);
	}

}
