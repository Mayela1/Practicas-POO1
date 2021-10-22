package edu.uaz.ingsoft.appcovid.pruebas;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;
import edu.uaz.ingsoft.appcovid.universitarios.alumnos.Alumno;
import edu.uaz.ingsoft.appcovid.universitarios.maestros.Maestro;
import edu.uaz.ingsoft.appcovid.utlis.Tablero;


public class PruebaUniv {
    public static void main(String[] args) {
        Tablero.mostrar();
        Tablero.insertar(new Universitario(1, "Jose Miguel"));
        Tablero.insertar(new Maestro(2 ,"Giovanna Esmeralda",10f),4);
        Tablero.insertar(new Alumno(3, "Hanna Jimena",80));
        Tablero.insertar(new Universitario(1, "Saul Alfonso"));
        Tablero.insertar(new Maestro(2, "Edwin Brayan",5000f),6);
        Tablero.insertar(new Alumno(3, "Esther Sarahi",5));
        Tablero.mostrar();
        Tablero.borrar(4);
        Tablero.borrar();
        Tablero.borrar(10);
        Tablero.mostrar();
    }
}