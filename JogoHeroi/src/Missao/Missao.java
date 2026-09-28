package Missao;

import Heroi.Heroi;

public class Missao {

    private String nome;
    private int dificuldade;
    private int recompensaOuro;
    private String heroi;
    private boolean iniciada;
    private boolean concluida;

    public Missao(String nome, int dificuldade, int recompensaOuro) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.recompensaOuro = recompensaOuro;
        this.iniciada = false;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getRecompensaOuro() {
        return recompensaOuro;
    }

    public void setRecompensaOuro(int recompensaOuro) {
        this.recompensaOuro = recompensaOuro;
    }

    public String getHeroiMissao() {
        return heroi;
    }

    public void setHeroiMissao(String heroi) {
        this.heroi = heroi;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void iniciarMissao() {
        if (heroi == null) {
            System.out.println("Nenhum herói foi designado para esta missão.");
            return;
        }

        iniciada = true;
        System.out.println("A missão '" + nome + "' foi iniciada pelo herói "
                + getHeroiMissao() + "!");
    }

    public void concluirMissao() {
        if (!iniciada) {
            System.out.println("A missão ainda não foi iniciada.");
            return;
        }

        concluida = true;

        System.out.println("A missão '" + nome + "' foi concluída!");
        System.out.println("Recompensa: " + recompensaOuro + " moedas de ouro.");
    }
}