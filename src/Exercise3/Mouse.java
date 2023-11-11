package Exercise3;

public class Mouse implements AnimalBehavior{
    @Override
    public String walk() {
        return "Mouse-walking";
    }

    @Override
    public String talk() {
        return "Mouse-talking";
    }

    @Override
    public String eat() {
        return "Mouse-eating";
    }
}
