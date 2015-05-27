package Vistas;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Usuario extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtEdad;
	private JTextField txtNacionalidad;
	private JTextField txtId;
	private JPanel contentPane;

	public Usuario(Principal vPrincipal) {
		setLayout(null);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBounds(10, 11, 133, 164);
		lblImagen.setIcon(new ImageIcon(Usuario.class.getResource("/Imagenes/usuario1.png")));
		add(lblImagen);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(183, 19, 46, 14);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(183, 44, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(183, 74, 46, 14);
		add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setEditable(false);
		txtApellidos.setText("Apellidos");
		txtApellidos.setBounds(183, 99, 86, 20);
		add(txtApellidos);
		txtApellidos.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(183, 130, 46, 14);
		add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setEditable(false);
		txtEdad.setText("Edad");
		txtEdad.setBounds(183, 155, 86, 20);
		add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(183, 186, 86, 14);
		add(lblNacionalidad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setText("Nacionalidad");
		txtNacionalidad.setBounds(183, 211, 86, 20);
		add(txtNacionalidad);
		txtNacionalidad.setColumns(10);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(316, 19, 46, 14);
		add(lblId);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("Id");
		txtId.setBounds(316, 44, 86, 20);
		add(txtId);
		txtId.setColumns(10);
		
		JButton btnSiguiente = new JButton("Siguiente>>");
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CardLayout cardLayout = (CardLayout) (frame.getContentPane().getLayout());
				CardLayout.show(frame.getContentPane(), "usuario");
			}
		});
		btnSiguiente.setBounds(324, 266, 116, 23);
		add(btnSiguiente);
		
	}
}

