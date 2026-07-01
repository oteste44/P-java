package heranca;

public class Transporte {
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;
    private double custoManutencao;
    private int anoFabricacao;
    private double preco;
    private boolean isLigado;



    public Transporte(String modelo, String nome, String marca, int anoFabricacao,double preco, boolean isLigado) {
        this.modelo = modelo;
        this.nome = nome;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.isLigado = isLigado;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getCustoManutencao() {
        return custoManutencao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void ligar(){
        this.isLigado = true;
        System.out.println("ligando motores");
    }
    public void desligar(){
        this.isLigado = false;
        System.out.println("desligando motores");
    }
    public void acelerar(){};

    public void freiar(){
        System.out.println("freando");}






}
