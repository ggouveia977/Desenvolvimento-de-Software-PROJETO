package model;

public class Jogador {
    private String nome;
    private String camisa;
    private String melhorPosicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getMelhorPosicao() {
        return melhorPosicao;
    }

    public void setMelhorPosicao(String melhorPosicao) {
        this.melhorPosicao = melhorPosicao;
    }

    @Override
    public String toString() {
        return ("|Jogador: " + nome + "| Camisa: " + camisa + "| Melhor posição: " + melhorPosicao + "\n");
    }

}
