/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        Produto[] ps = new Produto[5];
        Merge merge = new Merge();
        Linear linear = new Linear();
        Binary binary = new Binary();

        lerProdutos(ps);
        
        int numeroEscolhido = getNumeroEscolhido();
        System.out.println("1 - Linear");
        System.out.println("2 - Binaria");
        int opcBusca = getOpcaoBusca();

        switch (opcBusca) {
            case 1:
                linear.find(ps, numeroEscolhido);
                if (linear.isAchou()) {
                    System.out.println("Número encontrado na(s) posição(ões): " + linear.getPosicoes());
                    System.out.println(System.getProperty("line.separator"));
                    System.out.println("Total de comparações usando a busca linear: " + linear.getTentativas());
                } else {
                    System.out.println("Número não encontrado");
                }

                break;
            case 2:
                //com erro de lógica
                merge.mergeAsc(ps, 0, ps.length - 1);
                binary.find(ps, numeroEscolhido);
                if (binary.isAchou()) {
                    System.out.println("Número encontrado na posição"+binary.getPosicao());
                    System.out.println("Total de comparações usando a busca linear: " + binary.getTentativas());
                } else {
                    System.out.println("Número não encontrado");
                }
                break;
        }
    }

    public static void lerProdutos(Produto[] ps) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ps.length; i++) {
            System.out.println((i + 1) + "ºproduto");
            Produto aux;
            aux = new Produto();
            System.out.println("Código: ");
            aux.setCodigo(scanner.nextInt());
            System.out.println("Descrição: ");
            aux.setDescricao(scanner.next());
            System.out.println("Preço: ");
            aux.setPreco(scanner.nextDouble());
            System.out.println(System.getProperty("line.separator"));

            ps[i] = aux;
        }
    }

    private static void listarProdutos(Produto[] ps) {
        for (Produto p : ps) {
            System.out.print(p.getCodigo() + ", " + p.getDescricao() + ", " + p.getPreco());
            System.out.println(System.getProperty("line.separator"));
        }
    }

    private static int getNumeroEscolhido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um código para buscar");
        return scanner.nextInt();
    }

    private static int getOpcaoBusca() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

}
