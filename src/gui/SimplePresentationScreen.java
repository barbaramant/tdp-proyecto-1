package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel labelNombre;
	private JLabel labelMail;
	private JLabel labelURL;
	private JTextField textLU;
	private JTextField textApellido;
	private JTextField textNombre;
	private JTextField textMail;
	private JTextField textURL;
	private JLabel labelFoto;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(629, 246));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 167);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		JLabel labelLU = new JLabel("LU");
		labelLU.setFont(new Font("Arial", Font.BOLD, 11));
		
		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setFont(new Font("Arial", Font.BOLD, 11));
		
		labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Arial", Font.BOLD, 11));
		
		labelMail = new JLabel("E-mail");
		labelMail.setFont(new Font("Arial", Font.BOLD, 11));
		
		labelURL = new JLabel("GitHub URL");
		labelURL.setFont(new Font("Arial", Font.BOLD, 11));
		
		textLU = new JTextField("111288");
		textLU.setColumns(10);
		
		textApellido = new JTextField("Mantovani");
		textApellido.setColumns(10);
		
		textNombre = new JTextField("Bárbara");
		textNombre.setColumns(10);
		
		textMail = new JTextField("barbimantovani@gmail.com");
		textMail.setColumns(10);
		
		textURL = new JTextField("https://github.com/barbaramant");
		textURL.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelLU, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textLU, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelApellido, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelMail, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(31)
							.addComponent(textMail, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(labelURL, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textURL, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE))))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(3)
							.addComponent(labelLU, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textLU, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(3)
							.addComponent(labelApellido, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(3)
							.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(3)
							.addComponent(labelMail, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(3)
							.addComponent(labelURL, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(textURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		labelFoto = new JLabel("New label");
		labelFoto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/bm.jpg")));
		labelFoto.setBounds(445, 11, 164, 161);
		contentPane.add(labelFoto);
		
		DateTimeFormatter formatear = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		String hora = formatear.format(LocalDateTime.now());
		String dia = String.valueOf(LocalDate.now().getDayOfMonth());
		String mes = String.valueOf(LocalDate.now().getMonthValue());
		String anio = Integer.toString(LocalDate.now().getYear());
		
		JLabel lblNewLabel = new JLabel("Esta ventana fue generada el "+dia+"/"+mes+"/"+anio+" a las: "+hora);
		lblNewLabel.setBounds(15, 183, 420, 14);
		contentPane.add(lblNewLabel);
		
		
		
	}
}
