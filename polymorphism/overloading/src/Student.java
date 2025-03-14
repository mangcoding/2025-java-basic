public class Student {
   private String name;
   private int age;
   private String address;
   private String phone;
   private String email;
   private String password;

   /*Example of overloading method (Static Polymorphism) */
   public void register(String name, int age) {
    this.name = name;
    this.age = age;
   }

   public void register(String name, int age, String address, String phone, String email, String password) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.phone = phone;
    this.email = email;
    this.password = password;
   }
}
