package edu.uaz.ingsoft.appcovid.universitarios.alumnos;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.utlis.Calificacion;
public class Alumno extends Universitario{
	private float promedio;
	private Calificacion[] calificaciones = new int[5];

	public Alumno(int id, String nombre){
		super(id, nombre);
	}

	public void setCalif(int calif){
		this.calif = (calif >= 0 && calif<= 10) ? calif : 5 ;	
	}

	public boolean equals(Object o){
		boolean isEqu = false;
		if (super.equals(o) && o instanceof Alumno){
			Alumno a = (Alumno) o;
			isEqu = (a.calif == calif);
		}
		return isEqu;
	}	
	public int hashCode(){
		return super.hashCode() * calif;
	}
	public String toString(){
		return "Alumno" + super.toString() + calif;
	}
	public void setCalificaciones(){
		for (int i = 0 ; i < calificaciones.lenght ; i ++ ) {
			calificaciones[i].CERO;
		}
	}
	public void setCalificaciones(){

	}
}