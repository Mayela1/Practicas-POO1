package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;

public class Prueba{
	public static void main(String[] args) {
		Universitario[] personas = {
			new Universitario(1,"Valeria"),
			new Maestro(2,"Federico",5f),
			new Alumno(3,"Hanna",80),
			new Universitario(1,"Valeria"),
			new Maestro(2,"Federico", 1000f),
			new Alumno(3,"Hanna",5)
		};
		int i = 0;
		while (i < personas.length){
			for (Universitario u : personas ) {
				if(personas[i] == u){
					System.out.println("***** " + personas[i] + " es igual a " + u + "*****");
					continue;
				}
				if(u.equals(personas[i])){
					System.out.println("** " + personas[i] + "es igual a " + u + ", son objetos diferentes **");
					continue;
				}
				System.out.println(personas[i] + " ¡= " + u);
			}
			i++;
		}
	}	
}