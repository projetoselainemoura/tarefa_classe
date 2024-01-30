/**
 * classe carro
 */
public class Carro {
    // Atributos relaciondos ao carro
    private String modelo;
    private int anoFabricacao;
    private double preco;

    // Construtores da classe
    public Carro(String modelo, int anoFabricacao, double preco) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
    }

    // Método que mostra as informacoes do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Preço: R$ " + preco);
    }

