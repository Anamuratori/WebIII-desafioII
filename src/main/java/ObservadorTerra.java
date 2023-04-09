import java.util.*;

public class ObservadorTerra implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;
        List<String> eventos = new ArrayList<>(Arrays.asList("Uma caverna foi descoberta", "Um tunel foi aberto", "Nada a revelar"));

        Random rand = new Random();
        System.out.println("Observador Terra: " + eventos.get(rand.nextInt(eventos.size())));
    }
}
