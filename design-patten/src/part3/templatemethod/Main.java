package part3.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay h = new CharDisplay('H');
        AbstractDisplay e = new StringDisplay("Hello");
        h.display();
        e.display();
    }
}
