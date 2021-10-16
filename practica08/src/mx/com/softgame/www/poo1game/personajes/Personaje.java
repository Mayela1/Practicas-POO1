package mx.com.softgame.www.poo1game.personajes;
public class Personaje{
	private String nombre;
	private int vida;

	public Personaje(String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje(String nombre){
		this(nombre,3);
	}

	public void setNombre(String nombre){
		if (nombre.length() > 3 && nombre.length() <20) {
			this.nombre = nombre;
		}
	}

	public String getNombre(){
	    return nombre;
	}

	public int getVida(){
		return vida;
	}

	public boolean setVida(int vida){
		boolean result = false;
		if(vida > 0 && vida <100){
			this.vida = vida;
			result = true;
		}
	    return result;
	}
	public String getDetalle(){
		return (nombre + "\t" + vida);
	}

	public void decVida(){
		decVida(1);	 
	}

	public void decVida(int d){
		if ((vida - d)> 0){
			vida -= d;
		}
	}
}