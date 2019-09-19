/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

/**
 *
 * @author DLT1CA
 */
public class Merge{
    public void mergeAsc(Produto ps[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAsc(ps, inicio, meio);
            mergeAsc(ps, meio + 1, fim);
            intercalaAsc(ps, inicio, fim, meio);
        }
    }
    public Produto[] intercalaAsc(Produto ps[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Produto[] aux = new Produto[ps.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (ps[inicioVet1].getCodigo() <= ps[inicioVet2].getCodigo()) {
                aux[indiceVetorAux] = ps[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = ps[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = ps[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = ps[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            ps[i] = aux[i];
        }

        return aux;
    }
}
