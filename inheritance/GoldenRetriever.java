public class GoldenRetriever extends Dog {
    private String name = "GoldenRetriever";

    public static void main(String[] args) {
        GoldenRetriever golden = new GoldenRetriever();

        System.out.println("This is a " + golden.name + " and he says ");

        golden.speak("golden is da bezt");

        System.out.println("when he want " + golden.favouriteFood());

        Body body = new Body();

        body.breathe();
        body.speak();
    }
}
