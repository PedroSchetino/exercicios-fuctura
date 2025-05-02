package ExercicioLacos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int numero = 1;

        // -- Primeiro ponto a ser observado é se o usuario se o
        // numero digitado pelo usuario for diferente de 0 = seguirá com a operação --
        while (numero != 0){
            System.out.println("Digite o número ZERO para encerrar a operação.");
            numero = sc.nextInt();

            // -- Em seguida segue o código realizar a tabuada até 10 --
            System.out.println("--- TABUADA ---");
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(i + " x " + numero + " = " + (numero * i));
            }
            soma += numero;
        }
        sc.close();
    }

}
