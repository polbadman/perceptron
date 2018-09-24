package thiagodnf.perceptron.example;

import java.util.ArrayList;
import java.util.List;

import thiagodnf.perceptron.point.Point;
import thiagodnf.perceptron.point.Point.Type;

public class Example01 {

	public static List<Point> getPoints() {

		List<Point> points = new ArrayList<>();

		points.add(new Point(0.2, 0.3, Type.CIRCLE));
		points.add(new Point(0.1, 0.4, Type.CIRCLE));
		points.add(new Point(0.1, 0.5, Type.CIRCLE));

		return points;
	}
}
