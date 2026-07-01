package heranca;

public class Aeronaves extends Transporte{
    private final int LIMITE_VELOCIDADE = 460;

    public Aeronaves(String modelo, String nome, String marca, int anoFabricacao, double preco, boolean isLigado) {
        super(modelo, nome, marca, anoFabricacao, preco, isLigado);
    }

    @Override
    public void acelerar() {
        System.out.printf("O limite de velocidade da aeronave e {} km por hora.");
        super.acelerar();
    }

    public void Voar(){
        System.out.println("Voando");
    }
    public void decolar(){
        System.out.println("Decolar");
    }


}
