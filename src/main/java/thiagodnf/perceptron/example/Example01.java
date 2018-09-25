package thiagodnf.perceptron.example;

import java.util.ArrayList;
import java.util.List;

import thiagodnf.perceptron.point.Point;
import thiagodnf.perceptron.point.Type;

public class Example01 implements Example{

	@Override
	public List<Point> getTrainingSet() {

		List<Point> points = new ArrayList<>();

		points.add(new Point(5, 11, Type.CIRCLE));
		points.add(new Point(10, 11, Type.CIRCLE));
		points.add(new Point(12, 10, Type.CIRCLE));
		points.add(new Point(12, 12, Type.CIRCLE));
		points.add(new Point(14, 9, Type.CIRCLE));
		points.add(new Point(14, 11, Type.CIRCLE));
		points.add(new Point(16, 8, Type.CIRCLE));
		points.add(new Point(16, 10, Type.CIRCLE));
		points.add(new Point(18, 7, Type.CIRCLE));
		points.add(new Point(18, 9, Type.CIRCLE));
		points.add(new Point(20, 6, Type.CIRCLE));
		points.add(new Point(20, 8, Type.CIRCLE));
		points.add(new Point(22, 5, Type.CIRCLE));
		points.add(new Point(22, 7, Type.CIRCLE));

		points.add(new Point(19, 1, Type.SQUARE));
		points.add(new Point(1, 7, Type.SQUARE));
		points.add(new Point(1, 9, Type.SQUARE));
		points.add(new Point(3, 5, Type.SQUARE));
		points.add(new Point(3, 7, Type.SQUARE));
		points.add(new Point(3, 9, Type.SQUARE));
		points.add(new Point(5, 3, Type.SQUARE));
		points.add(new Point(5, 5, Type.SQUARE));
		points.add(new Point(5, 7, Type.SQUARE));
		points.add(new Point(7, 1, Type.SQUARE));
		points.add(new Point(7, 3, Type.SQUARE));
		points.add(new Point(7, 5, Type.SQUARE));
		points.add(new Point(9, 1, Type.SQUARE));
		points.add(new Point(9, 3, Type.SQUARE));

		return points;
	}
	
	@Override
	public List<Point> getTestSet() {

		List<Point> points = new ArrayList<>();

		points.add(new Point(1, 1, Type.SQUARE));
		points.add(new Point(6, 8, Type.SQUARE));
		points.add(new Point(12, 5, Type.SQUARE));
		points.add(new Point(14, 1, Type.SQUARE));
		points.add(new Point(6, 6, Type.SQUARE));

		points.add(new Point(10, 8, Type.CIRCLE));
		points.add(new Point(15, 6, Type.CIRCLE));
		points.add(new Point(21, 2, Type.CIRCLE));
		points.add(new Point(23, 12, Type.CIRCLE));
		points.add(new Point(8, 12, Type.CIRCLE));

		return points;
	}
}
