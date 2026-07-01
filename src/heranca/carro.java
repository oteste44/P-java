package heranca;

public class carro extends Transporte{

    private final int LIMITE_VELOCIDADE = 160;

    public carro(String modelo, String nome, String marca, int anoFabricacao, double preco, boolean isLigado) {
        super(modelo, nome, marca, anoFabricacao, preco, isLigado);
    }


    @Override
    public void acelerar() {

        System.out.printf("A velocidade maxima de um carro e {} km por hora", LIMITE_VELOCIDADE);
        super.acelerar();
    }

}
