package entitites;

import interfaces.Organiza_Serie_A;
import interfaces.Organiza_Serie_B;

public abstract class Brasileirao {

		Organiza_Serie_A oa;
		Organiza_Serie_B ob;
		
		
		public Brasileirao() {
			
		}

		public void setOa(Organiza_Serie_A oa) {
			this.oa = oa;
		}

		public void setOb(Organiza_Serie_B ob) {
			this.ob = ob;
		}
		
		public void rodada_Serie_A() {
		
		getOa().tabela_Serie_A();
		getOa().pontos_Serie_A();
}
		
		public void rodada_Serie_B() {
			
			getOb().tabela_Serie_B();
			getOb().pontos_Serie_B();
		}

		public Organiza_Serie_A getOa() {
			return oa;
		}

		public Organiza_Serie_B getOb() {
			return ob;
		}
}



