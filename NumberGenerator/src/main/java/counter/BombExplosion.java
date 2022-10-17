package counter;

public class BombExplosion {

    public void explodeIn10Sec(int explosionDelay) {
        do {
            System.out.println("Bomb will explode in: " + explosionDelay + "sec.");
            explosionDelay--;
            System.out.println(explosionDelay);
        }
        while (explosionDelay > 0);
            System.out.println("BUM");
    }

    public void explodeIn30Sec(int explosionDelay) {

        for (int i = 30; i > 0; i--) {
            System.out.println("Bomb will explode in: " + explosionDelay + "sec.");
            explosionDelay--;
            System.out.println("BUM");
        }
    }

    public void explodeIn60Sec(int explosionDelay) {

        while (explosionDelay > 0) {
            System.out.println("Bomb will explode in: " + explosionDelay + "sec.");
            explosionDelay--;
        }
        System.out.println("BUM");
    }
}

