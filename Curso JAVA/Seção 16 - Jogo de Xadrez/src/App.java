import xadrez.PartidaXadrez;

public class App {
    public static void main(String[] args) throws Exception {

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printTabuleiro(partidaXadrez.getpeças());
    }
}
