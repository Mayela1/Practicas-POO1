package mx.com.softgame.www.poo1game.personajes.malos;
import mx.com.softgame.www.poo1game.personajes.Personaje;
public class Zombie extends Personaje{
	public boolean ataque;

	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre,boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	public boolean getAtaque(){
		return ataque;
	}
	public String getDetalle(){
		return super.getDetalle()+" " + ataque;
	}
	public void decVida(){
		if (ataque == true){
			super.decVida(3);
		} else{
			super.decVida(2);
		}		 
	}
	public void decVida(int d){
		if(ataque == true ){
			super.decVida(d*3);
		} else {
			super.decVida(d*2);
		}
	}
}