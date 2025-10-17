public class BateriaExercicio extends InstrumentoMusical {
    private int numeroPecas;

    public BateriaExercicio(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Fazendo a base de um rock insano no " + super.getNome() + "com " + numeroPecas + "peças!");
        System.out.println("Batendo no bumbo e pratos com energia!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das peles e o posicionamento dos pratos da bateria.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + numeroPecas);
    }
}