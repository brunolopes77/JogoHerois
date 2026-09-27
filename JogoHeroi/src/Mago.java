public class Mago extends Heroi {

    private int mana;
    private int poderMagico;
    private int inteligencia;

    public Mago(String nome, int nivel, int vida,
                int mana, int poderMagico, int inteligencia) {

        super(nome, nivel, vida,"Mago");

        this.mana = mana;
        this.poderMagico = poderMagico;
        this.inteligencia = inteligencia;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Mana: " + mana);
        System.out.println("Poder Mágico: " + poderMagico);
        System.out.println("Inteligência: " + inteligencia);
    }
}