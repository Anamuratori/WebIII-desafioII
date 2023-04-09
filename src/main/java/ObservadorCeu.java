import java.util.*;

public class ObservadorCeu implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;
        List<String> eventos = new ArrayList<>(Arrays.asList("Eclipse lunar começou", "Um cometa passou", "Nada a revelar"));


        Random rand = new Random();
        System.out.println("Observador Ceu: " + eventos.get(rand.nextInt(eventos.size())));
    }
}
