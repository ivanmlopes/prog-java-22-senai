package br.com.senaisp.aula27.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;

public class FormMain extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormMain frame = new FormMain();
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
	public FormMain() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastros");
		menuBar.add(mnCadastro);
		
		mntmCliente = new JMenuItem("Cliente");
		mnCadastro.add(mntmCliente);
		
		JSeparator separator = new JSeparator();
		mnCadastro.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnCadastro.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
