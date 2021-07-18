import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        Object[] objectArray = new Object[10];
        List<Object> objectList = new ArrayList<Object>();

        objectArray[0] = "String0";
        objectArray[1] = 0;
        objectArray[2] = 0.0;

        objectList.add("String1");
        objectList.add(1);
        objectList.add(1.0);

        System.out.println("Show the array elements:");

        for (Object object : objectArray) {
            System.out.println(object);
        }

        System.out.println();

        System.out.println("Show the list elements:");

        for (Object object : objectList) {
            System.out.println(object);
        }

        System.out.println();
    }
}