package part13.visitor;

public interface Element {
    void accept(Visitor visitor);
}
