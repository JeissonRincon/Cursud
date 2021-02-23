package comportamineto.cadena;

public class ManejadorB extends Manejador {
	 public static final int SOLUCION_B=2;
	public ManejadorB(Manejador sucesor,int token) {
		super(sucesor,token);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void resolver() {
		System.out.println("B");

	}

	@Override
	protected boolean puedoResolver() {
		// TODO Auto-generated method stub
		return token==SOLUCION_B;
	}

}
