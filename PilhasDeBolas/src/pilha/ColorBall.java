package pilha;

public enum ColorBall {
	
	BLACK(1),
	BLUE(2),
	GREEN(3),
	YELLOW(4),
	ORANGE(5),
	PURPLE(6),
	RED(7);
	
	private final int color;
	
	ColorBall(int color) {
		this.color=color;
	}
	
	public int getColor() {
		return color;
	}
	
	public static ColorBall colorInt(int color) {
		for(ColorBall c : ColorBall.values()) {
			if(c.getColor()==color) {
				return c;
			}
		}
		throw new IllegalArgumentException("Cor Inválida : "+color);
	}
	
}
