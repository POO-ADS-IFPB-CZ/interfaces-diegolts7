package src.view;

import src.model.Conta;
import src.model.ContaPoupanca;
import src.model.Triatleta;

public class Main {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("Diego");
        ContaPoupanca contaPoupanca = new ContaPoupanca(12333, "Diego");
        triatleta.aquecer();
        triatleta.correr();
        contaPoupanca.depositar(10);
        contaPoupanca.reajustar(23.00);
        System.out.println(contaPoupanca.getSaldo());;
    }
}
