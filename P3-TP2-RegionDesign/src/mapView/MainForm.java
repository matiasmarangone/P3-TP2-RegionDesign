package mapView;

import java.awt.EventQueue;

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

public class MainForm 
{

	private JFrame frame;
	private JPanel panelMapa;
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
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panelMapa = new JPanel();
		panelMapa.setBounds(100, 100, 1200, 800);
		frame.getContentPane().add(panelMapa);
		
		panelControles = new JPanel();
		panelControles.setBounds(457, 11, 1200, 800);
		frame.getContentPane().add(panelControles);		
		panelControles.setLayout(null);
		
		_mapa = new JMapViewer();
		_mapa.setDisplayPosition(new Coordinate(-35.25421708829717, -65.43006617821713), 4);
				
		panelMapa.add(_mapa);
		
		Coordinate capital_federal = new Coordinate(-34.6083, -58.3712);
		Coordinate buenos_aires = new Coordinate(-36.157222, -60.569722);
		
		List<Coordinate> route = new ArrayList<Coordinate>(Arrays.asList(capital_federal, buenos_aires, buenos_aires));
		_mapa.addMapPolygon(new MapPolygonImpl(route));
		
		detectarCoordenadas();
		dibujarPoligono();
		eliminarPoligono();		
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
