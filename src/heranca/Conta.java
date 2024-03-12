package heranca;

public class Conta {
    private double saldo;

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }

    void deposita(double valor) {
        saldo += valor;
    }
}
