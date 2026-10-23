import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // criando objetos de vendedor, consultor e gerente
        vendedor Saulo = new vendedor("Saulo", "256.475.658-03", 300.00, 100);

        consultor Daila = new consultor("Daila", "458.659.173-18", 500.00, 4);

        gerente Estavão = new gerente("Estevão", "549.731.854-86", 200.00);

        ArrayList<funcionario> funcionario = new ArrayList<>();
        funcionario.add(Saulo);
        funcionario.add(Daila);
        funcionario.add(Estavão);

        System.out.println("\n_________________________________________________________\n");

        for (funcionario f : funcionario) {
            System.out.println("Nome: " + f.getNome() + "  || Tipo: " + f.getClass().getSimpleName() + "  || Salário: " + f.calcularSalario());
        }
    }
}
