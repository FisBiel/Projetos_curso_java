package tabuleiro;

public abstract class Peça {

    protected Posição posição;
    private Tabuleiro tabuleiro;

    public Peça(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posição = null;
    }

    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public abstract boolean[][] possivelMover();

    public boolean possivelMover(Posição posição){
        return possivelMover()[posição.getLinha()][posição.getColuna()];
    }

    public boolean possivelUmMovimento(){
        boolean[][] mat = possivelMover();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j])
                    return true;
            }
        }
        return false;
    }

}
