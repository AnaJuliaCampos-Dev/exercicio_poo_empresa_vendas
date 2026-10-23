public class consultor extends funcionario {
    
    //atributos privados
    private double valorHora;
    private int horasTrabalhas;

    //Construtor
    public consultor (String nome, String cpf, double valorHora, int horasTrabalhas){
        this.valorHora = valorHora;
        this.horasTrabalhas = horasTrabalhas;

        super(nome, cpf);

    }

    //sobrescrita do metodo calcularSalario 
    @Override
    public double calcularSalario() {
        
        double salarioConsultor = valorHora * horasTrabalhas;
        return salarioConsultor;
    }

    //Getters e Setters
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhas;
    }

    public void setHorasTrabalhadas(int horasTrabalhas) {
        this.horasTrabalhas = horasTrabalhas;
    }
}
