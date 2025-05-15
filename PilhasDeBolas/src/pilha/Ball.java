package pilha;

public class Ball {
	private Ball next = null;
	public int valor;
	
	public Ball(int valor) {
		this.valor=valor;
	}

	public void setNext(Ball next) {
		this.next = next;
	}

	public Ball getNext() {
		return next;
	}
	
}
