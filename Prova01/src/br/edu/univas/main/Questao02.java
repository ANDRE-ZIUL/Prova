package br.edu.univas.main;

public class Questao02 {

	public static void main(String[] args) {
		
		int ano1 = 8;
		int ano2 = 27;
		int ano3 = 19;
		
		if(2021 + ano1 + ano2 + ano3 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano1 + ano2 - ano3 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano2 + ano3 - ano1 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano1 + ano3 - ano2 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano1 + ano2 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano1 + ano3 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else if(2021 + ano2 + ano3 == 2021) {
			System.out.println("Sim, � poss�vel viajar no tempo e voltar ao presente");
		
		} else {
			System.out.println("N�o, n�o � poss�vel viajar no tempo e voltar ao presente");
		}
	}
}
