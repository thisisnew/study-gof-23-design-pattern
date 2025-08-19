package part20.flyweight;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String str) {
        BigCharFactory factory = BigCharFactory.getInstance();
        bigChars = new BigChar[str.length()];
        for (int i = 0; i < str.length(); i++) {
            bigChars[i] = factory.getBigChar(str.charAt(i));
        }
    }

    public void print() {
        for (BigChar bc : bigChars) {
            bc.print();
        }
    }
}
