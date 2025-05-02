package ExercicioLacos;

import java.util.Scanner;

public class LacoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 1234;
        int tentativas = 1; // a tribuido valor 1 para contar quantidade de tentativas
        int limiteTentativas = 3;

        // -- Loop While para repetir o código até que digite a senha correta
        while (tentativas <= limiteTentativas) {
            System.out.println("Tentativa #" + tentativas);
            System.out.println("Insira sua senha");
            int senha = sc.nextInt();

            if (senha == senhaCorreta) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Senha incorreta.");
                System.out.println("Restam " + (limiteTentativas - tentativas) + " tentativas");
                // -- lógica basica para limitar o numero de tentativas
            }
            tentativas++; // contador
        }
        if (tentativas > 3) {
            System.out.println("Senha bloqueada!");
        }
    }
}
