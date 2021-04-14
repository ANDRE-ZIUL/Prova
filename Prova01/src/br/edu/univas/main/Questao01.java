package br.edu.univas.main;

public class Questao01 {

	public static void main(String[] args) {
		
		int nota1 = 49;
		int nota2 = 61;
		int nota3 = 12;
		int nota4 = 98;
		
		int media = (nota1 + nota2 + nota3 + nota4) / 2;
		
		if(media >= 70) {
			System.out.println("Aluno aprovado");
		
		} else if(media >= 50 && media <= 69) {
			System.out.println("Aluno em recuperação");
		
		} else {
			System.out.println("Aluno em dependência");
		}
	}
}