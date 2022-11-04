package clasesPersonajes;

public interface MetodosCombate {
    void recibirDanio(int num);
    void enviarDanio(Personaje obj);
    boolean validarVidaRestante();
}
