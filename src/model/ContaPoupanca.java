package src.model;

public class ContaPoupanca extends Conta implements Investimento {
    public ContaPoupanca(int numero, String nomeTitular){
        super(numero, nomeTitular);
    }

    @Override
    public void reajustar(double valor){
        this.depositar(this.getSaldo() * valor);
    }
}
