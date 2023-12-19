import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ordenador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes. Para sair, digite 'sair'.");

        // Loop para ler os dados do console
        while (true) {
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            // Verificar se o usuário quer sair
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            // Adicionar à lista
            nomes.add(nome);
        }

        // Ordenar os nomes em ordem alfabética
        Collections.sort(nomes);

        // Imprimir os nomes em ordem alfabética
        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
