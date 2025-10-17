public class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material)
    {
        this.nome = nome;
        this.material = material;

    }

    public abstract void tocar();

    public void afinar(){
        System.out.println("Afinando o "+ nome);
    }

    public void mostrarInformacoes()
    {
        System.out.println("Instrumento: " + nome);
        System.out.println("Material: "+ material);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}