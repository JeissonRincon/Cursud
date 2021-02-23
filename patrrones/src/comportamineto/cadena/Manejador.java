package comportamineto.cadena;

public abstract class Manejador {
	protected int token;
	protected Manejador sucesor;

	public Manejador(Manejador sucesor, int token) {		
		this.sucesor = sucesor;
		this.token = token;
	}

	public Manejador getSucesor() {
		return sucesor;
	}

	public void setSucesor(Manejador sucesor) {
		this.sucesor = sucesor;
	}
	
	public void servicio() {
		if(puedoResolver()) {
		   resolver();
		}else if(haySucesor()){
		   sucesor.servicio();
		}
	}

	private boolean haySucesor() {		
		return sucesor!=null;
	}

	protected abstract void resolver();

	protected abstract boolean puedoResolver();

}
