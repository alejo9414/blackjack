package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class View extends JFrame {
	
	public Panel_ingreso panel_ingreso;
	public Panel_imagen panel_imagen;
	
	

	public View() {
		
		getContentPane().setLayout(null);
		setTitle("BlackJack");
		setBounds(0, 0, 700, 700);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
		
		
		panel_ingreso = new Panel_ingreso();
		panel_ingreso.setBounds(25, 25, 650,600);
		getContentPane().add(panel_ingreso);
		
		panel_imagen = new Panel_imagen();
		panel_imagen.setBounds(0, 0, 700, 700);
		add(panel_imagen);
		

		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}



	public Panel_ingreso getPanel_ingreso() {
		return panel_ingreso;
	}



	public void setPanel_ingreso(Panel_ingreso panel_ingreso) {
		this.panel_ingreso = panel_ingreso;
	}



	public Panel_imagen getPanel_imagen() {
		return panel_imagen;
	}



	public void setPanel_imagen(Panel_imagen panel_imagen) {
		this.panel_imagen = panel_imagen;
	}
	
	
		
	

}
