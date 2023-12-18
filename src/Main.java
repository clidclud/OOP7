public class Main {
    public static void main(String[] args) {
        Operation addition = OperationFactory.createOperation("+");
        Calculator additionCalculator = new Calculator(addition);
        double result1 = additionCalculator.calculate(5, 5);

        Operation subtraction = OperationFactory.createOperation("-");
        Calculator subtractionCalculator = new Calculator(subtraction);
        double result2 = subtractionCalculator.calculate(15, 5);

        Operation multiplication = OperationFactory.createOperation("*");
        Calculator multiplicationCalculator = new Calculator(multiplication);
        double result3 = multiplicationCalculator.calculate(5, 2);

        Operation division = OperationFactory.createOperation("/");
        Calculator divisionCalculator = new Calculator(division);
        double result4 = divisionCalculator.calculate(50, 5);
    }
}