public class Cat extends Animals {
    public Cat(String name, String owner) {
        super.name = name;
        super.owner = owner;
    }

    public void sound() {
        System.out.println("Meoooooooong");
    }
}
