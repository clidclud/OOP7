import java.util.logging.Logger;
class Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    private final Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double x, double y) {
        double result = operation.apply(x, y);
        LOGGER.info("Калькулятор: " + x + " " + operation.getOperationName() + " " + y + " = " + result);
        return result;
    }
}