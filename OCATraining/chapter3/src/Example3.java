public class Example3 {

    String phone = "123456789";

    {
        System.out.println("Vasea is awful");
    }

    void setPhone() {
        String phone;
        phone = "987654321";
    }

    public static void main(String[] args) {
        Example3 o1 = new Example3();
        o1.setPhone();
        System.out.println(o1.phone);
    }
}