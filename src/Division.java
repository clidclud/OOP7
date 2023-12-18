class Division implements Operation {
    @Override
    public double apply(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return x / y;
    }
    @Override
    public String getOperationName() {
        return "/";
    }
}
