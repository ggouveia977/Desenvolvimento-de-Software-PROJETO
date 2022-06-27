package controller;

import java.util.ArrayList;

import interfaces.Controller;
import model.Time;

public class TimesController implements Controller<Time> {

    private static ArrayList<Time> times = new ArrayList<Time>();

    public ArrayList<Time> listar() {
        return times;
    }

    public void adicionar(Time time) {
        times.add(time); // adiciona um time ao array de times
    }

    public void atualizar(int i, Time timeUpdate) {
        times.set(i, timeUpdate); // atualiza os times na lista
    }

    public void deletar() { // deleta os times da lista
        times.clear();
    }

}
