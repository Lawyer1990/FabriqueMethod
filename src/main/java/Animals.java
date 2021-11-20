public class Animals {
    private IEat[] iEats = new IEat[]{
            new Cat(),
            new Dog(),
            new Lion()
    };
    private IGrowl[] iGrowls = new IGrowl[]{
            new Dog(),
            new Lion()
    };
    private ISleep[] iSleeps = new ISleep[]{
            new Cat(),
            new Lion()
    };
    public void eatAnimal(){
        for (int i=0;i<iEats.length;i++){
            iEats[i].eat();
        }
    }
    public void growlAnimal(){
        for (int i=0;i<iGrowls.length;i++){
            iGrowls[i].growl();
        }
    }
    public void sleepAnimal(){
        for (int i=0;i<iSleeps.length;i++){
            iSleeps[i].sleep();
        }
    }
}
