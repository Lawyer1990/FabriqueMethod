public class Cat implements IEat, ISleep {
    @Override
    public void eat() {
        System.out.println("I'm a cat and I'm eating");
    }

    @Override
    public void sleep() {
        System.out.println("I'm a cat and I'm sleeping");
    }
}
