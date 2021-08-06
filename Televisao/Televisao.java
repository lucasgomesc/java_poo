package POO.Televisao;

import java.util.Scanner;

public class Televisao {
    public static void main(String[] args) {
        ControleRemoto[] c = new ControleRemoto[1];

        c[0] = new ControleRemoto(0, 1);
        int opcao = 10, e;

        System.out.println("1 - Aumentar volume");
        System.out.println("2 - Diminuir volume");
        System.out.println("3 - Aumentar numero do canal");
        System.out.println("4 - Diminuir numero do canal");
        System.out.println("5 - Trocar para canal indicado");
        System.out.println("6 - Consultar o valor do volume de som e o canal selecionado");
        System.out.println("0 - Desligar!");

        Scanner input = new Scanner(System.in);

        while (opcao != 0) {
            opcao = input.nextInt();
            if (opcao == 1) {
                c[0].aumentarVolume();
            } else if (opcao == 2) {
                c[0].diminuirVolume();
            } else if (opcao == 3) {
                c[0].aumentarCanal();
            } else if (opcao == 4) {
                c[0].diminuirCanal();
            } else if (opcao == 5) {
                System.out.println("CANAL >");
                c[0].escolherCanal(input.nextInt());
            } else if (opcao == 6) {
                System.out.println(c[0].consulta());
            } else if (opcao == 0) {
                    System.out.println("Desligando aparelho...");
            } else {
                System.out.println("Opção Invalida");
            }
        }
    }
}

