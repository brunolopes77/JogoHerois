package Heroi;

public abstract class Heroi{
    private String nome;
    private int nivel;
    private int vida;
    private String classe;

    public Heroi(String nome, int nivel, int vida, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }



    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Classe: " + classe);
    }
}