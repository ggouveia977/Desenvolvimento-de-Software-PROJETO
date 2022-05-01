package controller;

import java.util.ArrayList;
import model.Tatica;
public class TaticaController {
    private static ArrayList<Tatica> taticas = new ArrayList<Tatica>();

    
    public TaticaController() {
        Tatica taticaVoadora = new Tatica("Tatica Voadora",3, 3, 4);
        Tatica taticaMeteoro = new Tatica("Tatica Meteoro",5, 2, 3);
        Tatica taticaPassaNada = new Tatica("Tatica Passa Nada",2, 4, 4);
        Tatica taticaBalanceada = new Tatica("Tatica Balanceada",3, 4, 3);
        this.taticas.add(taticaVoadora);
        this.taticas.add(taticaMeteoro);
        this.taticas.add(taticaPassaNada);
        this.taticas.add(taticaBalanceada);        
    }

    public ArrayList<Tatica> getTaticas(){
        return this.taticas;
    }

    public Tatica getTatica(int opcaoEscolhida ){
        return this.taticas.get(opcaoEscolhida - 1);
    }
}
