package mx.tv.kishimoto.anime;
public class Personaje{
	private String nombre;
	private int poder;

	public Personaje(String nombre, int valoresPoder){
		this.nombre=nombre;
		if(valoresPoder>=0 && valoresPoder<=500){
			this.poder=valoresPoder;
		}else{
			this.poder=0
		}
	}
	public void setPoder(int sumaPoder){
		if (valoresPoder>=0 && valoresPoder<=500){
			this.poder += sumaPoder;
		}
	}

	public String getDatos(){
		return (nombre + "\t" + poder);
	}
}