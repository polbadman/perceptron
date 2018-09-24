import java.util.ArrayList;
import java.util.List;

import thiagodnf.perceptron.classifier.Perceptron;
import thiagodnf.perceptron.point.Point;
import thiagodnf.perceptron.point.Point.Type;

public class Explore {
	
	public static int numberOfRandomPoints = 10; 
	
	public static void main(String[] args) {
		
		Perceptron perceptron = new Perceptron(2);
		
		List<Point> points = new ArrayList<>();
		
		points.add(new Point(0.2, 0.3, Type.CIRCLE));
		points.add(new Point(0.1, 0.4, Type.CIRCLE));
		points.add(new Point(0.1, 0.5, Type.SQUARE));
		
		List<double[]> inputs = new ArrayList<>();
		
		inputs.add(new double[] { 0.0, 0.2 });
		inputs.add(new double[] { 0.1, 0.3 });
		
		perceptron.train(inputs);
		
		
		
	}
}
