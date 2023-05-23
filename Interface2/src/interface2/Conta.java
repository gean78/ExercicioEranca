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
public  abstract class Conta implements Movimentacoes{
   private String numero;
   private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", saldo=" + saldo + '}';
    }
   
}
