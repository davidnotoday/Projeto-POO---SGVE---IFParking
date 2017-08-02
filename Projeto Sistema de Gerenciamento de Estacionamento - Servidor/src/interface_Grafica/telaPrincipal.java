package interface_Grafica;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JLabel;

public class telaPrincipal {
	private JFrame telaPrincipal;
	
	/**
	 * Launch the application.
	 */
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal window = new telaPrincipal();
					window.telaPrincipal.setLocationRelativeTo(null);
					window.telaPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		telaPrincipal = new JFrame();
		telaPrincipal.setForeground(new Color(100, 149, 237));
		telaPrincipal.getContentPane().setForeground(new Color(32, 178, 170));
		telaPrincipal.setType(Type.UTILITY);
		telaPrincipal.setName("TelaPrincipal");
		telaPrincipal.setTitle("     IFParking - Principal");
		telaPrincipal.setResizable(false);
		telaPrincipal.setBounds(100, 100, 685, 608);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipal.getContentPane().setLayout(null);
		
		JButton btnCadastro = new JButton("Cadastros");
		btnCadastro.setBounds(10, 11, 100, 23);
		telaPrincipal.getContentPane().add(btnCadastro);
		
		JButton btnTelaDeBaixa = new JButton("Tela de Baixa ");
		btnTelaDeBaixa.setBounds(120, 11, 120, 23);
		telaPrincipal.getContentPane().add(btnTelaDeBaixa);
		
		JButton btnEstatistica = new JButton("Estatisticas");
		btnEstatistica.setActionCommand("Estatisticas");
		btnEstatistica.setBounds(250, 11, 114, 23);
		telaPrincipal.getContentPane().add(btnEstatistica);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(374, 11, 87, 23);
		telaPrincipal.getContentPane().add(btnLogout);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(471, 11, 65, 23);
		telaPrincipal.getContentPane().add(btnSair);
		
		JLabel lblSistemaGerenciadorDe = new JLabel("Sistema Gerenciador de Vagas de Estacionamento ");
		lblSistemaGerenciadorDe.setEnabled(false);
		lblSistemaGerenciadorDe.setBounds(10, 554, 311, 14);
		telaPrincipal.getContentPane().add(lblSistemaGerenciadorDe);
		
		JLabel lblV = new JLabel("V 0.0.1");
		lblV.setEnabled(false);
		lblV.setBounds(623, 554, 46, 14);
		telaPrincipal.getContentPane().add(lblV);
		
		JLabel lblUsuarioLogado = new JLabel("Usuario Logado");
		lblUsuarioLogado.setEnabled(false);
		lblUsuarioLogado.setBounds(546, 15, 100, 14);
		telaPrincipal.getContentPane().add(lblUsuarioLogado);
		
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				   
				   telaCadastros.main(null);
				   telaPrincipal.setVisible(false);   
												 
			}
		});
		
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				   
				   login.main(null);
				   telaPrincipal.setVisible(false);   
												 
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				   
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
	}
		
		
	}
	
	
	

