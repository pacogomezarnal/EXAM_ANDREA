package Vistas;

import javax.swing.JPanel;
import javax.swing.JComboBox;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Modelo.Cadete;
import Modelo.IngresoCadete;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class Equipo extends JPanel {
	private JTextField txtNombre;
	private JTextField txterApellido;
	private JTextField txtoApellido;
	private JTextField txtNacionalidad;
	private JTextField txtId;
	private IngresoCadete ic = new IngresoCadete();
	
	public Equipo() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Equipo");
		comboBox.setBounds(20, 34, 100, 20);
		add(comboBox);
		
		Iterator<Cadete> recorredor=ic.getDatos().iterator();
		while(recorredor.hasNext()){
			comboBox.addItem(recorredor.next().toString());
		}
		
		JLabel lblEquipo = new JLabel("Equipo");
		lblEquipo.setBounds(10, 9, 46, 14);
		add(lblEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(161, 11, 46, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(161, 34, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(161, 65, 86, 14);
		add(lblerApellido);
		
		txterApellido = new JTextField();
		txterApellido.setEditable(false);
		txterApellido.setText("1er Apellido");
		txterApellido.setBounds(161, 90, 86, 20);
		add(txterApellido);
		txterApellido.setColumns(10);
		
		JLabel lbloApellido = new JLabel("2o Apellido");
		lbloApellido.setBounds(161, 121, 86, 14);
		add(lbloApellido);
		
		txtoApellido = new JTextField();
		txtoApellido.setText("2o Apellido");
		txtoApellido.setEditable(false);
		txtoApellido.setColumns(10);
		txtoApellido.setBounds(161, 146, 86, 20);
		add(txtoApellido);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(161, 177, 86, 14);
		add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setText("Nacionalidad");
		txtNacionalidad.setBounds(161, 202, 86, 20);
		add(txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("Id");
		txtId.setBounds(298, 34, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(298, 9, 46, 14);
		add(lblId);
		
		JButton button = new JButton("<<Atr\u00E1s");
		button.setBounds(20, 266, 89, 23);
		add(button);
		
		JButton btnSiguiente = new JButton("Siguiente>>");
		btnSiguiente.setBounds(324, 266, 116, 23);
		add(btnSiguiente);

		
		
	}
}
