public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private Cooling cooling;

    public Powerplant(Generator generator, Reactor reactor, Cooling cooling) {
        this.generator = generator;
        this.reactor = reactor;
        this.cooling = cooling;
    }

    public double run(int tempInKelvin, int timeInSeconds){
        return 0.0;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Cooling getCooling() {
        return cooling;
    }

    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
    }
}
