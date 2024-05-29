package xadrez;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.peças.*;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        iniciaPartida();
    }

    public PeçaXadrez[][] getpeças() {
        PeçaXadrez[][] mat = new PeçaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getLinhas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PeçaXadrez) tabuleiro.peça(i, j);
            }
        }
        return mat;
    }

    private void iniciaPartida() {
        tabuleiro.posiçãoPeça(new Torre(tabuleiro, Cor.Branco), new Posição(2, 1));
    }
}
