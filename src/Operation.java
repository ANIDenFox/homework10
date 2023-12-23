class Operation {
    private String type;
    private double amount;

    public Operation(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return type + ": " + amount;
    }
}