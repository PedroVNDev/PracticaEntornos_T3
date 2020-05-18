package vista;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Clase para la Barra de Herramientas
 *@author Felix
 */
public class BarradeHerramientas extends JToolBar{
	/**
	 * Método constructor por el crea la JToolBar
	 * @author Felix
	 */
	public BarradeHerramientas(){
		setBackground(Color.GRAY);
		//Boton Busqueda
		Image imagenbuscar = new ImageIcon(getClass().getResource("/Imagenesprograma/Buscar.png")).getImage();
		ImageIcon imageniconobuscar=new ImageIcon(imagenbuscar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton boton_buscar = new JButton();
		boton_buscar.setBackground(Color.GRAY);
		boton_buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelPrincipal.cambiarpanel(0);
			}
		});
		boton_buscar.setIcon(imageniconobuscar);
		this.add(boton_buscar);
		//Boton nuevo
		Image imagen_nuevo = new ImageIcon(getClass().getResource("/Imagenesprograma/Botonañadir.png")).getImage();
		ImageIcon imagenicono_nuevo=new ImageIcon(imagen_nuevo.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton boton_nuevo = new JButton();
		boton_nuevo.setBackground(Color.GRAY);
		
		boton_nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelPrincipal.cambiarpanel(1);
			}
		});
		boton_nuevo.setIcon(imagenicono_nuevo);
		this.add(boton_nuevo);
		//Boton Editar
		Image imagen_editar = new ImageIcon(getClass().getResource("/Imagenesprograma/Botoneditar.png")).getImage();
		ImageIcon imagenicono_editar=new ImageIcon(imagen_editar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton etiqueta_editar = new JButton();
		etiqueta_editar.setBackground(Color.gray);
		etiqueta_editar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelPrincipal.cambiarpanel(2);
			}
		});
		etiqueta_editar.setIcon(imagenicono_editar);
		this.add(etiqueta_editar);
		
		//Boton-icono Eliminar
		Image imagen_eliminar = new ImageIcon(getClass().getResource("/Imagenesprograma/Botoneliminar.png")).getImage();
		ImageIcon imagenicono_eliminar=new ImageIcon(imagen_eliminar.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton etiqueta_eliminar = new JButton();
		etiqueta_eliminar.setBackground(Color.gray);
		etiqueta_eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PanelPrincipal.cambiarpanel(3);
			}
		});
		etiqueta_eliminar.setIcon(imagenicono_eliminar);
		this.add(etiqueta_eliminar);
		
		//Boton Excel
		
		Image imagen_excel = new ImageIcon(getClass().getResource("/Imagenesprograma/excel.png")).getImage();
		ImageIcon imagenicono_excel=new ImageIcon(imagen_excel.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton etiqueta_excel = new JButton();
		etiqueta_excel.setIcon(imagenicono_excel);
		etiqueta_excel.setBackground(Color.GRAY);
		this.add(etiqueta_excel);
		//Boton xml
		Image imagen_xml = new ImageIcon(getClass().getResource("/Imagenesprograma/Botonxml.png")).getImage();
		ImageIcon imagenicono_xml=new ImageIcon(imagen_xml.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton etiqueta_xml = new JButton();
		etiqueta_xml.setIcon(imagenicono_xml);
		etiqueta_xml.setBackground(Color.gray);
		this.add(etiqueta_xml);
		//Boton sql
		Image imagen_sql = new ImageIcon(getClass().getResource("/Imagenesprograma/Botonsql.png")).getImage();
		ImageIcon imagenicono_sql=new ImageIcon(imagen_sql.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
		JButton etiqueta_sql = new JButton();

		etiqueta_sql.setIcon(imagenicono_sql);
		etiqueta_sql.setBackground(Color.gray);
		this.add(etiqueta_sql);
	}
}
