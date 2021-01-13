public class Cat extends Animal {
    private String className = "Cat";
    private String[] foods = { "I-am-your-master Food", "Your Shirt", "Your Headphone Wire", "Your Sofa" };

    public static void main(String[] args) {
        Cat lucy = new Cat();

        System.out.println("This is a " + lucy.getNameCat() + " and she says ");

        lucy.speak("Meow Meow");

        System.out.println("when she want " + lucy.favouriteFood());
    }

    public String favouriteFood() {
        int x = randomNumber(3, 1);
        return foods[x];
    }

    public String getNameCat() {
        return className;
    }

    private int randomNumber(int max, int min) {
        return ((int) (Math.random() * (max - min + 1)) + min);
    }

    @Override
    public String getNameAnimal() {
        return className;
    }

    public int favouriteNumber(int k) {
        return k;
    }

    public double favouriteNumber(double k) {
        return k;
    }
}
