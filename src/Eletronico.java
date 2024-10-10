public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularDesconto(double porcentagem) {
        double descontoExtra = 10;
        return preco - (preco * (porcentagem + descontoExtra) / 100);
    }
}