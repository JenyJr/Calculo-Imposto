import java.util.*;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int numContribunites;

        Scanner sc = new Scanner(System.in);

        List<Contribuinte> listaContribuintes = new ArrayList<>();

        System.out.println("Insira o numero de Contribuintes: ");
        numContribunites = sc.nextInt();
        sc.useDelimiter("\n");

        //iteração adicionando cada valor em uma lista
        for (int i = 1; i <= numContribunites; i++) {
            System.out.println(STR."Dados do Contribuinte #0\{i}:");
            System.out.println("Pessoa Fisica ou Juridica? ");
            char contribuinte = sc.next().charAt(0);

            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (contribuinte == 'f') {
                System.out.println("gasto com Saude: ");
                double gastoSaude = sc.nextDouble();

                listaContribuintes.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            }

            else if (contribuinte == 'j') {
                System.out.println("Numero de funcionarios");
                int numFuncionario = sc.nextInt();

                listaContribuintes.add(new PessoaJuridica(nome, rendaAnual, numFuncionario));
            }
        }

        System.out.println();

        //usando o foreach para percorrer cada elemento da lista e usando o polimorfismo para acessar o imposto de cada elemento.
        System.out.println("Pagamento de taxas: ");
        for (Contribuinte contribuinte: listaContribuintes){
            System.out.printf(STR."\{contribuinte.getNome()}: \{String.format("%.2f", contribuinte.imposto())}\n");
        }

        double soma = 0.0;
        for (Contribuinte contribuinte: listaContribuintes){
            soma += contribuinte.imposto();
        }

        System.out.println();
        System.out.println(STR."Total de taxas: \{String.format("%.2f", soma)}");

        sc.close();
    }
}
