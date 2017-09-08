package atividade04.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import atividade04.basic.Usuario;
import atividade04.fachada.Fachada;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField campoLogin;
	private JTextField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 98);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblLogin = new JLabel("Login:");
		panel.add(lblLogin);
		
		campoLogin = new JTextField();
		panel.add(campoLogin);
		campoLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		panel.add(lblSenha);
		
		campoSenha = new JTextField();
		panel.add(campoSenha);
		campoSenha.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fachada fachada = new Fachada();
				try {
					fachada.logar(campoLogin.getText().trim(), campoSenha.getText().trim());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		contentPane.add(btnEntrar, BorderLayout.SOUTH);
	}

}
