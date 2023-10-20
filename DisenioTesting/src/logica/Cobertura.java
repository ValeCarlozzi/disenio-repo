package logica;

import java.util.List;

public class Cobertura {
	
	private String detalle;
	private PorcentajeCobertura porcentajeActual;
	private List<PorcentajeCobertura> historial;
	
	public PorcentajeCobertura getPorcentajeActual() {
		return porcentajeActual;
	}
	public void setPorcentajeActual(PorcentajeCobertura porcentajeActual) {
		this.porcentajeActual = porcentajeActual;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public List<PorcentajeCobertura> getHistorial() {
		return historial;
	}
	public void setHistorial(List<PorcentajeCobertura> historial) {
		this.historial = historial;
	}
}
