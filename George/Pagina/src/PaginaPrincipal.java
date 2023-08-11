/*
 panel Buscador --> Barra horizontal gris arriba
 panel Fondo --> fondo negro debajo de la barra
 
 Botones --> se llaman igual que el texto que contienen
 Labels --> se llaman igual que la imagen que contienen, o aunque no se llamen exactamente igual hacen referencia al icono 
 
 
 
 */

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PaginaPrincipal {

	private JFrame frame;
	
	
	public PaginaPrincipal() {
		
		

		frame = new JFrame();
		frame.setTitle("Home Page");
		frame.setBounds(600, 250, 529, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Panel_Buscador = new JPanel();
		Panel_Buscador.setBackground(new Color(112, 128, 144));
		Panel_Buscador.setBounds(0, 0, 513, 49);
		frame.getContentPane().add(Panel_Buscador);
		Panel_Buscador.setLayout(null);
		
		JButton Boton_Nosotros = new JButton("Nosotros\r\n");
		Boton_Nosotros.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Nosotros.setBounds(424, 11, 79, 23);
		Panel_Buscador.add(Boton_Nosotros);
		
		JButton Boton_Ubicacion = new JButton("Ubicación");
		Boton_Ubicacion.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Ubicacion.setBounds(325, 11, 89, 23);
		Panel_Buscador.add(Boton_Ubicacion);
		
		JButton Boton_Modelos = new JButton("Modelos");
		Boton_Modelos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		Boton_Modelos.setBounds(226, 11, 89, 23);
		Panel_Buscador.add(Boton_Modelos);
		
		JLabel Label_MenuBarras = new JLabel("");
		Label_MenuBarras.setBounds(10, 11, 30, 30);
		Label_MenuBarras.setOpaque(true);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Menu1.png"));
		Label_MenuBarras.setIcon(img);
		Panel_Buscador.add(Label_MenuBarras);
		
		JLabel Label_LogoMini = new JLabel("New label");
		Label_LogoMini.setBounds(50, 11, 86, 26);
		Label_LogoMini.setOpaque(true);
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/LogoChico.png"));
		Label_LogoMini.setIcon(img3);
		Panel_Buscador.add(Label_LogoMini);
		
		JPanel Panel_Fondo = new JPanel();
		Panel_Fondo.setBackground(new Color(0, 0, 0));
		Panel_Fondo.setBounds(0, 49, 513, 293);
		frame.getContentPane().add(Panel_Fondo);
		Panel_Fondo.setLayout(null);
		

		
		JLabel lblNewLabel = new JLabel("Merlo Molina Rolon Salgueiro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(159, 263, 194, 19);
		lblNewLabel.setForeground(new Color(240, 248, 255));
		Panel_Fondo.add(lblNewLabel);
		
		JLabel Label_LogoMax = new JLabel("New label");
		Label_LogoMax.setBounds(136, 106, 240, 72);
		Label_LogoMax.setOpaque(true);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/LogoGrande.png"));
		Label_LogoMax.setIcon(img2);
		Panel_Fondo.add(Label_LogoMax);
		
		
      
        
        frame.setVisible(true);
	
		
	
	

		




		 
	
	
	}
}

   