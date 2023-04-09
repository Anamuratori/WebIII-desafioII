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

        ObjetoObservado evento1 = new ObjetoObservado("Eclipse lunar começou");
        ObjetoObservado evento2 = new ObjetoObservado("Eclipse lunar terminou");
        ObjetoObservado evento3 = new ObjetoObservado("Uma alga rara foi encontrada");
        ObjetoObservado evento4 = new ObjetoObservado("Um navio naufragou");
        ObjetoObservado evento5 = new ObjetoObservado("Uma caverna foi descoberta");
        ObjetoObservado evento6 = new ObjetoObservado("Um tunel foi aberto");

        List<ObjetoObservado> eventos = new ArrayList<>(Arrays.asList(evento1, evento2, evento3, evento4, evento5, evento6));

        evento.eventoAleatorio(eventos);
    }
}