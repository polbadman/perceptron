package thiagodnf.perceptron.classifier;

import java.util.List;

import thiagodnf.perceptron.learning.Learning;
import thiagodnf.perceptron.learning.MaxIterationsLearning;

public class Perceptron {

	/** Learning rate */
	private double lRate = 0.0002;

	/** The Weights */
	private double[] weights;
	
	/** Information without attributes */
	private double bias = -1;
	
	/** Define the stopping criteria for training phase */
	private Learning learning;

	/**
	 * Constructor
	 */
	public Perceptron() {
		this(2, new MaxIterationsLearning(30));
	}

	/**
	 * Constructor
	 * @param dimensions the size of the weights
	 */
	public Perceptron(int dimensions, Learning learning) {
		this.weights = new double[dimensions];
		this.learning = learning;
	}
	
	public void train(List<double[]> inputs) {

		for (double[] input : inputs) {

			double output = classify(input);
			double expected = input[input.length - 1];

			if (output != expected) {

				updateWeightsAndBias(input, expected, output);
			}

		}
		
		if( ! learning.isStoppingConditionReached(this, inputs)) {
			train(inputs);
		}
	}
	
	protected void updateWeightsAndBias(double[] input, double expected, double output) {

		double error = (expected - output);
		
		for (int i = 0; i < input.length-1; i++) {

			weights[i] += (lRate * (error) * input[i]);
		}

		bias += lRate * error;
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

	public double getLRate() {
		return lRate;
	}

	public void setLRate(double lRate) {
		this.lRate = lRate;
	}

	public Learning getLearning() {
		return learning;
	}

	public void setLearning(Learning learning) {
		this.learning = learning;
	}
}
