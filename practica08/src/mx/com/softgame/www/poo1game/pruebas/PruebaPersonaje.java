package mx.com.softgame.www.poo1game.pruebas;
import mx.com.softgame.www.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {	   
	    Personaje per01 = new Personaje("Fernando");
	    Personaje per02 = new Personaje("Miriam" );
	    Personaje per03 = new Personaje("Christian");
	    Personaje per04 = new Personaje("Valeria");
	    Personaje per05 = new Personaje("Edwin");
	    int n = 0;
	    int m = 0;
	    while (n >= m){
	    	n = (int)(Math.random()*100);
	    	m = (int)(Math.random()*100);
	    }
	    int ed;
	    for (int i = n ; i <= m ;i++){
	    	per01.setVida(ed = (int)(Math.random()*250));
	    	if (per01.setVida(ed)){
	    		System.out.println(per01.getDetalle() + " Se modifico la edad");
	    	} else{
	    		System.out.println(per01.getDetalle() + " No se modifico la edad a " + ed);
	    	}
	    	per02.setVida(ed = (int)(Math.random()*250));
	    	if (per02.setVida(ed)){
	    		System.out.println(per02.getDetalle() + " Se modifico la edad");
	    	} else{
	    		System.out.println(per02.getDetalle() + " No se modifico la edad a " + ed);
	    	}
	    	per03.setVida(ed = (int)(Math.random()*250));
	    	if (per03.setVida(ed)){
	    		System.out.println(per03.getDetalle() + " Se modifico la edad");
	    	} else{
	    		System.out.println(per03.getDetalle() + " No se modifico la edad a " + ed);
	    	}
	    	ed = (int)(Math.random()*250);
	    	do{
	    		ed = (int)(Math.random()*250);
	    		System.out.println(ed);
	    		if (ed == 150){
	    			System.out.println("***Bingo 150***");
	    			break;
	    		}
	    		per04.setVida(ed = (int)(Math.random()*250));
	    	}while (!per04.setVida(ed));
	    	System.out.println(per04.getDetalle());
	    }
	}
}