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

        EscolaMusica escola = new EscolaMusica();

        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
    }


    public void apresentar (InstrumentoMusical)[] banda {

            System.out.println("\n=== A ORQUESTRA VAI COMEÇAR! ===");

            System.out.println("\n--- Afinação dos instrumentos --- \n");
            for (InstrumentoMusical instrumento : banda) {
                instrumento.afinar();
                System.out.println();
            }

            System.out.println("\n--- O CONCERTO INICIA! ---");
            for (InstrumentoMusical instrumento : banda) {
                instrumento.tocar();
                System.out.println();
            }
            System.out.println("\n=== O CONCERTO TERMINA! ===");
        }

        public void contarInstrumentosPorTipo(InstrumentoMusical[] banda) {
            int pianos = 0;
            int baterias = 0;
            int saxofones = 0;
            int violoes = 0;
            int outros = 0;

            for (InstrumentoMusical instrumento : banda) {
                if (instrumento instanceof Piano) {
                    pianos++;
                } else if (instrumento instanceof Bateria) {
                    baterias++;
                } else if (instrumento instanceof Saxofone) {
                    saxofones++;
                } else if (instrumento instanceof Violao) {
                    violoes++;
                } else {
                    outros++;
                }
            }

            System.out.println("\n--- Resumo de Instrumentos ---");
            System.out.println("Piano(s): " + pianos);
            System.out.println("Bateria(s): " + baterias);
            System.out.println("Saxofone(s): " + saxofones);
            System.out.println("Violão(ões): " + violoes);

            if (outros > 0) {
                System.out.println("Outros: " + outros);
            }
        }
}