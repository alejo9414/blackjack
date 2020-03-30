package co.edu.unbosque.controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import co.edu.unbosque.view.View;

public class Controller implements ActionListener {
	
	private View view;
	ImageIcon imagen;
	Icon icono;
	
	int n = 0;
	
	
	public Controller() {
		view = new View();
		view.getPanel_ingreso().getBoton_repartir().addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Repartir cartas"));
		
		carta_random_pc();
		carta_random_pc2();
		carta_random_humano();
		carta_random_humano2();
	}
	
	public void carta_random_pc() {
		//carta random
		Random r = new Random();
		int valorCarta = r.nextInt(52)+1;
		System.out.println(valorCarta);
		
		if(valorCarta ==1) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);
			n=valorCarta;

		}else if(valorCarta ==2) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==3) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==4) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==5) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==6) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==7) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==8) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==9) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==10) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==11) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==12) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==13) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==14) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==15) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==16) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==17) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==18) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==19) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==20) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==21) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==22) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==23) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==24) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==25) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==26) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==27) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==28) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==29) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==30) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==31) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==32) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==33) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==34) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==35) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==36) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==37) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==38) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==39) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==40) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==41) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==42) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==43) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==44) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==45) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==46) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==47) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==48) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==49) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==50) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==51) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==52) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta().setIcon(icono);			
			n=valorCarta;	
		}	
		
		
	}
	public void carta_random_pc2() {
		
		Random r = new Random();
		int valorCarta = r.nextInt(52)+1;
		System.out.println(valorCarta);
		
		if(valorCarta ==1) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);
			n=valorCarta;

		}else if(valorCarta ==2) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==3) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==4) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==5) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==6) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==7) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==8) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==9) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==10) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==11) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==12) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==13) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==14) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==15) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==16) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==17) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==18) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==19) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==20) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==21) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==22) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==23) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==24) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==25) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==26) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==27) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==28) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==29) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==30) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==31) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==32) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==33) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==34) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==35) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==36) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==37) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==38) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==39) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==40) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==41) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==42) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==43) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==44) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==45) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==46) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==47) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==48) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==49) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==50) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==51) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==52) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_pc2().setIcon(icono);			
			n=valorCarta;	
		}	
		
	}
	public void carta_random_humano() {
		
		Random r = new Random();
		int valorCarta = r.nextInt(52)+1;
		System.out.println(valorCarta);
		
		if(valorCarta ==1) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);
			n=valorCarta;

		}else if(valorCarta ==2) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==3) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==4) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==5) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==6) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==7) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==8) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==9) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==10) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==11) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==12) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==13) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k corazones.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==14) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==15) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==16) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==17) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==18) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==19) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==20) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==21) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==22) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==23) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==24) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==25) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==26) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k picas.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==27) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==28) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==29) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==30) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==31) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==32) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==33) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==34) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==35) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==36) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==37) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==38) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==39) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k diamantes.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==40) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//a trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==41) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//2 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==42) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//3 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==43) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//4 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==44) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//5 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==45) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//6 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==46) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//7 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==47) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//8 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==48) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//9 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==49) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//10 trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==50) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//j trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==51) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//q trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}else if(valorCarta ==52) {
			imagen = new ImageIcon(getClass().getResource("..//imagenes//k trebol.png"));
			icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
			view.getPanel_ingreso().getImagen_carta_humano().setIcon(icono);			
			n=valorCarta;	
		}	
	}	
		public void carta_random_humano2() {
			
			Random r = new Random();
			int valorCarta = r.nextInt(52)+1;
			System.out.println(valorCarta);
			
			if(valorCarta ==1) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//a corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);
				n=valorCarta;

			}else if(valorCarta ==2) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//2 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==3) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//3 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==4) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//4 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==5) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//5 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==6) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//6 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==7) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//7 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==8) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//8 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==9) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//9 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==10) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//10 corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==11) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//j corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==12) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//q corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==13) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//k corazones.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==14) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//a picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==15) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//2 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==16) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//3 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==17) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//4 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==18) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//5 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==19) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//6 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==20) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//7 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==21) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//8 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==22) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//9 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==23) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//10 picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==24) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//j picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==25) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//q picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==26) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//k picas.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==27) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//a diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==28) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//2 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==29) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//3 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==30) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//4 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==31) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//5 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==32) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//6 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==33) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//7 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==34) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//8 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==35) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//9 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==36) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//10 diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==37) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//j diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==38) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//q diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==39) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//k diamantes.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==40) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//a trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==41) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//2 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==42) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//3 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==43) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//4 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==44) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//5 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==45) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//6 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==46) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//7 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==47) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//8 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==48) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//9 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==49) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//10 trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==50) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//j trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==51) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//q trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}else if(valorCarta ==52) {
				imagen = new ImageIcon(getClass().getResource("..//imagenes//k trebol.png"));
				icono = new ImageIcon(imagen.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
				view.getPanel_ingreso().getImagen_carta_humano2().setIcon(icono);			
				n=valorCarta;	
			}
	}
	


}
