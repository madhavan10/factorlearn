import java.util.Random;

public class MathTools {

    public static int gcd(int p, int q) {
        
        int lower = Math.min(Math.abs(p), Math.abs(q));
        int gcd = 1;
        for(int i = 2; i <= lower; i++) {
            if(p % i == 0 && q % i == 0) {
                gcd = i;
            }
        }

        return gcd;

    }
    
    //Draw 2 primes with replacement from {2, 3, 5}
    //Draw one prime from {2, 3, 5, 7}
    public static int specialSmallPrimeRand() {
        Random gen = new Random();
        
        int[] smallPrimeArray = {2, 3, 5, 7};
        
        int product = 1;
        product *= smallPrimeArray[gen.nextInt(4)];
        product *= smallPrimeArray[gen.nextInt(3)];
        product *= smallPrimeArray[gen.nextInt(3)];

		return product;
    }


}
