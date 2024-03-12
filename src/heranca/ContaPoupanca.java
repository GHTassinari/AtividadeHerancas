package heranca;

class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo){
        super(saldo);
    }

    @Override
    void atualiza(double taxa) {
        deposita(getSaldo() * taxa * 3);
    }


}
