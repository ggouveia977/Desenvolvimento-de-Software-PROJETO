package controller;

import java.util.ArrayList;
import model.Jogador;

public class JogadoresController {
    
    private static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private ArrayList<Jogador> jogadoresNaposicao = new ArrayList<Jogador>();
    
    public void adicionar(Jogador jogador) {
        jogadores.add(jogador); // adiciona um jogador ao array jogadores
    }

    public ArrayList<Jogador> puxarLista() {
        return jogadores; // puxar a lista de jogadores
    }

    public void atualizar(int i, Jogador jogadorUpdate) {
        jogadores.set(i, jogadorUpdate); // atualiza os jogadores na lista
    }

    public void deletar() { // deleta os jogadores da lista
        jogadores.clear();
    }

    public ArrayList<Jogador> buscarPosicao(String posicao) {
        jogadoresNaposicao = new ArrayList<Jogador>();
        for (Jogador JogadorCadastrado : jogadores) {
            if (JogadorCadastrado.getMelhorPosicao().equals(posicao)) {
                jogadoresNaposicao.add(JogadorCadastrado);
            }
        }

        return jogadoresNaposicao;
        
        
    }

}
