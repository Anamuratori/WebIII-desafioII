import java.util.Observable;
import java.util.Observer;

public class ObservadorTerra implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;

        if (arg.equals("Uma caverna foi descoberta")) {
            System.out.println("Observador Terra: Uma caverna foi descoberta");
        } else if (arg.equals("Um tunel foi aberto")) {
            System.out.println("Observador Terra: Um tunel foi aberto");
        } else {
            System.out.println("Observador Terra: Nada a declarar");
        }
    }
}
