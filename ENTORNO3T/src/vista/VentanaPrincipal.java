package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.SwingConstants;

import java.awt.GridLayout;

import javax.swing.JTextField;
/**
 * Clase compuesta por las propiedades del Frame principal
 * @author Felix
 *
 */
public class VentanaPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static PanelPrincipal mipanel;

	public VentanaPrincipal(){
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension display = mipantalla.getScreenSize();
		int anchodisplay = display.width;
		int altodisplay = display.height;
		int anchoventana=1024;
		int altoventana=768;
		int posicionancho= (anchodisplay-anchoventana)/2;
		int posicionalto=(altodisplay-altoventana)/2;
		setBounds(posicionancho, posicionalto, anchoventana, altoventana);
		setMinimumSize(new Dimension(1024,768));
		//Icono de la ventana
        Image icon = new ImageIcon(getClass().getResource("/Imagenesprograma/Buscar.png")).getImage();
        setIconImage(icon);
		//Titulo de la ventana principal
		setTitle("MOTOR 2020");
		//Maximizar ventana
		setExtendedState(6);
		getContentPane().setLayout(new BorderLayout());
		mipanel = new PanelPrincipal();
		JPanel prueba = mipanel.obtenerprincipal();
		getContentPane().add(prueba,BorderLayout.CENTER);
		revalidate();
		repaint();
		

	}
		
}



