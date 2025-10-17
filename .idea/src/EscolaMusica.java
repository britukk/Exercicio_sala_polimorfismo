import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaMusica {

    public static void main (String[] args){
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciar a orquestra!");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new ViolaoExercicio("Violao classico", "madeira", 6);
        banda[1] = new PianoExercicio("Piano de cauda", "Madeira e metal", 88);
        banda[2] = new BateriaExercicio("Bateria acustica", "Madeira e metal", 5);
        banda[3] = new SaxofoneExercicio("Saxofone", "Latao", "Alto");
    }

    public void apresentar (InstrumentoMusical)[] banda {

    }
}