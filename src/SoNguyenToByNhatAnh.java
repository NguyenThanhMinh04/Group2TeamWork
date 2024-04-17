import java.util.ArrayList;
import java.util.List;

public class SoNguyenToByNhatAnh {
	 public static boolean isPrime(int n) {
	        if (n < 2) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static int sumPrimes(List<Integer> primes) {
	        int sum = 0;
	        for (int prime : primes) {
	            sum += prime;
	        }
	        return sum;
	    }

	    public static int differencePrimes(List<Integer> primes) {
	        int diff = 0;
	        if (primes.size() >= 2) {
	            diff = primes.get(0) - primes.get(1);
	        }
	        return diff;
	    }

	    public static void main(String[] args) {
	        int n = 100; 

	        List<Integer> primeNumbers = new ArrayList<>();
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                primeNumbers.add(i);
	            }
	        }

	        int sum = sumPrimes(primeNumbers);
	        int diff = differencePrimes(primeNumbers);

	        System.out.println("Tổng của các số nguyên tố là: " + sum);
	        System.out.println("Hiệu của hai số nguyên tố đầu tiên là: " + diff);
	    }
}
