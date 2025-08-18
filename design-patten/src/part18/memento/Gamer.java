package part18.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();

    private static String[] fruitsNames = {"apple", "banana", "orange", "pear"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        if (dice == 1) {
            money += 100;
            System.out.println("소지금이 증가하였습니다.");
            return;
        }

        if (dice == 2) {
            money /= 2;
            System.out.println("소지금이 절반으로 줄었습니다.");
            return;
        }

        if (dice == 6) {
            String f = getFruits();
            System.out.println("과일(" + f + ")를 받았습니다.");
            fruits.add(f);
            return;
        }

        System.out.println("변동 없음.");
    }

    public Memento createMemento () {
        Memento memento = new Memento(money);

        for (String f : fruits) {
            if (f.startsWith("맛있는 ")) {
                memento.addFruit(f);
            }
        }

        return memento;
    }

    public void restoreMemento(Memento memento) {
        money = memento.getMoney();
        fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money=" + money + ", fruits=" + fruits + "]";
    }

    private String getFruits() {
        String f = fruitsNames[random.nextInt(fruitsNames.length)];

        if (random.nextBoolean()) {
            return "맛있는 " + f;
        }

        return f;
    }
}
