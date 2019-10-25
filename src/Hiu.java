public class Hiu extends Animal  {
 
    public Hiu(){}

    public Hiu(int lifetime){
        super(lifetime);
    }

    @Override
    public void eatMeat() throws Exception {
        throw new Exception("Forbidden to eat meat this animal");
    }

    @Override
    public void eatEgg() {
        System.out.println("can eat egg");
    }
}