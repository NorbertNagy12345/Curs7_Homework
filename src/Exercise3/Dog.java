package Exercise3;

public class Dog implements AnimalBehavior{
    @Override
    public String walk() {
        return "Dog-walking";
    }

    @Override
    public String talk() {
        return "Dog-talking";
    }

    @Override
    public String eat() {
        return "Dog-eating";
    }
}
