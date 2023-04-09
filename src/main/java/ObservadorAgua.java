import java.util.Observable;
import java.util.Observer;

public class ObservadorAgua implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;

        if (arg.equals("Uma alga rara foi encontrada")) {
            System.out.println("Observador Agua: Uma alga rara foi encontrada");
        } else if (arg.equals("Um navio naufragou")) {
            System.out.println("Observador Agua: Um navio naufragou");
        } else {
            System.out.println("Observador Agua: Nada a declarar");
        }

    }
}
