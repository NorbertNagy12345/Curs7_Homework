package Exercise3;

public class Chicken implements AnimalBehavior{
    @Override
    public String walk() {
        return "Chicken-walking";
    }

    @Override
    public String talk() {
        return "Chicken-talking";
    }

    @Override
    public String eat() {
        return "Chicken-eating";
    }
}
