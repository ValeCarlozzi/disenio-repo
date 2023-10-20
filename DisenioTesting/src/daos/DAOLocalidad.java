package daos;

import java.util.ArrayList;
import java.util.List;

import logica.Localidad;
import logica.Pais;
import logica.Provincia;

public class DAOLocalidad {

	public List<Pais> obtenerPaises(){
		//consulta al orm
		return new ArrayList<Pais>();
	}
	
	public List<Provincia> obtenerProvincias(Pais pais){
		//consutla al orm
		return new ArrayList<Provincia>();
	}
	
	public List<Localidad> obtenerLocalidades(Provincia provincia){
		//consutla al orm
		return new ArrayList<Localidad>();
	}
}
