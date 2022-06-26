package model;

import java.util.ArrayList;

public class TaticaAplicada {
    private ArrayList<Jogador> ataque = new ArrayList<Jogador>();
    private ArrayList<Jogador> meioCampo = new ArrayList<Jogador>();
    private ArrayList<Jogador> defesa = new ArrayList<Jogador>();

    public ArrayList<Jogador> getDefesa() {
        return defesa;
    }

    public void setDefesa(ArrayList<Jogador> defesa) {
        this.defesa = defesa;
    }

    public ArrayList<Jogador> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Jogador> ataque) {
        this.ataque = ataque;
    }

    public ArrayList<Jogador> getMeioCampo() {
        return meioCampo;
    }

    public void setMeioCampo(ArrayList<Jogador> meioCampo) {
        this.meioCampo = meioCampo;
    }

}
