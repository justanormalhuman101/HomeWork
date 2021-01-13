public class Dog {
    private String name;
    private int age;
    private String[] foods = { "StrawBerry", "Pizza", "Your Headphone Wire", "Sofa" };

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String favouriteFood() {
        int x = randomNumber(4, 0);
        return foods[x];
    }

    private int randomNumber(int max, int min) {
        return ((int) (Math.random() * (max - min + 1)) + min);
    }
}