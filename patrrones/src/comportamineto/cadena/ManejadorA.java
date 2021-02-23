package comportamineto.cadena;

public class ManejadorA extends Manejador {
    public static final int SOLUCION_A=1;
	public ManejadorA(Manejador sucesor,int token) {
		super(sucesor,token);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void resolver() {
		System.out.println("A");

	}

	@Override
	protected boolean puedoResolver() {
		return token == SOLUCION_A;
	}

}
