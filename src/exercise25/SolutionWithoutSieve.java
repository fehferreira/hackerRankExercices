package exercise25;

import java.util.Scanner;

public class SolutionWithoutSieve {

    public static boolean isPrime(int n){
        if( n == 1 ){
            return false;
        }

        int i = 1;
        while( i++ < n/2 ){
            if( n % i == 0 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            System.out.println( (isPrime(scan.nextInt()) ? "Prime" : "Not prime") );
        }
        scan.close();
    }
}
