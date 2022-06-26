package model;

import controller.JogadoresController;
import controller.TaticaController;

public class Opcoes {

    int idTaticaAplicada = -1;
    
    JogadoresController jogadoresController = new JogadoresController();
    TaticaController taticacontroller = new TaticaController();
    Jogador jogadorComMelhorPosicaoAtacante = new Jogador();
    TaticaAplicada taticaAplicada = new TaticaAplicada();
    String posicao = jogadorComMelhorPosicaoAtacante.getMelhorPosicao();

    // public void jogadoresNoAtaque(int opcaoescolhida) {
    //     jogadorComMelhorPosicaoAtacante = jogadoresController.buscarPosicao("Ataque");

    // }
}

// ArrayList<String> posicao = new ArrayList<String>();
// posicao.add("jorless");