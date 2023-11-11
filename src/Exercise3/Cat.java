package Exercise3;

public class Cat implements AnimalBehavior{
    @Override
    public String walk() {
        return "Cat-walking";
    }

    @Override
    public String talk() {
        return "Cat-talking";
    }

    @Override
    public String eat() {
        return "Cat-eating";
    }
}
