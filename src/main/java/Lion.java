public class Lion implements IEat,IGrowl,ISleep{
    @Override
    public void eat() {
        System.out.println("I'm a lion and i'm eating");
    }

    @Override
    public void growl() {
        System.out.println("I'm a lion and i'm growling");
    }

    @Override
    public void sleep() {
        System.out.println("I'm a lion and i'm sleeping");
    }
}
