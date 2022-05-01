package view;
import utils.Console;
//import java.util.ArrayList;

//import model.Jogador;

public class Main{
    public static void main(String[] args){
        int opcao = 0;
        AdicionarJogador validarJogador = new AdicionarJogador();
        Listar listar = new Listar();

        do{
            System.out.println("1 - Montar seu time!");
            System.out.println("2 - Listar Jogadores do seu time! ");
            System.out.println("3 - Selecione uma tatica pronta! ");
            System.out.println("4 - Monte sua própria tática! ");
            opcao = Console.readInt("Digite uma das opções: ");

            switch(opcao){
                case 1:
                    validarJogador.validar();
                break;

                case 2:
                    listar.listar();
                break;  
                  
                case 3:
                    listar.listarTaticas();                  
                    opcao = Console.readInt("Digite o numero da tática escolhida: ");
                    listar.aplicarTatica(opcao);
                break;
            }
        }while(opcao != 0);
    }
}