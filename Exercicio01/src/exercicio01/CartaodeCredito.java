/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author geang
 */
public class CartaodeCredito implements Pagamento{

    @Override
    public void realizarpagamento(double valor) {
        System.out.println("Cartao de Credito"+valor);
    }
    
}
