package heranca;

class ContaCorrente extends Conta{
    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    void atualiza(double taxa) {
        deposita(getSaldo() * taxa * 2);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 1);
    }
}
