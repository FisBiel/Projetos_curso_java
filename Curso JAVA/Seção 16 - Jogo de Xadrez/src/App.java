import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PeçaXadrez;
import xadrez.XadrezExeção;
import xadrez.XadrezPosição;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        List<PeçaXadrez> captura = new ArrayList<>();

        while(!partidaXadrez.getCheckMate()){
            try{
                UI.cleanScreen();
                UI.printPartida(partidaXadrez, captura);
                System.out.println();
                System.out.print("Origem: ");
                XadrezPosição origem = UI.lerXadrezPosição(sc);

                boolean[][] possivelMover = partidaXadrez.possivelMover(origem);
                System.out.println("batata");
                UI.cleanScreen();
                UI.printTabuleiro(partidaXadrez.getpeças(), possivelMover);


                System.out.println();
                System.out.print("Alvo: ");
                XadrezPosição alvo = UI.lerXadrezPosição(sc);

                PeçaXadrez capturaPeça = partidaXadrez.movimentaçãoXadrez(origem, alvo);

                if(capturaPeça != null){
                    captura.add(capturaPeça);
                }

                if(partidaXadrez.getPromo() != null){
                    System.out.println("Qual peça você deseja: (B/N/R/Q)");
                    String type = sc.nextLine();
                    partidaXadrez.substituirPromo(type);
                }
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
        UI.cleanScreen();
        UI.printPartida(partidaXadrez, captura);
    }
}
