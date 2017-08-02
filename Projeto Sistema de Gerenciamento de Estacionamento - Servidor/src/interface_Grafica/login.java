package interface_Grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import elementos.Usuario;
import elementos.coleçãoUsuarios;
import procediementos.XML;

public class login {
	
	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private String login,senha;    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setLocationRelativeTo(null);	// centraliza na tela				
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setExtendedState(Frame.MAXIMIZED_BOTH);
		frmLogin.setLocation(new Point(500, 500));
		frmLogin.getContentPane().setBackground(new Color(30, 144, 255));
		frmLogin.setBackground(Color.BLUE);
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 228, 211);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(79, 44, 86, 20);
		frmLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLogin = new JLabel("Usuario");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setBackground(new Color(240, 255, 240));
		lblLogin.setBounds(30, 47, 46, 14);
		frmLogin.getContentPane().add(lblLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 84, 86, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(30, 87, 46, 14);
		frmLogin.getContentPane().add(lblSenha);
		
		JLabel lblIfparking = new JLabel("IFParking");
		lblIfparking.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		lblIfparking.setForeground(Color.WHITE);
		lblIfparking.setBounds(79, 11, 86, 22);
		frmLogin.getContentPane().add(lblIfparking);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(30, 123, 76, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		JLabel lblSgveSistema = new JLabel("SGVE ");
		lblSgveSistema.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblSgveSistema.setForeground(SystemColor.window);
		lblSgveSistema.setBounds(94, 157, 34, 14);
		frmLogin.getContentPane().add(lblSgveSistema);
		
		JButton btnSair = new JButton("Sair");
		
		btnSair.setBounds(137, 123, 57, 23);
		frmLogin.getContentPane().add(btnSair);
		
		JLabel lblSistemaGerenciadorDe = new JLabel("Sistema Gerenciador de Vagas de Espacionamento");
		lblSistemaGerenciadorDe.setForeground(Color.WHITE);
		lblSistemaGerenciadorDe.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblSistemaGerenciadorDe.setBounds(5, 168, 241, 14);
		frmLogin.getContentPane().add(lblSistemaGerenciadorDe);

		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
				login = textField.getText();
				senha = passwordField.getText();
				
				if(fazLogin(login,senha)){
				   frmLogin.setVisible(false);					
				}else{
				textField.setText("");
				passwordField.setText("");
				}
								 
			}
		});
	}
	
	
	
	coleçãoUsuarios colUsuario = new coleçãoUsuarios();
	
	public boolean fazLogin(String login ,String senha){
		ArrayList<Usuario> lista = new ArrayList <Usuario>();
		coleçãoUsuarios col = new coleçãoUsuarios();
		XML out = new XML();
		
			try {				
				col = out.LerUsuarios();
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}	
				
		lista = col.listagemDeUsuarios();
		
		if ((login.equals("Master"))&&(senha.equals("123456"))){
			telaPrincipal.main(null);
			return true;			
		}else{
			for (Usuario p : lista){
				if (p.getNome().equals(login) && p.getSenha().equals(senha)){
					telaPrincipal.main(null);
					return true;	
				}
			}
			JOptionPane.showMessageDialog(null, "Errrou : Login ou Senha Incorreta");
			return false;
			
		}		
	}
}
