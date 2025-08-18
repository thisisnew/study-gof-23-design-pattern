package part17.observer;

public class Main {
    public static void main(String[] args) {
        var generator = new RandomNumberGenerator();
        generator.addObserver(new DigitObserver());
        generator.addObserver(new GraphObserver());
        generator.execute();
    }
}
