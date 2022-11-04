package clasesPersonajes;


public abstract class Personaje implements MetodosCombate {

    String nombre;
    int numCorazones;
    int danio;
    boolean vivo;
    Personaje(){
        this.nombre = "PersonajePrueba";
        this.numCorazones = 3;
        this.danio = 1;
        this.vivo = true;
    }
    Personaje(String nombre, int HP, int Danio) {
        this.nombre = nombre;
        this.numCorazones = HP;
        this.danio = Danio;
        this.vivo = true;
    }

    public void enviarDanio(Personaje obj){
        obj.recibirDanio(this.danio);
    }

    public void recibirDanio(int num){
        this.numCorazones -= num;
        this.validarVidaRestante();
    }
    public boolean validarVidaRestante(){
        if (numCorazones <= 0){
            vivo = false;
            return false;
        }
        return true;
    }
}
