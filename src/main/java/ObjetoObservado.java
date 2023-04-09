import java.util.Observable;

public class ObjetoObservado extends Observable {

    public ObjetoObservado() {
    }

    public void mudouStatus() {
        System.out.println("\n>> Objeto observado mudou de status <<\n");
        setChanged();
        notifyObservers();
    }
}
