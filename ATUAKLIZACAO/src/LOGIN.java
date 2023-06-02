import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
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
	public LOGIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(52, 205, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton entrar = new JButton("Entrar");
		entrar.setFont(new Font("Times New Roman", Font.BOLD, 12));
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usuario.getText().equals("teste") && senha.getText().equals("123")){
		            JOptionPane.showMessageDialog(null, "Acesso Permitido!");
		          imc calcIMC= new imc ();
		          calcIMC.setVisible(true);
		        }
		        else{ JOptionPane.showMessageDialog(null, "Acesso Negado!");
		        }
				
			}
			
		});
		entrar.setBounds(270, 205, 89, 23);
		contentPane.add(entrar);
		
		usuario = new JTextField();
		usuario.setBounds(173, 85, 101, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(173, 124, 101, 20);
		contentPane.add(senha);
		
		JLabel lblNewLabel = new JLabel("Usu\u00E1rio:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 87, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(132, 32, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSenha.setBounds(96, 126, 67, 14);
		contentPane.add(lblSenha);
	}
}
