package thiagodnf.perceptron.classifier;

import java.util.Arrays;
import java.util.List;

public class Perceptron {

	/** Learning rate */
	private double lRate = 1.0;

	private double[] weights;
	
	private double bias = 0;
	
	private int maxEpoch = 30;
	
	private int countEpoch = 0;

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

		for (double[] input : inputs) {

			int output = classify(input);

			// If the result is different from expected updated weights
			if (output != input[input.length - 1]) {

				updateWeightsAndBias(input, output);
			}

		}

		// acrescenta uma época
		this.countEpoch++;

		if (countEpoch < this.maxEpoch) {
			train(inputs);
		}
	}
	
	protected void updateWeightsAndBias(double[] input, double output) {

		for (int i = 0; i < input.length - 1; i++) {

			weights[i] += (lRate * (input[i] - output) * input[i]);
		}

		bias += lRate * output;
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
