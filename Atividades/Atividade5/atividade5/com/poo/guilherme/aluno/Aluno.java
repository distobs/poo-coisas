package com.poo.guilherme.aluno;

public class Aluno {
    String nome;
    String matricula;
    int mediaGeral = -1;

    void estudar() {
            System.out.println(nome + " estuda, estuda, estuda!");
    }

    void dormir() {
            System.out.println(nome + " zzzzzzzzzzzzzzzzzzz...");
    }

    int calcularMedia(int n1, int n2) {
            int media = (n1 + n2) / 2;

            return media;
    }
}
