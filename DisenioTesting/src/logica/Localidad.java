package logica;

import java.util.List;

public class Localidad {
	private String nombreLocalidad;
	private Provincia provincia;
	private IndicadorRiesgo indicadorActual;
	private List<IndicadorRiesgo> historialIndicadorRiesgo;

	public Localidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Localidad(String nombreLocalidad) {
		super();
		this.nombreLocalidad = nombreLocalidad;
	}

	public String getNombreLocalidad() {
		return nombreLocalidad;
	}

	public void setNombreLocalidad(String nombreLocalidad) {
		this.nombreLocalidad = nombreLocalidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public IndicadorRiesgo getIndicadorActual() {
		return indicadorActual;
	}

	public void setIndicadorActual(IndicadorRiesgo indicadorActual) {
		this.indicadorActual = indicadorActual;
	}

	public List<IndicadorRiesgo> getHistorialIndicadorRiesgo() {
		return historialIndicadorRiesgo;
	}

	public void setHistorialIndicadorRiesgo(List<IndicadorRiesgo> historialIndicadorRiesgo) {
		this.historialIndicadorRiesgo = historialIndicadorRiesgo;
	}
	
}
