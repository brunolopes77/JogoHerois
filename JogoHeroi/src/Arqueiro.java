public class Arqueiro extends Heroi {

    private int precisao;
    private int agilidade;
    private int concentracao;

    public Arqueiro(String nome, int nivel, int vida,
                    int precisao, int agilidade, int concentracao) {

        super(nome, nivel, vida,"Arqueiro");

        this.precisao = precisao;
        this.agilidade = agilidade;
        this.concentracao = concentracao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nível: " + getNivel());
        System.out.println("Vida: " + getVida());
        System.out.println("Precisão: " + precisao);
        System.out.println("Agilidade: " + agilidade);
        System.out.println("Concentração: " + concentracao);
    }
}