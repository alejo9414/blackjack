package co.edu.unbosque.view;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel_ingreso extends JPanel{
	
	
	private Panel_imagen panel_imagen;
	private JButton boton_repartir;
	private JButton imagen_carta_pc;
	private JButton imagen_carta_pc2;
	private JButton imagen_carta_humano;
	private JButton imagen_carta_humano2;
	
	public Panel_ingreso() {
		
		
		
		
		panel_imagen = new Panel_imagen();
		panel_imagen.setBounds(0, 0, 700, 700);
		add(panel_imagen);
		
		boton_repartir = new JButton("Repartir cartas");
		boton_repartir.setBounds(500, 550, 150, 30);
		add(boton_repartir);
		
		imagen_carta_pc  = new JButton();
		imagen_carta_pc.setBounds(250, 100, 100, 100);
		add(imagen_carta_pc);
		
		imagen_carta_pc2 = new JButton();
		imagen_carta_pc2.setBounds(350, 100, 100, 100);
		add(imagen_carta_pc2);
		
		imagen_carta_humano = new JButton();
		imagen_carta_humano.setBounds(250, 400, 100, 100);
		add(imagen_carta_humano);
		
		imagen_carta_humano2 = new JButton();
		imagen_carta_humano2.setBounds(350, 400, 100, 100);
		add(imagen_carta_humano2);
		
		
		setLayout(null);
		setVisible(true);
	}

	public JButton getImagen_carta() {
		return imagen_carta_pc;
	}

	public JButton getImagen_carta_pc() {
		return imagen_carta_pc;
	}

	public void setImagen_carta_pc(JButton imagen_carta_pc) {
		this.imagen_carta_pc = imagen_carta_pc;
	}

	public JButton getImagen_carta_pc2() {
		return imagen_carta_pc2;
	}

	public void setImagen_carta_pc2(JButton imagen_carta_pc2) {
		this.imagen_carta_pc2 = imagen_carta_pc2;
	}

	public JButton getImagen_carta_humano() {
		return imagen_carta_humano;
	}

	public void setImagen_carta_humano(JButton imagen_carta_humano) {
		this.imagen_carta_humano = imagen_carta_humano;
	}

	public JButton getImagen_carta_humano2() {
		return imagen_carta_humano2;
	}

	public void setImagen_carta_humano2(JButton imagen_carta_humano2) {
		this.imagen_carta_humano2 = imagen_carta_humano2;
	}

	public void setImagen_carta(JButton imagen_carta) {
		this.imagen_carta_pc = imagen_carta;
	}

	public Panel_imagen getPanel_imagen() {
		return panel_imagen;
	}

	public void setPanel_imagen(Panel_imagen panel_imagen) {
		this.panel_imagen = panel_imagen;
	}

	public JButton getBoton_repartir() {
		return boton_repartir;
	}

	public void setBoton_repartir(JButton boton_repartir) {
		this.boton_repartir = boton_repartir;
	}
	
	
	
	

}
