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
public class CalcularIPTU {

    Double iptu_desconto;
    Double iptu;
    String retorno;

    public String calcularIPTU(String tipo, Double valor, Double desconto) {
        Imovel i = new Imovel();
        i.setTipo(tipo);
        i.setValor(valor);

        if (!tipo.equals("RESIDENCIAL") && !tipo.equals("NÃO RESIDENCIAL") && !tipo.equals("TERRITORIAL")) {
            retorno = "TIPO DE IMÓVEL INVÁLIDO";
        } else {
            CalcularFaixas c = new CalcularFaixas();
            iptu = c.calcularfaixas(i);

            if (desconto > 0.3 * iptu) {
                retorno = "DESCONTO INVÁLIDO: MAIOR QUE 30%!";

            } else {
                iptu_desconto = iptu - desconto;
                retorno = iptu_desconto.toString();
                if (iptu == 0.0){
                    retorno = "ISENTO";
                }
            }
        }

        return retorno;
    }
}
