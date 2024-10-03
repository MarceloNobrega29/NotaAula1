public class Produto {

    private String nome, cor;
    private double valor, peso, especie;
    private int codigo, quantidade, quantidadeProdutos;
    public double troco, novoEstoque, vendaDesconto, cartao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEspecie() {
        return especie;
    }

    public void setEspecie(double especie) {
        this.especie = especie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void valorTotalCartao() {
        cartao = valorTotal();
    }

    public void removerPodutos() {
        novoEstoque = quantidade - quantidadeProdutos;
    }

    public void desconto() {
        vendaDesconto = valorTotal() * 0.95;
    }

    public void trocoEspecie() {
        troco = especie - vendaDesconto;
    }

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public double valorEstoque() {
        return  valor * quantidade;
    }

    public double valorTotal() {
        return quantidadeProdutos * valor;
    }
    public int rep = 0;

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }
    public String toString() {
        return nome
                + "\nCor: " + cor
                + "\nValor: $ " + String.format("%.2f", valor, " Reais")
                + "\nCódigo do produto: " + codigo
                + "\nPeso do produto: " + String.format("%.2f", peso)
                + "\nQuantidade no Stock: " + quantidade
                + "\nValor do Estoque: $ " + String.format("%.2f", valorEstoque());
    }
}
