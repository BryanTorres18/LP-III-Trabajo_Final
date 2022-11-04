package clasesPersonajes;

public class PersonajePrincipal extends Personaje{

    static int contJugadoresTotales;
    int corazonesExtra = 0;
    int rachaRespuestasCorrecta = 0;

    PersonajePrincipal(){
        super("JugadorPrueba",5,1);
        contJugadoresTotales++;
    }

    PersonajePrincipal(String nombre, int numCorazones){
        super(nombre,numCorazones,1);
        contJugadoresTotales++;
    }

    public void validarCorazonesExtra(){
        if (corazonesExtra > 3) {
            this.corazonesExtra = 3;
        }
    }
    public void chequearRacha(){

    }

    public int getDanio(int valor){
        return this.danio;
    }

    public int getCorazonesExtra() {
        return this.corazonesExtra;
    }


}
