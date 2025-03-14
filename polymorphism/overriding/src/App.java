public class App {
    public static void main(String[] args) throws Exception {
        Animals catie = new Cat("Catie","Siti");
        catie.sound();
        catie.info();
        System.out.println("_______________________");
        Animals dogi = new Dog("Dogie","Rendi");
        dogi.sound();
        dogi.info();
    }
}
