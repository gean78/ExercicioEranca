/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;


 
public class ExemploInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta contaTauhan = new contaPoupanca(1.5, "1234", 40000);
        Conta contaMoacir = new contaCorrente(10000, "987654", 400000);
        
        contaMoacir.consultarSaldo();
        contaMoacir.depositar(5000);
        contaMoacir.consultarSaldo();
        contaMoacir.sacar(190000);
        contaMoacir.consultarSaldo();
        
        
        contaTauhan.consultarSaldo();
        contaTauhan.sacar(50000);
        contaTauhan.consultarSaldo();
        
    }
    
}
