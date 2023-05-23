/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author geang
 */
public class contaPoupanca extends Conta {
  private double taxaRendimento;

    @Override
    public void depositar(double valor) {
             super.setSaldo(super.getSaldo()+valor);
 
    }

    @Override
    public void sacar(double valor) {
        if(super.getSaldo()>= valor){ 
        super.setSaldo(super.getSaldo()-valor);
        }
    }

    public contaPoupanca(double taxaRendimento, String numero, double saldo) {
        super(numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo -R$"+super.getSaldo()); 
        
    }

    @Override
    public String toString() {
        return "contaPoupanca{" + "taxaRendimento=" + taxaRendimento + '}';
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public contaPoupanca(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
