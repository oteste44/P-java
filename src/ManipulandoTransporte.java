import heranca.Aeronaves;
import heranca.Motocicleta;
import heranca.Transporte;
import heranca.carro;

public class ManipulandoTransporte {
    public static void main(String[] args) {
        Transporte carro = new carro("top", "fuscao", "volks", 1999, 7000, true);
        Transporte moto = new Motocicleta("2024", "tiguer 660", "thriunf", 2024, 50000, true);
        Transporte aviao = new Aeronaves("11/9", "osama biladen", "habbibs",2001, -90000000, false);
    }
}
