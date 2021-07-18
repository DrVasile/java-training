public class ThreadLocalExample {

    private static void method0() {
        ThreadLocal<Integer> threadLocalInstance = new ThreadLocal<>();

        threadLocalInstance.set(25);
        Integer value = threadLocalInstance.get();

        System.out.println(value);
    }

    private static void method1() {
        ThreadLocal<Integer> threadLocalInstance  = ThreadLocal.withInitial(() -> 25);
        Integer value = threadLocalInstance.get();
        System.out.println(value);

        threadLocalInstance.set(null);

        value = threadLocalInstance.get();
        System.out.println(value);
    }

    public static void main(String[] args) {
        // method0();
        method1();
    }
}