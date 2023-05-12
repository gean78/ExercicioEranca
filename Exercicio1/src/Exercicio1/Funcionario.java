
package Exercicio1;

public abstract class Funcionario {
  private String nome;
  private int idade;
  private double Salario;
public abstract double CalcularBonusSalario();

public Funcionario(){

}

    public Funcionario(String nome, int idade, double Salario) {
        this.nome = nome;
        this.idade = idade;
        this.Salario = Salario;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    

    
    public String exibirDetalhes() {
        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + ", Salario=" + (Salario + CalcularBonusSalario())+ '}';
    }
  
   
  
}
