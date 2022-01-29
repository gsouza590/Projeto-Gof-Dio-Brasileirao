package entitites;

import interfaces.Organiza_Serie_A;

public class Times_Serie_A implements Organiza_Serie_A {
	
	public void tabela_Serie_A() {
		System.out.println("CAMPEONATO BRASILEIRO DA SERIE A \n"
				+ "PALMEIRAS X GREMIO");
	}
	
	public void pontos_Serie_A() {
		
		System.out.println("Palmeiras 56 \n Internacional 53 \n"
				+ "...\n Parana 21");
	}

}
