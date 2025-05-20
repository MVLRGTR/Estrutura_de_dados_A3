package pilha;

public class Pilha {
	
	private static final int limit = 7;
	private int currentPosition = 0;
	private Ball top = null;
	
	public Pilha() {
		
	}
	
	public void stack(Ball novo) throws StackExeption{
		if(isEmpty()) {
			top = novo;
			currentPosition+=1;
		}else if(!isFull()) {
			novo.setNext(top);
			top=novo;
			currentPosition+=1;
		}else {
			throw StackExeption.stackItsFull("Error: Pilha está cheia !!!");
		}
	}
	
	public Ball unstack() throws StackExeption {
		if(!isEmpty()) {
			Ball retValue = top;
			top = top.getNext();
			currentPosition-=1;
			return retValue;
		}else {
			throw StackExeption.stackIsEmpty("Error : Pilha está vazia !!!");
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
		Ball temp = top;
		System.out.println("Mostrando Pilha de Bolas :");
		while(temp != null) {
			System.out.println("Bola cor : "+temp.getColor());
			temp = temp.getNext();
		}
	}
	
	public boolean clear() {
		if(this.isEmpty()) {
			return false;
		}else {
			while(!this.isEmpty()) {
				top = top.getNext();
			}
			this.currentPosition=0;
			return true;
		}
	}
	
	public boolean winnerStack() {
		if (top == null) return false;
		Ball temp = top;
		int cont = 0;
		ColorBall compareColor = temp.getColor();
		while(temp != null) {
			if(compareColor!=temp.getColor()) {
				return false;
			}
			temp=temp.getNext();
			cont++;
		}
		if(cont==7) {
			return true;
		}else {
			return false;
		}
	}
	
}
