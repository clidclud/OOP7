class OperationFactory {
    public static Operation createOperation(String operator) {
        switch (operator) {
            case "+":
                return new Addition();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "-":
                return new Subtraction();
            default:
                throw new IllegalArgumentException("Ошибка: " + operator);
        }
    }
}