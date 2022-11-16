public class SplitResult {
    private final int residueRemainingHeat;
    private final double steam;

    public SplitResult(int residueRemainingHeat, double steam) {
        this.residueRemainingHeat = residueRemainingHeat;
        this.steam = steam;
    }

    public int getResidueRemainingHeat() {
        return residueRemainingHeat;
    }

    public double getSteam() {
        return steam;
    }
}
