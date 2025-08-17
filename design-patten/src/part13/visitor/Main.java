package part13.visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));
        root.accept(new VisitorExecutor());
        System.out.println();

        System.out.println("Making user entries...");
        Directory youngjin = new Directory("youngjin");
        Directory gildong = new Directory("gildong");
        Directory dojun = new Directory("dojun");
        usr.add(youngjin);
        usr.add(gildong);
        usr.add(dojun);
        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("memo.tex", 200));
        dojun.add(new File("java.doc", 300));
        dojun.add(new File("java.ppt", 400));
        root.accept(new VisitorExecutor());
    }
}
