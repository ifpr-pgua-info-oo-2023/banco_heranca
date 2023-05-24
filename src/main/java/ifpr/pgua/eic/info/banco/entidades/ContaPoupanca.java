package ifpr.pgua.eic.info.banco.entidades;

public class ContaPoupanca extends Conta{
    
    private double taxaRendimento;
    private double rendimento;

    public ContaPoupanca(String agencia, String numero, 
                         Pessoa cliente, double taxaRendimento) {
        super(agencia, numero, cliente);
        this.taxaRendimento = taxaRendimento;
        this.rendimento = 0.0;
    }

    public double getRendimento() {
        return rendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String gerarExtrato(){
        String texto = "";

        texto = super.gerarExtrato();

        texto = texto + " Taxa de rendimento:"+taxaRendimento;
        texto = texto + " Rendimento:"+rendimento;

        return texto;
    }

    public void render(){
        rendimento = rendimento + (saldo*taxaRendimento);
    }

    public String mostrarTipo(){
        return "Conta Poupanca";
    }

}
