package edu.uaz.ingsoft.appcovid.utlis;
import edu.uaz.ingsoft.appcovid.universitarios.Universitario;

public class Tablero {

    private static final int MAX=5;
    private static int poss=-1;
    private static Universitario[] personas= new Universitario[MAX];
    
    private Tablero(){}

    public static void mostrar(){
        if(personas == null){
            System.out.println("-");
        }
        else{
            System.out.println("*El tablero contiene*");
            for(int i=1;i<MAX;i++){
                if(personas[i] == null){
                    
                    System.out.println("-");
                }
                else{
                System.out.println(personas[i]);
                }
            }
            System.out.println("******");
        }
    }

    public static void insertar(Universitario u){
        poss+=1;
        if(poss>personas.length){
            System.out.println("Imposible insertar en "+ poss);
        }
        else{
            personas[poss]=u;
        }    
    }

    public static void insertar(Universitario u, int idx){
        idx=+1;
        if(idx>personas.length){
            System.out.println("Imposible insertar en "+ idx);
        }
        else{
            personas[idx]=u;
        }
    }

    public static void borrar(){
        if(poss>personas.length){
            System.out.println("Es imposible borrar en "+poss);
        }
        else{
            personas[poss]=null;
            poss=-1;
        }
    }

    public static void borrar(int idx){
        if(idx>personas.length){
            System.out.println("Es imposible borrar en "+idx);
        }
        else{
            personas[idx]=null;
        }
    } 
}