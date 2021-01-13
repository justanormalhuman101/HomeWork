public class Main {
    public static void main(String[] args) {
        Dog doggo = new Dog();
        doggo.setAge(10);
        doggo.setName("David");

        System.out.println("Dog's name is " + doggo.getName() + " and he is " + doggo.getAge()  + " and he likes " + doggo.favouriteFood());
    }
}
