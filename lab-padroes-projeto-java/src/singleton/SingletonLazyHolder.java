package singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author mizael
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		return InstanceHolder.instancia;
	}
}
