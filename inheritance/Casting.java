public class Casting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int

        int myOtherInt = 9;
        double myOtherDouble = myInt; // Automatic casting: int to double

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt); // Outputs 9
        System.out.println(myOtherDouble); // Outputs 9.78
        System.out.println(myOtherInt); // Outputs 9
    }
}
