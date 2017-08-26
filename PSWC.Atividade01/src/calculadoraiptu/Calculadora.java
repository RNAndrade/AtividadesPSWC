/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraiptu;

/**
 *
 * @author rnand
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcularIPTU c = new CalcularIPTU();
        
        //PARÂMETROS(TIPO DO IMÓVEL, VALOR DO IMÓVEL, DESCONTO)
        System.out.println(c.calcularIPTU("RESIDENCIAL", 450000.00, 0.00));
    }

}
