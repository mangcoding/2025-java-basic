public abstract class Animals {
    protected String name;
    protected String owner;

    public abstract void sound();

    public void info() {
        System.out.println("Name of animals "+this.name);
        System.out.println("Owner "+this.owner);
    }
}