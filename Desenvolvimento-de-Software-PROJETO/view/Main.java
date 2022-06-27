package view;

import utils.Console;
import controller.*;
//import java.util.ArrayList;

//import model.Jogador;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        AdicionarJogador adicionarJogador = new AdicionarJogador();
        Aplicações aplicacoes = new Aplicações();
        JogadoresController jogadores = new JogadoresController();


        do {
            System.out.println("1 - Montar seu time!");
            System.out.println("2 - Listar Jogadores do seu time! ");
            System.out.println("3 - Selecione uma tatica pronta! ");
            System.out.println("4 - Monte sua própria tática! ");
            System.out.println("5 - Atualizar Jogador! ");
            System.out.println("6 - Deletar jogadores! ");
            System.out.println("7 - Teste! ");
            System.out.println("0 - Sair! ");
            opcao = Console.readInt("Digite uma das opções: ");

            switch (opcao) {
                case 1:
                    adicionarJogador.adicionar();
                    break;

                case 2:
                    aplicacoes.listar();
                    break;

                case 3:
                    aplicacoes.listarTaticas();
                    opcao = Console.readInt("Digite o numero da tática escolhida: ");
                    aplicacoes.aplicarTatica(opcao);
                    aplicacoes.listarJogadoresNaTatica();
                    break;

                case 4:
                    aplicacoes.montarTatica();
                    break;

                case 5:
                    aplicacoes.atualizarJogador();
                    break;

                case 6:
                    aplicacoes.deletarJogadores();
                    break;

                case 7:
                    //opcoes.distribuirTatica();
                    // System.out.println("Teste");
                System.out.println(jogadores.buscarPosicao("Ataque"));
                

            }
        } while (opcao != 0);

    }
}