package clasesPersonajes;

import java.util.ArrayList;

public class Enemigo extends Personaje{

    ArrayList<Preguntas>PreguntasEnemigos;
    ArrayList<String>Frases;

    Enemigo(){
        super("EnemigoPrueba",5,1);
    }

    Enemigo(String nombre, int numCorazones, int Danio, ArrayList<Preguntas> preguntas,ArrayList<String>Frases){
        super(nombre,numCorazones, Danio);
        this.PreguntasEnemigos = preguntas;
        this.Frases = Frases;
    }
    public  void enviarDanio(Personaje obj){
        obj.recibirDanio(this.danio);
    }

    public  void recibirDanio(int num){
        this.numCorazones -= num;
        this.validarVidaRestante();
    }
    public  boolean validarVidaRestante(){
        if (numCorazones <= 0){
            vivo = false;
            return false;
        }
        return true;
    }
}
