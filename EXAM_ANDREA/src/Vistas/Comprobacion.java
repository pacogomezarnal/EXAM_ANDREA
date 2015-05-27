package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Comprobacion extends JPanel {
	private JTextField txtId;
	private JTextField txterApellido;
	private JTextField txtDevuelto;


	public Comprobacion() {
		setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 11, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setBounds(10, 36, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(159, 11, 72, 14);
		add(lblerApellido);
		
		txterApellido = new JTextField();
		txterApellido.setText("1er Apellido");
		txterApellido.setBounds(159, 36, 86, 20);
		add(txterApellido);
		txterApellido.setColumns(10);
		
		txtDevuelto = new JTextField();
		txtDevuelto.setEditable(false);
		txtDevuelto.setText("Mensaje devuelto");
		txtDevuelto.setBounds(10, 144, 393, 20);
		add(txtDevuelto);
		txtDevuelto.setColumns(10);
		
		JButton btnComprobar = new JButton("COMPROBAR");
		btnComprobar.setBounds(10, 110, 393, 23);
		add(btnComprobar);
		
		JButton button = new JButton("<< Atr\u00E1s");
		button.setBounds(10, 266, 89, 23);
		add(button);

	}

}
