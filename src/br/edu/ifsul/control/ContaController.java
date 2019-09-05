package br.edu.ifsul.control;

import br.edu.ifsul.model.ContaCorrente;
import br.edu.ifsul.model.ContaPoupanca;

public class ContaController {

    public static void main(String[] args) {
	    ContaCorrente cc = new ContaCorrente(1000.00);
        ContaPoupanca cp = new ContaPoupanca(500.00);

        System.out.println("Contas criadas");
        System.out.println(cc);
        System.out.println(cp);
    }
}
