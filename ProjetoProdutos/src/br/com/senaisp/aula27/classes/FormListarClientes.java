package br.com.senaisp.aula27.classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class FormListarClientes extends JFrame {

	private JPanel contentPane;
	private DefaultTableModel tblMdProd;
	private JTable tblProdutos;
	private Cliente clie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormListarClientes frame = new FormListarClientes();
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
	public FormListarClientes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Adicionar");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Consultar");
		panel.add(btnNewButton_1);

		

		JButton btnNewButton_3 = new JButton("Excluir");
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JScrollPane scrCliente = new JScrollPane();
		contentPane.add(scrCliente, BorderLayout.CENTER);
		String cabecalho[] = { "Código", "Nome", "Telefone", "Data de Nascimento" };

		tblMdProd = new DefaultTableModel(cabecalho, 0);
		
		JButton btnNewButton_2 = new JButton("Alterar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormManutencao fmtCli = new FormManutencao();
				fmtCli.setTblMdProd(tblMdProd);
				fmtCli.setLinhaSelecionada(tblProdutos.getSelectedRow());
				fmtCli.setTipoOperacao(3);
				fmtCli.setVisible(true);
			}
		});
		panel.add(btnNewButton_2);

		tblProdutos = new JTable(tblMdProd) {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				Component returnComp = super.prepareRenderer(renderer, row, column);
				Color alternateColor = new Color(192, 192, 192);
				Color whiteColor = Color.WHITE;
				if (!returnComp.getBackground().equals(getSelectionBackground())) {
					Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
					returnComp.setBackground(bg);
					// Alinhando usando o evento de renderização
					if (column == 0 || column == 2) {
						((JLabel) returnComp).setHorizontalAlignment(SwingConstants.RIGHT);
					} else {
						((JLabel) returnComp).setHorizontalAlignment(SwingConstants.LEFT);
					}
					// Colocando espaço na celula
					((JLabel) returnComp).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
					bg = null;
				}
				((JLabel)returnComp).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
				return returnComp;
			}
		};
		scrCliente.setViewportView(tblProdutos);
		Calendar cal = Calendar.getInstance();
		DateFormat fmtDt = new SimpleDateFormat("dd/MM/yyyy");
		for (int lin = 1; lin <= 5; lin++) {
			cal.set(1980, 0, lin);
			java.util.Date dtNasc = cal.getTime();
			Object item[] = { lin, "Cliente" + lin, "14 9999-8833", fmtDt.format(dtNasc) };
			tblMdProd.addRow(item);
		}
	}
}
