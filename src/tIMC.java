import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JTextPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.JRadioButton;

public class tIMC {

	private JFrame frame;
	private JTextField jaltura;
	private JTextField jpeso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tIMC window = new tIMC();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tIMC() {
		initialize();
	}
	float peso, altura, imc;
	private JTextField resultado;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cálculo IMC");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 34, 271, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setBounds(59, 269, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		jaltura = new JTextField();
		jaltura.setColumns(10);
		jaltura.setBounds(181, 153, 106, 20);
		frame.getContentPane().add(jaltura);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSexo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSexo.setBounds(59, 121, 112, 20);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAltura.setBounds(59, 152, 112, 20);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPeso.setBounds(59, 183, 112, 20);
		frame.getContentPane().add(lblPeso);
		
		jpeso = new JTextField();
		jpeso.setColumns(10);
		jpeso.setBounds(181, 184, 106, 20);
		frame.getContentPane().add(jpeso);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jaltura.setText(null);
				jpeso.setText(null);
				
			}
			
		});
		btnLimpar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnLimpar.setBounds(351, 152, 106, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVoltar.setBounds(210, 269, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnConfirma = new JButton("Calcule");
		btnConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				 float peso = Float.parseFloat(jpeso.getText());
			        float altura = Float.parseFloat(jaltura.getText());
			        imc= peso/(altura*altura);
			       resultado.setText(String.valueOf(imc));
					
			  
			}
		});
		btnConfirma.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnConfirma.setBounds(351, 269, 106, 23);
		frame.getContentPane().add(btnConfirma);
		
		resultado = new JTextField();
		resultado.setBackground(new Color(255, 255, 255));
		resultado.setForeground(new Color(0, 0, 0));
		resultado.setEditable(false);
		resultado.setColumns(10);
		resultado.setBounds(181, 215, 106, 20);
		frame.getContentPane().add(resultado);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblResultado.setBounds(59, 214, 112, 20);
		frame.getContentPane().add(lblResultado);
		
		JRadioButton feminino = new JRadioButton("Feminino");
		feminino.setFont(new Font("Times New Roman", Font.BOLD, 13));
		feminino.setBounds(154, 121, 89, 23);
		frame.getContentPane().add(feminino);
		
		JRadioButton masculino = new JRadioButton("Masculino");
		masculino.setFont(new Font("Times New Roman", Font.BOLD, 13));
		masculino.setBounds(245, 121, 140, 23);
		frame.getContentPane().add(masculino);
	}
}
