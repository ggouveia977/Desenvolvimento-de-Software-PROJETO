package model;

public class Jogador extends Time {

    private String camisa;
    private String melhorPosicao;

    public String getNome() {
        return camisa;
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

        return " Nome: " + super.getNome() + " Camisa: " + camisa + " Melhor Posição: " + melhorPosicao + "\n";
    }

}
