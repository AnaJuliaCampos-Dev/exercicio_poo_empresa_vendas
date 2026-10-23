public class funcionario {

    //atributos privados
    private String nome;
    private String cpf;

    //construtor
    public funcionario (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    //
    public double calcularSalario() {
        return 0.0;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}