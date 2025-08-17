package part9.bridge;

public class Display {
    private final DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public final void open() {
        displayImpl.rawOpen();
    }

    public final void print() {
        displayImpl.rawPrint();
    }

    public final void close() {
        displayImpl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
