public abstract class Animal implements Eatable {
    private int lifetime;

    public Animal(){

    }
    public Animal(int lifetime){
        this.lifetime = lifetime;
    }

    /**
     * @return the lifetime
     */
    public int getLifetime() {
        return lifetime;
    }

    /**
     * @param lifetime the lifetime to set
     */
    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
}