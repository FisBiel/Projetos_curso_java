package xadrez.peças;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PeçaXadrez;

public class Bispo extends PeçaXadrez {

    public Bispo(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possivelMover() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];

        Posição p = new Posição(0, 0);

        p.setValor(posição.getLinha() - 1, posição.getColuna() - 1);
        while (getTabuleiro().posiçãoExistente(p) && !getTabuleiro().temPeça(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValor(p.getLinha() - 1, p.getColuna() - 1);
        }
        if(getTabuleiro().posiçãoExistente(p) && possivelComer(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 1, posição.getColuna() + 1);
        while (getTabuleiro().posiçãoExistente(p) && !getTabuleiro().temPeça(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValor(p.getLinha() - 1, p.getColuna() + 1);
        }
        if(getTabuleiro().posiçãoExistente(p) && possivelComer(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() + 1);
        while (getTabuleiro().posiçãoExistente(p) && !getTabuleiro().temPeça(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValor(p.getLinha() + 1, p.getColuna() + 1);
        }
        if(getTabuleiro().posiçãoExistente(p) && possivelComer(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() - 1);
        while (getTabuleiro().posiçãoExistente(p) && !getTabuleiro().temPeça(p)) {
            mat[p.getLinha()][p.getColuna()] = true;
            p.setValor(p.getLinha() + 1, p.getColuna() - 1);
        }
        if(getTabuleiro().posiçãoExistente(p) && possivelComer(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }
}
