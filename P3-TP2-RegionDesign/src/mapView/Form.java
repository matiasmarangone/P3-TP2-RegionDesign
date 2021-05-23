package mapView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;

import arbolgeneradorminimo.AGM;
import arbolgeneradorminimo.ArbolGeneradorMinimo;

public class Form {

	private JMapViewer _mapa;
	private ArrayList<Coordinate> _lasCoordenadas;
	private MapPolygonImpl _poligono;
	private JButton btnDibujarPolgono ;

	private JFrame frame;
	private JTextField arista11_19;
	private JTextField arista11_16;
	private JTextField arista11_15;
	private JTextField arista12_19;
	private JTextField arista12_18;
	private JTextField arista13_18;
	private JTextField arista13_19;
	private JTextField arista13_15;
	private JTextField arista15_16;
	private JTextField arista17_22;
	private JTextField arista17_24;
	private JTextField arista18_19;
	private JTextField arista20_23;
	private JTextField arista21_22;
	private JTextField arista22_24;
	private JTextField arista4_9;
	private JTextField arista5_20;
	private JTextField arista5_16;
	private JTextField arista6_11;
	private JTextField arista6_19;
	private JTextField arista6_12;
	private JTextField arista6_22;
	private JTextField arista6_21;
	private JTextField arista7_14;
	private JTextField arista7_8;
	private JTextField arista7_21;
	private JTextField arista8_21;
	private JTextField arista9_17;
	private JTextField arista10_17;
	private JTextField arista11_13;
	private JTextField arista1_2;
	private JTextField arista1_16;
	private JTextField arista1_11;
	private JTextField arista1_6;
	private JTextField arista1_21;
	private JTextField arista1_8;
	private JTextField arista3_12;
	private JTextField arista3_6;
	private JTextField arista3_22;
	private JTextField arista3_24;
	private JTextField arista3_17;
	private JTextField arista4_7;
	private JTextField arista4_21;
	private JTextField arista4_22;
	private JTextField arista4_17;
	private JTextField cantidad_regiones;
	JLayeredPane layeredPane = new JLayeredPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1059, 581);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		layeredPane.setBounds(43, 48, 956, 468);
		frame.getContentPane().add(layeredPane);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 956, 468);
		layeredPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1_1_1_1_1_1_1_7_1 = new JLabel("Jujuy - Salta");
		lblNewLabel_1_1_1_1_1_1_1_7_1.setBounds(442, 378, 103, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_7_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_6_1 = new JLabel("Formosa - Salta");
		lblNewLabel_1_1_1_1_1_1_1_6_1.setBounds(432, 353, 113, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_6_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_5_1 = new JLabel("Entre R\u00EDos - Santa Fe");
		lblNewLabel_1_1_1_1_1_1_1_5_1.setBounds(398, 328, 147, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_5_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_4_1 = new JLabel("Corrientes - Santa Fe");
		lblNewLabel_1_1_1_1_1_1_1_4_1.setBounds(398, 306, 147, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_4_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_3_1 = new JLabel("Corrientes - Entre R\u00EDos");
		lblNewLabel_1_1_1_1_1_1_1_3_1.setBounds(398, 281, 147, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_3_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_2_1 = new JLabel("Corrientes - Misiones");
		lblNewLabel_1_1_1_1_1_1_1_2_1.setBounds(408, 256, 137, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_2_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("C\u00F3rdoba - Santa Fe");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(408, 231, 137, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("C\u00F3rdoba - Santiago del Estero");
		lblNewLabel_1_1_1_1_1_1_2.setBounds(363, 206, 182, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("C\u00F3rdoba - La Rioja");
		lblNewLabel_1_1_1_1_1_2.setBounds(415, 181, 130, 14);
		panel.add(lblNewLabel_1_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("C\u00F3rdoba - San Luis");
		lblNewLabel_1_1_1_1_2.setBounds(415, 157, 130, 14);
		panel.add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_2 = new JLabel("C\u00F3rdoba - La Pampa");
		lblNewLabel_1_1_1_2.setBounds(408, 133, 137, 14);
		panel.add(lblNewLabel_1_1_1_2);

		JLabel lblNewLabel_1_1_2 = new JLabel("Chubut - Rio Negro");
		lblNewLabel_1_1_2.setBounds(415, 108, 130, 14);
		panel.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_2 = new JLabel("Chubut - Santa Cruz");
		lblNewLabel_1_2.setBounds(408, 83, 137, 14);
		panel.add(lblNewLabel_1_2);

		JLabel lblChacoFormosa = new JLabel("Chaco - Formosa");
		lblChacoFormosa.setBounds(423, 58, 122, 14);
		panel.add(lblChacoFormosa);

		JLabel lblNewLabel = new JLabel("Buenos Aires - Capital Federal");
		lblNewLabel.setBounds(76, 58, 186, 14);
		panel.add(lblNewLabel);

		JLabel lblBuenosAires = new JLabel("Buenos Aires - Rio Negro");
		lblBuenosAires.setBounds(107, 83, 155, 14);
		panel.add(lblBuenosAires);

		JLabel lblNewLabel_1_1 = new JLabel("Buenos Aires - La Pampa");
		lblNewLabel_1_1.setBounds(107, 106, 155, 14);
		panel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Buenos Aires - C\u00F3rdoba");
		lblNewLabel_1_1_1.setBounds(102, 131, 160, 14);
		panel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Buenos Aires - Santa Fe");
		lblNewLabel_1_1_1_1.setBounds(102, 156, 160, 14);
		panel.add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Buenos Aires - Entre Rios");
		lblNewLabel_1_1_1_1_1.setBounds(99, 180, 163, 14);
		panel.add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Catamarca - La Rioja");
		lblNewLabel_1_1_1_1_1_1.setBounds(120, 204, 142, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Catamarca - C\u00F3rdoba");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(115, 229, 147, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Catamarca - Santiago del Estero");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(66, 254, 196, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1_1_2 = new JLabel("Catamarca - Tucuman");
		lblNewLabel_1_1_1_1_1_1_1_2.setBounds(110, 279, 152, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_3 = new JLabel("Catamarca - Salta");
		lblNewLabel_1_1_1_1_1_1_1_3.setBounds(135, 304, 127, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_3);

		JLabel lblNewLabel_1_1_1_1_1_1_1_4 = new JLabel("Chaco - Corrientes");
		lblNewLabel_1_1_1_1_1_1_1_4.setBounds(132, 329, 130, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_4);

		JLabel lblNewLabel_1_1_1_1_1_1_1_5 = new JLabel("Chaco - Santa Fe");
		lblNewLabel_1_1_1_1_1_1_1_5.setBounds(140, 351, 122, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_5);

		JLabel lblNewLabel_1_1_1_1_1_1_1_6 = new JLabel("Chaco - Santiago del Estero");
		lblNewLabel_1_1_1_1_1_1_1_6.setBounds(93, 376, 169, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_6);

		JLabel lblNewLabel_1_1_1_1_1_1_1_7 = new JLabel("Chaco - Salta");
		lblNewLabel_1_1_1_1_1_1_1_7.setBounds(154, 401, 108, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_7);

		JLabel lblNewLabel_1_1_1_1_1_1_1_7_2 = new JLabel("Santa Fe - Santiago del Estero");
		lblNewLabel_1_1_1_1_1_1_1_7_2.setBounds(637, 376, 185, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_7_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_6_2 = new JLabel("Santa Cruz - Tierra del Fuego");
		lblNewLabel_1_1_1_1_1_1_1_6_2.setBounds(640, 351, 182, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_6_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_5_2 = new JLabel("San Juan - San Luis");
		lblNewLabel_1_1_1_1_1_1_1_5_2.setBounds(687, 328, 132, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_5_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_4_2 = new JLabel("Salta - Tucum\u00E1n");
		lblNewLabel_1_1_1_1_1_1_1_4_2.setBounds(704, 304, 115, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_4_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_3_2 = new JLabel("Salta - Santiago del Estero");
		lblNewLabel_1_1_1_1_1_1_1_3_2.setBounds(654, 279, 165, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_3_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_2_2 = new JLabel("Neuqu\u00E9n - R\u00EDo Negro");
		lblNewLabel_1_1_1_1_1_1_1_2_2.setBounds(680, 254, 139, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_2_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_1_2 = new JLabel("Mendoza - Neuqu\u00E9n");
		lblNewLabel_1_1_1_1_1_1_1_1_2.setBounds(680, 229, 139, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_1_1_1_9 = new JLabel("Mendoza - San Luis");
		lblNewLabel_1_1_1_1_1_1_1_9.setBounds(687, 205, 132, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_9);

		JLabel lblNewLabel_1_1_1_1_1_1_3 = new JLabel("Mendoza - San Juan");
		lblNewLabel_1_1_1_1_1_1_3.setBounds(681, 180, 138, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_3);

		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("La rioja - San Juan");
		lblNewLabel_1_1_1_1_1_3.setBounds(688, 155, 131, 14);
		panel.add(lblNewLabel_1_1_1_1_1_3);

		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("La rioja - San Luis");
		lblNewLabel_1_1_1_1_3.setBounds(696, 131, 123, 14);
		panel.add(lblNewLabel_1_1_1_1_3);

		JLabel lblNewLabel_1_1_1_3 = new JLabel("La Pampa - Neuqu\u00E9n ");
		lblNewLabel_1_1_1_3.setBounds(675, 106, 144, 14);
		panel.add(lblNewLabel_1_1_1_3);

		JLabel lblNewLabel_1_1_3 = new JLabel("La Pampa - Rio Negro");
		lblNewLabel_1_1_3.setBounds(671, 82, 148, 14);
		panel.add(lblNewLabel_1_1_3);

		JLabel lblNewLabel_1_3 = new JLabel("La Pampa - San Luis");
		lblNewLabel_1_3.setBounds(680, 58, 139, 14);
		panel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_1_1_1_1_1_1_7_2_1 = new JLabel("Santiago del Estero - Tucum\u00E1n");
		lblNewLabel_1_1_1_1_1_1_1_7_2_1.setBounds(637, 401, 185, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1_7_2_1);


		JLabel lblNewLabel_1_3_1 = new JLabel("La Pampa - Mendoza");
		lblNewLabel_1_3_1.setBounds(408, 401, 137, 14);
		panel.add(lblNewLabel_1_3_1);

		//Obtención de peso/distancia entre vertices ingresado por el usuario


		arista11_19 = new JTextField();
		arista11_19.setColumns(10);
		arista11_19.setBounds(829, 54, 86, 20);
		panel.add(arista11_19);

		arista11_16 = new JTextField();
		arista11_16.setColumns(10);
		arista11_16.setBounds(829, 79, 86, 20);
		panel.add(arista11_16);

		arista11_15 = new JTextField();
		arista11_15.setColumns(10);
		arista11_15.setBounds(829, 103, 86, 20);
		panel.add(arista11_15);

		arista12_19 = new JTextField();
		arista12_19.setColumns(10);
		arista12_19.setBounds(829, 128, 86, 20);
		panel.add(arista12_19);

		arista12_18 = new JTextField();
		arista12_18.setColumns(10);
		arista12_18.setBounds(829, 153, 86, 20);
		panel.add(arista12_18);

		arista13_18 = new JTextField();
		arista13_18.setColumns(10);
		arista13_18.setBounds(829, 177, 86, 20);
		panel.add(arista13_18);

		arista13_19 = new JTextField();
		arista13_19.setColumns(10);
		arista13_19.setBounds(829, 202, 86, 20);
		panel.add(arista13_19);

		arista13_15 = new JTextField();
		arista13_15.setColumns(10);
		arista13_15.setBounds(829, 227, 86, 20);
		panel.add(arista13_15);

		arista15_16 = new JTextField();
		arista15_16.setColumns(10);
		arista15_16.setBounds(829, 251, 86, 20);
		panel.add(arista15_16);

		arista17_22 = new JTextField();
		arista17_22.setColumns(10);
		arista17_22.setBounds(829, 276, 86, 20);
		panel.add(arista17_22);

		arista17_24 = new JTextField();
		arista17_24.setColumns(10);
		arista17_24.setBounds(829, 301, 86, 20);
		panel.add(arista17_24);

		arista18_19 = new JTextField();
		arista18_19.setColumns(10);
		arista18_19.setBounds(829, 325, 86, 20);
		panel.add(arista18_19);

		arista20_23 = new JTextField();
		arista20_23.setColumns(10);
		arista20_23.setBounds(829, 348, 86, 20);
		panel.add(arista20_23);

		arista21_22 = new JTextField();
		arista21_22.setColumns(10);
		arista21_22.setBounds(829, 373, 86, 20);
		panel.add(arista21_22);

		arista22_24 = new JTextField();
		arista22_24.setColumns(10);
		arista22_24.setBounds(829, 398, 86, 20);
		panel.add(arista22_24);



		arista4_9 = new JTextField();
		arista4_9.setColumns(10);
		arista4_9.setBounds(541, 54, 86, 20);
		panel.add(arista4_9);

		arista5_20 = new JTextField();
		arista5_20.setColumns(10);
		arista5_20.setBounds(541, 79, 86, 20);
		panel.add(arista5_20);

		arista5_16 = new JTextField();
		arista5_16.setColumns(10);
		arista5_16.setBounds(541, 103, 86, 20);
		panel.add(arista5_16);

		arista6_11 = new JTextField();
		arista6_11.setColumns(10);
		arista6_11.setBounds(541, 128, 86, 20);
		panel.add(arista6_11);

		arista6_19 = new JTextField();
		arista6_19.setColumns(10);
		arista6_19.setBounds(541, 153, 86, 20);
		panel.add(arista6_19);

		arista6_12 = new JTextField();
		arista6_12.setColumns(10);
		arista6_12.setBounds(541, 177, 86, 20);
		panel.add(arista6_12);

		arista6_22 = new JTextField();
		arista6_22.setColumns(10);
		arista6_22.setBounds(541, 202, 86, 20);
		panel.add(arista6_22);

		arista6_21 = new JTextField();
		arista6_21.setColumns(10);
		arista6_21.setBounds(541, 227, 86, 20);
		panel.add(arista6_21);

		arista7_14 = new JTextField();
		arista7_14.setColumns(10);
		arista7_14.setBounds(541, 251, 86, 20);
		panel.add(arista7_14);

		arista7_8 = new JTextField();
		arista7_8.setColumns(10);
		arista7_8.setBounds(541, 276, 86, 20);
		panel.add(arista7_8);

		arista7_21 = new JTextField();
		arista7_21.setColumns(10);
		arista7_21.setBounds(541, 301, 86, 20);
		panel.add(arista7_21);

		arista8_21 = new JTextField();
		arista8_21.setColumns(10);
		arista8_21.setBounds(541, 325, 86, 20);
		panel.add(arista8_21);

		arista9_17 = new JTextField();
		arista9_17.setColumns(10);
		arista9_17.setBounds(541, 348, 86, 20);
		panel.add(arista9_17);

		arista10_17 = new JTextField();
		arista10_17.setColumns(10);
		arista10_17.setBounds(541, 373, 86, 20);
		panel.add(arista10_17);

		arista11_13 = new JTextField();
		arista11_13.setColumns(10);
		arista11_13.setBounds(541, 398, 86, 20);
		panel.add(arista11_13);

		arista1_2 = new JTextField();
		arista1_2.setColumns(10);
		arista1_2.setBounds(267, 54, 86, 20);
		panel.add(arista1_2);

		arista1_16 = new JTextField();
		arista1_16.setColumns(10);
		arista1_16.setBounds(267, 79, 86, 20);
		panel.add(arista1_16);

		arista1_11 = new JTextField();
		arista1_11.setColumns(10);
		arista1_11.setBounds(267, 103, 86, 20);
		panel.add(arista1_11);

		arista1_6 = new JTextField();
		arista1_6.setColumns(10);
		arista1_6.setBounds(267, 128, 86, 20);
		panel.add(arista1_6);

		arista1_21 = new JTextField();
		arista1_21.setColumns(10);
		arista1_21.setBounds(267, 153, 86, 20);
		panel.add(arista1_21);

		arista1_8 = new JTextField();
		arista1_8.setColumns(10);
		arista1_8.setBounds(267, 177, 86, 20);
		panel.add(arista1_8);

		arista3_12 = new JTextField();
		arista3_12.setColumns(10);
		arista3_12.setBounds(267, 202, 86, 20);
		panel.add(arista3_12);

		arista3_6 = new JTextField();
		arista3_6.setColumns(10);
		arista3_6.setBounds(267, 227, 86, 20);
		panel.add(arista3_6);

		arista3_22 = new JTextField();
		arista3_22.setColumns(10);
		arista3_22.setBounds(267, 251, 86, 20);
		panel.add(arista3_22);

		arista3_24 = new JTextField();
		arista3_24.setColumns(10);
		arista3_24.setBounds(267, 276, 86, 20);
		panel.add(arista3_24);

		arista3_17 = new JTextField();
		arista3_17.setColumns(10);
		arista3_17.setBounds(267, 301, 86, 20);
		panel.add(arista3_17);

		arista4_7 = new JTextField();
		arista4_7.setColumns(10);
		arista4_7.setBounds(267, 325, 86, 20);
		panel.add(arista4_7);

		arista4_21 = new JTextField();
		arista4_21.setColumns(10);
		arista4_21.setBounds(267, 348, 86, 20);
		panel.add(arista4_21);

		arista4_22 = new JTextField();
		arista4_22.setColumns(10);
		arista4_22.setBounds(267, 373, 86, 20);
		panel.add(arista4_22);

		arista4_17 = new JTextField();
		arista4_17.setColumns(10);
		arista4_17.setBounds(267, 398, 86, 20);
		panel.add(arista4_17);

		JLabel lblNewLabel_1 = new JLabel("Cantidad de regiones buscadas");
		lblNewLabel_1.setBounds(262, 443, 217, 14);
		panel.add(lblNewLabel_1);

		cantidad_regiones = new JTextField();
		cantidad_regiones.setBounds(489, 440, 86, 20);
		panel.add(cantidad_regiones);
		cantidad_regiones.setColumns(10);




		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 956, 468);
		layeredPane.add(panel_2);

		JTextPane txtpnPanelAgm = new JTextPane();


		JButton btnNewButton_4 = new JButton("Generar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int reg_buscadas = Integer.parseInt(cantidad_regiones.getText());
				//agarrar los pesos
				int a1_2 = Integer.parseInt(arista1_2.getText());
				int a1_16 = Integer.parseInt(arista1_16.getText());
				int a1_11 = Integer.parseInt(arista1_11.getText());
				int a1_6 = Integer.parseInt(arista1_6.getText());
				int a1_21 = Integer.parseInt(arista1_21.getText());
				int a1_8 = Integer.parseInt(arista1_8.getText());
				int a3_12 = Integer.parseInt(arista3_12.getText());
				int a3_6 = Integer.parseInt(arista3_6.getText());
				int a3_22 = Integer.parseInt(arista3_22.getText());
				int a3_24 = Integer.parseInt(arista3_24.getText());
				int a3_17 = Integer.parseInt(arista3_17.getText());
				int a4_7 = Integer.parseInt(arista4_7.getText());
				int a4_21 = Integer.parseInt(arista4_21.getText());
				int a4_22 = Integer.parseInt(arista4_22.getText());
				int a4_17 = Integer.parseInt(arista4_17.getText());
				int a4_9 = Integer.parseInt(arista4_9.getText());
				int a5_20 = Integer.parseInt(arista5_20.getText());
				int a5_16 = Integer.parseInt(arista5_16.getText());
				int a6_11 = Integer.parseInt(arista6_11.getText());
				int a6_19 = Integer.parseInt(arista6_19.getText());
				int a6_12 = Integer.parseInt(arista6_12.getText());
				int a6_22 = Integer.parseInt(arista6_22.getText());
				int a6_21 = Integer.parseInt(arista6_21.getText());
				int a7_14 = Integer.parseInt(arista7_14.getText());
				int a7_8 = Integer.parseInt(arista7_8.getText());
				int a7_21 = Integer.parseInt(arista7_21.getText());
				int a8_21 = Integer.parseInt(arista8_21.getText());
				int a9_17 = Integer.parseInt(arista9_17.getText());
				int a10_17 = Integer.parseInt(arista10_17.getText());
				int a11_13 = Integer.parseInt(arista11_13.getText());
				int a11_19 = Integer.parseInt(arista11_19.getText());
				int a11_16 = Integer.parseInt(arista11_16.getText());
				int a11_15 = Integer.parseInt(arista11_15.getText());
				int a12_19 = Integer.parseInt(arista12_19.getText());
				int a12_18 = Integer.parseInt(arista12_18.getText());
				int a13_18 = Integer.parseInt(arista13_18.getText());
				int a13_19 = Integer.parseInt(arista13_19.getText());
				int a13_15 = Integer.parseInt(arista13_15.getText());
				int a15_16 = Integer.parseInt(arista15_16.getText());
				int a17_22 = Integer.parseInt(arista17_22.getText());
				int a17_24 = Integer.parseInt(arista17_24.getText());
				int a18_19 = Integer.parseInt(arista18_19.getText());
				int a20_23 = Integer.parseInt(arista20_23.getText());
				int a21_22 = Integer.parseInt(arista21_22.getText());
				int a22_24 = Integer.parseInt(arista22_24.getText());

				int listaDePesos[] = new int[] {a1_2,a1_16,a1_11,a1_6,a1_21,a1_8,a3_12,a3_6,a3_22,a3_24,a3_17,a4_7,a4_21,a4_22,a4_17,a4_9,a5_20,a5_16,a6_11,a6_19,a6_12,a6_22,a6_21,a7_14,a7_8,a7_21,a8_21,a9_17,a10_17,a11_13,a11_19,a11_16,a11_15,a12_19,a12_18,a13_18,a13_19,a13_15,a15_16,a17_22,a17_24,a18_19,a20_23,a21_22,a22_24
				};

				//AGM.guardarPesosGrafoArgentina(listaDePesos);

				//AGM.arbolGeneradorMinimoUsuario(reg_buscadas,listaDePesos);
				ArbolGeneradorMinimo.arbolGeneradorMinimoUsuario(reg_buscadas, listaDePesos);

				txtpnPanelAgm.setText(ArbolGeneradorMinimo.renderAGM());

				//System.out.println(ArbolGeneradorMinimo.renderAGM());

				panel_2.add(txtpnPanelAgm);
				panel_2.repaint();
				
				switchPanels(panel_2);

			}
		});
		btnNewButton_4.setBounds(651, 439, 89, 23);
		panel.add(btnNewButton_4);

		JTextPane txtpnPorFavorCompletar = new JTextPane();
		txtpnPorFavorCompletar.setText("Por favor completar el peso de las aristas con valores numericos enteros. Lo mismo para la cantidad de regiones buscadas");
		txtpnPorFavorCompletar.setBounds(76, 11, 794, 20);
		panel.add(txtpnPorFavorCompletar);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 956, 468);
		layeredPane.add(panel_1);

		_mapa = new JMapViewer();
		_mapa.setDisplayPosition(new Coordinate(-35.25421708829717, -65.43006617821713), 4);

		//panel_1.add(_mapa);

		Coordinate capital_federal = new Coordinate(-34.6083, -58.3712);
		Coordinate buenos_aires = new Coordinate(-36.157222, -60.569722);
		Coordinate rio_negro = new Coordinate(-40.121232072786434, -67.2422522092288);
		Coordinate la_pampa = new Coordinate(-37.003956446666535, -65.44565007026247);
		Coordinate cordoba = new Coordinate(-31.711934584094696, -63.7192512984437);
		Coordinate santa_fe = new Coordinate(-30.50389029094929, -60.8750049433848);
		Coordinate entre_rios = new Coordinate(-31.9547182033473, -59.09072502289711);
		Coordinate catamarca = new Coordinate(-27.89813364721282, -66.90722116376938);
		Coordinate la_rioja = new Coordinate(-29.562722841135425, -66.97461051791764);
		Coordinate santiago_del_estero = new Coordinate(-27.50189406578348, -63.25395216208365);
		Coordinate tucuman = new Coordinate(-26.652698179265403, -65.28343332993346);
		Coordinate salta = new Coordinate(-25.022698434873565, -64.55452544475297);
		Coordinate chaco = new Coordinate(-26.18964268002508, -60.66435853428049);
		Coordinate corrientes = new Coordinate(-28.780321113741714, -57.55675164907145);
		Coordinate formosa = new Coordinate(-28.780321113741714, -57.55675164907145);
		Coordinate chubut = new Coordinate(-43.95420000996885, -68.85351637685419);
		Coordinate santa_cruz = new Coordinate(-48.3659957995137, -69.65449778450795);
		Coordinate san_luis = new Coordinate(-33.61976424081013, -66.05855385857673);
		Coordinate misiones = new Coordinate(-26.58999567468294, -54.28276056802246);
		Coordinate jujuy = new Coordinate(-22.783620461304313, -65.88568111082124);
		Coordinate mendoza = new Coordinate(-34.27795257467895, -68.42296195797809);
		Coordinate neuquen = new Coordinate(-38.29125409006371, -69.87350888681866);
		Coordinate san_juan = new Coordinate(-30.627301991317438, -69.05397990650064);
		Coordinate tierra_del_fuego = new Coordinate(-54.271547409116124, -67.55845717895879);




		List<Coordinate> route = new ArrayList<Coordinate>(Arrays.asList(capital_federal, buenos_aires, buenos_aires));
		List<Coordinate> route2 = new ArrayList<Coordinate>(Arrays.asList(buenos_aires, rio_negro, rio_negro));
		List<Coordinate> route3 = new ArrayList<Coordinate>(Arrays.asList(buenos_aires, la_pampa, la_pampa));
		List<Coordinate> route4 = new ArrayList<Coordinate>(Arrays.asList(buenos_aires, cordoba, cordoba));
		List<Coordinate> route5 = new ArrayList<Coordinate>(Arrays.asList(buenos_aires, santa_fe, santa_fe));
		List<Coordinate> route6 = new ArrayList<Coordinate>(Arrays.asList(buenos_aires, entre_rios, entre_rios));
		List<Coordinate> route7 = new ArrayList<Coordinate>(Arrays.asList(catamarca, la_rioja, la_rioja));
		List<Coordinate> route8 = new ArrayList<Coordinate>(Arrays.asList(catamarca, cordoba, cordoba));
		List<Coordinate> route9 = new ArrayList<Coordinate>(Arrays.asList(catamarca, santiago_del_estero, santiago_del_estero));
		List<Coordinate> route10 = new ArrayList<Coordinate>(Arrays.asList(catamarca, tucuman, tucuman));
		List<Coordinate> route11 = new ArrayList<Coordinate>(Arrays.asList(catamarca, salta, salta));
		List<Coordinate> route12 = new ArrayList<Coordinate>(Arrays.asList(chaco, corrientes, corrientes));
		List<Coordinate> route13 = new ArrayList<Coordinate>(Arrays.asList(chaco, santa_fe, santa_fe));
		List<Coordinate> route14 = new ArrayList<Coordinate>(Arrays.asList(chaco, santiago_del_estero, santiago_del_estero));
		List<Coordinate> route15 = new ArrayList<Coordinate>(Arrays.asList(chaco, salta, salta));
		List<Coordinate> route16 = new ArrayList<Coordinate>(Arrays.asList(chaco, formosa, formosa));
		List<Coordinate> route17 = new ArrayList<Coordinate>(Arrays.asList(chubut, santa_cruz, santa_cruz));
		List<Coordinate> route18 = new ArrayList<Coordinate>(Arrays.asList(chubut, rio_negro, rio_negro));
		List<Coordinate> route19 = new ArrayList<Coordinate>(Arrays.asList(cordoba, la_pampa, la_pampa));
		List<Coordinate> route20 = new ArrayList<Coordinate>(Arrays.asList(cordoba, san_luis, san_luis));
		List<Coordinate> route21 = new ArrayList<Coordinate>(Arrays.asList(cordoba, la_rioja, la_rioja));
		List<Coordinate> route22 = new ArrayList<Coordinate>(Arrays.asList(cordoba, santiago_del_estero, santiago_del_estero));
		List<Coordinate> route23 = new ArrayList<Coordinate>(Arrays.asList(cordoba, santa_fe, santa_fe));
		List<Coordinate> route24 = new ArrayList<Coordinate>(Arrays.asList(corrientes, misiones, misiones));
		List<Coordinate> route25 = new ArrayList<Coordinate>(Arrays.asList(corrientes, entre_rios, entre_rios));
		List<Coordinate> route26 = new ArrayList<Coordinate>(Arrays.asList(corrientes, santa_fe, santa_fe));
		List<Coordinate> route27 = new ArrayList<Coordinate>(Arrays.asList(entre_rios, santa_fe, santa_fe));
		List<Coordinate> route28 = new ArrayList<Coordinate>(Arrays.asList(formosa, salta, salta));
		List<Coordinate> route29 = new ArrayList<Coordinate>(Arrays.asList(jujuy, salta, salta));
		List<Coordinate> route30 = new ArrayList<Coordinate>(Arrays.asList(la_pampa, mendoza, mendoza));
		List<Coordinate> route31 = new ArrayList<Coordinate>(Arrays.asList(la_pampa, san_luis, san_luis));
		List<Coordinate> route32 = new ArrayList<Coordinate>(Arrays.asList(la_pampa, rio_negro, rio_negro));
		List<Coordinate> route33 = new ArrayList<Coordinate>(Arrays.asList(la_pampa, rio_negro, rio_negro));
		List<Coordinate> route34 = new ArrayList<Coordinate>(Arrays.asList(la_pampa, neuquen, neuquen));
		List<Coordinate> route35 = new ArrayList<Coordinate>(Arrays.asList(la_rioja, san_luis, san_luis));
		List<Coordinate> route36 = new ArrayList<Coordinate>(Arrays.asList(la_rioja, san_juan, san_juan));
		List<Coordinate> route37 = new ArrayList<Coordinate>(Arrays.asList(mendoza, san_juan, san_juan));
		List<Coordinate> route38 = new ArrayList<Coordinate>(Arrays.asList(mendoza, san_luis, san_luis));
		List<Coordinate> route39 = new ArrayList<Coordinate>(Arrays.asList(mendoza, neuquen, neuquen));
		List<Coordinate> route40 = new ArrayList<Coordinate>(Arrays.asList(neuquen, rio_negro, rio_negro));
		List<Coordinate> route41 = new ArrayList<Coordinate>(Arrays.asList(salta, santiago_del_estero, santiago_del_estero));
		List<Coordinate> route42 = new ArrayList<Coordinate>(Arrays.asList(salta, tucuman, tucuman));
		List<Coordinate> route43 = new ArrayList<Coordinate>(Arrays.asList(san_juan, san_luis, san_luis));
		List<Coordinate> route44 = new ArrayList<Coordinate>(Arrays.asList(santa_cruz, tierra_del_fuego, tierra_del_fuego));
		List<Coordinate> route45 = new ArrayList<Coordinate>(Arrays.asList(santa_fe, santiago_del_estero, santiago_del_estero));
		List<Coordinate> route46 = new ArrayList<Coordinate>(Arrays.asList(tucuman, santiago_del_estero, santiago_del_estero));

		_mapa.addMapPolygon(new MapPolygonImpl(route));
		_mapa.addMapPolygon(new MapPolygonImpl(route2));
		_mapa.addMapPolygon(new MapPolygonImpl(route3));
		_mapa.addMapPolygon(new MapPolygonImpl(route4));
		_mapa.addMapPolygon(new MapPolygonImpl(route5));
		_mapa.addMapPolygon(new MapPolygonImpl(route6));
		_mapa.addMapPolygon(new MapPolygonImpl(route7));
		_mapa.addMapPolygon(new MapPolygonImpl(route8));
		_mapa.addMapPolygon(new MapPolygonImpl(route9));
		_mapa.addMapPolygon(new MapPolygonImpl(route10));
		_mapa.addMapPolygon(new MapPolygonImpl(route11));
		_mapa.addMapPolygon(new MapPolygonImpl(route12));
		_mapa.addMapPolygon(new MapPolygonImpl(route13));
		_mapa.addMapPolygon(new MapPolygonImpl(route14));
		_mapa.addMapPolygon(new MapPolygonImpl(route15));
		_mapa.addMapPolygon(new MapPolygonImpl(route16));
		_mapa.addMapPolygon(new MapPolygonImpl(route17));
		_mapa.addMapPolygon(new MapPolygonImpl(route18));
		_mapa.addMapPolygon(new MapPolygonImpl(route19));
		_mapa.addMapPolygon(new MapPolygonImpl(route20));
		_mapa.addMapPolygon(new MapPolygonImpl(route21));
		_mapa.addMapPolygon(new MapPolygonImpl(route22));
		_mapa.addMapPolygon(new MapPolygonImpl(route23));
		_mapa.addMapPolygon(new MapPolygonImpl(route24));
		_mapa.addMapPolygon(new MapPolygonImpl(route25));
		_mapa.addMapPolygon(new MapPolygonImpl(route26));
		_mapa.addMapPolygon(new MapPolygonImpl(route27));
		_mapa.addMapPolygon(new MapPolygonImpl(route28));
		_mapa.addMapPolygon(new MapPolygonImpl(route29));
		_mapa.addMapPolygon(new MapPolygonImpl(route30));
		_mapa.addMapPolygon(new MapPolygonImpl(route31));
		_mapa.addMapPolygon(new MapPolygonImpl(route32));
		_mapa.addMapPolygon(new MapPolygonImpl(route33));
		_mapa.addMapPolygon(new MapPolygonImpl(route34));
		_mapa.addMapPolygon(new MapPolygonImpl(route35));
		_mapa.addMapPolygon(new MapPolygonImpl(route36));
		_mapa.addMapPolygon(new MapPolygonImpl(route37));
		_mapa.addMapPolygon(new MapPolygonImpl(route38));
		_mapa.addMapPolygon(new MapPolygonImpl(route39));
		_mapa.addMapPolygon(new MapPolygonImpl(route40));
		_mapa.addMapPolygon(new MapPolygonImpl(route41));
		_mapa.addMapPolygon(new MapPolygonImpl(route42));
		_mapa.addMapPolygon(new MapPolygonImpl(route43));
		_mapa.addMapPolygon(new MapPolygonImpl(route44));
		_mapa.addMapPolygon(new MapPolygonImpl(route45));
		_mapa.addMapPolygon(new MapPolygonImpl(route46));


		_mapa.addMapMarker(new MapMarkerDot("", buenos_aires));
		_mapa.addMapMarker(new MapMarkerDot("", catamarca));
		_mapa.addMapMarker(new MapMarkerDot("", chaco));
		_mapa.addMapMarker(new MapMarkerDot("", chubut));
		_mapa.addMapMarker(new MapMarkerDot("", cordoba));
		_mapa.addMapMarker(new MapMarkerDot("", corrientes));
		_mapa.addMapMarker(new MapMarkerDot("", entre_rios));
		_mapa.addMapMarker(new MapMarkerDot("", formosa));
		_mapa.addMapMarker(new MapMarkerDot("", jujuy));
		_mapa.addMapMarker(new MapMarkerDot("", la_pampa));
		_mapa.addMapMarker(new MapMarkerDot("", la_rioja));
		_mapa.addMapMarker(new MapMarkerDot("", mendoza));
		_mapa.addMapMarker(new MapMarkerDot("", misiones));
		_mapa.addMapMarker(new MapMarkerDot("", neuquen));
		_mapa.addMapMarker(new MapMarkerDot("", rio_negro));
		_mapa.addMapMarker(new MapMarkerDot("", salta));
		_mapa.addMapMarker(new MapMarkerDot("", san_juan));
		_mapa.addMapMarker(new MapMarkerDot("", san_luis));
		_mapa.addMapMarker(new MapMarkerDot("", santa_cruz));
		_mapa.addMapMarker(new MapMarkerDot("", santa_fe));
		_mapa.addMapMarker(new MapMarkerDot("", santiago_del_estero));
		_mapa.addMapMarker(new MapMarkerDot("", tierra_del_fuego));
		_mapa.addMapMarker(new MapMarkerDot("", tucuman));
		
		
		panel_1.add(_mapa);

		JButton btnNewButton = new JButton("Aristas y vertices");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel);
			}
		});
		btnNewButton.setBounds(295, 14, 135, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_2 = new JButton("AGM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
			}
		});
		btnNewButton_2.setBounds(538, 14, 89, 23);
		frame.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Ver Grafo original");
		btnNewButton_1.setBounds(78, 14, 161, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		
		
		switchPanels(panel_1);
		//panel_1.repaint();
		
	}  //end of private void initialize()
}
