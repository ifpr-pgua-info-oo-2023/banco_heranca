package ifpr.pgua.eic.info.banco;

import java.util.ArrayList;

import ifpr.pgua.eic.info.banco.entidades.Conta;
import ifpr.pgua.eic.info.banco.entidades.ContaCorrente;
import ifpr.pgua.eic.info.banco.entidades.ContaPoupanca;
import ifpr.pgua.eic.info.banco.entidades.Pessoa;

public class AppTeste {
    
    public static void main(String[] args) {
        
        ArrayList<Conta> contas = new ArrayList<>();
    
        ContaCorrente corrente;
        ContaPoupanca poupanca;

        Pessoa ze = new Pessoa("Zé", "1234", 35, 1000);
        Pessoa chico = new Pessoa("Chico","0987",18,300);

        corrente = new ContaCorrente("1234", "0123456", 
                                     chico, 15.00, 200);

        poupanca = new ContaPoupanca("1234", 
                                      "98765", ze, 0.001);

        contas.add(corrente);
        contas.add(poupanca);

        for(Conta c:contas){
            System.out.println(c.gerarExtrato());
        }

        for(Conta c:contas){
            if(c instanceof ContaPoupanca){
                ContaPoupanca aux = (ContaPoupanca)c;
                aux.render();
            }
        }

        for(Conta c:contas){
            System.out.println(c.mostrarTipo());
        }
        
    }
}
