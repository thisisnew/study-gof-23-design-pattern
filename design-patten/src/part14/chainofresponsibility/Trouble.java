package part14.chainofresponsibility;

public record Trouble(int number) {

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
