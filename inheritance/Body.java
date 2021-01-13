interface Mouth {
    public void speak(); // interface method
}

interface Nose {
    public void breathe(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
public class Body implements Mouth, Nose {
    public void speak() {
        System.out.println("I am speaking");
    }

    public void breathe() {
        System.out.println("I am breathing of course, or I die!");
    }
}
