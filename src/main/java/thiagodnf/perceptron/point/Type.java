package thiagodnf.perceptron.point;

public enum Type{
	
	NONE(-1),
	CIRCLE (1),
	SQUARE (0);
	
	public int value;
	
	Type(int value) {
		this.value = value;
	}
	
	public static Type fromInteger(int x) {
		switch (x) {
		case 0:
			return SQUARE;
		case 1:
			return CIRCLE;
		default:
			return NONE;
		}
	}
}
