package br.com.senaisp.aula23.classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.AbstractListModel;

public class JFRAME extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFRAME frame = new JFRAME();
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
	public JFRAME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PALAVRA CHAVE");
		lblNewLabel.setBounds(10, 9, 146, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 11, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ORIENTA\u00C7\u00C3O");
		lblNewLabel_1.setBounds(175, 63, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(294, 10, 89, 23);
		contentPane.add(btnNewButton);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"- kk", "- uu"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(72, 113, 304, 106);
		contentPane.add(list);
	}
}
