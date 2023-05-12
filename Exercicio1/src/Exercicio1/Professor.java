/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author geang
 */
public class  Professor  extends Funcionario{
    private String Disciplina;

    public Professor(String Disciplina, String nome, int idade, double Salario) {
        super(nome, idade, Salario);
        this.Disciplina = Disciplina;
    }

   

    public String getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "Disciplina=" + Disciplina + '}';
    }

    
    @Override
    public double CalcularBonusSalario() {
    return super.getSalario()*0.1;
    }
    
    
}
