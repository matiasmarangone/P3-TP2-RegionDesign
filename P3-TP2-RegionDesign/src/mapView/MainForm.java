package mapView;
import grafos.Grafo;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;


import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForm extends JFrame
{

	private JFrame frame;
	private JPanel panelMapa;
	private JTextField textField;
	private JPanel panelControles;
	private JMapViewer _mapa;
	private ArrayList<Coordinate> _lasCoordenadas;
	private JButton btnEliminar;
	private MapPolygonImpl _poligono;
	private JButton btnDibujarPolgono ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					MainForm window = new MainForm();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationByPlatform(true);
		setTitle("TP 2 - Matias Marangone");
        setResizable(false);
		
		//frame = new JFrame();
		//frame.setBounds(100, 100, 1200, 800);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		
		panelMapa = new JPanel(new FlowLayout(SwingConstants.LEADING, 20, 20));
        //panelMapa = new JPanel(new BoxLayout(panelMapa, BoxLayout.Y_AXIS));
        add(panelMapa);
		
        JLabel label1 = new JLabel("Buenos Aires - Capital Federal: ");
        
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        buttonPane.add(Box.createHorizontalGlue());
        buttonPane.add(label1);
        buttonPane.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPane.add(label1);
        
        //Container contentPane = getContentPane();
        //contentPane.add(listPane, BorderLayout.CENTER);
        //contentPane.add(buttonPane, BorderLayout.PAGE_END);
        
		//panelMapa.setBounds(100, 100, 1200, 800);
		//frame.getContentPane().add(panelMapa);
		
		//panelControles = new JPanel();
		//panelControles.setBounds(457, 11, 1200, 800);
		//frame.getContentPane().add(panelControles);		
		//panelControles.setLayout(null);
		//add(panelControles);
		
		
		 panelMapa.add(label1);
		 textField = new JTextField(8);
		 panelMapa.add(textField);
		 
		 JLabel label2 = new JLabel("Buenos Aires - Rio Negro: ");
		 panelMapa.add(label2);
		 JTextField textField2 = new JTextField(8);
		 panelMapa.add(textField2);
		 
		 JLabel label3 = new JLabel("Buenos Aires - La Pampa: ");
		 panelMapa.add(label3);
		 JTextField textField3 = new JTextField(8);
		 panelMapa.add(textField3);
		
		_mapa = new JMapViewer();
		_mapa.setDisplayPosition(new Coordinate(-35.25421708829717, -65.43006617821713), 4);
				
		panelMapa.add(_mapa);
		
		Coordinate capital_federal = new Coordinate(-34.6083, -58.3712);
		Coordinate buenos_aires = new Coordinate(-36.157222, -60.569722);
		
		List<Coordinate> route = new ArrayList<Coordinate>(Arrays.asList(capital_federal, buenos_aires, buenos_aires));
		_mapa.addMapPolygon(new MapPolygonImpl(route));
		
		
		pack();
		setVisible(true);
		
		//detectarCoordenadas();
		//dibujarPoligono();
		//eliminarPoligono();		
	}
	
	private void detectarCoordenadas() 
	{
		_lasCoordenadas = new ArrayList<Coordinate>();
				
		_mapa.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			if (e.getButton() == MouseEvent.BUTTON1)
			{
				Coordinate markeradd = (Coordinate)
				_mapa.getPosition(e.getPoint());
				_lasCoordenadas.add(markeradd);
				String nombre = JOptionPane.showInputDialog("Nombre: ");
				_mapa.addMapMarker(new MapMarkerDot(nombre, markeradd));
			}}
		});
	}

	private void dibujarPoligono() 
	{
		btnDibujarPolgono = new JButton("Dibujar Pol\u00EDgono");
		btnDibujarPolgono.setBounds(10, 11, 195, 23);
		btnDibujarPolgono.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				_poligono = new MapPolygonImpl(_lasCoordenadas);
				_mapa.addMapPolygon(_poligono);
			}
		});
	}

	private void eliminarPoligono() 
	{
		btnEliminar = new JButton("Eliminar Polgono");
		btnEliminar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				 _mapa.removeMapPolygon(_poligono);
			}
		});
		btnEliminar.setBounds(10, 64, 195, 23);
		panelControles.add(btnEliminar);
		panelControles.add(btnDibujarPolgono);
	}	
}
