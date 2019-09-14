package exe3;

import java.util.ArrayList;

/**
 *
 * @author DLT1CA
 */
public class Linear {

    private boolean achou;
    private int tentativas;
    private ArrayList posicoes = new ArrayList();

    public boolean isAchou() {
        return achou;
    }

    public int getTentativas() {
        return tentativas;
    }

    public ArrayList getPosicoes() {
        return posicoes;
    }

    public void find(Produto[] ps, int numEscolhido) {
        int i = 0;
        achou = false;
        tentativas = 0;
        int n = ps.length;

        while (i < n) {
            if (ps[i].getCodigo() == numEscolhido) {
                achou = true;
                posicoes.add(i);
            } else {
                tentativas++;
            }
            i++;
        }
    }
}
