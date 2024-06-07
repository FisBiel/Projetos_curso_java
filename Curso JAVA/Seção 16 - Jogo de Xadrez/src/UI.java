import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import xadrez.PartidaXadrez;
import xadrez.Cor;
import xadrez.PeçaXadrez;
import xadrez.XadrezPosição;

public class UI {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void cleanScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static XadrezPosição lerXadrezPosição(Scanner sc){
        try{
        String s = sc.nextLine();
        char coluna = s.charAt(0);
        int linha = Integer.parseInt(s.substring(1));
        return new XadrezPosição(coluna, linha);
        }
        catch (RuntimeException e){
            throw new InputMismatchException("Erro ao acessar posição, valores validos são de a1 ate h8!");
        }
    }

    public static void printPartida(PartidaXadrez partidaXadrez, List<PeçaXadrez> captura) {
		printTabuleiro(partidaXadrez.getpeças());
		System.out.println();
        printCapturaPeça(captura);
        System.out.println();
		System.out.println("Turno : " + partidaXadrez.getTurno());
		System.out.println("Jogada Player: " + partidaXadrez.getCorPlayer());
	}


    public static void printTabuleiro(PeçaXadrez[][] peças) {
        for (int i = 0; i < peças.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < peças.length; j++) {
                printPeça(peças[i][j], false);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public static void printTabuleiro(PeçaXadrez[][] peças, boolean[][] possivelMover) {
        for (int i = 0; i < peças.length; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < peças.length; j++) {
                printPeça(peças[i][j], possivelMover[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPeça(PeçaXadrez peça, boolean background) {
        if(background){
            if(peça == null){
                System.out.print(ANSI_BLUE_BACKGROUND);
            }else{
                System.out.print(ANSI_RED_BACKGROUND);
            }
        }
        if (peça == null) {
            System.out.print("-" + ANSI_RESET);
        }
        else {
            if (peça.getCor() == Cor.Branco) {
                System.out.print(ANSI_WHITE + peça + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + peça + ANSI_RESET);
            }
        }
        System.out.print(" ");
    }

    private static void printCapturaPeça(List<PeçaXadrez> captura){
        List<PeçaXadrez> branco = captura.stream().filter(x -> x.getCor() == Cor.Branco).collect(Collectors.toList());
		List<PeçaXadrez> preto = captura.stream().filter(x -> x.getCor() == Cor.Preto).collect(Collectors.toList());
		System.out.println("Peças Capturadas:");
		System.out.print("Branco: ");
		System.out.print(ANSI_WHITE);
		System.out.println(Arrays.toString(branco.toArray()));
		System.out.print(ANSI_RESET);
		System.out.print("Amarela: ");
		System.out.print(ANSI_YELLOW);
		System.out.println(Arrays.toString(preto.toArray()));
		System.out.print(ANSI_RESET);
    }
}
