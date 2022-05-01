package model;

public class Tatica {
    private String nome;
    private int ataque;
    private int defesa;
    private int meioCampo;  

    public Tatica(String nome, int ataque, int defesa, int meioCampo){
        this.setNome(nome);
        this.ataque = ataque;
        this.defesa = defesa;
        this.meioCampo = meioCampo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public int getNumDeJogadoresNoAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getNumDeJogadoresNaDefesa() {
        return defesa;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public int getNumDeJogadoresNoMeioDeCampo() {
        return meioCampo;
    }
    public void setMeioCampo(int meioCampo) {
        this.meioCampo = meioCampo;
    }

    public String getDetalhesTatica(){
        return "" + this.ataque + "-" + this.defesa + "-" + this.meioCampo;
    }
}


