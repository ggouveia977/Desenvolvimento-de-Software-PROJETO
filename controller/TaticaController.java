package controller;

import java.util.ArrayList;
import model.Tatica;
public class TaticaController {
    private static ArrayList<Tatica> taticas = new ArrayList<Tatica>();

    
    public TaticaController() {
        Tatica taticaVoadora = new Tatica("Tatica Voadora",3, 3, 4);               //taticas criadas automaticamente
        Tatica taticaMeteoro = new Tatica("Tatica Meteoro",5, 2, 3);
        Tatica taticaPassaNada = new Tatica("Tatica Passa Nada",2, 4, 4);
        Tatica taticaBalanceada = new Tatica("Tatica Balanceada",3, 4, 3);
        taticas.add(taticaVoadora);
        taticas.add(taticaMeteoro);
        taticas.add(taticaPassaNada);
        taticas.add(taticaBalanceada);        
    }

    public ArrayList<Tatica> getTaticas(){          //método que retorna as taticas
        return taticas;
    }

    public Tatica getTatica(int opcaoEscolhida ){       //metodo que retorna a opção de tatica escolhida
        return taticas.get(opcaoEscolhida - 1);
    }

    public void addTatica(Tatica tatica){               //adiciona uma nova tatica
        taticas.add(tatica);
    }
}
