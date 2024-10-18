public class PessoaJuridica extends Contribuinte {

    private double numeroDeFuncionarios;

    //Metodo abstrato sobrescrito que realiza o calculo de imposto.
    @Override
    public double imposto() {
        if (getNumeroDeFuncionarios() > 10) {
            return getRendaAnual() * 0.14;
        }

        return getRendaAnual() * 0.16;
    }

    public double getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public PessoaJuridica(){

    }

    public PessoaJuridica(String nome, double rendaAnual, double numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public String toString(){
        return STR."Nome: \{getNome()}\tRenda anual: \{getRendaAnual()}\tNumero de Funcionários: \{getNumeroDeFuncionarios()}\tImposto a ser pago: \{imposto()}";
    }
}
