package heranca;

public class conta {
    private int agencia;
    private int numeroConata;
    private String titularConta;
    private double saldo;
    private boolean isAtiva;

    public conta(int agencia, int numeroConata, String titularConta, double saldo, boolean isAtiva) {
        this.agencia = agencia;
        this.numeroConata = numeroConata;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.isAtiva = isAtiva;

    }

    public boolean isAtiva() {
        return isAtiva;
    }

    public void setAtiva(boolean ativa) {
        isAtiva = ativa;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public int getNumeroConata() {
        return numeroConata;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){this.saldo += valor;}

