import java.util.ArrayList;
import java.util.List;

import thiagodnf.perceptron.classifier.Perceptron;
import thiagodnf.perceptron.example.Example01;
import thiagodnf.perceptron.learning.MaxIterationsLearning;
import thiagodnf.perceptron.point.Point;
import thiagodnf.perceptron.point.Type;

public class Explore {

	public static void main(String[] args) {

		Perceptron perceptron = new Perceptron(2);
		
		perceptron.setLearning(new MaxIterationsLearning(30));

		List<double[]> inputs = new ArrayList<>();

		for (Point point : new Example01().getTrainingSet()) {
			inputs.add(point.getDimensions());
		}

		perceptron.train(inputs);

		List<Point> testPoints = new Example01().getTestSet();

		for (Point testPoint : testPoints) {
			classify(perceptron, testPoint);
		}
	}

	public static void classify(Perceptron perceptron, Point target) {

		int output = perceptron.classify(target.getDimensions());

		System.out.println("Found " + Type.fromInteger(output) + " and " + target);

	}
}
