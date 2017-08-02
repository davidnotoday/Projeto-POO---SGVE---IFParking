package interface_Grafica;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import elementos.Usuario;
import elementos.coleçãoUsuarios;
import procediementos.Buscar;
import procediementos.XML;

public class telaCadastros {
    
	private JFrame frmTelaCadastro;
	private JTextField textNome;
	private JPasswordField passwordSenha;
	private JFormattedTextField textCpf;
	private JTextField textNoperador;
	private JFormattedTextField textNvagas;
	private JTextField textPreço;
	private JTextField textTempo;
	private JFormattedTextField textPlaca;
	private JTextField textModCarro;
	private JTextField textCor;
	private JTextField textTipo;
	private JTextField textSetor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {	
			public void run() {
				try {
					telaCadastros window = new telaCadastros();
					window.frmTelaCadastro.setLocationRelativeTo(null);
					window.frmTelaCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public telaCadastros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("deprecation")
	private void initialize() {
		frmTelaCadastro = new JFrame();
		frmTelaCadastro.setTitle("IFParking - Cadastros");
		frmTelaCadastro.setBounds(100, 100, 515, 630);
		frmTelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaCadastro.getContentPane().setLayout(null);
		
		JLabel lblCadastroDeOperadores = new JLabel("Cadastro de Operadores");
		lblCadastroDeOperadores.setForeground(SystemColor.textHighlight);
		lblCadastroDeOperadores.setBounds(30, 11, 150, 14);
		frmTelaCadastro.getContentPane().add(lblCadastroDeOperadores);
		
		textNome = new JTextField();
		textNome.setBounds(139, 56, 233, 20);
		frmTelaCadastro.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(139, 36, 46, 14);
		frmTelaCadastro.getContentPane().add(lblNome);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(154, 80, 124, 14);
		frmTelaCadastro.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(390, 33, 46, 14);
		frmTelaCadastro.getContentPane().add(lblSenha);
		
		JLabel lblCadastroDeVagas = new JLabel("Cadastro de Vagas no estacionamento");
		lblCadastroDeVagas.setForeground(SystemColor.textHighlight);
		lblCadastroDeVagas.setBackground(new Color(0, 191, 255));
		lblCadastroDeVagas.setBounds(30, 146, 222, 14);
		frmTelaCadastro.getContentPane().add(lblCadastroDeVagas);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(288, 557, 93, 23);
		frmTelaCadastro.getContentPane().add(btnPesquisar);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(390, 57, 75, 20);
		frmTelaCadastro.getContentPane().add(passwordSenha);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(30, 86, 46, 14);
		frmTelaCadastro.getContentPane().add(lblCpf);
		
		textCpf = new JFormattedTextField();
		textCpf.setBounds(29, 105, 100, 20);
		frmTelaCadastro.getContentPane().add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNDoOperador = new JLabel("N\u00B0 do operador");
		lblNDoOperador.setBounds(30, 36, 99, 14);
		frmTelaCadastro.getContentPane().add(lblNDoOperador);
		
		textNoperador = new JTextField();
		textNoperador.setEditable(false);
		textNoperador.setBounds(30, 56, 46, 20);
		frmTelaCadastro.getContentPane().add(textNoperador);
		textNoperador.setColumns(10);
		
		JLabel lblQuantidadeDeVagas = new JLabel("N\u00B0 Vagas");
		lblQuantidadeDeVagas.setBounds(121, 171, 75, 14);
		frmTelaCadastro.getContentPane().add(lblQuantidadeDeVagas);
		
		textNvagas = new JFormattedTextField();
		textNvagas.setBounds(121, 192, 54, 20);
		frmTelaCadastro.getContentPane().add(textNvagas);
		textNvagas.setColumns(10);
		
		JLabel lblPreohora = new JLabel("Pre\u00E7o");
		lblPreohora.setBounds(321, 171, 86, 14);
		frmTelaCadastro.getContentPane().add(lblPreohora);
		
		textPreço = new JTextField();
		textPreço.setBounds(321, 192, 54, 20);
		frmTelaCadastro.getContentPane().add(textPreço);
		textPreço.setColumns(10);
		
		JLabel lblTempo = new JLabel("Tempo");
		lblTempo.setBounds(395, 171, 46, 14);
		frmTelaCadastro.getContentPane().add(lblTempo);
		
		textTempo = new JTextField();
		textTempo.setBounds(395, 192, 59, 20);
		frmTelaCadastro.getContentPane().add(textTempo);
		textTempo.setColumns(10);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.setFocusPainted(false);
		rdbtnSim.setBounds(202, 193, 54, 23);
		frmTelaCadastro.getContentPane().add(rdbtnSim);
		
		JRadioButton rdbtnNo = new JRadioButton("N\u00E3o");
		rdbtnNo.setBounds(256, 193, 59, 23);
		frmTelaCadastro.getContentPane().add(rdbtnNo);
		rdbtnNo.setSelected(true);
		textPreço.setEditable(false);
		textTempo.setEditable(false);
		
				
		JLabel lblSetores = new JLabel("Setor");
		lblSetores.setBounds(30, 171, 75, 14);
		frmTelaCadastro.getContentPane().add(lblSetores);
		
		JLabel lblCobranaPorUso = new JLabel("Cobran\u00E7a Por uso");
		lblCobranaPorUso.setBounds(202, 171, 109, 14);
		frmTelaCadastro.getContentPane().add(lblCobranaPorUso);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(391, 557, 75, 23);
		frmTelaCadastro.getContentPane().add(btnVoltar);
		
		JLabel lblCadastroDeClientes = new JLabel("Cadastro de Usuarios");
		lblCadastroDeClientes.setForeground(SystemColor.textHighlight);
		lblCadastroDeClientes.setBounds(31, 238, 124, 14);
		frmTelaCadastro.getContentPane().add(lblCadastroDeClientes);
		
		JLabel lblPlaca = new JLabel("Placa");
		lblPlaca.setBounds(31, 263, 46, 14);
		frmTelaCadastro.getContentPane().add(lblPlaca);
		
		textPlaca = new JFormattedTextField();
		textPlaca.setBounds(31, 281, 67, 20);
		frmTelaCadastro.getContentPane().add(textPlaca);
		textPlaca.setColumns(10);
		
		JLabel lblModeloDoCarro = new JLabel("Modelo do Carro");
		lblModeloDoCarro.setBounds(30, 312, 99, 14);
		frmTelaCadastro.getContentPane().add(lblModeloDoCarro);
		
		textModCarro = new JTextField();
		textModCarro.setEditable(false);
		textModCarro.setBounds(30, 330, 233, 20);
		frmTelaCadastro.getContentPane().add(textModCarro);
		textModCarro.setColumns(10);
		
		List ListagemBox = new List();
		ListagemBox.setFont(new Font("Dialog", Font.BOLD, 12));
		ListagemBox.setMultipleMode(true);
		ListagemBox.setMultipleSelections(false);
		ListagemBox.setFocusTraversalKeysEnabled(false);
		ListagemBox.setBounds(30, 421, 435, 120);
		frmTelaCadastro.getContentPane().add(ListagemBox);
		
		JLabel lblListagem = new JLabel("Listagem");
		lblListagem.setBounds(30, 401, 85, 14);
		frmTelaCadastro.getContentPane().add(lblListagem);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setBounds(154, 557, 124, 23);
		frmTelaCadastro.getContentPane().add(btnLimparCampos);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(121, 263, 46, 14);
		frmTelaCadastro.getContentPane().add(lblCor);
		
		textCor = new JTextField();
		textCor.setEditable(false);
		textCor.setBounds(121, 281, 75, 20);
		frmTelaCadastro.getContentPane().add(textCor);
		textCor.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(217, 263, 46, 14);
		frmTelaCadastro.getContentPane().add(lblTipo);
		
		textTipo = new JTextField();
		textTipo.setEditable(false);
		textTipo.setBounds(217, 281,141, 20);
		frmTelaCadastro.getContentPane().add(textTipo);
		textTipo.setColumns(10);
		
		JButton btnPesquisaDetran = new JButton("Pesquisar Placa No Detran");
		btnPesquisaDetran.setBounds(30, 367, 194, 23);
		frmTelaCadastro.getContentPane().add(btnPesquisaDetran);
		
		JButton btnSalvar_Operador = new JButton("Salvar");
		btnSalvar_Operador.setBounds(283, 105, 89, 23);
		frmTelaCadastro.getContentPane().add(btnSalvar_Operador);
		
		JButton btnExcluirPlaca = new JButton("Excluir");
		btnExcluirPlaca.setBounds(376, 327, 89, 23);
		frmTelaCadastro.getContentPane().add(btnExcluirPlaca);
		
		JButton btnSalvarSetor = new JButton("Salvar");
		btnSalvarSetor.setBounds(376, 223, 89, 23);
		frmTelaCadastro.getContentPane().add(btnSalvarSetor);
		
		JButton button_1 = new JButton("Salvar");
		button_1.setBounds(277, 327, 89, 23);
		frmTelaCadastro.getContentPane().add(button_1);
		
		JButton btnExcluirUsuario = new JButton("Excluir");
		btnExcluirUsuario.setBounds(382, 104, 89, 23);
		frmTelaCadastro.getContentPane().add(btnExcluirUsuario);
		
		JFormattedTextField textData = new JFormattedTextField();
		textData.setBounds(154, 105, 75, 20);
		frmTelaCadastro.getContentPane().add(textData);
		
		XML arquivoXML = new XML();
		coleçãoUsuarios colUsuario = new coleçãoUsuarios();
		textNvagas.setText("");		
		try {
			colUsuario.adicionarArrayList(arquivoXML.LerUsuarios().listagemDeUsuarios());
		} catch (ClassNotFoundException | IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		MaskFormatter maskData = null;
		MaskFormatter maskcpf = null;
		MaskFormatter maskPlaca = null;
		MaskFormatter maskNvagas = null;
	
		try {
			maskNvagas = new MaskFormatter("########");
			maskData = new MaskFormatter("##/##/####");
			maskcpf = new MaskFormatter("###.###.###-##");
			maskPlaca = new MaskFormatter("UUU-####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		maskNvagas.install(textNvagas);
		maskData.install(textData);	
		maskcpf.install(textCpf);
		maskPlaca.install(textPlaca);
		
		textSetor = new JTextField();
		textSetor.setBounds(30, 192, 54, 20);
		frmTelaCadastro.getContentPane().add(textSetor);
		textSetor.setColumns(10);
		
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnSim.setSelected(false);	
				textPreço.setText("");
				textTempo.setText("");
				textPreço.setEditable(false);
				textTempo.setEditable(false);
								 
			}
		});
		
		rdbtnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnNo.setSelected(false);
				textPreço.setEditable(true);
				textTempo.setEditable(true);
			}
		});
		
		btnSalvar_Operador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String dataNascimento = textData.getText();
				DateTimeFormatter formatação = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				ArrayList <Usuario> lista = colUsuario.listagemDeUsuarios();
				
				if (validaData(dataNascimento)){					
					LocalDate data = LocalDate.parse(dataNascimento, formatação);						
					Usuario us = new Usuario(textNome.getText(),textCpf.getText(),data,passwordSenha.getText());
					if(colUsuario.adicionar(us)){						
						textNome.setText("");
						textCpf.setText("");
						textData.setText("");
						passwordSenha.setText("");
						textNoperador.setText("");
						textNome.requestFocus();
						ListagemBox.removeAll();
						for (Usuario p : lista){									   
							   ListagemBox.add("Cpf :"+p.getCpf()+" | Nome :"+p.getNome()+"  | Data Nascimento :"+p.getDataDeNascimento().toString());
							   ListagemBox.add("-------------------------------------------------------------------------------------------");							   
						}
						JOptionPane.showMessageDialog(null, "Salvo Com Sucesso !");
						textNome.requestFocus();
					}else{
						JOptionPane.showMessageDialog(null, "Existe Já este Cpf Castrado");
						textCpf.setText("");
						textCpf.requestFocus();
					}			
				}else{
					JOptionPane.showMessageDialog(null, "ERRO ! Data de Nascumento Incorreto,Verifique");
					textData.setText("");	
					textData.requestFocus();
				}										 
			}
		});
		
		btnExcluirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList <Usuario> lista = colUsuario.listagemDeUsuarios();				
				if(colUsuario.removePeloNumero(textCpf.getText())){
					ListagemBox.removeAll();
					for (Usuario p : lista){									   
						   ListagemBox.add("Cpf :"+p.getCpf()+" | Nome :"+p.getNome()+"  | Data Nascimento :"+p.getDataDeNascimento().toString());
						   ListagemBox.add("-------------------------------------------------------------------------------------------");							   
					}					
					textCpf.setText("");
					textNome.requestFocus();
					JOptionPane.showMessageDialog(null, "Excluido com sucesso");	
				}else{
					JOptionPane.showMessageDialog(null, "Cpf Não encontrado nos Registros");
					textCpf.setText("");	
					textCpf.requestFocus();
				}												 
			}
		});
		
		btnSalvarSetor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
            
			System.out.println(textNvagas.getText());
				
				
				
				//coleçãoVagas v = new coleçãoVagas();
				
				//Setor s = new Setor(textSetor.getText(),);
				
			}
		});
		
		btnPesquisaDetran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					
				Buscar busca = new Buscar();
				ArrayList <String> lista = null;	
				int letrasNum = textPlaca.getText().indexOf("-");
				String letras = textPlaca.getText().substring(0, letrasNum);
				String num = textPlaca.getText().substring(++letrasNum);
				String placa = letras+num;
				try{					
				  lista = busca.buscaPlaca(placa);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "ERRO ! Verifique a Conexão com a Internet e Tente Novamente");
				}
				
				if(lista!= null){
					if (lista.size() == 1){
						JOptionPane.showMessageDialog(null, "Placa Não Cadastrada No Detran PB");
						textPlaca.setText("");
						textCor.setText("");
						textModCarro.setText("");
						textTipo.setText("");	
						textPlaca.requestFocus();
					}else{						
						textCor.setText(lista.get(0));
						textModCarro.setText(lista.get(1));
						textTipo.setText(lista.get(2));
						lista = null;
					}
				}					 
			}
		});
		
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textNome.setText("");
				textCpf.setText("");
				textData.setText("");
				passwordSenha.setText("");
				textNoperador.setText("");
				textPlaca.setText("");
				textCor.setText("");
				textModCarro.setText("");
				textTipo.setText("");		
			}
		});
		
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if (!(textNome.getText().isEmpty())){
					ArrayList <Usuario> busca = null;
					try{
					busca	= colUsuario.pesquisaPorNome(textNome.getText());	
					}catch(Exception only){
					
					}					
				    if(busca.size() > 0){
				    	ListagemBox.removeAll();
				    	for (Usuario p : busca){									   
							   ListagemBox.add("Cpf :"+p.getCpf()+" | Nome :"+p.getNome()+"  | Data Nascimento :"+p.getDataDeNascimento().toString());
							   ListagemBox.add("-------------------------------------------------------------------------------------------");							   
						}				   				    	
				    }else{
				    	JOptionPane.showMessageDialog(null, "Não Encontrado Registro!");
				    	textNome.setText("");
				    	textNome.requestFocus();	
				    }				    
				}else{
					ListagemBox.removeAll();
					for (Usuario p : colUsuario.listagemDeUsuarios()){									   
						   ListagemBox.add("Cpf :"+p.getCpf()+" | Nome :"+p.getNome()+"  | Data Nascimento :"+p.getDataDeNascimento().toString());
						   ListagemBox.add("-------------------------------------------------------------------------------------------");							   
					}
				}
			}
		});
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                  try{
                	  arquivoXML.GravarUsuario(colUsuario);  
                  }catch(Exception test){
                    System.out.println("Problemas Na Gravação do Arquivo!");
			      }
							
				   telaPrincipal.main(null);
				   frmTelaCadastro.setVisible(false);   			   	 
			}
		});
	}
	
	public boolean validaData(String data) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
			sdf.parse(data);
			return true;
		}catch (ParseException ex) {
			return false;
		 }
	}
}