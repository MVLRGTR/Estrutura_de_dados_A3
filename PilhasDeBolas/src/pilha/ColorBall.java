package pilha;

public enum ColorBall {
	
	BLUE(1),
	GREEN(2),
	YELLOW(3),
	ORANGE(4),
	PURPLE(5),
	RED(6);
	
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
