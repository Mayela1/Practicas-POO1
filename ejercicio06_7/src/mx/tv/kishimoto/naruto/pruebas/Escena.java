package mx.tv.kishimoto.naruto.pruebas;
import mx.tv.kishimoto.naruto.anime.Personaje;
public class Escena{
	public static void main(String[] args) {
		Personaje naruto = new Personaje("Naruto", 1000);
		Personaje sasuke = new Personaje ("Sasuke", -10);
		Personaje sakura = new Personaje("Sakura", 300);
		System.out.println(naruto.getDatos());
		System.out.println(sasuke.getDatos());
		System.out.println(sakura.getDatos());
		System.out.println("_ _ _");
		Personaje usumaki = naruto;
		System.out.println(usumaki.getDatos());
		System.out.println("_ _ _");
		int n;
		n= (int)(Math.random()*1000);
		while (n>500){
			System.out.println(n);
			n = (int)(Math.random()*1000);
		}
		usumaki.setPoder(n);
		System.out.println(naruto.getDatos());
	}
}