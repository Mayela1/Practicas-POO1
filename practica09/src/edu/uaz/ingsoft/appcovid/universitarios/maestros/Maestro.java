package edu.uaz.ingsoft.appcovid.universitarios.maestros;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
public class Maestro extends Universitario{
	private float sueldo;

	public Maestro(int id, String nombre, float sueldo){
		super(id, nombre);
		setSueldo(sueldo);
	}

	public Maestro(int id, String nombre){
		this(id, nombre, 1000f);
	}

	public void setSueldo(float sueldo){
		this.sueldo = (sueldo >= 100f && sueldo<= 20000f) ? sueldo : 1000f ;	
	}

	public boolean equals(Object o){
		boolean isEqu = false;
		if (super.equals(o) && o instanceof Maestro){
			Maestro m = (Maestro) o;
			isEqu = (m.sueldo == sueldo);
		}
		return isEqu;
	}	
	public int hashCode(){
		return super.hashCode() * ((int) sueldo);
	}
	public String toString(){
		return super.toString() + sueldo;
	}
}