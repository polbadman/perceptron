package thiagodnf.perceptron.classifier;

import java.util.Arrays;
import java.util.List;

public class Perceptron {

	/** Learning rate */
	private double lRate = 0.0;

	private double[] weights;
	
	private double bias = 0;

	/**
	 * Constructor
	 */
	public Perceptron() {
		this(2);
	}

	/**
	 * Constructor
	 * @param dimensions the size of the weights
	 */
	public Perceptron(int dimensions) {
		this.weights = new double[dimensions];
	}
	
	public void train(List<double[]> inputs) {
		
		for(double[] input : inputs) {
			
			int result = classify(input);
			
			System.out.println(result);
			System.out.println(Arrays.toString(input));
		}
		
	}
	
	public int classify(double[] input) {

		double result = 0.0;

		// The last position is the class. So we have to avoid it
		for (int i = 0; i < input.length - 1; i++) {
			result += input[i] * weights[i];
		}

		result += bias;

		if (result >= 0) {
			return 1;
		}

		return 0;
	}

}
