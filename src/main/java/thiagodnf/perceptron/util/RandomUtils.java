package thiagodnf.perceptron.util;

import thiagodnf.perceptron.point.Point;

public class RandomUtils {

	public static double getRandomDouble(double min, double max) {
		return (Math.random() * ((max - min) + 1)) + min;
	}

	public static double getRandomDouble() {
		return getRandomDouble(0.0, 1.0);
	}

	public static Point getRandomPoint() {
		return new Point(getRandomDouble(), getRandomDouble());
	}
}
