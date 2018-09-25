# Perceptron

A simple classifier for data learning and classification

## What is a perceptron?

The perceptron is an algorithm for supervised learning of binary classifiers (functions that can decide whether an input, represented by a vector of numbers, belongs to some specific class or not)

## Example

<img src="https://raw.githubusercontent.com/thiagodnf/perceptron/master/src/main/resources/example-01.png"/>

Output:

```
Found SQUARE and Point [1.0, 1.0] is SQUARE
Found SQUARE and Point [6.0, 8.0] is SQUARE
Found SQUARE and Point [12.0, 5.0] is SQUARE
Found SQUARE and Point [14.0, 1.0] is SQUARE
Found SQUARE and Point [6.0, 6.0] is SQUARE
Found CIRCLE and Point [10.0, 8.0] is CIRCLE
Found CIRCLE and Point [15.0, 6.0] is CIRCLE
Found CIRCLE and Point [21.0, 2.0] is CIRCLE
Found CIRCLE and Point [23.0, 12.0] is CIRCLE
Found CIRCLE and Point [8.0, 12.0] is CIRCLE
```

## Training Size

You have the following options as training size:

- Max Iterations Learning
- User-Specified Threshold Learning
