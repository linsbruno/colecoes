import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class separador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite os nomes e gêneros separados por vírgula. Para verificar a lista com os nomes e os generos, digite 'sair'.");

        // Loop para ler os dados do console
        while (true) {
            System.out.print("Digite o nome e o gênero: ");
            String input = scanner.nextLine();

            // Verificar se o usuário quer sair
            if (input.equalsIgnoreCase("sair")) {
                break;
            }

            // Adicionar à lista
            pessoas.add(input);
        }

        // Separar as pessoas por gênero
        Map<String, List<String>> grupos = separarPorGenero(pessoas);

        // Imprimir os grupos
        System.out.println("\nGrupos separados por gênero:");
        for (Map.Entry<String, List<String>> entry : grupos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<String, List<String>> separarPorGenero(List<String> pessoas) {
        Map<String, List<String>> grupos = new HashMap<>();

        for (String pessoa : pessoas) {
            // Dividir a entrada usando split
            String[] partes = pessoa.split(", ");

            if (partes.length == 2) {
                String nome = partes[0];
                String genero = partes[1];

                // Adicionar à lista correspondente ao gênero
                grupos.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);
            } else {
                System.out.println("Entrada inválida: " + pessoa);
            }
        }

        return grupos;
    }
}
