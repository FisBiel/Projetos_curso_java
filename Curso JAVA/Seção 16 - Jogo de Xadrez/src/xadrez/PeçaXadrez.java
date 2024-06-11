package xadrez;

import tabuleiro.Peça;
import tabuleiro.Posição;
import tabuleiro.Tabuleiro;

public abstract class PeçaXadrez extends Peça {

    private Cor cor;
    private int moviCont;

    public PeçaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    public XadrezPosição getXadrezPosição() {
		return XadrezPosição.fromPosição(posição);
	}

    protected boolean possivelComer(Posição posição){
        PeçaXadrez p = (PeçaXadrez) getTabuleiro().peça(posição);
        return p != null && p.getCor() != cor;
    }

    public int getMoviCont() {
        return moviCont;
    }

    public void incrementaNMovimento(){
        moviCont++;
    }

    public void decrimentaNMovimento(){
        moviCont--;
    }


}
