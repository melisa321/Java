package counter;
//pobierze od użytkownika całkowitą liczbę dodatnią.
// Następnie wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... " gdzie w miejsce dwukropka
// mają się pojawić liczby od podanej przez użytkownika do 0


public class AppBombExplode {

    public static void main(String[] args) {
        BombExplosion bombExplosion = new BombExplosion();
        bombExplosion.explodeIn10Sec(10);
        bombExplosion.explodeIn30Sec(30);
        bombExplosion.explodeIn60Sec(60);
    }
}
