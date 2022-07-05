package br.com.senaisp.aula23.classes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioTeste extends JFrame {

	private JLabel labelNome;
	private JLabel labelEndereco;
	private JTextField textNome;
	private JTextField textEndereco;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FormularioTeste() {
		super("Titulo da Janela");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void exibirForm() {
		setSize(500, 300);
		// setLocation(300,300);
		// CENTRALIZANDO A JANELA
		setLocationRelativeTo(null);
		labelNome = new JLabel("Nome do Cliente: ");
		textNome = new JTextField("Digite aqui o conteudo: ");
		labelEndereco = new JLabel("Endereco: ");
		textEndereco = new JTextField("Digite aqui o conteudo: ");
		// Colocando os posicionamentos (absoluto)
		labelNome.setBounds(10, 10, 100, 25);
		textNome.setBounds(110, 10, 200, 25);
		labelEndereco.setBounds(10, 50, 130, 25);
		textEndereco.setBounds(110, 50, 200, 25);
		// getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		// layout absoluto
		getContentPane().setLayout(null);

		getContentPane().add(labelNome);
		getContentPane().add(textNome);
		getContentPane().add(labelEndereco);
		getContentPane().add(textEndereco);

		setVisible(true);
	}

	
	protected void criarComponentes() {
		labelNome = new JLabel("Nome do Cliente: ");
		textNome = new JTextField("Digite aqui o conteudo: ");
		labelEndereco = new JLabel("Endereco: ");
		textEndereco = new JTextField("Digite aqui o conteudo: ");
	}

	protected void addComponentes2Panel() {
		getContentPane().add(labelNome);
		getContentPane().add(textNome);
		getContentPane().add(labelEndereco);
		getContentPane().add(textEndereco);

	}

	public void exibirFormAbsoluto() {
		setSize(500, 300);
		// setLocation(300,300);
		// CENTRALIZANDO A JANELA
		setLocationRelativeTo(null);
		criarComponentes();
		// Colocando os posicionamentos (absoluto)
		labelNome.setBounds(10, 10, 100, 25);
		textNome.setBounds(110, 10, 200, 25);
		labelEndereco.setBounds(10, 50, 130, 25);
		textEndereco.setBounds(110, 50, 200, 25);
		// layout absoluto
		getContentPane().setLayout(null);
		addComponentes2Panel();

		setVisible(true);
	}

	public void exibirFormFlow() {
		setSize(500, 300);
//setLocation(300,300);
//CENTRALIZANDO A JANELA
		setLocationRelativeTo(null);
		criarComponentes();

		getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));

		addComponentes2Panel();

		setVisible(true);
	}
	public void exibirFormBorder() {
		setSize(500, 300);
		//setLocation(300,300);
		//CENTRALIZANDO A JANELA
		setLocationRelativeTo(null);
		criarComponentes();

		getContentPane().setLayout(new BorderLayout());

		addComponentes2Panel();

		setVisible(true);
}
	public void exibirFormGrid() {
		setSize(500, 300);
//setLocation(300,300);
//CENTRALIZANDO A JANELA
		setLocationRelativeTo(null);
		criarComponentes();

		getContentPane().setLayout(new GridLayout(2, 2));

		addComponentes2Panel();

		setVisible(true);
}
}