import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ObservadorCeu implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ObjetoObservado objetoObservado = (ObjetoObservado) o;

        if (arg.equals("Eclipse lunar começou")) {
            System.out.println("Observador Céu: Eclipse lunar começou");
        } else if (arg.equals("Eclipse lunar terminou")) {
            System.out.println("Observador Céu: Eclipse lunar terminou");
        } else {
            System.out.println("Observador Céu: Nada a declarar");
        }
    }
}
