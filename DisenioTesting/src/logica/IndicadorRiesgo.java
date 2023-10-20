package logica;
import java.util.Date;

public class IndicadorRiesgo {
	private Float porcentajeIndicador;
	private Date inicioVigencia;
	private Date finVigencia;
	private Usuario usuarioEditor;
	
	public IndicadorRiesgo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IndicadorRiesgo(Float porcentajeIndicador, Date inicioVigencia, Date finVigencia) {
		super();
		this.porcentajeIndicador = porcentajeIndicador;
		this.inicioVigencia = inicioVigencia;
		this.finVigencia = finVigencia;
	}
	public Float getPorcentajeIndicador() {
		return porcentajeIndicador;
	}
	public void setPorcentajeIndicador(Float porcentajeIndicador) {
		this.porcentajeIndicador = porcentajeIndicador;
	}
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	public Date getFinVigencia() {
		return finVigencia;
	}
	public void setFinVigencia(Date finVigencia) {
		this.finVigencia = finVigencia;
	}
	public Usuario getUsuarioEditor() {
		return usuarioEditor;
	}
	public void setUsuarioEditor(Usuario usuarioEditor) {
		this.usuarioEditor = usuarioEditor;
	}
	
}
