public class Dog implements IEat, IGrowl{

    @Override
    public void eat() {
        System.out.println("I'm a dog and i'm eating");
    }

    @Override
    public void growl() {
        System.out.println("I'm a dog and i'm growling");
    }
}
