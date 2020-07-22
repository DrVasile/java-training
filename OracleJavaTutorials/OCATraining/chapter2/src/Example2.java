public class Example2 {

    public static void main(String[] args) {
        String name = "Vasea /*dr";

        Long val1 = Long.valueOf(123);
        Long val2 = Long.valueOf("123");
        System.out.println(val1 == val2);

        Long val3 = Long.valueOf("233");
        Long val4 = Long.valueOf("233");
        System.out.println(val3 == val4);
    }
}