package xadrez;

import tabuleiro.*;
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

    public boolean[][] possivelMover(XadrezPosição origemPosição){
        Posição posição = origemPosição.toPosição();
        validadeAtualPosição(posição);
        return tabuleiro.peça(posição).possivelMover();
    }

    public PeçaXadrez movimentaçãoXadrez(XadrezPosição origemPosição, XadrezPosição alvoPosição){
        Posição origem = origemPosição.toPosição();
        Posição alvo = alvoPosição.toPosição();
        validadeAtualPosição(origem);
        validadeAlvoPosição(origem, alvo);
        Peça capituraPeça = movimentaPeça(origem, alvo);
        return (PeçaXadrez) capituraPeça;
    }

    private Peça movimentaPeça(Posição origem, Posição alvo){
        Peça p = tabuleiro.removePeça(origem);
        Peça capturaPeça = tabuleiro.removePeça(alvo);
        tabuleiro.posiçãoPeça(p, alvo);
        return capturaPeça;
    }

    private void validadeAtualPosição(Posição posição){
        if(!tabuleiro.temPeça(posição)){
            throw new TabuleiroExeção("Não a peça nessa posição");
        }
        if(!tabuleiro.peça(posição).possivelUmMovimento()){
            throw new XadrezExeção("Não á movimentações livres para essa peça");
        }
    }

    private void validadeAlvoPosição(Posição origem, Posição alvo){
        if(!tabuleiro.peça(origem).possivelMove(alvo)){
            throw new XadrezExeção("Essa peça não pode se mover para a posição de destino!");
        }
    }

    private void lugarPeça(char coluna, int linha, PeçaXadrez peça) {
        tabuleiro.posiçãoPeça(peça, new XadrezPosição(coluna, linha).toPosição());
    }

    private void iniciaPartida() {
        lugarPeça('c', 1, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('c', 2, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('d', 2, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('e', 2, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('e', 1, new Torre(tabuleiro, Cor.Branco));
        lugarPeça('d', 1, new Rei(tabuleiro, Cor.Branco));

        lugarPeça('c', 7, new Torre(tabuleiro, Cor.Preto));
        lugarPeça('c', 8, new Torre(tabuleiro, Cor.Preto));
        lugarPeça('d', 7, new Torre(tabuleiro, Cor.Preto));
        lugarPeça('e', 7, new Torre(tabuleiro, Cor.Preto));
        lugarPeça('e', 8, new Torre(tabuleiro, Cor.Preto));
        lugarPeça('d', 8, new Rei(tabuleiro, Cor.Preto));
    }
}
