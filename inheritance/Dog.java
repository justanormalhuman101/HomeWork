public class Dog extends Animal {
    private String className = "Dog";
    private String[] foods = { "StrawBerry", "Pizza", "Your Headphone Wire", "Your Sofa" };

    public static void main(String[] args) {
        Dog doggo = new Dog();

        System.out.println("This is a " + doggo.getNameDog() + " and he says ");

        doggo.speak("doggo doggo");

        System.out.println("when he want " + doggo.favouriteFood());
    }

    public String favouriteFood() {
        int x = randomNumber(3, 1);
        return foods[x];
    }

    public String getNameDog() {
        return className;
    }

    private int randomNumber(int max, int min) {
        return ((int) (Math.random() * (max - min + 1)) + min);
    }
}
