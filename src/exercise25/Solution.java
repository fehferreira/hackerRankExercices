package exercise25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private int count = 0;

    private boolean[] primes;

    public Solution(int quantPrimes){
        primes = new boolean[quantPrimes];

        for(int i = 0 ; i < primes.length ; i++){
            primes[i] = true;
        }
        findPrime();
    }

    public boolean [] getPrimes(){
        return this.primes;
    }

    private void findPrime(){
        for(int i = 2 ; i < primes.length ; i++){
            if(primes[i]){
                for(int j = i ; i*j < primes.length ; j++){
                    primes[j*i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantValues = sc.nextInt();
        int maxValue = 0;
        List<Integer> values = new ArrayList<>();

        for(int i = 0 ; i < quantValues ; i++){
            values.add(sc.nextInt());
            if(maxValue < values.get(values.size()-1))
                maxValue = values.get(values.size()-1);
        }

        Solution crivo = new Solution(maxValue+1);
        boolean[] np = crivo.getPrimes();
        for(int i = 0 ; i < values.size() ; i++){
            if(values.get(i) != 1 && np[values.get(i)]){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }


}
