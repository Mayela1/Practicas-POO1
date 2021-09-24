package mx.com.softgame.www.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int edad;

	public Personaje(String nombre){
		this.nombre = nombre;
	}

	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() <20) {
			this.nombre = nombre;
		}
	}

	public String getNombre(){
	    return nombre;
	}

	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}

	public int getEdad(){
		return edad;
	}

	public boolean setEdad(int edad){
		boolean result = false;
		if(edad > 0 && edad <120){
			this.edad = edad;
			result = true;
		}
	    return result;
	}
	public String getDetalle(){
		return (nombre + "\t" + edad);
	}
}