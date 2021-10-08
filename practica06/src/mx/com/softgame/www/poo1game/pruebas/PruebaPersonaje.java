package mx.com.softgame.www.poo1game.pruebas;
import mx.com.softgame.www.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {
		
	    Personaje alumno = new Personaje("Kal El");
	    alumno.saludar();
	    System.out.println("Nombre: " + alumno.getNombre() + " Edad: " + alumno.getEdad());
	    System.out.println("Modificando el nombre " + alumno.getNombre());
	    alumno.setNombre("Michael jordan");
	    alumno.saludar();
	    if (!alumno.setEdad(30)){
	    	System.out.println("Edad sin cambios");
	    }
	    System.out.println("Nombre: " +alumno.getNombre()+ "Edad: "+alumno.getEdad());
	    System.out.println("Modificando edad en 130");
	    if(!alumno.setEdad(130)){
	    	System.out.println("Edad sin cambio");
	    }
	    System.out.println("Nombre: "+alumno.getNombre()+ "Edad: " + alumno.getEdad());
	    Personaje per01 = new Personaje("Aline",200);
	    Personaje per02 = new Personaje("Valeria",10);
	    Personaje per03 = new Personaje("Federico",1);
	    Personaje per04 = new Personaje("Mayela",-10);
	    Personaje per05 = new Personaje("Edwin",500);
	    System.out.println(per01.getDetalle());
	    System.out.println(per02.getDetalle());
	    System.out.println(per03.getDetalle());
	    System.out.println(per04.getDetalle());
	    System.out.println(per05.getDetalle());
	    Personaje per06 = per05;
	    Personaje per07 = per04;
	    Personaje per08 = per03;
	    Personaje per09 = per02;
	    Personaje per10 = per01;
	    per06.setNombre("Patrick Alberto Camilo");
	    per08.setNombre("Hanna");
	    per10.setNombre("jorge Abraham");
	    int n;
	    per07.setEdad (n = (int)(Math.random()*1000));
	    per09.setEdad (n = (int)(Math.random()*1000));
	    System.out.println(per01.getDetalle());
	    System.out.println(per02.getDetalle());
	    System.out.println(per03.getDetalle());
	    System.out.println(per04.getDetalle());
	    System.out.println(per05.getDetalle());
	}
}