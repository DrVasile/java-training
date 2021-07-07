class GeneralSystem {
    public String getDescription() {
        return "General type system."
    }
}

class TypeASystem extends GeneralSystem {
    public String getDescription() {
        return "Type A system."
    }
}

class TypeBSystem extends GeneralSystem {
    public String getDescription() {
        return "Type B system."
    }
}

public class Overriding {
    public static void main(String[] args) {
        System system0 = new TypeASystem();
        System system1 = new TypeBSystem();

        System.out.println(system0.getDescription());
        System.out.println(system1.getDescription());
    }
}

