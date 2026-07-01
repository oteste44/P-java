import heranca.conta;
public class banco {
    public static void main(String[] args) {
        conta cc = new conta(1001,1234,"joao",100, true);
        System.out.println("----------------------------");
        System.out.println("ContaCorrente");
        System.out.printf("Saldo Inicial CC: %.2f\n",cc.getSaldo());
//        cc.depositar(400)
//        cc.sacar(300)
        System.out.printf("Saldo Final CC: %.2f", cc.getSaldo());
    }
}
