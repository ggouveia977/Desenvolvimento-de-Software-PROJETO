package controller;
import java.util.ArrayList;
import model.Jogador;



public class JogadoresController {

    private static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();

    public void adicionar(Jogador jogador){
        jogadores.add(jogador);
    }

    public ArrayList<Jogador> listar(){
        return jogadores;
    }

 
}
