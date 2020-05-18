package vista;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;




import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase desde donde se crea el PanelPrincipal y metodos realacionados
 * @author Felix
 *
 */
public class PanelPrincipal  {

	private static JPanel principal;
	private JMenuBar menuprincipal;
	private BarradeHerramientas barraiconos;
	private static JPanel formulario;
	private static JScrollPane scrollpanel;
	private JPanel pie;
	public static  JPanel panelcambiante;
	public static int panelexistente =0;
	
	/**
	 * Metodo constructor para crear el panel principal.
	 * @author Felix
	 */
	public PanelPrincipal() {
		principal= new JPanel();
		GridBagLayout gbl_principal = new GridBagLayout();
		gbl_principal.rowHeights = new int[]{-16, 0, 0, 0};
		principal.setLayout(gbl_principal);
		//Voy a construir un Grid de 2x4(cxf)
		GridBagConstraints restricciones1 = new GridBagConstraints();
		GridBagConstraints restricciones2 = new GridBagConstraints();
		GridBagConstraints restricciones3 = new GridBagConstraints();
		GridBagConstraints restricciones4 = new GridBagConstraints();
		GridBagConstraints restricciones5 = new GridBagConstraints();
		
		
		//Para JBarMenu
		//Localizacion de columna
		restricciones1.gridx=0;
		//Localizacion de fila 
		restricciones1.gridy=0;
		//Columnas que quiero ocupar
		restricciones1.gridwidth=2;
		//Filas que quiero ocupar
		restricciones1.gridheight=1;
		//cantidad de redimensionado en ancho
		restricciones1.weightx=1.0;
		//cantidad de redimensionado en alto 
		restricciones1.weighty=0.0;
		//Para donde quiero que crezca
		restricciones1.fill=GridBagConstraints.HORIZONTAL;
		construirbarra();
		principal.add(menuprincipal,restricciones1);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuprincipal.add(mnArchivo);
		
		JMenu mnExportar = new JMenu("Exportar");
		mnArchivo.add(mnExportar);
		

		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnArchivo.add(mntmSalir);
		
		JMenu mnFunciones = new JMenu("Funciones");
		menuprincipal.add(mnFunciones);
		
		JMenuItem mntmInsertar = new JMenuItem("Insertar");
		mntmInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarpanel(1);
			}
		});
		mnFunciones.add(mntmInsertar);
		
		JMenuItem mntmBuscar = new JMenuItem("Buscar");
		mntmBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarpanel(0);
			}
		});
		mnFunciones.add(mntmBuscar);
		
		JMenuItem mntmModificareliminar = new JMenuItem("Modificar/Eliminar");
		mntmModificareliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarpanel(2);
			}
		});
		mnFunciones.add(mntmModificareliminar);
		
		JMenuItem mntmEliminar = new JMenuItem("Eliminar");
		mntmEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cambiarpanel(3);
			}
		});
		mnFunciones.add(mntmEliminar);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuprincipal.add(mnAyuda);
		
		
		//Para JBarMenu para iconos
		//Localizacion de columna
		restricciones2.gridx=0;
		//Localizacion de fila
		restricciones2.gridy=1;
		//Columnas que quiero ocupar
		restricciones2.gridwidth=2;
		//Filas que quiero ocupar
		restricciones2.gridheight=1;
		//cantidad de redimensionado en ancho
		restricciones2.weightx=1.0;
		//cantidad de redimensionado en alto 
		restricciones2.weighty=0.0;
		//Para donde quiero que crezca
		restricciones2.fill=GridBagConstraints.HORIZONTAL;
		barraiconos=new BarradeHerramientas();
		principal.add(barraiconos,restricciones2);
		
		
		
		//Para JPanel para formulario
		//Localizacion de columna
		restricciones3.gridx=0;
		//Localizacion de fila
		restricciones3.gridy=2;
		//Columnas que quiero ocupar
		restricciones3.gridwidth=2;
		//Filas que quiero ocupar
		restricciones3.gridheight=1;
		//cantidad de redimensionado en ancho
		restricciones3.weightx=1.0;
		//cantidad de redimensionado en alto 
		restricciones3.weighty=1.0;
		//Para donde quiero que crezca
		restricciones3.fill=GridBagConstraints.BOTH;
		construirFormulario();
		principal.add(formulario,restricciones3);
			


		

	

		
		
		//Para Pie de programa
		//Localizacion de columna
		restricciones5.gridx=0;
		//Localizacion de fila
		restricciones5.gridy=3;
		//Columnas que quiero ocupar
		restricciones5.gridwidth=2;
		//cantidad de redimensionado en ancho
		restricciones5.weightx=1.0;
		//cantidad de redimensionado en alto 
		restricciones5.weighty=0.0;
		//Para donde quiero que crezca
		restricciones5.fill=GridBagConstraints.HORIZONTAL;
		construirPie();
		principal.add(pie,restricciones5);	
		
	}
	/**
	 * Metodo que construye la barra de herramientas
	 *@author Felix
	 */
	public void construirbarra(){
		menuprincipal= new JMenuBar();
	}
	/**
	 * Metodo que construye el formulario de inicio.
	 * @author Felix
	 */
	public void construirFormulario(){
		formulario = new JPanel();
		formulario.setLayout(new CardLayout());
		formulario.add(new Formulariobusqueda());
	}

	
	public void construirPie(){
		pie = new JPanel();
		JLabel creador = new JLabel();
		creador.setFont(new Font("Tahoma", Font.ITALIC, 16));
		creador.setText("Programa creado por \r\nFelix Garcia S\u00E1nchez");
		pie.add(creador);
	}
	/**
	 * Metodo que cambia de formulario.
	 * @author Felix
	 * @param identificacionpanel
	 */
	public static void cambiarpanel(int identificacionpanel){
		panelexistente=identificacionpanel;
		formulario.removeAll();
		if(identificacionpanel==0){
			formulario.add(new Formulariobusqueda());
		}
		formulario.repaint();
		formulario.revalidate();
	}
	/**
	 * @author Felix
	 * @return
	 */
	public JPanel obtenerprincipal(){
		return principal;
	}
	

}
