package pilha;

public class Ball {
	private Ball next = null;
	private ColorBall color;
	
	public Ball(int color) {
		this.color=ColorBall.colorInt(color);
	}

	public void setNext(Ball next) {
		this.next = next;
	}

	public Ball getNext() {
		return next;
	}
	
	public ColorBall getColor() {
		return color;
	}
	
}
