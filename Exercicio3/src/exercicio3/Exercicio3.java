/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author geang
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto1 = new Livro("Mauri", "Use a Cabeça", 250.23);
        Produto produto2 = new CD("Zeca Pagodinho", "Vida Boa", 15.23);
        
        
        
        System.out.println(produto1.exibirDetalhes());
        System.out.println(produto2.exibirDetalhes());
        
    }
    
}
    
    

