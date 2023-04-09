import java.util.*;

public class ObservadorAgua implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;
        List<String> eventos = new ArrayList<>(Arrays.asList("Uma alga rara foi encontrada", "Um navio naufragou", "Nada a revelar"));

        Random rand = new Random();
        System.out.println("Observador Agua: " + eventos.get(rand.nextInt(eventos.size())));
    }
}
