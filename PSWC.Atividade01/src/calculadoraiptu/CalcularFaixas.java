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
public class CalcularFaixas {

    Double faixa1;
    Double faixa2;
    Double faixa3;
    Double faixa4;
    Double faixa5;
    Double faixa6;
    Double faixa7;
    Double iptu;

    Imovel i = new Imovel();

    public Double calcularfaixas(Imovel i) {
        switch (i.getTipo()) {
            case "RESIDENCIAL":
                if (i.getValor() <= 47724) {
                    iptu = 0.0;
                }
                if (i.getValor() > 47724 && i.getValor() <= 95450) {
                    faixa1 = i.getValor() * 0.006;
                    iptu = faixa1;
                } else if (i.getValor() > 95450 && i.getValor() <= 238626) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = (i.getValor() - 95450) * 0.007;
                    iptu = faixa1 + faixa2;
                } else if (i.getValor() > 238626 && i.getValor() <= 417596) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = 143176 * 0.007;
                    faixa3 = (i.getValor() - 238626) * 0.0075;
                    iptu = faixa1 + faixa2 + faixa3;
                } else if (i.getValor() > 417596 && i.getValor() <= 715879) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = 143176 * 0.007;
                    faixa3 = 178970 * 0.0075;
                    faixa4 = (i.getValor() - 417596) * 0.008;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4;
                } else if (i.getValor() > 715879 && i.getValor() <= 954505) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = 143176 * 0.007;
                    faixa3 = 178970 * 0.0075;
                    faixa4 = 298283 * 0.008;
                    faixa5 = (i.getValor() - 715879) * 0.0085;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
                } else if (i.getValor() > 954505 && i.getValor() <= 1193131) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = 143176 * 0.007;
                    faixa3 = 178970 * 0.0075;
                    faixa4 = 298283 * 0.008;
                    faixa5 = 238626 * 0.0085;
                    faixa6 = (i.getValor() - 954505) * 0.009;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 + faixa6;
                } else if (i.getValor() > 1193131) {
                    faixa1 = 95450 * 0.006;
                    faixa2 = 143176 * 0.007;
                    faixa3 = 178970 * 0.0075;
                    faixa4 = 298283 * 0.008;
                    faixa5 = 238626 * 0.0085;
                    faixa6 = 238626 * 0.009;
                    faixa7 = (i.getValor() - 1193131) * 0.01;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4 + faixa5 + faixa6 + faixa7;
                }
                break;
            case "NÃO RESIDENCIAL":
                if (i.getValor() <= 35793) {
                    faixa1 = i.getValor() * 0.012;
                    iptu = faixa1;
                } else if (i.getValor() > 35793 && i.getValor() <= 119313) {
                    faixa1 = 35793 * 0.012;
                    faixa2 = (i.getValor() - 35793) * 0.013;
                    iptu = faixa1 + faixa2;
                } else if (i.getValor() > 119313 && i.getValor() <= 596565) {
                    faixa1 = 35793 * 0.012;
                    faixa2 = 83520 * 0.013;
                    faixa3 = (i.getValor() - 119313) * 0.014;
                    iptu = faixa1 + faixa2 + faixa3;
                } else if (i.getValor() > 596565 && i.getValor() <= 1193131) {
                    faixa1 = 35793 * 0.012;
                    faixa2 = 83520 * 0.013;
                    faixa3 = 477252 * 0.014;
                    faixa4 = (i.getValor() - 596565) * 0.015;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4;
                } else if (i.getValor() > 1193131) {
                    faixa1 = 35793 * 0.012;
                    faixa2 = 83520 * 0.013;
                    faixa3 = 477252 * 0.014;
                    faixa4 = 596566 * 0.015;
                    faixa5 = (i.getValor() - 1193131) * 0.016;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
                } break;
            case "TERRITORIAL":
                if (i.getValor() <= 47724) {
                    faixa1 = i.getValor() * 0.01;
                    iptu = faixa1;
                } else if (i.getValor() > 47724 && i.getValor() <= 357939) {
                    faixa1 = 47724 * 0.01;
                    faixa2 = (i.getValor() - 47724) * 0.016;
                    iptu = faixa1 + faixa2;
                } else if (i.getValor() > 357939 && i.getValor() <= 715879) {
                    faixa1 = 47724 * 0.01;
                    faixa2 = 310215 * 0.016;
                    faixa3 = (i.getValor() - 357939) * 0.02;
                    iptu = faixa1 + faixa2 + faixa3;
                } else if (i.getValor() > 715879 && i.getValor() <= 1193131) {
                    faixa1 = 47724 * 0.01;
                    faixa2 = 310215 * 0.016;
                    faixa3 = 357940 * 0.02;
                    faixa4 = (i.getValor() - 715879) * 0.025;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4;
                }else if (i.getValor() > 1193131) {
                    faixa1 = 47724 * 0.01;
                    faixa2 = 310215 * 0.016;
                    faixa3 = 357940 * 0.02;
                    faixa4 = 477252 * 0.025;
                    faixa5 = (i.getValor() - 1193131) * 0.03;
                    iptu = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
                }
        }
        return iptu;
    }
}
