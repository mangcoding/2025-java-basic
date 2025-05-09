public class Printable {
    public static void print(int value) {
        System.out.println(value);
    }

    public static <T> void print(T value) {
        System.out.println(value);
    }

    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item+",");
        }
        System.out.println();
    }
}
