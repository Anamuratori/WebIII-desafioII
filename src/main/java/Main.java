import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjetoObservado evento = new ObjetoObservado();

        ObservadorCeu obsCeu = new ObservadorCeu();
        ObservadorAgua obsAgua = new ObservadorAgua();
        ObservadorTerra obsTerra = new ObservadorTerra();

        evento.addObserver(obsCeu);
        evento.addObserver(obsAgua);
        evento.addObserver(obsTerra);

        evento.mudouStatus();
    }
}