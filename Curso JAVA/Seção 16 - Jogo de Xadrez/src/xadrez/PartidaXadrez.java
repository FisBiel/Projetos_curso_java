package xadrez;

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

    private void lugarPeça(char coluna, int linha, PeçaXadrez peça) {
        tabuleiro.posiçãoPeça(peça, new XadrezPosição(coluna, linha).toPosição());
    }

    private void iniciaPartida() {
        lugarPeça('b', 6, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('c', 6, new Rei(tabuleiro, Cor.Preto));
        lugarPeça('a', 6, new Torre(tabuleiro, Cor.Branco));
    }
}
