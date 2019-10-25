public class Main {
    public Main() {
        Animal hiu = new Hiu();

        try {
            hiu.eatEgg();
            hiu.eatMeat();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}