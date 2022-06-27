package view;



import controller.TaticaAplicadaController;
import controller.TimesController;
import model.Time;

public class CadastrarTime {

    public void cadastrarTime() {

        TaticaAplicadaController taticaAplicadaController = new TaticaAplicadaController();
        TimesController times = new TimesController();
        System.out.println("\n -- cadastro jogadores -- \n");
        Time time = new Time();
        time.setNome("Real Madrid");
        time.setPais("Brasil");
        time.setTecnico("Jojo");
        time.setJogadoresNoTime(taticaAplicadaController.listar());
        times.adicionar(time);

    }
}
