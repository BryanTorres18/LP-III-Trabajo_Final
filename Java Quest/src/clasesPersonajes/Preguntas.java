package clasesPersonajes;

public class Preguntas{
    private String Pregunta;
    private String RespuestaCorrecta;

    // metodos
    public static boolean verificar_respuesta(String supuestaRespuesta, String respuestaCorrecta){
        if (supuestaRespuesta.equals(respuestaCorrecta)) {
            return false;
        }else{
            return true;
        }

    }

}
