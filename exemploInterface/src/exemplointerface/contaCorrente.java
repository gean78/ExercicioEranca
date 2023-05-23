/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

/**
 *
 * @author geang
 */
public class contaCorrente extends Conta {

    private double limite;

    @Override
    public void depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
    }

    public contaCorrente(double limite, String numero, double saldo) {
        super(numero, saldo);
        this.limite = limite;
    }

    

    @Override
    public void sacar(double valor) {
       if((super.getSaldo()+limite)>= valor){
        super.setSaldo(super.getSaldo() - valor);
       }else{
           System.out.println("Saldo Insuficiente");
       }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo - R$" + super.getSaldo());
    }


    @Override
    public String toString() {
        return "contaCorrente{" + "limite=" + limite + '}';
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
