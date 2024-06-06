import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PeçaXadrez;
import xadrez.XadrezExeção;
import xadrez.XadrezPosição;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();

        while(true){
            try{
                UI.cleanScreen();
                UI.printTabuleiro(partidaXadrez.getpeças());
                System.out.println();
                System.out.print("Origem: ");
                XadrezPosição origem = UI.lerXadrezPosição(sc);

                boolean[][] possivelMover = partidaXadrez.possivelMover(origem);
                UI.cleanScreen();
                UI.printTabuleiro(partidaXadrez.getpeças(), possivelMover);


                System.out.println();
                System.out.print("Alvo: ");
                XadrezPosição alvo = UI.lerXadrezPosição(sc);

                PeçaXadrez capturaPeça = partidaXadrez.movimentaçãoXadrez(origem, alvo);
            }
            catch(XadrezExeção e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
