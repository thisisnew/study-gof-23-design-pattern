package part9.bridge;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int count) {
        open();
        for (int i = 0; i < count; i++) {
            display();
        }
        close();
    }
}
