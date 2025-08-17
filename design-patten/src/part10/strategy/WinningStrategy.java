package part10.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand previousHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            previousHand = Hand.getHand(random.nextInt(3));
        }

        return previousHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
