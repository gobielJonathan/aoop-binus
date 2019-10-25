public class Cow extends Animal  {
 
    public Cow(){}

    public Cow(int lifetime){
        super(lifetime);
    }

    @Override
    public void eatMeat()  {
        System.out.println("can eat meat");
    }

    @Override
    public void eatEgg()  throws Exception{
        throw new Exception("cannot eat egg of this animal");
    }
}