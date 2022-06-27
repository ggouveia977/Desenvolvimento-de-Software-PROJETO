
package view;

import java.util.ArrayList;
import controller.JogadoresController;
import model.Jogador;

public class AdicionarJogador {
  ArrayList<Jogador> jogadores = new ArrayList<Jogador>(11);

  public void adicionar() {
    JogadoresController jogadoresController = new JogadoresController();
    System.out.println("\n -- cadastro jogadores -- \n");

    Jogador jogador1 = new Jogador();
    jogador1.setNome("Marcelo1 ");
    jogador1.setCamisa("1");
    jogador1.setMelhorPosicao("Ataque");
    jogadoresController.adicionar(jogador1);

    Jogador jogador2 = new Jogador();
    jogador2.setNome("Marcelo2 ");
    jogador2.setCamisa("2");
    jogador2.setMelhorPosicao("Defesa");
    jogadoresController.adicionar(jogador2);

    Jogador jogador3 = new Jogador();
    jogador3.setNome("Marcelo3 ");
    jogador3.setCamisa("3");
    jogador3.setMelhorPosicao("MeioCampo");
    jogadoresController.adicionar(jogador3);

    Jogador jogador4 = new Jogador();
    jogador4.setNome("Marcelo4");
    jogador4.setCamisa("4");
    jogador4.setMelhorPosicao("Ataque");
    jogadoresController.adicionar(jogador4);

    Jogador jogador5 = new Jogador();
    jogador5.setNome("Marcelo5 ");
    jogador5.setCamisa("5");
    jogador5.setMelhorPosicao("Defesa");
    jogadoresController.adicionar(jogador5);

    Jogador jogador6 = new Jogador();
    jogador6.setNome("Marcelo6 ");
    jogador6.setCamisa("6");
    jogador6.setMelhorPosicao("MeioCampo");
    jogadoresController.adicionar(jogador6);

    Jogador jogador7 = new Jogador();
    jogador7.setNome("Marcelo7 ");
    jogador7.setCamisa("7");
    jogador7.setMelhorPosicao("Ataque");
    jogadoresController.adicionar(jogador7);

    Jogador jogador8 = new Jogador();
    jogador8.setNome("Marcelo8 ");
    jogador8.setCamisa("8");
    jogador8.setMelhorPosicao("Defesa");
    jogadoresController.adicionar(jogador8);

    Jogador jogador9 = new Jogador();
    jogador9.setNome("Marcelo9 ");
    jogador9.setCamisa("9");
    jogador9.setMelhorPosicao("MeioCampo");
    jogadoresController.adicionar(jogador9);

    Jogador jogador10 = new Jogador();
    jogador10.setNome("Marcelo10 ");
    jogador10.setCamisa("10");
    jogador10.setMelhorPosicao("MeioCampo");
    jogadoresController.adicionar(jogador10);
  }
}
// System.out.println("\n -- cadastro jogadores -- \n");
// JogadoresController jogadoresController = new JogadoresController();
// do {
// Jogador jogador = new Jogador();
// jogador.setNome(Console.readString("Nome do jogador: "));
// jogador.setCamisa(Console.readString("Camisa do jogador: "));
// jogador.setMelhorPosicao(Console.readString("Melhor posição do jogador: "));
// } while (jogadoresController.puxarLista().size() < 10);
// }Jogador jogador = new Jogador();

// LISTAR JOGADOR
// ------------------------------------------------------------------------
