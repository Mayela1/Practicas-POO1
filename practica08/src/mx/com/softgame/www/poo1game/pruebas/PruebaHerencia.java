package mx.com.softgame.www.poo1game.pruebas;
import mx.com.softgame.www.poo1game.personajes.*;
import mx.com.softgame.www.poo1game.personajes.buenos.Planta;
import mx.com.softgame.www.poo1game.personajes.malos.Zombie;
public class PruebaHerencia{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Miguel",99);
		Personaje per02 = new Personaje("Sarahí");
		Planta plan01 = new Planta("Angel",10,'B');
		Planta plan02 = new Planta("Giovana",50);
		Planta plan03 = new Planta("Antonio",'C');
		Planta plan04 = new Planta("Valeria");
		Zombie zom01 = new Zombie("Alan",80,false);
		Zombie zom02 = new Zombie("Mayela",true);
		Zombie zom03 = new Zombie("Carlos");
		Personaje [] personajes = {per01, per02, plan01,
		 plan02, plan03, plan04, zomb01, zomb02, zomb03};

		for (Personaje p : personajes) {
			System.out.println(p.getDetalle());
			System.out.println(p.getEscudo());
			System.out.println(p.getAtaque());
		}
	}
}