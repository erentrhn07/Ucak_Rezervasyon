package rezervasyon_sistemi;
import java.util.Random;

public class Rezervasyon {
    public int ucret;
    private Random random;

    public Rezervasyon() {
        random = new Random();
        ucret = random.nextInt(15000 - 750 + 1) + 750;
    }
}
