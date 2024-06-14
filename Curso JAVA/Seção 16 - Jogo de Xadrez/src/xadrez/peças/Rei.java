package xadrez.peças;

import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PartidaXadrez;
import xadrez.PeçaXadrez;

public class Rei extends PeçaXadrez {

    private PartidaXadrez partidaXadrez;

    public Rei(Tabuleiro tabuleiro, Cor cor, PartidaXadrez partidaXadrez) {
        super(tabuleiro, cor);
        this.partidaXadrez = partidaXadrez;
    }

    @Override
    public String toString() {
        return "K";
    }

    private boolean podeMover(Posição posição){
        PeçaXadrez p = (PeçaXadrez) getTabuleiro().peça(posição);
        return p == null || p.getCor() != getCor();
    }

    private boolean testeTorre(Posição posição){
        PeçaXadrez p = (PeçaXadrez)getTabuleiro().peça(posição);
        return p != null && p instanceof Torre && p.getCor() == getCor() && p.getMoviCont() == 0;
    }
    @Override
    public boolean[][] possivelMover() {
        boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
        Posição p = new Posição(0, 0);

        p.setValor(posição.getLinha() - 1, posição.getColuna());
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna());
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 1, posição.getColuna() - 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() - 1, posição.getColuna() + 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() - 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha() + 1, posição.getColuna() + 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha(), posição.getColuna() - 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        p.setValor(posição.getLinha(), posição.getColuna() + 1);
        if(getTabuleiro().posiçãoExistente(p) && podeMover(p)){
            mat[p.getLinha()][p.getColuna()] = true;
        }

        //Especial

        if(getMoviCont() == 0 && !partidaXadrez.getCheck()){
            Posição posT1 = new Posição(posição.getLinha(), posição.getColuna() + 3);
            if(testeTorre(posT1)){
                Posição p1 = new Posição(posição.getLinha(), posição.getColuna() + 1);
                Posição p2 = new Posição(posição.getLinha(), posição.getColuna() + 2);
                if(getTabuleiro().peça(p1) == null && getTabuleiro().peça(p2) == null){
                    mat[posição.getLinha()][posição.getColuna() + 2] = true;
                }
            }
            Posição posT2 = new Posição(posição.getLinha(), posição.getColuna() - 4);
            if(testeTorre(posT2)){
                Posição p1 = new Posição(posição.getLinha(), posição.getColuna() - 1);
                Posição p2 = new Posição(posição.getLinha(), posição.getColuna() - 2);
                Posição p3 = new Posição(posição.getLinha(), posição.getColuna() - 3);
                if(getTabuleiro().peça(p1) == null && getTabuleiro().peça(p2) == null && getTabuleiro().peça(p3) == null){
                    mat[posição.getLinha()][posição.getColuna() - 2] = true;
                }
            }
        }

        return mat;
    }

}
