package exercise25;

import javax.management.openmbean.ArrayType;
import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int [] numbers = new int[times];
        for(int i = 0 ; i < times ; i++){
            numbers[i] = sc.nextInt();
        }

        for(Integer number : numbers){
            System.out.println((testPrime(number) ? "Prime" : "Not prime"));
        }
    }

    private static boolean testPrime(int number){
        if(number == 1 || number == 0){
            return false;
        }
        for(int j = 2 ; j < number ; j++){
            if(number%j == 0){
                return false;
            }
        }
        return true;
    }
}
