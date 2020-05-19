package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * Declaración de la clase FormularioBorrar
 * desde la que vamos a borrar el libro seleccionado
 * @author Jaime
 *
 */
public class FormularioBorrar extends JPanel {
	private static final long serialVersionUID = 1L;
	private static JTextField c_titulo;
	private static JTextField c_autor;
	private static JTextField c_anyo;
	private static JComboBox<String> c_editorial;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	/**
	 * Create the panel.
	 */
	public FormularioBorrar() {

		setAlignmentY(0.0f);
		setAlignmentX(0.0f);
		setLayout(new GridBagLayout());
		setBackground(Color.GRAY);


		//Boton Borrar
		JButton botonBorrar = new JButton("Borrar");
		GridBagConstraints gbc_boton_insertar = new GridBagConstraints();
		gbc_boton_insertar.insets = new Insets(20, 0, 0, 0);
		gbc_boton_insertar.fill = GridBagConstraints.CENTER;
		gbc_boton_insertar.gridx = 2;
		gbc_boton_insertar.gridy = 0;
		gbc_boton_insertar.gridwidth=1;
		gbc_boton_insertar.gridheight=4;
		gbc_boton_insertar.weightx=1.0;
		gbc_boton_insertar.weighty=0.0;
		add(botonBorrar, gbc_boton_insertar);

		botonBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int modificar = JOptionPane.showConfirmDialog(null, "¿Quieres borrar el libro seleccionado?");

				if (modificar == JOptionPane.YES_OPTION) {

					try {

						String titulo = (textField1.getText());
						String autor = textField2.getText();
						int aniopublicacion = Integer.parseInt(textField3.getText());
						String editorial = (textField4.getText());
						int idlibro = Integer.parseInt(textField5.getText());

						String agregar = "delete from t_libros where idlibro='" + idlibro + "'";
						Connection conexion = DriverManager.getConnection("\"jdbc:mysql://45.87.80.103/u754444868_biblioteca_ir","u754444868_alumnosjxxiii","Fe&Ja");
						Statement consulta = conexion.createStatement();

						consulta.executeUpdate(agregar);

						JOptionPane.showMessageDialog(null, "libro borrado Correctamente");

					} catch (Exception ex1) {
						JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos");
						ex1.printStackTrace();
					}

				} else {
					JOptionPane.showMessageDialog(null, "No se borrará el libro Seleccionado");
				}
			}
		});

		//Etiqueta TITULO
		//Restriccion
		GridBagConstraints restriccion_Lbl_Titulo=new GridBagConstraints();
		restriccion_Lbl_Titulo.insets = new Insets(20, 0, 0, 0);
		//Localizacion de columna
		restriccion_Lbl_Titulo.gridx=0;
		//Localizacion de fila 
		restriccion_Lbl_Titulo.gridy=0;
		//Columnas que quiero ocupar
		restriccion_Lbl_Titulo.gridwidth=1;
		//Filas que quiero ocupar
		restriccion_Lbl_Titulo.gridheight=1;
		//cantidad de redimensionado en ancho
		restriccion_Lbl_Titulo.weightx=1.0;
		//cantidad de redimensionado en alto 
		restriccion_Lbl_Titulo.weighty=0.0;
		//Para donde quiero que crezca
		restriccion_Lbl_Titulo.fill=GridBagConstraints.NONE;
		JLabel lblModelo = new JLabel("Título");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		add(lblModelo,restriccion_Lbl_Titulo);

		//JComboFielmarca
		//Restriccion
		GridBagConstraints restriccion_Jtf_Titulo=new GridBagConstraints();
		restriccion_Jtf_Titulo.insets = new Insets(20, 0, 0, 0);
		//Localizacion de columna
		restriccion_Jtf_Titulo.gridx=1;
		//Localizacion de fila 
		restriccion_Jtf_Titulo.gridy=0;
		//Columnas que quiero ocupar
		restriccion_Jtf_Titulo.gridwidth=1;
		//Filas que quiero ocupar
		restriccion_Jtf_Titulo.gridheight=1;
		//cantidad de redimensionado en ancho
		restriccion_Jtf_Titulo.weightx=1.0;
		//cantidad de redimensionado en alto 
		restriccion_Jtf_Titulo.weighty=0.0;
		//Para donde quiero que crezca
		restriccion_Jtf_Titulo.fill=GridBagConstraints.HORIZONTAL;
		c_titulo = new JTextField();
		c_titulo.setMinimumSize(new Dimension(140, 40));
		c_titulo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		add(c_titulo,restriccion_Jtf_Titulo);

		//Etiqueta Autor
		JLabel lbl_autor = new JLabel("Autor");
		lbl_autor.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints restriccion_lbl_autor = new GridBagConstraints();
		restriccion_lbl_autor.insets = new Insets(20, 0, 0, 0);
		restriccion_lbl_autor.gridx = 0;
		restriccion_lbl_autor.gridy = 1;
		restriccion_lbl_autor.gridwidth=1;
		restriccion_lbl_autor.gridheight=1;
		restriccion_lbl_autor.weightx=1.0;
		restriccion_lbl_autor.weighty=0.0;
		restriccion_lbl_autor.fill=GridBagConstraints.NONE;
		add(lbl_autor, restriccion_lbl_autor);

		//Campo Autor		
		c_autor = new JTextField();
		GridBagConstraints restricciones_c_autor = new GridBagConstraints();
		restricciones_c_autor.insets = new Insets(20, 0, 0, 0);
		restricciones_c_autor.gridx = 1;
		restricciones_c_autor.gridy = 1;
		restricciones_c_autor.gridwidth=1;
		restricciones_c_autor.gridheight=1;
		restricciones_c_autor.weightx=1.0;
		restricciones_c_autor.weighty=0.0;
		restricciones_c_autor.fill=GridBagConstraints.HORIZONTAL;
		add(c_autor, restricciones_c_autor);

		//Año de publicacion

		JLabel lbl_anyo = new JLabel("Año de publicacion");
		lbl_anyo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		//Restriccion
		GridBagConstraints restricciones_lbl_anyo=new GridBagConstraints();
		restricciones_lbl_anyo.insets = new Insets(20, 0, 0, 0);
		//Localizacion de columna
		restricciones_lbl_anyo.gridx=0;
		//Localizacion de fila 
		restricciones_lbl_anyo.gridy=2;
		//Columnas que quiero ocupar
		restricciones_lbl_anyo.gridwidth=1;
		//Filas que quiero ocupar
		restricciones_lbl_anyo.gridheight=1;
		//cantidad de redimensionado en ancho
		restricciones_lbl_anyo.weightx=1.0;
		//cantidad de redimensionado en alto 
		restricciones_lbl_anyo.weighty=0.0;
		//Para donde quiero que crezca
		restricciones_lbl_anyo.fill=GridBagConstraints.NONE;
		add(lbl_anyo,restricciones_lbl_anyo);

		//JSlider ANO
		c_anyo = new JTextField();
		GridBagConstraints gbc_c_anyo = new GridBagConstraints();
		gbc_c_anyo.insets = new Insets(20, 0, 0, 0);
		gbc_c_anyo.gridx = 1;
		gbc_c_anyo.gridy = 2;
		gbc_c_anyo.gridwidth=1;
		gbc_c_anyo.gridheight=1;
		gbc_c_anyo.weightx=1.0;
		gbc_c_anyo.weighty=0.0;
		gbc_c_anyo.fill=GridBagConstraints.HORIZONTAL;
		add(c_anyo, gbc_c_anyo);


		//JLabel Editoria
		JLabel Etiqueta_editorial = new JLabel("Editorial.");
		Etiqueta_editorial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints restricciones_lbl_editorial = new GridBagConstraints();
		restricciones_lbl_editorial.insets = new Insets(20, 0, 0, 0);
		restricciones_lbl_editorial.gridx = 0;
		restricciones_lbl_editorial.gridy = 3;
		restricciones_lbl_editorial.gridwidth=1;
		restricciones_lbl_editorial.gridheight=1;
		restricciones_lbl_editorial.weightx=1.0;
		restricciones_lbl_editorial.weighty=0.0;
		restricciones_lbl_editorial.fill=GridBagConstraints.NONE;
		add(Etiqueta_editorial,restricciones_lbl_editorial);

		//JCOMBOBOX Editorial
		c_editorial = new JComboBox();
		c_editorial.setFont(new Font("Tahoma", Font.ITALIC, 18));
		c_editorial.setMinimumSize(new Dimension(140, 40));
		GridBagConstraints restricciones_c_editorial = new GridBagConstraints();
		restricciones_c_editorial.insets = new Insets(20, 0, 0, 0);
		restricciones_c_editorial.gridx = 1;
		restricciones_c_editorial.gridy = 3;
		restricciones_c_editorial.gridwidth=1;
		restricciones_c_editorial.gridheight=1;
		restricciones_c_editorial.weightx=1.0;
		restricciones_c_editorial.weighty=0.0;
		restricciones_c_editorial.fill=GridBagConstraints.HORIZONTAL;
		add(c_editorial, restricciones_c_editorial);
		construirComboboxEditorial();

		//ETIQUETA VACIA
		JPanel vacia = new JPanel();
		vacia.setBackground(Color.red);
		vacia.setFont(new Font("Tahoma", Font.ITALIC, 20));
		GridBagConstraints restricciones_vacia = new GridBagConstraints();
		restricciones_vacia.insets = new Insets(20, 0, 0, 0);
		restricciones_vacia.gridx = 0;
		restricciones_vacia.gridy = 4;
		restricciones_vacia.gridwidth=3;
		restricciones_vacia.gridheight=1;
		restricciones_vacia.weightx=1.0;
		restricciones_vacia.weighty=1.0;
		restricciones_vacia.fill=GridBagConstraints.BOTH;
		add(vacia, restricciones_vacia);
	}

	/**
	 * Declaración del método construirComboboxEditorial
	 */
	public void construirComboboxEditorial(){
		try{
			String consultaSQL="SELECT EDITORIAL FROM T_LIBROS GROUP BY EDITORIAL";
			Connection conexion = DriverManager.getConnection("jdbc:mysql://45.87.80.103/u754444868_biblioteca_ir","u754444868_alumnosjxxiii","Fe&Ja");
			PreparedStatement sentencia2=conexion.prepareStatement(consultaSQL);
			ResultSet fila2=sentencia2.executeQuery(consultaSQL);
			c_editorial.addItem("- Todas -");
			while(fila2.next()){
				c_editorial.addItem(fila2.getString("EDITORIAL"));
			}
			conexion.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}