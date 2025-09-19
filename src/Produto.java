public class Produto {
    // Atributos (encapsulados)

    private String nome;
    private double preco;
    private int quantidade;

    // Construtor metodo chamado ao criar objeto.
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    // usando o setter para colocar valores
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // usando o getter para acessar valores
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Metodo para mostrar informações do produto
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------");
    }
}
