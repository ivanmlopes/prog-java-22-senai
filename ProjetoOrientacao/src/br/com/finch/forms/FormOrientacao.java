package br.com.finch.forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.com.finch.classes.Orientacao;

public class FormOrientacao extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable tblOrientacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormOrientacao frame = new FormOrientacao();
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
	public FormOrientacao() {
		EventoClick evt = new EventoClick();
		setTitle("Manuten\u00E7\u00E3o de Orienta\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);

		JButton btnAdicionar = new JButton("Adicionar");
		pnlBotoes.add(btnAdicionar);
		btnAdicionar.addActionListener(evt);

		JButton btnConsultar = new JButton("Consultar");
		pnlBotoes.add(btnConsultar);
		btnConsultar.addActionListener(evt);

		JButton btnAlterar = new JButton("Alterar");
		pnlBotoes.add(btnAlterar);
		btnAlterar.addActionListener(evt);

		JButton btnExcluir = new JButton("Excluir");
		pnlBotoes.add(btnExcluir);
		btnExcluir.addActionListener(evt);

		JPanel pnlPesquisa = new JPanel();
		contentPane.add(pnlPesquisa, BorderLayout.NORTH);

		JLabel lblPesquisa = new JLabel("Palavra Chave a pesquisar:");
		pnlPesquisa.add(lblPesquisa);

		txtPesquisa = new JTextField();
		pnlPesquisa.add(txtPesquisa);
		txtPesquisa.setColumns(20);

		JButton btnPesquisa = new JButton("Pesquisar Palavra");
		pnlPesquisa.add(btnPesquisa);
		btnPesquisa.addActionListener(evt);

		JButton btnTodos = new JButton("Carregar Tudo");
		pnlPesquisa.add(btnTodos);
		btnTodos.addActionListener(evt);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		tblOrientacao = new JTable();
		scrollPane.setViewportView(tblOrientacao);
	}

	class EventoClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			Orientacao or = new Orientacao();
			FormOrientacaoManutencao frmMan = null;

			int linha = tblOrientacao.getSelectedRow();
			boolean bPodeExecutar = true;

			switch (btn.getText()) {
			case "Adicionar":
			case "Consultar":
			case "Alterar":
			case "Excluir":
				frmMan = new FormOrientacaoManutencao();
				frmMan.setOr(or);
				if (btn.getText().equals("Adicionar")) {
					or.novo();
				} else {
					if (linha > -1) {
						DefaultTableModel dft = (DefaultTableModel) tblOrientacao.getModel();
						or.setId((int) dft.getValueAt(linha, 0));
						// para garantir que vamos conseguir pegar o registro trataremos com um if
						if (!or.read()) {
							if (or.isHaErro()) {
								JOptionPane.showMessageDialog(null, "Ocorreu um erro na leitura do registro");
							}
							JOptionPane.showMessageDialog(null, or.getMsgErro());
							bPodeExecutar = false;
						} // fim do if do read

					}else {
					JOptionPane.showMessageDialog(null, "Favor selecionar um registro");
					bPodeExecutar = false;
					}
				}
				break;
			}
			if (bPodeExecutar) {
				switch (btn.getText()) {
				case "Adicionar":
					frmMan.setTipoOperacao(1);
					break;
				case "Consultar":
					frmMan.setTipoOperacao(2);
					break;
				case "Alterar":
					frmMan.setTipoOperacao(3);
					break;
				case "Excluir":
					frmMan.setTipoOperacao(4);
					break;
				case "Pesquisar Palavra":
					tblOrientacao.setModel(or.readByKeyWord(txtPesquisa.getText()));
					break;
				case "Carregar Tudo":
					tblOrientacao.setModel(or.getListaOrientacao());
					break;
				}
				if (frmMan != null) {
					frmMan.setVisible(true);
					frmMan.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosed(WindowEvent e) {
							tblOrientacao.setModel(or.getListaOrientacao());
							super.windowClosed(e);
						}
					});
				}
			}

		}

	}
}
