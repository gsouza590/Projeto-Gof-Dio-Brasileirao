package application;

import entitites.Brasileirao;
import entitites.Serie_A;
import entitites.Serie_B;

public class Rola_Brasileirao{

	public static void main(String[] args) {
		
		Brasileirao d = new Serie_A();
		
		d.setOa(d.getOa());
		d.rodada_Serie_A();

		System.out.println();
		
		Brasileirao e= new Serie_B();
		e.setOb(e.getOb());
		e.rodada_Serie_B();
	}
	

}
