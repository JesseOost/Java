import java.util.HashSet;
import java.util.Set;

public class Reactor {
    private Set<Core> core;

    public Reactor() {
        this.core = new HashSet<Core>();
    }

    public void addCore(Core core){

    }

    public Core removeCore(Core core){
        return null;
    }

    public Set<Core> getCore() {
        return core;
    }

    public void setCore(Set<Core> core) {
        this.core = core;
    }
}
