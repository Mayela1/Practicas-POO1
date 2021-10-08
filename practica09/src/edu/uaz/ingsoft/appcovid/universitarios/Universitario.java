package edu.uaz.ingsoft.appcovid.universitarios;
public class Universitario{
	public nombre String;
	public Universitario(String nombre){
		this.nombre = nombre;
	}
	public boolean equals(Object o){
		boolean result = false;
		if ( (o != null) && (o instanceof Universitario)){
			Universitario d =(Universitario) o;
			if (this.nombre.equals()){
				result = true;
			}
		}
	}
}