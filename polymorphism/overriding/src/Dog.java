public class Dog extends Animals{
    public Dog(String name, String owner) {
        super.name = name;
        super.owner = owner;
    }
    
    public void sound() {
        System.out.println("Guk guk guk");
    }
}
