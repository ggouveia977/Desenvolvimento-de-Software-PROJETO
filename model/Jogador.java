package model;

public class Jogador extends Time{
    
    private String camisa;
    private String melhorPosicao;

    public String getNome(){
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

    public String imprimirJogadoresNoTime() {
        return ("| Nome: "+getNomeJogadores()+"|Camisa: "+camisa+" | Melhor posição: "+melhorPosicao+"\n");
    }

}
