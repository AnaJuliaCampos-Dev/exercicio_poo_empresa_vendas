public class gerente extends funcionario {
    
    //atributos privados
    private double bonificacao;

    public gerente (String nome, String cpf, double bonificacao){
        this.bonificacao = bonificacao;

        super(nome, cpf);

    }

    //sobrescrita do metodo calcularSalario 
    @Override
    public double calcularSalario() {
        
        double salarioMin = 1621.00;
        double salarioConsultor = bonificacao + (salarioMin * 6);
        return salarioConsultor;
    }

    //Getters e Setters
    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

}
