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
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Form {

	private JFrame frame;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_13;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_30;
	private JTextField textField_11;
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

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(829, 54, 86, 20);
		panel.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(829, 79, 86, 20);
		panel.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(829, 103, 86, 20);
		panel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(829, 128, 86, 20);
		panel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(829, 153, 86, 20);
		panel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(829, 177, 86, 20);
		panel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(829, 202, 86, 20);
		panel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(829, 227, 86, 20);
		panel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(829, 251, 86, 20);
		panel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(829, 276, 86, 20);
		panel.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(829, 301, 86, 20);
		panel.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(829, 325, 86, 20);
		panel.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(829, 348, 86, 20);
		panel.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(829, 373, 86, 20);
		panel.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(829, 398, 86, 20);
		panel.add(textField_45);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("La Pampa - Mendoza");
		lblNewLabel_1_3_1.setBounds(408, 401, 137, 14);
		panel.add(lblNewLabel_1_3_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(541, 54, 86, 20);
		panel.add(textField_13);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(541, 79, 86, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(541, 103, 86, 20);
		panel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(541, 128, 86, 20);
		panel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(541, 153, 86, 20);
		panel.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(541, 177, 86, 20);
		panel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(541, 202, 86, 20);
		panel.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(541, 227, 86, 20);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(541, 251, 86, 20);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(541, 276, 86, 20);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(541, 301, 86, 20);
		panel.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(541, 325, 86, 20);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(541, 348, 86, 20);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(541, 373, 86, 20);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(541, 398, 86, 20);
		panel.add(textField_29);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(267, 54, 86, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(267, 79, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(267, 103, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(267, 128, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(267, 153, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(267, 177, 86, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(267, 202, 86, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(267, 227, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(267, 251, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(267, 276, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(267, 301, 86, 20);
		panel.add(textField_10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(267, 325, 86, 20);
		panel.add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(267, 348, 86, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(267, 373, 86, 20);
		panel.add(textField_15);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(267, 398, 86, 20);
		panel.add(textField_30);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de regiones buscadas");
		lblNewLabel_1.setBounds(262, 443, 217, 14);
		panel.add(lblNewLabel_1);
		
		textField_11 = new JTextField();
		textField_11.setBounds(489, 440, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Generar");
		btnNewButton_4.setBounds(651, 439, 89, 23);
		panel.add(btnNewButton_4);
		
		JTextPane txtpnPorFavorCompletar = new JTextPane();
		txtpnPorFavorCompletar.setText("Por favor completar el peso de las aristas con valores numericos enteros. Lo mismo para la cantidad de regiones buscadas");
		txtpnPorFavorCompletar.setBounds(76, 11, 794, 20);
		panel.add(txtpnPorFavorCompletar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 956, 468);
		layeredPane.add(panel_1);
		
		JTextPane txtpnPanelVerGrafo = new JTextPane();
		txtpnPanelVerGrafo.setText("Panel ver grafo original");
		panel_1.add(txtpnPanelVerGrafo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 956, 468);
		layeredPane.add(panel_2);
		
		JTextPane txtpnPanelAgm = new JTextPane();
		txtpnPanelAgm.setText("panel AGM");
		panel_2.add(txtpnPanelAgm);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 956, 468);
		layeredPane.add(panel_3);
		
		JTextPane txtpnPanelRegiones = new JTextPane();
		txtpnPanelRegiones.setText("panel regiones");
		panel_3.add(txtpnPanelRegiones);
		
		JButton btnNewButton = new JButton("Aristas y vertices");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel);
			}
		});
		btnNewButton.setBounds(102, 14, 135, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver Grafo original");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_1);
			}
		});
		btnNewButton_1.setBounds(313, 14, 161, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("AGM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_2);
			}
		});
		btnNewButton_2.setBounds(538, 14, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Regiones");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(panel_3);
			}
		});
		btnNewButton_3.setBounds(696, 14, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}