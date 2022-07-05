package br.com.senaisp.aula24.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class ClasseFormProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClasseFormProduto frame = new ClasseFormProduto();
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
	public ClasseFormProduto() {
		setTitle("Manuten\u00E7\u00E3o de Produtos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo do Produto");
		lblNewLabel.setBounds(10, 11, 98, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(150, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o do Produto");
		lblNewLabel_1.setBounds(10, 49, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(150, 46, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Pre\u00E7o do Produto");
		lblNewLabel_2.setBounds(10, 87, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(150, 84, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(10, 238, 430, 33);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButton = new JButton("Gravar");
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		panel.add(btnNewButton_1);
	}
}
