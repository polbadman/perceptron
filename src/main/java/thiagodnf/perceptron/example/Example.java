package thiagodnf.perceptron.example;

import java.util.List;

import thiagodnf.perceptron.point.Point;

public interface Example {

	public List<Point> getTrainingSet();
	
	public List<Point> getTestSet();
}
