package comportamineto.cadena;

public class Cliente {

	public static void main(String[] args) {
		Manejador ma = new ManejadorA(null, -1);
		Manejador mb = new ManejadorB(null, ManejadorB.SOLUCION_B);
		ma.setSucesor(mb);
		ma.servicio();

	}

}
