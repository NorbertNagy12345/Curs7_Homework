package Exercise3;

public class Duck implements AnimalBehavior{
    @Override
    public String walk() {
        return "Duck-walking";
    }

    @Override
    public String talk() {
        return "Duck-talking";
    }

    @Override
    public String eat() {
        return "Duck-eating";
    }
}
