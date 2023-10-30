package paraTPDisenio;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AltaPoliza extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Background primera = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background segunda = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background tercera = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background cuarta = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background quinta = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background pdf  = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");
	Background buscarCliente  = new Background("C:\\Users\\valec\\OneDrive\\Desktop\\paraTPDisenio\\src\\background.jpg");

	
	CardLayout cl = new CardLayout();
	JPanel containerPanel = new JPanel();
		
	MenuProductorSeguros main;
	
	AltaPoliza(MenuProductorSeguros menu){
		
		main = menu;
		
		primeraConfig();
		segundaConfig();
		terceraConfig();
		cuartaConfig();
		quintaConfig();
		pdfConfig();
		buscarClienteConfig();
		
		//configurar panel container
	    containerPanel.setLayout(cl);
	    containerPanel.setPreferredSize(this.getSize());
	    containerPanel.add(primera, "1");
	    containerPanel.add(buscarCliente, "buscarCliente");
	    containerPanel.add(segunda, "2");
	    containerPanel.add(tercera, "3");
	    containerPanel.add(cuarta, "4");
	    containerPanel.add(quinta, "5");
	    containerPanel.add(pdf, "6");
	    cambiarPantalla("1");
		
		//agregar mainPanel
		GridBagConstraints gbc0 = new GridBagConstraints();
		gbc0.weightx = 1;
	    gbc0.weighty = 1;
	    gbc0.anchor = GridBagConstraints.CENTER;
	    gbc0.fill = GridBagConstraints.BOTH;
		this.setLayout(new GridBagLayout());
		this.add(containerPanel,gbc0);
		
	}
	
	private void primeraConfig() {
		
		Boton botonCancelar = new Boton("Cancelar");
		Boton botonBuscarCliente = new Boton("Buscar Cliente");
		Boton botonContinuar = new Boton("Continuar");
		
		JPanel panelCliente = new JPanel();
		JPanel panelHijos = new JPanel(); 
		
		JLabel cliente = new JLabel("Cliente");
		JPanel panelClienteLabel = new JPanel(); 
		
		JLabel apellido = new JLabel("Apellido");
		JLabel nombre = new JLabel("Nombre");
		JLabel numero = new JLabel("Nro. Cliente");	
		JLabel tipoDocumento = new JLabel("Tipo de documento");
		JLabel nroDocumento = new JLabel("Nro. Documento");
		JLabel direccion = new JLabel("Direccion");
		
		JPanel panelApellido = new JPanel(); 
		JPanel panelNombre = new JPanel(); 
		JPanel panelNumero = new JPanel(); 
		JPanel panelDoc = new JPanel(); 
		JPanel panelNDoc = new JPanel(); 
		JPanel panelDireccion = new JPanel(); 
		
		
		
		JLabel placeholder0 = new JLabel("placeholder");
		JLabel placeholder1 = new JLabel("placeholder");
		JLabel placeholder2 = new JLabel("placeholder");
		JLabel placeholder3 = new JLabel("placeholder");
		JLabel placeholder4 = new JLabel("placeholder");
		JLabel placeholder5 = new JLabel("placeholder");
		
		JPanel placeholder0P = new JPanel(); 
		JPanel placeholder1P = new JPanel(); 
		JPanel placeholder2P = new JPanel(); 
		JPanel placeholder3P = new JPanel(); 
		JPanel placeholder4P = new JPanel(); 
		JPanel placeholder5P = new JPanel(); 
		
		botonBuscarCliente.addActionListener((ActionEvent e) -> {
			cambiarPantalla("buscarCliente");
        });
		botonCancelar.addActionListener((ActionEvent e) -> {
			main.cambiarPantalla("1");
        });
		botonContinuar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("2");
        });
		
		//config panelCliente
		panelCliente.setLayout(new GridBagLayout());
		GridBagConstraints gbc1 = new GridBagConstraints();
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.anchor = GridBagConstraints.WEST;
		gbc2.fill = GridBagConstraints.NONE;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
        gbc2.insets = new Insets(0, 10, 0, 0);

		
        Font customFont = new Font("Arial", Font.BOLD, 24); // Font name, style, and size
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
        
		gbc1.fill = GridBagConstraints.BOTH;
		gbc1.weightx = 1;
        gbc1.weighty = 0.2;
        gbc1.gridwidth = 3;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.anchor = GridBagConstraints.NORTH;
        gbc1.insets = new Insets(10, 10, 0, 10);
        cliente.setFont(customFont);
        panelClienteLabel.setLayout(new GridBagLayout());
        panelClienteLabel.setBackground(new Color(240,240,240));
        panelClienteLabel.add(cliente,gbc2);
		panelCliente.add(panelClienteLabel, gbc1);
		
        gbc2.anchor = GridBagConstraints.SOUTHWEST;
        gbc2.insets = new Insets(0, 10, 5, 0);
		gbc1.gridy = 1;
        gbc1.weighty = 0.1;
        gbc1.gridwidth = 1;
		gbc1.anchor = GridBagConstraints.WEST;
        gbc1.insets = new Insets(30, 10, 5, 10);
        panelApellido.setLayout(new GridBagLayout());
        panelApellido.setBackground(new Color(250,250,250));
        panelApellido.add(apellido,gbc2);
		panelCliente.add(panelApellido, gbc1);
		
		gbc1.gridx = 1;
		panelNombre.setLayout(new GridBagLayout());
		panelNombre.setBackground(new Color(250,250,250));
		panelNombre.add(nombre,gbc2);
		panelCliente.add(panelNombre, gbc1);

		gbc1.gridx = 2;
		panelNumero.setLayout(new GridBagLayout());
		panelNumero.setBackground(new Color(250,250,250));
		panelNumero.add(numero,gbc2);
		panelCliente.add(panelNumero, gbc1);
		
		gbc2.anchor = GridBagConstraints.WEST;
        gbc2.insets = new Insets(0, 10, 0, 0);
		gbc1.anchor = GridBagConstraints.CENTER;
		gbc1.gridy = 2;
		gbc1.gridx = 0;
        gbc1.insets = new Insets(1, 10, 60, 10);
        placeholder0P.setLayout(new GridBagLayout());
        placeholder0P.setBackground(new Color(255,255,255));
        placeholder0P.setBorder(border);
        placeholder0P.add(placeholder0,gbc2);
		panelCliente.add(placeholder0P, gbc1);
		
        gbc1.weighty = 0.2;
		gbc1.gridx = 1;
		placeholder1P.setLayout(new GridBagLayout());
		placeholder1P.setBackground(new Color(255,255,255));
		placeholder1P.setBorder(border);
		placeholder1P.add(placeholder1,gbc2);
		panelCliente.add(placeholder1P, gbc1);

		gbc1.gridx = 2;
		placeholder2P.setLayout(new GridBagLayout());
		placeholder2P.setBackground(new Color(255,255,255));
		placeholder2P.setBorder(border);
		placeholder2P.add(placeholder2,gbc2);
		panelCliente.add(placeholder2P, gbc1);
		
        gbc2.anchor = GridBagConstraints.SOUTHWEST;
        gbc2.insets = new Insets(0, 10, 5, 0);
        gbc1.weighty = 0.1;
		gbc1.anchor = GridBagConstraints.WEST;
        gbc1.insets = new Insets(0, 10, 5, 10);
		gbc1.gridy = 3;
		gbc1.gridx = 0;
		panelDoc.setLayout(new GridBagLayout());
		panelDoc.setBackground(new Color(250,250,250));
		panelDoc.add(tipoDocumento,gbc2);
		panelCliente.add(panelDoc, gbc1);
		
		gbc1.gridx = 1;
		panelNDoc.setLayout(new GridBagLayout());
		panelNDoc.setBackground(new Color(250,250,250));
		panelNDoc.add(nroDocumento,gbc2);
		panelCliente.add(panelNDoc, gbc1);

		gbc1.gridx = 2;
		panelDireccion.setLayout(new GridBagLayout());
		panelDireccion.setBackground(new Color(250,250,250));
		panelDireccion.add(direccion,gbc2);
		panelCliente.add(panelDireccion, gbc1);
		
		gbc2.anchor = GridBagConstraints.WEST;
        gbc2.insets = new Insets(0, 10, 0, 0);
		gbc1.anchor = GridBagConstraints.CENTER;
		gbc1.weighty = 0.2;
		gbc1.gridy = 4;
		gbc1.gridx = 0;
        gbc1.insets = new Insets(1, 10, 60, 10);
        placeholder3P.setLayout(new GridBagLayout());
        placeholder3P.setBackground(new Color(255,255,255));
        placeholder3P.setBorder(border);
        placeholder3P.add(placeholder3,gbc2);
		panelCliente.add(placeholder3P, gbc1);
		
		gbc1.gridx = 1;
		placeholder4P.setLayout(new GridBagLayout());
		placeholder4P.setBackground(new Color(255,255,255));
		placeholder4P.setBorder(border);
		placeholder4P.add(placeholder4,gbc2);
		panelCliente.add(placeholder4P, gbc1);

		gbc1.gridx = 2;
		placeholder5P.setLayout(new GridBagLayout());
		placeholder5P.setBackground(new Color(255,255,255));
		placeholder5P.setBorder(border);
		placeholder5P.add(placeholder5,gbc2);
		panelCliente.add(placeholder5P, gbc1);
		
		//config panelHijos
		
		JPanel panelcantHijosLabel = new JPanel();
		JPanel paneltextHijos = new JPanel();
		
		JLabel cantHijosLabel = new JLabel("Cant. Hijos del cliente: ");
		JLabel placeholder6 = new JLabel("placeholder");
		
		panelHijos.setLayout(new GridBagLayout());
		panelcantHijosLabel.setLayout(new GridBagLayout());
		paneltextHijos.setLayout(new GridBagLayout());
		GridBagConstraints gbc3 = new GridBagConstraints();
		GridBagConstraints gbc4 = new GridBagConstraints();
		
		
		gbc4.anchor = GridBagConstraints.EAST;
        gbc4.insets = new Insets(5, 0, 5, 5);
        gbc4.weightx = 1;
		gbc4.weighty = 1;
        panelcantHijosLabel.add(cantHijosLabel,gbc4);
		gbc3.fill = GridBagConstraints.BOTH;
		gbc3.weightx = 0.8;
        gbc3.weighty = 1;
        gbc3.gridwidth = 1;
		gbc3.gridx = 0;
		gbc3.gridy = 0;
		gbc3.anchor = GridBagConstraints.EAST;
        gbc3.insets = new Insets(0, 0, 0, 0);
        panelHijos.add(panelcantHijosLabel, gbc3);
        
        gbc4.anchor = GridBagConstraints.WEST;
        gbc4.insets = new Insets(5, 5, 5, 0);
        paneltextHijos.add(placeholder6,gbc4);
		gbc3.anchor = GridBagConstraints.WEST;
        gbc3.gridwidth = 1;
		gbc3.weightx = 0.2;
		gbc3.gridx = 1;
        panelHijos.add(paneltextHijos, gbc3);
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 10, 10, 10);
        primera.add(botonBuscarCliente, gbc);
		
		panelCliente.setBackground(new Color(230,230,230));
        panelCliente.setBorder(border);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.weighty = 0.75;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 10, 10, 10);
        primera.add(panelCliente,gbc);
		
		panelHijos.setBackground(new Color(255,255,150));
		gbc.gridwidth = 2;
		gbc.weighty = 0.2;
		gbc.gridy = 2;
		gbc.insets = new Insets(0, 10, 0, 10);
		primera.add(panelHijos,gbc);
		
		gbc.gridwidth = 1;
		gbc.weighty = 0.025;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        primera.add(botonCancelar,gbc);
		
		gbc.anchor = GridBagConstraints.SOUTHEAST;		
		gbc.gridx = 1;
		primera.add(botonContinuar,gbc);
		
		return;
		
	}
	
	private void segundaConfig() {
		
		Boton botonVolver = new Boton("Volver");
		Boton botonCancelar = new Boton("Cancelar");
		Boton botonContinuar = new Boton("Continuar");
		
		JPanel panelVehiculo = new JPanel();
		JPanel panelMedidas = new JPanel(); 
		
		botonVolver.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
	    });
		botonCancelar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
			main.cambiarPantalla("1");
	    });
		botonContinuar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("3");
	    });
		
		GridBagConstraints gbc = new GridBagConstraints();
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        segunda.add(botonVolver, gbc);
		
        panelVehiculo.setBackground(new Color(240,240,240));;
        panelVehiculoConfig(panelVehiculo);
        panelVehiculo.setBorder(border);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.weighty = 0.85;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 10, 5, 10);
        segunda.add(panelVehiculo,gbc);
		
        panelMedidas.setBackground(new Color(240,240,240));;
        panelMedidasConfig(panelMedidas);
        panelMedidas.setBorder(border);
		gbc.gridwidth = 2;
		gbc.weighty = 0.1;
		gbc.gridy = 2;
		segunda.add(panelMedidas,gbc);
		
		gbc.gridwidth = 1;
        gbc.weighty = 0.025;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 10, 10, 10);
        segunda.add(botonCancelar,gbc);
		
		gbc.anchor = GridBagConstraints.SOUTHEAST;		
		gbc.gridx = 1;
		segunda.add(botonContinuar,gbc);
		
        
		return;
	}
	
	private void terceraConfig() {
		
		Boton botonVolver = new Boton("Volver");
		Boton botonCancelar = new Boton("Cancelar");
		Boton botonConfirmar = new Boton("Confirmar datos");
		
		JPanel panelHijos = new JPanel();
		
		botonVolver.addActionListener((ActionEvent e) -> {
			cambiarPantalla("2");
	    });
		botonCancelar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
			main.cambiarPantalla("1");
	    });
		botonConfirmar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("4");
	    });
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        tercera.add(botonVolver, gbc);
		
        panelHijos.setBackground(new Color(150,255,255));;
        panelHijosConfig(panelHijos, 3);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.weighty = 0.95;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 10, 5, 10);
        tercera.add(panelHijos,gbc);
		
		gbc.gridwidth = 1;
        gbc.weighty = 0.025;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 10, 10, 10);
        tercera.add(botonCancelar,gbc);
		
		gbc.anchor = GridBagConstraints.SOUTHEAST;		
		gbc.gridx = 1;
		tercera.add(botonConfirmar,gbc);
		
        
		return;
	}
	
	private void cuartaConfig() {
		
		Boton botonVolver = new Boton("Volver");
		Boton botonCancelar = new Boton("Cancelar");
		Boton botonGenerar = new Boton("Generar poliza");
		
		JPanel panelCobertura = new JPanel();
		
		botonVolver.addActionListener((ActionEvent e) -> {
			cambiarPantalla("3");
	    });
		botonCancelar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
			main.cambiarPantalla("1");
	    });
		botonGenerar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("5");
	    });
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        cuarta.add(botonVolver, gbc);
		
        panelCobertura.setBackground(new Color(240,240,240));;
        panelCoberturaConfig(panelCobertura);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.weighty = 0.95;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 10, 5, 10);
        cuarta.add(panelCobertura,gbc);
		
		gbc.gridwidth = 1;
        gbc.weighty = 0.025;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 10, 10, 10);
        cuarta.add(botonCancelar,gbc);
		
		gbc.anchor = GridBagConstraints.SOUTHEAST;		
		gbc.gridx = 1;
		cuarta.add(botonGenerar,gbc);
		
        
		return;
	}
	
	private void quintaConfig() {
		
		Boton botonVolver = new Boton("Volver");
		Boton botonCancelar = new Boton("Cancelar");
		Boton botonConfirmar = new Boton("Confirmar poliza");
		
		JPanel panelResumen = new JPanel();
		JPanel panelPoliza = new JPanel();
		JPanel panelCuotas = new JPanel();
		
		botonVolver.addActionListener((ActionEvent e) -> {
			cambiarPantalla("4");
	    });
		botonCancelar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
			main.cambiarPantalla("1");
	    });
		botonConfirmar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("6");
	    });
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.weightx = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(10, 10, 5, 10);
        quinta.add(botonVolver, gbc);
	
        panelResumen.setBackground(new Color(240,240,240));;
        panelResumenConfig(panelResumen);
        gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 2;
		gbc.weighty = 1;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 10, 5, 0);
        quinta.add(panelResumen,gbc);
		
        panelPoliza.setBackground(new Color(240,240,240));;
        panelPolizaConfig(panelPoliza);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 1;
		//gbc.weighty = 0.35;
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(5, 0, 0, 10);
        quinta.add(panelPoliza,gbc);
        
        panelCuotas.setBackground(new Color(255,255,150));;
        panelCuotasConfig(panelCuotas, 6);
		gbc.fill = GridBagConstraints.BOTH;
		//gbc.weighty = 0.35;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(0, 0, 5, 10);
        quinta.add(panelCuotas,gbc);
        
		gbc.gridwidth = 1;
        gbc.weighty = 0.025;
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
        gbc.insets = new Insets(5, 10, 10, 10);
        quinta.add(botonCancelar,gbc);
		
		gbc.anchor = GridBagConstraints.SOUTHEAST;		
		gbc.gridx = 1;
		quinta.add(botonConfirmar,gbc);
		
        
		return;
		
	}
	
	private void pdfConfig() {
		
		JLabel placeholder = new JLabel("PDF");
		Boton botonCancelar = new Boton("Cancelar");
		
		botonCancelar.addActionListener((ActionEvent e) -> {
			cambiarPantalla("1");
			main.cambiarPantalla("1");
	    });		
		
		pdf.add(placeholder);
		pdf.add(botonCancelar);
		
	}
	
	private void buscarClienteConfig() {
		
		BuscarCliente panel = new BuscarCliente(this);
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		buscarCliente.add(panel,gbc);

		
		return;
	}
	
	private void panelVehiculoConfig(JPanel panelVehiculo){
		
		PanelText tVehiculo = new PanelText("Vehiculo", "BOLD" ,24, "WEST");
		
		panelVehiculo.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelVehiculo.add(tVehiculo,gbc);
		
		//domicilio ---------------------------
		PanelText tDomicilioRiesgo = new PanelText("Domicilio de riesgo","BOLD", 16, "SOUTHWEST");
		PanelText tProvincia = new PanelText("Provincia", "PLAIN", 16, "SOUTHWEST");
		PanelText tLocalidad = new PanelText("Localidad", "PLAIN", 16, "SOUTHWEST");
		
		String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
		
		PanelDropDown dProvincia  = new PanelDropDown("WEST", items);
		PanelDropDown dLocalidad = new PanelDropDown("WEST", items);
		
		gbc.gridy = 1;
		panelVehiculo.add(tDomicilioRiesgo,gbc);
		
		gbc.gridy = 2;
		panelVehiculo.add(tProvincia,gbc);
		
		gbc.gridx = 1;
		panelVehiculo.add(tLocalidad,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		panelVehiculo.add(dProvincia,gbc);
		
		gbc.gridx = 1;
		panelVehiculo.add(dLocalidad,gbc);
		
		//modelo ---------------------------
		PanelText tModeloVehiculo = new PanelText("Modelo del vehiculo", "BOLD", 16, "SOUTHWEST");

		PanelText tMarca = new PanelText("Marca", "PLAIN", 16, "SOUTHWEST");
		PanelText tModelo = new PanelText("Modelo", "PLAIN", 16, "SOUTHWEST");
		PanelText tAnio = new PanelText("Año", "PLAIN", 16, "SOUTHWEST");
		
		PanelDropDown dMarca = new PanelDropDown("WEST", items);
		PanelDropDown dModelo = new PanelDropDown("WEST", items);
		PanelDropDown dAnio = new PanelDropDown("WEST", items);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.SOUTH;
		panelVehiculo.add(tModeloVehiculo,gbc);
		
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridy = 5;
		panelVehiculo.add(tModelo,gbc);
		
		gbc.gridx = 1;
		panelVehiculo.add(tMarca,gbc);
		
		gbc.gridx = 2;
		panelVehiculo.add(tAnio,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		panelVehiculo.add(dMarca,gbc);
		
		gbc.gridx = 1;
		panelVehiculo.add(dModelo,gbc);
		
		gbc.gridx = 2;
		panelVehiculo.add(dAnio,gbc);
		
		//suma asegurada ---------------------------
		PanelText tSumaAsegurada = new PanelText("Suma aseguradora en pesos: ", "ITALIC", 16, "WEST");
		PanelTextInput tSuma = new PanelTextInput("placeholder", 16);
		tSuma.setEditable(false);
		
		gbc.gridx = 0;
		gbc.gridy = 7;
        gbc.insets = new Insets(13, 0, 0, 0);
		panelVehiculo.add(tSumaAsegurada,gbc);
		
		gbc.gridx = 1;
		panelVehiculo.add(tSuma,gbc);

		//datos vehiculo ---------------------------
		
		PanelText tDatosVehiculo = new PanelText("Datos vehiculo", "BOLD", 16, "SOUTHWEST");
		
		PanelText tNroMotor = new PanelText("Nro. Motor", "PLAIN", 16, "SOUTHWEST");
		PanelText tNroChasis = new PanelText("Nro. Chasis", "PLAIN", 16, "SOUTHWEST");
		PanelText tPatente = new PanelText("Patente", "PLAIN", 16, "SOUTHWEST");
		
		
		
		PanelTextInput tiNroMotor = new PanelTextInput(16);
		PanelTextInput tiNroChasis = new PanelTextInput(16);
		PanelTextInput tiPatente = new PanelTextInput(16);
		
		PanelText tKMAnio = new PanelText("KM. por año", "PLAIN", 16, "SOUTHWEST");
		PanelTextInput tiKMAnio  = new PanelTextInput(16);
		PanelText tCantidadSin= new PanelText("Cantidad de siniestros en el ultimo año", "PLAIN", 16, "SOUTHWEST");
		PanelTextInput tiCantidadSin = new PanelTextInput("placeholder", 16);
		
		tiCantidadSin.setEditable(false);
		
        gbc.insets = new Insets(0, 0, 0, 0);
		gbc.gridx = 0;
		gbc.gridy = 8;
		panelVehiculo.add(tDatosVehiculo,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 9;
		panelVehiculo.add(tNroMotor,gbc);
		gbc.gridx = 1;
		panelVehiculo.add(tNroChasis,gbc);
		gbc.gridx = 2;
		panelVehiculo.add(tPatente,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 10;
		panelVehiculo.add(tiNroMotor,gbc);
		gbc.gridx = 1;
		panelVehiculo.add(tiNroChasis,gbc);
		gbc.gridx = 2;
		panelVehiculo.add(tiPatente,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 11;
		panelVehiculo.add(tKMAnio,gbc);
		gbc.gridx = 1;
		panelVehiculo.add(tCantidadSin,gbc);
		
        gbc.insets = new Insets(0, 0, 10, 0);
		gbc.gridx = 0;
		gbc.gridy = 12;
		panelVehiculo.add(tiKMAnio,gbc);
		gbc.gridx = 1;
		panelVehiculo.add(tiCantidadSin,gbc);

		
		
		
		
	}
	
	private void panelMedidasConfig(JPanel panelMedidas) {
		
		panelMedidas.setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		//titulo
		PanelText medidas = new PanelText("Medidas de seguridad", "BOLD", 16, "WEST");
		
		//checkboxes
		PanelCheckBox garage = new PanelCheckBox("Garage");
		PanelCheckBox alarma = new PanelCheckBox("Alarma");
		PanelCheckBox dispositivo = new PanelCheckBox("Dispositivo antirrobo");
		PanelCheckBox tuercas = new PanelCheckBox("Tuercas antirrobo");	
		
		gbc.gridx = 0;
		gbc.gridy = 0;
        gbc.insets = new Insets(5, 0, 0, 0);
		panelMedidas.add(medidas,gbc);
		
        gbc.insets = new Insets(0, 0, 5, 0);
		gbc.gridy = 1;
		panelMedidas.add(garage,gbc);
		
		gbc.gridx = 1;
		panelMedidas.add(alarma,gbc);
		
		gbc.gridx = 2;
		panelMedidas.add(dispositivo,gbc);
		
		gbc.gridx = 3;
		panelMedidas.add(tuercas,gbc);
		
		
		return;
	}
	
	private void panelHijosConfig(JPanel panelHijos, int cantidadHijos) {
		
		CardLayout cl = new CardLayout();
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
    	
		//configurar panel container
		panelHijos.setLayout(cl);
		panelHijos.setBorder(border);

		
		//panelHijos.add(menuProductorSeguros, "1");
		
		for(int i = 1; i <= cantidadHijos; i++) {
			

            JPanel panel = new JPanel();
            
            panel.setLayout(new GridBagLayout());
        	
        	PanelText titulo = new PanelText("Declaracion de hijos", "BOLD", 26, "SOUTHWEST");
        	PanelText hijo = new PanelText("HIJO " + i, "PLAIN", 20, "WEST");
        	titulo.setBackgroundColor(255,255,255);
        	hijo.setBackgroundColor(255,255,255);
        	
        	PanelText fechaDeNacimiento = new PanelText("Fecha de nacimiento", "PLAIN", 18, "SOUTHWEST");
        	PanelText sexo = new PanelText("Sexo", "PLAIN", 18, "SOUTHWEST");
        	PanelText estadoCivil = new PanelText("Estado civil", "PLAIN", 18, "SOUTHWEST");
        	
        	PanelText numero = new PanelText("" + i, "PLAIN", 18, "CENTER");

    		String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
        	
        	PanelTextInput fechaInput = new PanelTextInput(18);
        	PanelDropDown sexoDropDown = new PanelDropDown("CENTER", items);
        	PanelDropDown estadoCivilDropDown = new PanelDropDown("CENTER", items);
        
        	Boton boton0 = new Boton("🡰");
        	Boton boton1 = new Boton("🡲");

        	
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.fill = GridBagConstraints.BOTH;
            gbc2.gridwidth = 3;
    		gbc2.weightx = 1;
    		gbc2.weighty = 1;
           // gbc2.insets = new Insets(10, 10, 10, 10);
            
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            panel.add(titulo,gbc2);
            
            gbc2.anchor = GridBagConstraints.NORTHWEST;
            //gbc2.fill = GridBagConstraints.NONE;
            gbc2.gridy = 1;
            gbc2.weighty = 0.1;
            panel.add(hijo,gbc2);
            
            gbc2.gridwidth = 1;
            gbc2.anchor = GridBagConstraints.SOUTHWEST;
            gbc2.weighty = 1;
            gbc2.gridy = 2;
            panel.add(fechaDeNacimiento,gbc2);
            
            gbc2.gridx = 1;
            panel.add(sexo,gbc2);
            
            gbc2.gridx = 2;
            panel.add(estadoCivil,gbc2);
            
            gbc2.fill = GridBagConstraints.HORIZONTAL;
            //gbc2.insets = new Insets(20, 20, 20, 20);
            gbc2.anchor = GridBagConstraints.NORTHWEST;
            gbc2.gridx = 0;
            gbc2.gridy = 3;
            panel.add(fechaInput,gbc2);
            
            gbc2.gridx = 1;
            panel.add(sexoDropDown,gbc2);
            
            gbc2.gridx = 2;
            panel.add(estadoCivilDropDown,gbc2);
            
            gbc2.fill = GridBagConstraints.NONE;
            //gbc2.insets = new Insets(20, 20, 20, 20);
            gbc2.anchor = GridBagConstraints.EAST;
            gbc2.gridwidth = 1;
            gbc2.gridx = 0;
            gbc2.gridy = 4;
            gbc2.insets = new Insets(5, 5, 5, 5);
            panel.add(boton0,gbc2);
            
            gbc2.anchor = GridBagConstraints.CENTER;
            gbc2.gridx = 1;
            panel.add(numero,gbc2);
            
            gbc2.anchor = GridBagConstraints.WEST;
            gbc2.gridx = 2;
            panel.add(boton1,gbc2);

            panelHijos.add(panel, ""+i);
            
            int a = i;
            
            boton0.addActionListener((ActionEvent e) -> {
        		cl.show(panelHijos, ""+(a-1));
            });
            
            boton1.addActionListener((ActionEvent e) -> {
        		cl.show(panelHijos, ""+(a+1));
            });
            
		}
		
		cl.show(panelHijos, ""+1);
		
		return;
	}
	
	private void panelCoberturaConfig(JPanel panelCobertura) {
		
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
    	
		//configurar panel container
		panelCobertura.setLayout(new GridBagLayout());
		panelCobertura.setBorder(border);
   	
        	PanelText titulo = new PanelText("Seleccion de cobertura", "BOLD", 26, "SOUTHWEST");
        	titulo.setBackgroundColor(255,255,255);
        	
        	PanelText tipoCobertura = new PanelText("Tipo de cobertura", "PLAIN", 18, "SOUTHWEST");
        	PanelText fechaInicio = new PanelText("Fecha de inicio", "PLAIN", 18, "SOUTHWEST");
        	PanelText formaPago = new PanelText("Forma de pago", "PLAIN", 18, "SOUTHWEST");
        	

    		String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};
        	
        	PanelTextInput fechaInput = new PanelTextInput(18);
        	PanelDropDown tipoCoberturaDropDown = new PanelDropDown("CENTER", items);
        	PanelDropDown formaPagoDropDown = new PanelDropDown("CENTER", items);

        	
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.fill = GridBagConstraints.BOTH;
            gbc2.gridwidth = 3;
    		gbc2.weightx = 1;
    		gbc2.weighty = 1;
           // gbc2.insets = new Insets(10, 10, 10, 10);
            
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            panelCobertura.add(titulo,gbc2);
            
            gbc2.gridwidth = 1;
            gbc2.anchor = GridBagConstraints.SOUTHWEST;
            gbc2.weighty = 1;
            gbc2.gridy = 1;
            panelCobertura.add(tipoCobertura,gbc2);
            
            gbc2.gridx = 1;
            panelCobertura.add(fechaInicio,gbc2);
            
            gbc2.gridx = 2;
            panelCobertura.add(formaPago,gbc2);
            
            gbc2.fill = GridBagConstraints.HORIZONTAL;
            //gbc2.insets = new Insets(20, 20, 20, 20);
            gbc2.anchor = GridBagConstraints.NORTHWEST;
            gbc2.gridx = 0;
            gbc2.gridy = 2;
            panelCobertura.add(tipoCoberturaDropDown,gbc2);
            
            gbc2.gridx = 1;
            panelCobertura.add(fechaInput,gbc2);
            
            gbc2.gridx = 2;
            panelCobertura.add(formaPagoDropDown,gbc2);
 

            		
		return;
	}
	
	private void panelResumenConfig(JPanel panelResumen) {
		
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);

		panelResumen.setLayout(new GridBagLayout());
		panelResumen.setBorder(border);
		
		PanelText titulo = new PanelText("Resumen de datos", "BOLD", 21, "WEST");
		
		PanelText titularSeguro = new PanelText("Titular del vehiculo", "BOLD", 18, "WEST");
		PanelText vehiculo = new PanelText("Vehiculo", "BOLD", 18, "WEST");
		
		PanelText modelo = new PanelText("Modelo", "PLAIN", 16, "WEST");
		PanelText patente = new PanelText("Patente", "PLAIN", 16, "WEST");
		PanelText suma = new PanelText("Suma asegurada", "PLAIN", 16, "WEST");
		PanelText chasis = new PanelText("Chasis", "PLAIN", 16, "WEST");
		PanelText motor = new PanelText("Motor", "PLAIN", 16, "WEST");

		PanelTextInput tituloI = new PanelTextInput("placeholder", 16);
		tituloI.setEditable(false);
		PanelTextInput modeloI = new PanelTextInput("placeholder", 16);
		modeloI.setEditable(false);
		PanelTextInput patenteI = new PanelTextInput("placeholder", 16);
		patenteI.setEditable(false);
		PanelTextInput sumaI = new PanelTextInput("placeholder", 16);
		sumaI.setEditable(false);
		PanelTextInput chasisI = new PanelTextInput("placeholder", 16);
		chasisI.setEditable(false);
		PanelTextInput motorI = new PanelTextInput("placeholder", 16);
		motorI.setEditable(false);

		GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.gridwidth = 3;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		gbc2.gridx = 0;
		gbc2.gridy = 0;
        //gbc2.insets = new Insets(10, 10, 10, 10);
		panelResumen.add(titulo,gbc2);
		
        gbc2.gridwidth = 1;
		gbc2.gridy = 1;
		panelResumen.add(titularSeguro,gbc2);
		
		gbc2.gridwidth = 2;
		gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
		gbc2.gridy = 2;
		panelResumen.add(tituloI,gbc2);
		
		gbc2.gridwidth = 1;
		gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.CENTER;
		gbc2.gridy = 3;
		panelResumen.add(vehiculo,gbc2);
		
		gbc2.gridy = 4;
		panelResumen.add(modelo,gbc2);
		
	    gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
        gbc2.gridwidth = 2;
		gbc2.gridx = 0;
		gbc2.gridy = 5;
		panelResumen.add(modeloI,gbc2);
		
		gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.CENTER;
        gbc2.gridwidth = 1;
		gbc2.gridy = 6;
		panelResumen.add(patente,gbc2);
		
		gbc2.gridx = 1;
		panelResumen.add(suma,gbc2);
		
		gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
		gbc2.gridy = 7;
		gbc2.gridx = 0;
		panelResumen.add(patenteI,gbc2);
		
		gbc2.gridx = 1;
		panelResumen.add(sumaI,gbc2);
		
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.CENTER;
		gbc2.gridx = 0;
		gbc2.gridy = 8;
		panelResumen.add(chasis,gbc2);
		
		gbc2.gridx = 1;
		panelResumen.add(motor,gbc2);
		
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
		gbc2.gridx = 0;
		gbc2.gridy = 9;
		panelResumen.add(chasisI,gbc2);
		
		gbc2.gridx = 1;
		panelResumen.add(motorI,gbc2);
		
		
		return;
	}
	
	private void panelPolizaConfig(JPanel panelPoliza) {
		
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);

		panelPoliza.setLayout(new GridBagLayout());
		panelPoliza.setBorder(border);
				
		PanelText poliza = new PanelText("Poliza", "BOLD", 18, "WEST");
		PanelText vigencia = new PanelText("Vigencia", "PLAIN", 18, "WEST");
		
		PanelText fechaInicio = new PanelText("Fecha inicio", "PLAIN", 16, "WEST");
		PanelText fechaFin = new PanelText("Fecha fin", "PLAIN", 16, "WEST");
		PanelText tipoPago = new PanelText("Tipo pago", "PLAIN", 16, "WEST");
		PanelText monto = new PanelText("Monto", "PLAIN", 16, "WEST");

		PanelTextInput fechaInicioI = new PanelTextInput("placeholder", 16);
		fechaInicioI.setEditable(false);
		PanelTextInput fechaFinI = new PanelTextInput("placeholder", 16);
		fechaFinI.setEditable(false);
		PanelTextInput tipoPagoI = new PanelTextInput("placeholder", 16);
		tipoPagoI.setEditable(false);
		PanelTextInput montoI = new PanelTextInput("placeholder", 16);
		montoI.setEditable(false);
		
		GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.gridwidth = 3;
		gbc2.weightx = 1;
		gbc2.weighty = 1;
		gbc2.gridx = 0;
		gbc2.gridy = 0;
        //gbc2.insets = new Insets(10, 10, 10, 10);
		panelPoliza.add(poliza,gbc2);
		
        gbc2.gridwidth = 1;
		gbc2.gridy = 1;
		panelPoliza.add(vigencia,gbc2);
		
		gbc2.gridy = 2;
		panelPoliza.add(fechaInicio,gbc2);
		
		gbc2.gridx = 1;
		panelPoliza.add(fechaFin,gbc2);
		
		gbc2.gridx = 2;
		panelPoliza.add(tipoPago,gbc2);
		
		gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
		gbc2.gridx = 0;
		gbc2.gridy = 3;
		panelPoliza.add(fechaInicioI,gbc2);
		
		gbc2.gridx = 1;
		panelPoliza.add(fechaFinI,gbc2);
		
		gbc2.gridx = 2;
		panelPoliza.add(tipoPagoI,gbc2);
		
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.anchor = GridBagConstraints.CENTER;
		gbc2.gridx = 0;
		gbc2.gridy = 4;
		panelPoliza.add(monto,gbc2);
		
        gbc2.fill = GridBagConstraints.HORIZONTAL;
        gbc2.anchor = GridBagConstraints.NORTH;
		gbc2.gridy = 5;
		panelPoliza.add(montoI,gbc2);
		
		
		
		return;
	}
	
	private void panelCuotasConfig(JPanel panelCuotas, int cantidadCuotas){
		
		CardLayout cl = new CardLayout();
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
    	
		//configurar panel container
		panelCuotas.setLayout(cl);
		panelCuotas.setBorder(border);

				
		for(int i = 1; i <= cantidadCuotas; i++) {
			

            JPanel panel = new JPanel();
            
            panel.setLayout(new GridBagLayout());
        	
        	PanelText titulo = new PanelText("Cuota " + i, "BOLD", 20, "WEST");
        	
        	PanelText premio = new PanelText("Premio", "PLAIN", 18, "SOUTHWEST");
        	PanelText importeDescuento = new PanelText("Importe por descuentos", "PLAIN", 18, "SOUTHWEST");
        	PanelText importe = new PanelText("Importe cuota", "PLAIN", 18, "SOUTHWEST");
        	PanelText inicioCuota = new PanelText("Inicio cuota", "PLAIN", 18, "SOUTHWEST");
        	PanelText ultimoDia = new PanelText("Ultimo dia de pago", "PLAIN", 18, "SOUTHWEST");

        	PanelText numero = new PanelText("" + i, "PLAIN", 18, "CENTER");
        	
        	PanelTextInput premioI = new PanelTextInput("placeholder",18);
        	premioI.setEditable(false);
        	PanelTextInput importeDescuentoI = new PanelTextInput("placeholder", 18);
        	importeDescuentoI.setEditable(false);
        	PanelTextInput importeI = new PanelTextInput("placeholder", 18);
        	importeI.setEditable(false);
        	PanelTextInput inicioCuotaI = new PanelTextInput("placeholder", 18);
        	inicioCuotaI.setEditable(false);
        	PanelTextInput ultimoDiaI = new PanelTextInput("placeholder", 18);
        	ultimoDiaI.setEditable(false);

        
        	Boton boton0 = new Boton("🡰");
        	Boton boton1 = new Boton("🡲");

        	
            GridBagConstraints gbc2 = new GridBagConstraints();
            gbc2.fill = GridBagConstraints.BOTH;
            gbc2.gridwidth = 3;
    		gbc2.weightx = 1;
    		gbc2.weighty = 1;
           // gbc2.insets = new Insets(10, 10, 10, 10);
            
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            panel.add(titulo,gbc2);
            
            gbc2.gridwidth = 1;
            gbc2.anchor = GridBagConstraints.SOUTHWEST;
            gbc2.gridy = 1;
            panel.add(premio,gbc2);
            
            gbc2.gridx = 1;
            panel.add(importeDescuento,gbc2);
            
            gbc2.gridx = 2;
            panel.add(importe,gbc2);
            
            gbc2.fill = GridBagConstraints.HORIZONTAL;
            gbc2.anchor = GridBagConstraints.NORTHWEST;
            gbc2.gridx = 0;
            gbc2.gridy = 2;
            panel.add(premioI,gbc2);
            
            gbc2.gridx = 1;
            panel.add(importeDescuentoI,gbc2);
            
            gbc2.gridx = 2;
            panel.add(importeI,gbc2);
            
            gbc2.anchor = GridBagConstraints.SOUTHWEST;
            gbc2.gridx = 0;
            gbc2.gridy = 3;
            panel.add(inicioCuota,gbc2);
            
            gbc2.gridx = 1;
            panel.add(ultimoDia,gbc2);
            
            gbc2.fill = GridBagConstraints.HORIZONTAL;
            gbc2.anchor = GridBagConstraints.NORTHWEST;
            gbc2.gridx = 0;
            gbc2.gridy = 4;
            panel.add(inicioCuotaI,gbc2);
            
            gbc2.gridx = 1;
            panel.add(ultimoDiaI,gbc2);
            
            JPanel panelBoton = new JPanel(new GridBagLayout());
            
            gbc2.fill = GridBagConstraints.NONE;
            gbc2.anchor = GridBagConstraints.CENTER;
            gbc2.gridx = 0;
            gbc2.gridy = 0;
            gbc2.insets = new Insets(0, 10, 0, 0);
            panelBoton.add(boton0,gbc2);
            
            gbc2.insets = new Insets(10, 5, 10, 15);
            gbc2.gridx = 1;
            panelBoton.add(numero,gbc2);
            
            gbc2.gridx = 2;
            panelBoton.add(boton1,gbc2);
            
            gbc2.gridheight = 2;
            gbc2.gridx = 2;
            gbc2.gridy = 3;
            panel.add(panelBoton,gbc2);
            
            panelCuotas.add(panel, ""+i);
            
            int a = i;
            
            boton0.addActionListener((ActionEvent e) -> {
        		cl.show(panelCuotas, ""+(a-1));
            });
            
            boton1.addActionListener((ActionEvent e) -> {
        		cl.show(panelCuotas, ""+(a+1));
            });
            
		}
		
		cl.show(panelCuotas, ""+1);
		
		return;
	}
	
	void cambiarPantalla(String pantalla) {
		//cambia el panel visible
		cl.show(containerPanel, pantalla);
	}
	
}
