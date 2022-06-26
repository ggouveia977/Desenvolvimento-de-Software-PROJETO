package model;

import java.util.ArrayList;
import controller.JogadoresController;

public class Time {
    
    private String nome;
    private String pais;
    private String tecnico;

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

    public String imprimirTime(){
        return ("| Nome: "+nome+" | Pais: "+pais+" | Técnico: "+tecnico+"\n");
    }
    
    JogadoresController jogadoresController = new JogadoresController();

    public ArrayList<Jogador> getNomeJogadores(){
        return jogadoresController.puxarLista();
    }

}
