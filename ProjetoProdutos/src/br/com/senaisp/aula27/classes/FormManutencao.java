package br.com.senaisp.aula27.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import javax.swing.text.NumberFormatter;

public class FormManutencao extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JFormattedTextField fmtCodigo;
	private JFormattedTextField fmtDataNascimento;
	private DefaultTableModel tblMdProd;
	private int linhaSelecionada;
	private int tipoOperacao;
	private DateFormat fmtDt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormManutencao frame = new FormManutencao();
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
	public FormManutencao() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel pnlBotoes = new JPanel();
		contentPane.add(pnlBotoes, BorderLayout.SOUTH);
		
		JButton btnConfirmar = new JButton("Confirmar");
		pnlBotoes.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		pnlBotoes.add(btnCancelar);
		
		JPanel pnlCorpo = new JPanel();
		contentPane.add(pnlCorpo, BorderLayout.NORTH);
		pnlCorpo.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel pnlCodigo = new JPanel();
		FlowLayout fl_pnlCodigo = (FlowLayout) pnlCodigo.getLayout();
		fl_pnlCodigo.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlCodigo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		pnlCodigo.add(lblCodigo);
		
		NumberFormat fmtNm = NumberFormat.getInstance();
		NumberFormatter fmtNmt = new NumberFormatter(fmtNm);
		
		fmtNmt.setValueClass(Integer.class);
		fmtNmt.setMinimum(0);
		fmtNmt.setMaximum(Integer.MAX_VALUE);
		fmtNmt.setAllowsInvalid(false);
		
		fmtCodigo = new JFormattedTextField(fmtNmt);
		fmtCodigo.setColumns(10);
		pnlCodigo.add(fmtCodigo);
		fmtCodigo.setValue(0);
		
		JPanel pnlNome = new JPanel();
		FlowLayout fl_pnlNome = (FlowLayout) pnlNome.getLayout();
		fl_pnlNome.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlNome);
		
		JLabel lblNome = new JLabel("Nome");
		pnlNome.add(lblNome);
		
		txtNome = new JTextField();
		pnlNome.add(txtNome);
		txtNome.setColumns(30);
		
		JPanel pnlTelefone = new JPanel();
		FlowLayout fl_pnlTelefone = (FlowLayout) pnlTelefone.getLayout();
		fl_pnlTelefone.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone");
		pnlTelefone.add(lblTelefone);
		
		txtTelefone = new JTextField();
		pnlTelefone.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JPanel pnlDtNasc = new JPanel();
		FlowLayout fl_pnlDtNasc = (FlowLayout) pnlDtNasc.getLayout();
		fl_pnlDtNasc.setAlignment(FlowLayout.LEFT);
		pnlCorpo.add(pnlDtNasc);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento");
		pnlDtNasc.add(lblDataNascimento);
		
		fmtDt = new SimpleDateFormat ("dd/MM/yyyy");
		DateFormatter fmtDtt = new DateFormatter(fmtDt);
		fmtDtt.setAllowsInvalid(false);
		fmtDtt.setOverwriteMode(true);
		
		
		fmtDataNascimento = new JFormattedTextField(fmtDtt);
		fmtDataNascimento.setColumns(10);
		pnlDtNasc.add(fmtDataNascimento);
		fmtDataNascimento.setValue(new Date());
	}

	public void setLinhaSelecionada(int linhaSelecionada) {
		this.linhaSelecionada = linhaSelecionada;
	}

	public void setTipoOperacao(int tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
		switch(tipoOperacao) {
		case 2:
		case 3:
		case 4:
			fmtCodigo.setValue(tblMdProd.getValueAt(linhaSelecionada, 0));
			txtNome.setText((String)tblMdProd.getValueAt(linhaSelecionada, 1));
			txtTelefone.setText((String)tblMdProd.getValueAt(linhaSelecionada, 2));
			try {
				Date dtNasc = fmtDt.parse((String)tblMdProd.getValueAt(linhaSelecionada, 3));
				fmtDataNascimento.setValue(dtNasc);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	public void setTblMdProd(DefaultTableModel tblMdProd) {
		this.tblMdProd = tblMdProd;
	}

	
	}


