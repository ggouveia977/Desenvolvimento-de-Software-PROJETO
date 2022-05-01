package view;
import controller.JogadoresController;
import model.Jogador;
import model.Tatica;
import model.TaticaAplicada;
import controller.TaticaController;
import java.util.ArrayList;

public class Listar {
    JogadoresController jogadoresController = new JogadoresController();
    TaticaController taticaController = new TaticaController();
    
    
    public void listar(){
            System.out.println("LISTAGEM DE JOGADORES: "); 
            for (Jogador jogadorCadastrado : jogadoresController.listar()) {
                System.out.println(jogadorCadastrado);
            }
       }

    public void listarTaticas(){
        int numeroDaOpcao = 1; 
        System.out.println("LISTAGEM DE TATICAS: "); 
        for (Tatica taticaExistentes : taticaController.getTaticas()) {
            System.out.println("#" + numeroDaOpcao + " " + taticaExistentes.getDetalhesTatica());
            numeroDaOpcao++;
        }
    } 

    //aplicar a Tatica na Tatica Aplicada...

    public void aplicarTatica(int opcaoEscolhida){  //pega a opção de tática escolhida... 
        Tatica minhaTatica = taticaController.getTatica(opcaoEscolhida); //Novo objeto de Tatica que pega a opção escolhida.
        //System.out.println(minhaTatica.getDetalhesTatica());


        TaticaAplicada novaTaticaAplicada = new TaticaAplicada();       //instanciando nova tatica aplicada

        ArrayList<Jogador> jogadoresAtaque = new ArrayList<Jogador>();  //instanciando as listas do tipo Jogador.
        ArrayList<Jogador> jogadoresDefesa = new ArrayList<Jogador>();
        ArrayList<Jogador> jogadoresMeioCampo = new ArrayList<Jogador>();

        for(int i = 0; i < minhaTatica.getNumDeJogadoresNoAtaque(); i++){       //Enquanto o numero de jogadores no ataque for menor que o numero de jogadores no ataque da tática ele executa
            Jogador jogadorSelecionado = jogadoresController.listar().get(i);   //Pega um jogador na posição i da lista de jogadores cadastrados.
            jogadoresAtaque.add(jogadorSelecionado);                            // adiciona os jogadores no ataque.
        }

        for(int i = 0; i < minhaTatica.getNumDeJogadoresNaDefesa(); i++){       //Adiciona os jogadores da defesa
            int contDefesa = minhaTatica.getNumDeJogadoresNoAtaque();
            int posicaoProximoJogador = contDefesa + i;  
            Jogador jogadorSelecionado = jogadoresController.listar().get(posicaoProximoJogador);
            jogadoresDefesa.add(jogadorSelecionado);
        }
        
        for(int i = 0; i < minhaTatica.getNumDeJogadoresNoMeioDeCampo(); i++){  //Adiciona os jogadores no meio campo
            int contMeioCampo = minhaTatica.getNumDeJogadoresNaDefesa();
            int posicaoProximoJogador = contMeioCampo + i;
            Jogador jogadorSelecionado = jogadoresController.listar().get(posicaoProximoJogador);
            jogadoresMeioCampo.add(jogadorSelecionado);
        }

        novaTaticaAplicada.setAtaque(jogadoresAtaque);
        novaTaticaAplicada.setDefesa(jogadoresDefesa);
        novaTaticaAplicada.setMeioCampo(jogadoresMeioCampo);
        

        


       

       // jogadoresAtaque.add(jogador.getAtaque());




        //novaTaticaAplicada.setAtaque(ataque);

        
        //todo verificar se eu tenho 10 jogadores para aplicar uma tatica, caso não, mandar uma mensagem de erro "você nao tem 10 jogadores! favor adicione 10"
        //todo aplicar a tatica (minhatatica.getataque)
    }

}
    

