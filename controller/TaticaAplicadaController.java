package controller;

import model.TaticaAplicada;
import java.util.ArrayList;

import interfaces.Controller;

public class TaticaAplicadaController implements Controller<TaticaAplicada>{

    private static ArrayList<TaticaAplicada> jogadoresNaTatica = new ArrayList<TaticaAplicada>();

    public ArrayList<TaticaAplicada> listar() { // lista os jogadores na tatica com suas
                                                                 // posições
        return jogadoresNaTatica;
    }
    public void adicionar(TaticaAplicada tatica) { // adiciona uma nova tatica
        jogadoresNaTatica.add(tatica);
    }

}