package strategy;

public class Robo {

	private Comportamento comportamento;
	
	public void setSComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
