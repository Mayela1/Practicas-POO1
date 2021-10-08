package mx.tv.kishimoto.naruto.anime;
public class Personaje{
	private String nombre;
	private int poder;
	public Personaje(String nombre, int poder){
		this.nombre=nombre;
		if(poder>=0 && poder<=500){
			this.poder=poder;
		}else{
			this.poder=0;
		}
	}
	public void setPoder(int sumaPoder){
		if (poder>=0 && poder<=500){
			poder += sumaPoder;
		}
	}
	public String getDatos(){
		return (nombre + "\t" + poder);
	}
}