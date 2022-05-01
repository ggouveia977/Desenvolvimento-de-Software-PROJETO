
package view;


import java.util.ArrayList;

import controller.JogadoresController;
import model.Jogador;
import utils.Console;

public class AdicionarJogador {
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>(11);
    public void validar(){
        JogadoresController jogadoresController = new JogadoresController();
        do{
        Jogador jogador = new Jogador();        
        System.out.println("\n -- cadastro jogadores -- \n");
        jogador.setNome(Console.readString("Nome do jogador: "));
        jogador.setCamisa(Console.readString("Camisa do jogador: "));        
        jogador.setMelhorPosicao(Console.readString("Melhor posição do jogador: "));
        jogadoresController.adicionar(jogador);
        }while(jogadoresController.listar().size() < 3);
    }
    }

    // LISTAR JOGADOR ------------------------------------------------------------------------


  

