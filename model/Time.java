package model;

import java.util.ArrayList;


import controller.JogadoresController;

public class Time {

    private String nome;
    private String pais;
    private String tecnico;
    private ArrayList<TaticaAplicada> jogadoresNoTime = new ArrayList<TaticaAplicada>();

    public ArrayList<TaticaAplicada> getJogadoresNoTime() {
        return jogadoresNoTime;
    }

    public void setJogadoresNoTime(ArrayList<TaticaAplicada> jogadoresNoTime) {
        this.jogadoresNoTime = jogadoresNoTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | País: " + pais + " | Tecnico: " + tecnico + "\n| Jogadores: \n" + jogadoresNoTime;
    }

    JogadoresController jogadoresController = new JogadoresController();

    public ArrayList<Jogador> getNomeJogadores() {
        return jogadoresController.listar();
    }
    
    
}
