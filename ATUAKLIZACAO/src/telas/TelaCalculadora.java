package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
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
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 419, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane visorCalculador = new JTextPane();
		visorCalculador.setFont(new Font("Dialog", Font.BOLD, 27));
		visorCalculador.setBackground(new Color(0, 0, 0));
		visorCalculador.setForeground(new Color(255, 255, 255));
		visorCalculador.setBounds(37, 35, 330, 66);
		contentPane.add(visorCalculador);
		
		
		
		JButton btn_limpar = new JButton("C");
		btn_limpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 visorCalculador.setText("");
				
			}
		});
		
		btn_limpar.setForeground(new Color(255, 255, 255));
		btn_limpar.setBackground(new Color(128, 128, 128));
		btn_limpar.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_limpar.setBounds(37, 128, 75, 53);
		contentPane.add(btn_limpar);
		
		JButton btn_maisMenos = new JButton("+/-");
		btn_maisMenos.setForeground(new Color(255, 255, 255));
		btn_maisMenos.setBackground(new Color(128, 128, 128));
		btn_maisMenos.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_maisMenos.setBounds(122, 128, 75, 53);
		contentPane.add(btn_maisMenos);
		
		JButton btn_perc = new JButton("%");
		btn_perc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "%");
			}
		});
		btn_perc.setForeground(new Color(255, 255, 255));
		btn_perc.setBackground(new Color(128, 128, 128));
		btn_perc.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_perc.setBounds(207, 128, 75, 53);
		contentPane.add(btn_perc);
		
		JButton btn_div = new JButton("/");
		btn_div.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "/");
			}
		});
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_div.setForeground(new Color(255, 255, 255));
		btn_div.setBackground(new Color(250, 197, 71));
		btn_div.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_div.setBounds(292, 128, 75, 53);
		contentPane.add(btn_div);
		
		JButton btn_7 = new JButton("7");
		btn_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "7");
			}
		});
	
		btn_7.setForeground(new Color(255, 255, 255));
		btn_7.setBackground(new Color(40, 40, 40));
		btn_7.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_7.setBounds(37, 192, 75, 53);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "8");
			}
		});
		btn_8.setForeground(new Color(255, 255, 255));
		btn_8.setBackground(new Color(40, 40, 40));
		btn_8.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_8.setBounds(122, 192, 75, 53);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "9");
			}
		});
		btn_9.setForeground(new Color(255, 255, 255));
		btn_9.setBackground(new Color(40, 40, 40));
		btn_9.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_9.setBounds(207, 192, 75, 53);
		contentPane.add(btn_9);
		
		JButton btn_mult = new JButton("x");
		btn_mult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "x");
			}
		});
		btn_mult.setForeground(new Color(255, 255, 255));
		btn_mult.setBackground(new Color(250, 197, 71));
		btn_mult.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_mult.setBounds(292, 192, 75, 53);
		contentPane.add(btn_mult);
		
		JButton btn_4 = new JButton("4");
		btn_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "4");
			}
		});
		btn_4.setForeground(new Color(255, 255, 255));
		btn_4.setBackground(new Color(40, 40, 40));
		btn_4.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_4.setBounds(37, 256, 75, 53);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "5");
			}
		});
		btn_5.setForeground(new Color(255, 255, 255));
		btn_5.setBackground(new Color(40, 40, 40));
		btn_5.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_5.setBounds(122, 256, 75, 53);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "6");
			}
		});
		btn_6.setForeground(new Color(255, 255, 255));
		btn_6.setBackground(new Color(40, 40, 40));
		btn_6.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_6.setBounds(207, 256, 75, 53);
		contentPane.add(btn_6);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "-");
			}
		});
		btn_sub.setForeground(new Color(255, 255, 255));
		btn_sub.setBackground(new Color(250, 197, 71));
		btn_sub.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_sub.setBounds(292, 256, 75, 53);
		contentPane.add(btn_sub);
		
		JButton btn_1 = new JButton("1");
		btn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "1");
			}
		});
		btn_1.setForeground(new Color(255, 255, 255));
		btn_1.setBackground(new Color(40, 40, 40));
		btn_1.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_1.setBounds(37, 320, 75, 53);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "2");
			}
		});
		btn_2.setForeground(new Color(255, 255, 255));
		btn_2.setBackground(new Color(40, 40, 40));
		btn_2.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_2.setBounds(122, 320, 75, 53);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "3");
			}
		});
		btn_3.setForeground(new Color(255, 255, 255));
		btn_3.setBackground(new Color(40, 40, 40));
		btn_3.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_3.setBounds(207, 320, 75, 53);
		contentPane.add(btn_3);
		
		JButton btn_adicao = new JButton("+");
		btn_adicao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "+");
			}
		});
		btn_adicao.setForeground(new Color(255, 255, 255));
		btn_adicao.setBackground(new Color(250, 197, 71));
		btn_adicao.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_adicao.setBounds(292, 320, 75, 53);
		contentPane.add(btn_adicao);
		
		JButton btn_0 = new JButton("0");
		btn_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + "0");
			}
		});
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn_0.setForeground(new Color(255, 255, 255));
		btn_0.setBackground(new Color(40, 40, 40));
		btn_0.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_0.setBounds(37, 384, 160, 53);
		contentPane.add(btn_0);
		
		JButton btn_ponto = new JButton(".");
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_ponto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
			    visorCalculador.setText(valor + ".");
			}
		});
		btn_ponto.setForeground(new Color(255, 255, 255));
		btn_ponto.setBackground(new Color(40, 40, 40));
		btn_ponto.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_ponto.setBounds(207, 384, 75, 53);
		contentPane.add(btn_ponto);
		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_igual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String valor = visorCalculador.getText();
		        System.out.println(">>>"+valor);
		        Calculos calculos = new Calculos();
		        String resultado = calculos.calculadora(valor);

		        visorCalculador.setText(resultado);
				
			}
		});
		btn_igual.setForeground(new Color(255, 255, 255));
		btn_igual.setBackground(new Color(250, 197, 71));
		btn_igual.setFont(new Font("Dialog", Font.BOLD, 23));
		btn_igual.setBounds(292, 384, 75, 53);
		contentPane.add(btn_igual);
	}
}
