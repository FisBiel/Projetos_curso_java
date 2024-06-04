import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PeçaXadrez;
import xadrez.XadrezPosição;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while(true){
        UI.printTabuleiro(partidaXadrez.getpeças());
        System.out.println();
        System.out.print("Origem: ");
        XadrezPosição origem = UI.lerXadrezPosição(sc);

        System.out.println();
        System.out.print("Alvo: ");
        XadrezPosição alvo = UI.lerXadrezPosição(sc);

        PeçaXadrez capturaPeça = partidaXadrez.movimentaçãoXadrez(origem, alvo);

        }
    }
}
