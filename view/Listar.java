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
    
    public void aplicarTatica(int opcaoEscolhida){
        Tatica minhaTatica = taticaController.getTatica(opcaoEscolhida);
        //System.out.println(minhaTatica.getDetalhesTatica());


        TaticaAplicada novaTaticaAplicada = new TaticaAplicada();

        ArrayList<Jogador> jogadoresAtaque = new ArrayList<Jogador>();
        ArrayList<Jogador> jogadoresDefesa = new ArrayList<Jogador>();
        ArrayList<Jogador> jogadoresMeioCampo = new ArrayList<Jogador>();

        for(int i = 0; i < minhaTatica.getNumDeJogadoresNoAtaque(); i++){
            Jogador jogadorSelecionado = jogadoresController.listar().get(i);
            jogadoresAtaque.add(jogadorSelecionado);
        }

        for(int i = 0; i < minhaTatica.getNumDeJogadoresNaDefesa(); i++){
            Jogador jogadorSelecionado = jogadoresController.listar().get(i);
            jogadoresDefesa.add(jogadorSelecionado);
        }

        for(int i = 0; i < minhaTatica.getNumDeJogadoresNoMeioDeCampo(); i++){
            Jogador jogadorSelecionado = jogadoresController.listar().get(i);
            jogadoresMeioCampo.add(jogadorSelecionado);
        }

        


       

       // jogadoresAtaque.add(jogador.getAtaque());




        //novaTaticaAplicada.setAtaque(ataque);

        
        //todo verificar se eu tenho 10 jogadores para aplicar uma tatica, caso não, mandar uma mensagem de erro "você nao tem 10 jogadores! favor adicione 10"
        //todo aplicar a tatica (minhatatica.getataque)
    }

}
    

