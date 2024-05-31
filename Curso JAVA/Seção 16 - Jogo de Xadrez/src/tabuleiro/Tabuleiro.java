package tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peça[][] peças;

    public Tabuleiro(int linhas, int colunas) {
        if (linhas < 1 || colunas < 1) {
            throw new TabuleiroExeção(
                    "Erro ao criar tabuleiro: é necessario que o número de linhas e colunas seja maior que 1!");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        peças = new Peça[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peça peça(int linha, int coluna) {
        if (!posiçãoExistente(linha, coluna)) {
            throw new TabuleiroExeção("Essa posição não faz parte do tabuleiro");
        }
        return peças[linha][coluna];
    }

    public Peça peça(Posição posição) {
        if (!posiçãoExistente(posição)) {
            throw new TabuleiroExeção("Essa posição não faz parte do tabuleiro");
        }
        return peças[posição.getLinha()][posição.getColuna()];
    }

    public void posiçãoPeça(Peça peça, Posição posição) {
        if (temPeça(posição)) {
            throw new TabuleiroExeção("Já a uma peça nessa posição: " + posição);
        }
        peças[posição.getLinha()][posição.getColuna()] = peça;
        peça.posição = posição;
    }

    public boolean posiçãoExistente(int linha, int coluna) {
        return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
    }

    public boolean posiçãoExistente(Posição posição) {
        return posiçãoExistente(posição.getLinha(), posição.getColuna());
    }

    public boolean temPeça(Posição posição) {
        if (!posiçãoExistente(posição)) {
            throw new TabuleiroExeção("Essa posição não faz parte do tabuleiro");
        }
        return peça(posição) != null;
    }
}
