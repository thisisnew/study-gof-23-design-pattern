package part13.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry>{

    private final String name;
    private final List<Entry> directories = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Entry add(Entry entry) {
        directories.add(entry);
        return this;
    }

    @Override
    public Iterator<Entry> iterator() {
        return directories.iterator();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return directories.stream()
                .mapToInt(Entry::getSize)
                .sum();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
