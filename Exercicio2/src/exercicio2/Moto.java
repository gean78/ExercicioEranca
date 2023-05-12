/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author geang
 */
public class Moto extends Veiculo {
   private boolean possuiPartidaEletrica;

   
   
    public Moto(boolean possuiPartidaEletrica, String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public String exibirDetalhes() {
        return "Moto{" + super.ExibirDetalhes()+ " possuiPartidaEletrica=" + possuiPartidaEletrica + '}';
    }

    @Override
    public double CalcularvelocidadeMaxima() {
         return 180.0;
    
    }
}
