package com.poo.guilherme.carro;

public class Carro {
        String marcaModeloAno;
        int velocidade = 0;
        char pisca = 'n'; // 'd'ireita, 'e'squerda, 'n'ada

        int acelerar() {
                velocidade += 10;
                return velocidade;
        }

        int frear() {
                if (velocidade < 10) {
                        System.out.println("Este carro tem ré.");
                } else {
                        velocidade -= 10;
                }

                return velocidade;
        }

        char piscar(char d) {
                if (d != 'd' && d != 'e' && d != 'n') {
                        System.out.println("Direção inválida");
                } else {
                        pisca = d;
                }

                return pisca;
        }
}
