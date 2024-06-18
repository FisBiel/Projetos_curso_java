package xadrez.peças;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PeçaXadrez;

public class Cavalo extends PeçaXadrez {

    public Cavalo(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "C";
    }

    private boolean podeMover(Posição posição){
        PeçaXadrez p = (PeçaXadrez) getTabuleiro().peça(posição);
        return p == null || p.getCor() != getCor();
    }
    @Override
    public boolean[][] possivelMover() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        Posição p = new Posição(0, 0);

        p.setValor(posição.getLinha() - 1, posição.getColuna() - 2);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 2, posição.getColuna() - 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 2, posição.getColuna() + 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 1, posição.getColuna() + 2);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() + 2);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 2, posição.getColuna() + 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 2, posição.getColuna() - 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() - 2);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        return mat;
    }

}
