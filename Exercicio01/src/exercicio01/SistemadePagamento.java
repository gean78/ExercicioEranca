
package exercicio01;


public class SistemadePagamento {

    
    public static void main(String[] args) {
      Pagamento  pagcartao  = new CartaodeCredito();
      Pagamento  pagpix  = new Pix();
      Pagamento  transfeBancario  = new TransferenciaBancaria();
      
      
      pagcartao.realizarpagamento(100);
      pagpix.realizarpagamento(250);
      transfeBancario.realizarpagamento(25000);
      
    }
    
}
