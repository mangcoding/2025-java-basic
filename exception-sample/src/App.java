public class App {
    public static void main(String[] args) throws Exception {
        int [] Numbers = {1,2,3,4,5};
        try {
            System.out.print(Numbers[10]);
        }catch(Exception e) {
            System.out.println("There is something wrong, please contact administrator");
            try {
                System.out.print(Numbers[11]);
            }catch(Exception m ){
                
            }
        }finally{
            System.out.println("Finally we are here even throw error");

            try {
                Throw.checkAge(10);
            }catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
    }
}
