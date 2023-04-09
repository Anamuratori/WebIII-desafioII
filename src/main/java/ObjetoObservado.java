import java.util.List;
import java.util.Observable;
import java.util.Random;

public class ObjetoObservado extends Observable {

    private String evento;

    public ObjetoObservado() {
    }

    public ObjetoObservado(String evento) {
        this.evento = evento;
    }
    public void eventoAleatorio (List<ObjetoObservado> eventos) {
        Random rand = new Random();
        ObjetoObservado eventoRandom = eventos.get(rand.nextInt(eventos.size()));
        System.out.println("\nObjeto Observado: " + eventoRandom + "\n");
        setChanged();
        notifyObservers(String.valueOf(eventoRandom));
    }

    @Override
    public String toString() {
        return evento;
    }
}
