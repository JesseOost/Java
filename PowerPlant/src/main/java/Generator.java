public class Generator {
    private double totalYield;

    public Generator(double totalYield) {
        this.totalYield = totalYield;
    }

    public double generateEnergy(float steam){
        return 0.0;
    }

    public double getTotalYield() {
        return totalYield;
    }

    public void setTotalYield(double totalYield) {
        this.totalYield = totalYield;
    }
}
