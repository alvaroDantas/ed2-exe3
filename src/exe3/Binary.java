package exe3;

import java.util.ArrayList;

/**
 *
 * @author DLT1CA
 */
public class Binary {

    private boolean achou;
    private int posicao;
    private int inicio;
    private int fim;
    private int meio;
    private int tentativas;
    
    //<editor-fold desc="Getters and Setters">
    public boolean isAchou() {
        return achou;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public int getMeio() {
        return meio;
    }

    public int getTentativas() {
        return tentativas;
    }

   
    //</editor-fold>
    
    public void find(Produto[] ps, int numEscolhido) {
        posicao = 0;
        inicio = ps[0].getCodigo();
        fim = ps.length - 1;
        meio = 0;
        achou = false;

        while (inicio <= fim && !achou) {
            meio = (inicio + fim) / 2;
            if (numEscolhido == ps[meio].getCodigo()) {
                achou = true;
                posicao = meio;
            } else if (numEscolhido > ps[meio].getCodigo()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
                tentativas++;
            }

        }
    }
}
