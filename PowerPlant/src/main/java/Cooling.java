public class Cooling {
    private double waterTemp;

    public Cooling(double waterTemp) {
        this.waterTemp = waterTemp;
    }

    public double abductResidualHeat(){
        return 0.0;
    }

    public double getWaterTemp() {
        return waterTemp;
    }

    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }
}
