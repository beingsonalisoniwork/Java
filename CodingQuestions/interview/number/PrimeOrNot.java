package interview.number;

public class PrimeOrNot {
    public static void main(String[] args) {
        // int num = Integer.MAX_VALUE;
        // int num = 0;
        // int num = -4;
        int num = 29;
        boolean isPrime = checkIfPrime(num);
        System.out.println(isPrime);
    }

    public static boolean checkIfPrime(int num) { 
        if(num == 0 || num == 1) return false;
        if(num < 0) { num *= -1; }

        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) 
                return false;
        }

        return true;
    }
}

/*
 * 16 
 * 2, 3, 4, 5, 6, 7, 8, 9, 10... 16
 * 16/2 = 8
*/