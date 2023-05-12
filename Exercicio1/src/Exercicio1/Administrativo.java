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
public class Administrativo extends Funcionario {
private String setor;

    public Administrativo(String setor, String nome, int idade, double Salario) {
        super(nome, idade, Salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    @Override
    public String toString() {
        return "Administrativo{" + "setor=" + setor + '}';
    }
    @Override
    public double CalcularBonusSalario() {
    return super.getSalario()*0.05;
    }
    
}
