class Phone {
    public void greet() {
        System.out.println("Good morning");
    }

    public void on() {
        System.out.println("Phone is on");
    }
}

class SmartPhone extends Phone {
    public void swagat() {
        System.out.println("Aapka swagat hai");
    }

    @Override
    public void on() {
        System.out.println("Smartphone is on");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        // Dynamic Method Dispatch (Runtime Polymorphism)
        Phone obj = new SmartPhone(); 
        
        // Yeh SmartPhone class ka on() method chalayega
        obj.on(); 
    }
}