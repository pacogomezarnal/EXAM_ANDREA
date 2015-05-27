package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

public class Principal extends JFrame {

	private JPanel contentPane;
	public Usuario usu;
	
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 344);
		usu = new Usuario(this);
		
		//JPanel interior
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//CardLayout
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(usu, "VentanaUsuario");
	}

}
