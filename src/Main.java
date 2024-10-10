public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Produto tv = new Eletronico("TV", 5000.00);
        Produto camisa = new Vestuario("Camisa", 500.00);
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(camisa);
        System.out.println("Preços dos produtos:");
        estoque.exibirPrecosComDesconto(15);
    }
}
