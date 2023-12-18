class Subtraction implements Operation{
    @Override
    public double apply(double x, double y) {
        return x - y;
    }
    @Override
    public String getOperationName() {
        return "-";
    }
}
