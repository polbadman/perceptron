package thiagodnf.perceptron.point;

public class Point {

	public enum Type{
		NONE(-1),
		CIRCLE (1),
		SQUARE (0);
		
		public int value;
		
		Type(int value) {
			this.value = value;
		}
	}
	
	private double x;

	private double y;
	
	private Type type;

	public Point(double x, double y, Type type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public Point(double x, double y) {
		this(x, y, Type.NONE);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double[] getDimensions() {
		return new double[] { getX(), getY() };
	}
}
