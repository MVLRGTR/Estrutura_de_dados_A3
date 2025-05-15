package pilha;

public class Pilha {
	
	private static final int limit = 7;
	private static int currentPosition = 0;
	private Ball top = null;
	
	public Pilha() {
		
	}
	
	public void stack(Ball novo) {
		if(!this.isEmpty()) {
			top = novo;
			currentPosition+=1;
		}else if(!isFull()) {
			novo.setNext(top);
			top.setNext(novo);
			currentPosition+=1;
		}else {
			
		}
	}
	
	public Ball unstack() {
		if(!isEmpty()) {
			Ball retValue = top;
			top.setNext(top.getNext());
			currentPosition-=1;
			return retValue;
		}else {
			return null;
		}
	}
	
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		return (currentPosition < limit) ? false : true;
	}
	
	public Ball showTop() {
		return top;
	}
	
	public void showStack() {
		
	}
	
}
