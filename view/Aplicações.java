package view;
import controller.JogadoresController;
import model.Jogador;
import model.Tatica;
import model.TaticaAplicada;
import model.Time;
import controller.TaticaController;
import controller.TimesController;
import utils.Console;
import java.util.ArrayList;

public class Aplicações {

    TimesController timesController = new TimesController();
    JogadoresController jogadoresController = new JogadoresController();
    TaticaController taticaController = new TaticaController();
    TaticaAplicada taticaAplicadaSalva = new TaticaAplicada();
    int idTaticaAplicada = -1;
    int contJogadores;
    
    public void listar(){

        System.out.println("LISTAGEM DE JOGADORES: "); 
        int numJogador = 1;
        for (Jogador jogadorCadastrado : jogadoresController.puxarLista()) {
            System.out.println(numJogador + "-" + jogadorCadastrado);
            numJogador++;
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
        idTaticaAplicada = opcaoEscolhida;
        TaticaAplicada novaTaticaAplicada = new TaticaAplicada();       //instanciando nova tatica aplicada
        ArrayList<Jogador> jogadoresAtaque = new ArrayList<Jogador>();  //instanciando as listas do tipo Jogador.
        ArrayList<Jogador> jogadoresDefesa = new ArrayList<Jogador>();
        ArrayList<Jogador> jogadoresMeioCampo = new ArrayList<Jogador>();

        if (jogadoresController.buscarPosicao("Ataque").size() >= minhaTatica.getNumDeJogadoresNoAtaque()){

            for(int i = 0; i < minhaTatica.getNumDeJogadoresNoAtaque(); i++){       //Enquanto o numero de jogadores no ataque for menor que o numero de jogadores no ataque da tática ele executa
                jogadoresAtaque.add(jogadoresController.buscarPosicao("Ataque").get(i));                            // adiciona os jogadores no ataque.
            }
        }

        else{
                for(int i = 0; i < jogadoresController.buscarPosicao("Ataque").size(); i++){       //Enquanto o numero de jogadores no ataque for menor que o numero de jogadores no ataque da tática ele executa
                    jogadoresAtaque.add(jogadoresController.buscarPosicao("Ataque").get(i));
                }
                int j = 0;
                do  {
                    jogadoresAtaque.add(jogadoresController.buscarPosicao("MeioCampo").get(j));
                    j++;
                    contJogadores = j;
                }
                while (jogadoresAtaque.size() < minhaTatica.getNumDeJogadoresNoAtaque());
        }
       
        
        if ((jogadoresController.buscarPosicao("MeioCampo").size() - contJogadores)>= minhaTatica.getNumDeJogadoresNoMeioDeCampo()) {
            for(int i = contJogadores; i < minhaTatica.getNumDeJogadoresNoMeioDeCampo(); i++){  //Adiciona os jogadores no meio campo
                jogadoresMeioCampo.add(jogadoresController.buscarPosicao("MeioCampo").get(i));
            }
        }
        else{
            for(int i = contJogadores; i < jogadoresController.buscarPosicao("MeioCampo").size(); i++){  //Adiciona os jogadores no meio campo
                jogadoresMeioCampo.add(jogadoresController.buscarPosicao("MeioCampo").get(i));
            }
            int j = 0;
            do  {
                    jogadoresMeioCampo.add(jogadoresController.buscarPosicao("Defesa").get(j));
                    j++;
                    contJogadores = j;
                }
                while (jogadoresMeioCampo.size() < minhaTatica.getNumDeJogadoresNoMeioDeCampo());
        }
        if ((jogadoresController.buscarPosicao("Defesa").size() - contJogadores)>= minhaTatica.getNumDeJogadoresNaDefesa()) {
            for(int i = contJogadores; i < minhaTatica.getNumDeJogadoresNaDefesa(); i++){       //Adiciona os jogadores da defesa
                jogadoresDefesa.add(jogadoresController.buscarPosicao("Defesa").get(i));
            }
        }
        else{
            for(int i = contJogadores; i < jogadoresController.buscarPosicao("Defesa").size(); i++){  //Adiciona os jogadores no meio campo
                jogadoresDefesa.add(jogadoresController.buscarPosicao("Defesa").get(i));
            }
            int j = jogadoresMeioCampo.size();
            do  {
                jogadoresDefesa.add(jogadoresController.buscarPosicao("MeioCampo").get(j));
                j++;
                
            }while (jogadoresDefesa.size() < minhaTatica.getNumDeJogadoresNaDefesa());
        }

        novaTaticaAplicada.setAtaque(jogadoresAtaque);              //Seta os jogadores da tatica na Tatica aplicada
        novaTaticaAplicada.setDefesa(jogadoresDefesa);
        novaTaticaAplicada.setMeioCampo(jogadoresMeioCampo);

        this.taticaAplicadaSalva = novaTaticaAplicada;
        
    
    }
      
    //todo verificar se eu tenho 10 jogadores para aplicar uma tatica, caso não, mandar uma mensagem de erro "você nao tem 10 jogadores! favor adicione 10"
    
    public void listarJogadoresNaTatica(){

        System.out.println("LISTAGEM DE JOGADORES NA TATICA: ");     
            System.out.println("Jogadores Ataque: "+ "\n" + this.taticaAplicadaSalva.getAtaque());
            System.out.println("Jogadores Defesa: "+ "\n"  + this.taticaAplicadaSalva.getDefesa());
            System.out.println("Jogadores Meio Campo: " + "\n" + this.taticaAplicadaSalva.getMeioCampo());
        
   }
   public void atualizarJogador(){

        JogadoresController jogadoresTest = new JogadoresController();
        this.listar();
        int jogadorEscolhido = Console.readInt("Escolha o numero jogador que quer alterar: ");
        Jogador jogador = new Jogador();
        jogador.setNome(Console.readString("Nome do jogador: "));
        jogador.setCamisa(Console.readString("Camisa do jogador: "));        
        jogador.setMelhorPosicao(Console.readString("Melhor posição do jogador: "));
        jogadoresTest.atualizar(jogadorEscolhido - 1, jogador);
        this.listar();

        if(idTaticaAplicada >= 0){
            this.aplicarTatica(idTaticaAplicada);
            this.listarJogadoresNaTatica();
        }
   }

   public void deletarJogadores(){

       jogadoresController.deletar();
   }

   public void montarTatica(){

        String nome = Console.readString("Escreva o nome da tática: ");
        int ataque = Console.readInt("Escreva quantos jogadores terão no ataque: ");
        int defesa = Console.readInt("Escreva quantos jogadores terão na defesa: ");
        int meioCampo = Console.readInt("Escreva quantos jogadores terão no meio de campo: ");

        if(ataque + defesa + meioCampo == 10){
            Tatica tatica = new Tatica(nome, ataque, defesa, meioCampo);
            taticaController.addTatica(tatica);
        }else{
            System.out.println("Numero de jogadores invalido");
        }

   }   
}


    

