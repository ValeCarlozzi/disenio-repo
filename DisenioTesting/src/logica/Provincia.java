package logica;

public class Provincia {
	private String nombreProvincia;
	private Pais pais;

	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provincia(String nombreProvincia) {
		super();
		this.nombreProvincia = nombreProvincia;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
