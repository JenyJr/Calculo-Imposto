public class PessoaFisica extends Contribuinte {

    private final double gastosComSaude;

    //Metodo abstrato sobrescrito que realiza o calculo de imposto.
    @Override
    public double imposto() {
        if (getRendaAnual() < 2000){
            if (getGastosComSaude() > 0){
                return ((getRendaAnual() * 0.15) * 0.5) - (getGastosComSaude() * 0.5);
            }
            return getRendaAnual() * 0.15;
        }

        else {
            if (getGastosComSaude() > 0){
                return (getRendaAnual() * 0.25) - (getGastosComSaude() * 0.5);
            }
            return getRendaAnual() * 0.25;
        }
    }

    //construtor
    public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public String toString(){
        return STR."Nome: \{getNome()}\tRenda anual: R$\{getRendaAnual()}\tTotal gasto com Saude: R$\{getGastosComSaude()}\tImposto a ser pago: R$\{imposto()}";
    }
}
