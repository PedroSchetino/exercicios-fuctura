package ExercicioLacos;

import java.util.Scanner;

public class ValidadorSenha {

    public static void main(String[] args) {

        Scanner entradaUsuario = new Scanner(System.in); // O Scanner é criado uma vez

        // Loop While para que a condição só seja concluída assim que atenda as
        // exigências de validação final
        while (true) {

            // Reset das variaveis para cada NOVA tentativa de senha
            boolean contemLetraMaiuscula = false;
            boolean contemLetraMinuscula = false;
            boolean contemEspacos = false;
            boolean contemNumeros = false;
            Boolean contemCaracterEspecial = false;
            // Não precisamos resetar o tamanho, pois ele é calculado a cada loop

            // Menu
            System.out.println("\n--- Validador de Senha ---");
            System.out.println("Crie uma senha conforme solicitado:");
            System.out.println("1. Deve ter entre 6 e 12 caracteres.");
            System.out.println("2. Deve conter pelo menos uma letra maiúscula.");
            System.out.println("3. Deve conter pelo menos uma letra minúscula.");
            System.out.println("4. Deve conter pelo menos um número.");
            System.out.println("5. Não pode conter espaços em branco.");
            System.out.println("6. Não pode conter caracteres especiais.");

            System.out.print("Digite sua Senha: ");

            // Armazena senha do usuário na memória da var
            String senhaUsuario = entradaUsuario.nextLine();

            // Calcular o tamanho da senha uma vez por tentativa
            int tamanhoSenha = senhaUsuario.length();

            // --- Lógica de Verificação dos TIPOS de Caracteres ---
            // O loop deve percorrer a senha para levantar as bandeiras.
            for (int i = 0; i < tamanhoSenha; i++) {

                // Pegamos o caractere na posição atual i
                char caractereAtual = senhaUsuario.charAt(i);

                // Cadeia de condições: análise de cada caractere para levantar as bandeiras
                if (Character.isUpperCase(caractereAtual)) {
                    contemLetraMaiuscula = true;
                } else if (Character.isLowerCase(caractereAtual)) {
                    contemLetraMinuscula = true;
                } else if (caractereAtual == ' ') {
                    contemEspacos = true;
                } else if (Character.isDigit(caractereAtual)) {
                    contemNumeros = true;
                } else {
                    contemCaracterEspecial = true;
                    break;
                }

                // Paramos cedo se JÁ encontramos todos os requisitos POSITIVOS E não
                // encontramos o NEGATIVO (espaço)
                if (contemLetraMaiuscula && contemLetraMinuscula && contemNumeros && !contemEspacos && !contemCaracterEspecial) {
                    break;
                }
            }
            // --- Fim da Lógica de Verificação dos Tipos ---

            // --- Bloco de código que retorna as mensagens ao usuário ---
            if (tamanhoSenha >= 6 && tamanhoSenha <= 12 && contemLetraMaiuscula && contemLetraMinuscula && contemNumeros
                    && !contemEspacos && !contemCaracterEspecial) {

                System.out.println("\n--- Senha Válida! ---");
                break; // CORREÇÃO: break para sair do loop while(true) APENAS quando a senha é
                // totalmente válidaV

            } else {
                // Se a senha não é válida, listamos TODOS os erros DENTRO DESTE ELSE.
                System.out.println("\n--- Senha Inválida! Verifique os requisitos: ---");

                if (tamanhoSenha < 6 || tamanhoSenha > 12) {
                    System.out.println("- A senha deve ter entre 6 e 12 caracteres. (Atual: " + tamanhoSenha + ")");
                }
                if (!contemLetraMaiuscula) {
                    System.out.println("- Deve conter pelo menos uma letra maiúscula.");
                }
                if (!contemLetraMinuscula) {
                    System.out.println("- Deve conter pelo menos uma letra minúscula.");
                }
                if (!contemNumeros) {
                    System.out.println("- Deve conter pelo menos um número.");
                }
                if (contemEspacos) {
                    System.out.println("- Não pode conter espaços em branco.");
                }
                if (contemCaracterEspecial) {
                    System.out.println("- Não pode conter caracteres especiais.");
                }
            }
        }
        // Fim do WHILE(true)

        entradaUsuario.close();
        System.out.println("Validador de senha encerrado."); // Mensagem final
    }

}
