package mx.com.softgame.www.poo1game.personajes.buenos;
import  mx.com.softgame.www.poo1game.personajes.Personaje;
public class Planta extends Personaje{
	public char escudo;
	public Planta(String nombre,int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo;
	}
	public Planta(String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta(String nombre, int vida){
		this(nombre,vida,'A');
	}
	public Planta(String nombre){
		this(nombre,3,'A');
	}

	public char getEscudo(){
		return escudo;
	}
	public void decVida(){
		if (escudo == 'A'){
			super.decVida(2);
		} else{
			super.decVida();
		}		 
	}
	public void decVida(int d){
		if(escudo == 'A'){
			super.decVida(d*2);
		} else {
			super.decVida();
		}
	}
	public String getDetalle(){
		return super.getDetalle()+" " + escudo;
	}
}