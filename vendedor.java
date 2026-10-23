public class vendedor extends funcionario {
    
    //atributos privados
    private double comissao;
    private int numeroVendas;

    public vendedor (String nome, String cpf, double comissao, int numeroVendas){
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;

        super(nome, cpf);

    }

    //sobrescrita do metodo calcularSalario 
    @Override
    public double calcularSalario() {
        
        double salarioMin = 1621.00;
        double salarioVendedor = salarioMin + (comissao * numeroVendas);
        return salarioVendedor;
    }

    //Getters e Setters
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

}
