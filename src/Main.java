import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // usado arrei para armazenar em formato de lista os produtos

        ArrayList<Produto> produtos = new ArrayList<>();

        String resposta;
        // usado o do-while pára garantir que seja perguntado toda vez ate o usuario não querer mais cadastrar produto

        do {
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // limpar e permitir digitar outro

            // Fase de adicionando à lista o produto criado
            Produto produto = new Produto(nome, preco, quantidade);
            produtos.add(produto);

            System.out.println("Produto cadastrado! Deseja cadastrar outro? (sim/não) ");
            resposta = scanner.nextLine();
        } while (resposta.equalsIgnoreCase("sim"));

        // Mostrar todos os produtos cadastrados

        System.out.println("\n=== Produtos Cadastrados ===");

        // usei o for para garantir que seja acessado e mostrado todos os produtos cadastrado
        for (Produto p : produtos) {
            p.mostrarInfo();
        }

        scanner.close();
    }
}
