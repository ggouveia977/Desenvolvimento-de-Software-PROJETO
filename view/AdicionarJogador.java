
package view;


import java.util.ArrayList;

import controller.JogadoresController;
import model.Jogador;
import utils.Console;

public class AdicionarJogador {
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>(11);
    public void validar(){
        JogadoresController jogadoresController = new JogadoresController();
        //do{
        Jogador jogador = new Jogador();        
        System.out.println("\n -- cadastro jogadores -- \n");
        //jogador.setNome(Console.readString("Nome do jogador: "));
        jogador.setNome("Marcelo1 ");
        //jogador.setCamisa(Console.readString("Camisa do jogador: "));        
        //jogador.setMelhorPosicao(Console.readString("Melhor posição do jogador: "));
        jogador.setCamisa("10 ");
        jogador.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);
        //}while(jogadoresController.listar().size() < 10);

        Jogador jogador2 = new Jogador();        
        jogador2.setNome("Marcelo2 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador3 = new Jogador();        
        jogador2.setNome("Marcelo3 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador4 = new Jogador();        
        jogador2.setNome("Marcelo4 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador5 = new Jogador();        
        jogador2.setNome("Marcelo5 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador6 = new Jogador();        
        jogador2.setNome("Marcelo6 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador7 = new Jogador();        
        jogador2.setNome("Marcelo7 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador8 = new Jogador();        
        jogador2.setNome("Marcelo8 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador9 = new Jogador();        
        jogador2.setNome("Marcelo9 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);

        Jogador jogador10 = new Jogador();        
        jogador2.setNome("Marcelo10 ");
        jogador2.setCamisa("11 ");
        jogador2.setMelhorPosicao("Ataque");
        jogadoresController.adicionar(jogador);
    }
    }

    // LISTAR JOGADOR ------------------------------------------------------------------------


  

