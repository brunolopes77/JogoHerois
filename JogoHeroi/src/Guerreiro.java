public class Guerreiro extends Heroi {

    private int forca;
    private int resistencia;
    private int energia;

    public Guerreiro(String nome, int nivel, int vida,
                     int forca, int resistencia, int energia) {

        super(nome, nivel, vida,"Guerreiro");

        this.forca = forca;
        this.resistencia = resistencia;
        this.energia = energia;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + forca);
        System.out.println("Resistência: " + resistencia);
        System.out.println("Energia: " + energia);
    }
}