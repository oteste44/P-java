package heranca;

public class Motocicleta extends Transporte{
    private final int LIMITE_VELOCIDADE = 200;

    public Motocicleta(String modelo, String nome, String marca, int anoFabricacao, double preco, boolean isLigado) {
        super(modelo, nome, marca, anoFabricacao, preco, isLigado);
    }

    @Override
    public void acelerar() {

        System.out.printf("A velocidade maxima da moto e {} km por hora.", LIMITE_VELOCIDADE);

        super.acelerar();
    }
}
