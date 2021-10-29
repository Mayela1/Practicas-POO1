package edu.uaz.ingsoft.appcovid.universitarios;
public abstract class Universitario{
	private String nombre;
	private int id;
	public Universitario(int id, String nombre){
		this.nombre = nombre;
		this.id = id;
	}
	public boolean equals(Object o){
		boolean isEquals = false;
		if ( o != null && o instanceof Universitario){
			Universitario u =(Universitario) o;
			isEquals = u.nombre.equals(nombre) && u.id == id;
		}
		return isEquals;
	}
	public int hashCode(){
		return nombre.hashCode() * id;
	}
	public String toString(){
		return id + " " + nombre;
	}
	public abstract void getNota();
}
