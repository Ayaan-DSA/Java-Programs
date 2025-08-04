import java.util.Random;

public class rand {
    public static void main(String[] args) {
        Random random = new Random();
        int a;
        int b;
        boolean heads;

        a = random.nextInt(1, 101);
        b = random.nextInt(1, 101);
        heads = random.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(heads);
    }
}
