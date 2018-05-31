public class TestGCD {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);

            System.out.println(a);
            System.out.println(b);
            System.out.println("GCD:" + MathTools.gcd(a, b));
        }
    }
}
