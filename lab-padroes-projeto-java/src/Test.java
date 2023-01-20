import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
	public static void main(String[] args) {
		
		// Singleton 
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstacia();
		System.out.println(holder);
		
		// Strategy
		
		Comportamento normal =  new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setSComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setSComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setSComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		// facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Mizael", "88828000");
	}
}
