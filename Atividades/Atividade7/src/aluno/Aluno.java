package aluno;

public class Aluno {
	String nome;
    int mediaGeral = 6;
    int horasDeSono = 2;
    
    Aluno (String nome) {
    	this.nome = nome;
    }
    
    Aluno (String nome, int media) {
    	this.nome = nome;
    	this.mediaGeral = media;
    }
    
    Aluno (String nome, int media, int hds) {
    	this.nome = nome;
    	this.mediaGeral = media;
    	this.horasDeSono = hds;
    }
}