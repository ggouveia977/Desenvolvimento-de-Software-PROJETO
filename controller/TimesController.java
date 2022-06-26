package controller;

import java.util.ArrayList;
import model.Time;

public class TimesController {
    
    private static ArrayList<Time> times = new ArrayList<Time>();
    
    public void adicionar(Time jogador) {
        times.add(jogador); // adiciona um jogador ao array times
    }

    public ArrayList<Time> puxarLista() {
        return times; // puxar a lista de times
    }

    public void atualizar(int i, Time timeUpdate) {
        times.set(i, timeUpdate); // atualiza os times na lista
    }

    public void deletar() { // deleta os times da lista
        times.clear();
    }
}
