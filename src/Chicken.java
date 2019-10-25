public class Chicken extends Animal {
 
    public Chicken(){}

    public Chicken(int lifetime){
        super(lifetime);
    }

    @Override
    public void eatMeat()  {
        System.out.println("can eat meat");
    }

    @Override
    public void eatEgg() {
        System.out.println("can eat egg");
    }
}